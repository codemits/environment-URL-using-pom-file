package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example {

    public static void main(String[] args) {

        // Optional: You can set Chrome options, for example, to disable browser notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Initialize the WebDriver with the specified options
        WebDriver driver = new ChromeDriver(options);

        // Retrieve the environment URL from system properties with a default value
        String environmentURL = System.getProperty("environment.url", "http://google.com");

        // Navigate to the specified environment URL (or the default URL)
        driver.get(environmentURL);

        // Optionally, perform actions on the webpage

        // Close the browser
        driver.quit();
    }
}

