# CricketTestAutomationScript

Instructions:
The code is developed on eclipse IDE.
All the dependencies are to be uploaded in the pom.xml file:

    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.cv</groupId>
    <artifactId>CricketTest</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <dependencies>
      <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.5.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.6.1</version>
        <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.3.0</version>
    </dependency>


    </dependencies>
  </project>
  
 To run all the test case, testng.xml has to be run. Right click on the file -> run as test ng suite.
