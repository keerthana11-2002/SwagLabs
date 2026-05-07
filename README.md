# Playwright Automation Framework (Swag Labs)

## 📌 Project Overview

This project contains automated test scripts for the Swag Labs application using **Playwright (Java) + TestNG**.
It follows the **Page Object Model (POM)** design pattern for better maintainability and scalability.

---

## 🛠 Tech Stack

* Java
* Playwright
* TestNG
* Maven

---

## 📂 Project Structure

```
src
 ├── main/java
 │    └── pages        → Page Object classes
 │
 ├── test/java
 │    └── tests        → Test classes
 │
```

---

## ✅ Test Scenarios Covered

* Login (valid & invalid)
* Empty field validation
* Locked user login
* Add single product to cart
* Add multiple products
* Remove product from cart
* Checkout flow
* Logout functionality
* Back navigation
* Filter (A to Z sorting)
* About Page

---

## ⚙️ Setup Instructions

### 1. Prerequisites

* Java (JDK 8 or above)
* Maven installed for Playwright in Pom.xml
* IDE (Eclipse / IntelliJ / VS Code)
```

---

## ▶️ Execution Options

* Run individual test classes

---

## 🧠 Framework Design Highlights

* Page Object Model (POM)
* Reusable methods
* Dynamic locators
* Clean separation of test logic and page actions
* Minimal use of hardcoded values

---

## 📌 Notes

* Playwright auto-waits are used instead of Thread.sleep
* Assertions are implemented using TestNG

---

 
 
