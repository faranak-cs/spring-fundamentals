# Java with Maven & Spring Boot
I am learning Java with Maven and Spring Boot

## SDK commands
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
5. See current version:
```
sdk current java
```
6. Set default version:
```
sdk default java version
```

## Maven commands
1. Compile the code:
```
mvn clean compile
```
2. Compile, test (all) and package the project:
```
mvn clean install
```
3. Compile, test (unit tests), package and skip ITs:
```
 mvn clean install -DskipITs
```
4. Run the ITs using Failsafe plugin:
```
 mvn failsafe:integration-test
```
> It will not fail the build if ITs are failed

5. Verify the results using Failsafe plugin:
```
mvn failsafe:verify
```
> It will fail the build if ITs are failed in the reports

6. Generate report for code coverage using JaCoCo plugin:
```
mvn jacoco:report
```
7. Build and verify the results:
```
mvn clean verify
```

## JUnit
- 4
```
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```
- 5
```
<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.11.3</version>
    <scope>test</scope>
</dependency>
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

## Useful links
- https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
