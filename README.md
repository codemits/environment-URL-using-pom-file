# Environment URL using Pom.xml and Selenium WebDriver

This project demonstrates how to configure and use an environment URL in a Java Selenium project using the Maven `pom.xml` file and the latest WebDriver.

## Prerequisites

Before running the project, make sure you have the following installed:

1. [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
2. [Maven](https://maven.apache.org/download.cgi)

## Project Setup

1. Clone this repository to your local machine:
```git clone https://github.com/your-username/environment-URL-using-pom-file.git```

2. Configure the Maven Surefire Plugin to set the `environment.url` system property.

## Use Cases

### 1. Launching TA digital Home Page

To launch TA digital with the default URL (https://www.tadigital.com/home), simply run the following command:

```mvn clean test```


### 2. Launching a Custom URL

To launch a custom URL (e.g., http://www.google.com), provide it as a system property when running the tests:

```mvn clean test -Denvironment.url=http://www.google.com```

This command will use "http://www.google.com" as the URL for the test, overriding the default URL.

### 4. Additional Customizations

- You can customize the WebDriver options (e.g., disable notifications) by modifying the code in the Java file.


