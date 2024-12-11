# Java with Maven & Spring Boot
I am learning Java with Maven and Spring Boot
## Setup
1. Install SDKMAN
```
curl -s "https://get.sdkman.io" | bash
```

2. Use the following command to see the list of Java versions
```
sdk list java
```
3. Use the following command to install Java
```
sdk install java version
```
4. Use the following command to select the Java version for the project:
```
sdk use java version
```

## [Maven Commands](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)
1. Compile the code:
```
mvn clean compile
```
2. Compile, test and package the project:
```
mvn clean install
```
3. Compile, test, package and skip ITs:
```
 mvn clean install -DskipITs
```
4. Run the ITs using Failsafe plugin:
```
 mvn failsafe:integration-test
```
5. Verify the results using Failsafe plugin:
```
mvn failsafe:verify
```
6. Generate report for code coverage using JaCoCo plugin:
```
mvn jacoco:report
```
7. Build and verify the results:
```
mvn clean verify
```


## Component Diagram
![component-diagram](https://github.com/faranak-cs/spring-fundamentals/assets/73027299/e6cb872c-f215-4b8b-ad1a-7242478d9c97)

## Version
| Library      | Version |
| -----------      | ----------- |
| IntelliJ IDEA CE | 2024.1.4    |
| Java             | 17.0.11-tem |
| Maven            | 3.9.8  |
| Spring Boot      | 3.3.1  |
| Spring Framework | 6.1.10 |
