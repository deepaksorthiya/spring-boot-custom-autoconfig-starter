[![Java Maven Build Test](https://github.com/deepaksorthiya/spring-boot-custom-autoconfig/actions/workflows/maven-build.yml/badge.svg)](https://github.com/deepaksorthiya/spring-boot-custom-autoconfig/actions/workflows/maven-build.yml)

---

### ** Spring Boot Custom User Define Auto Configuration Example **

---

# Getting Started

### Requirements:

```
Git: 2.49.0
Spring Boot: 3.4.4
Maven: 3.9+
Java: 17
```

### Branches Information

| Branch          | Info                                                                                                                       |
|-----------------|----------------------------------------------------------------------------------------------------------------------------|
| main            | this branch contains ```META-INF/spring.factories``` based approach                                                        |
| meta-inf-spring | this branch contains ```META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports``` based approach |

### Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/spring-boot-custom-autoconfig.git
cd spring-boot-custom-autoconfig
```

### Build Jar File and Run Tests:

```bash
./mvnw clean install
```

### Usage

To use this starter you will need to add the following dependency to your spring boot project.

```xml

<dependency>
    <groupId>com.example</groupId>
    <artifactId>spring-boot-custom-autoconfig</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

And configure the following properties in your `application.properties` file. The reason I made this a setting is
because you might
want to run JsonPlaceHolder Service locally or in a different environment. If you don't configure one the default will
be used.

```properties
json-placeholder-service.base-url=https://jsonplaceholder.typicode.com
```

### Reference Documentation

For further reference, please consider the following sections:

* [Creating Your Own Auto-configuration](https://docs.spring.io/spring-boot/reference/features/developing-auto-configuration.html)

### Guides

The following guides illustrate how to use some features concretely:

* [JsonPlaceholder Service Spring Boot Starter](https://github.com/danvega/jps-spring-boot-starter)