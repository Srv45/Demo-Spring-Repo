# Spring XML Configuration Demo

This project demonstrates the use of **Spring Framework** to configure and manage dependencies using an XML configuration file. It includes an example of `Employee` and `Company` classes, where data is injected via the XML file.

---

## Features

- Dependency Injection (DI) using XML configuration.
- Example classes: `Employee` and `Company`.
- Demonstrates the use of `Bean` definitions in Spring XML.
- Simple and beginner-friendly setup for understanding Spring Core concepts.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **Apache Maven** (for dependency management)
- An IDE like **IntelliJ IDEA**, **Eclipse**, or **VS Code** with Java support

---

<b>Project Structure</b>

src/
├── main/
│   ├── java/
│   │   └── com.entity/
│   │       ├── model/
│   │       │   ├── Company.java  # Represents a company
│   │       │   └── Employee.java # Represents an employee
│   │       └── MainClass.java      # Entry point of the application
│   └── resources/
│       └── springbeans.xml     # Spring XML configuration file
└── test/                         # Unit tests (if any)

