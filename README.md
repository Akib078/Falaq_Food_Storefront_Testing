# 🛒 Falaq Food E-commerce Storefront Testing

> A comprehensive QA portfolio project showcasing my work in **Manual Testing, UI Test Automation, and API Testing** on the Falaq Food e-commerce storefront, covering functional validation, end-to-end workflows, defect reporting, Selenium-based regression automation, and Postman/Newman API testing.

![Role](https://img.shields.io/badge/Role-SQA%20Engineer-blue)
![Testing](https://img.shields.io/badge/Testing-Manual-orange)
![Automation](https://img.shields.io/badge/Automation-Selenium-green)
![API Testing](https://img.shields.io/badge/API%20Testing-Postman-orange)
![API Automation](https://img.shields.io/badge/API%20Execution-Newman-green)
![Language](https://img.shields.io/badge/Language-Java-red)
![Framework](https://img.shields.io/badge/Framework-TestNG-yellow)
![Tool](https://img.shields.io/badge/Tool-Jira-blue)
![Build](https://img.shields.io/badge/Build-Maven-C71A36)
![Pattern](https://img.shields.io/badge/Pattern-POM-purple)
![System](https://img.shields.io/badge/System-E--Commerce-brightgreen)

---

## 📌 Project Overview

A comprehensive **Software Quality Assurance (SQA) project** for testing the Falaq Food e-commerce storefront through **Manual Testing, UI Automation, and API Testing**.

The project covers functional validation of core e-commerce workflows, UI and usability testing, defect management, Selenium-based regression automation, and API testing using **Postman and Newman**.

**Application:** Falaq Food E-commerce Storefront  
**Testing Approach:** Manual + UI Automation + API Testing  
**UI Automation:** Selenium WebDriver + Java + TestNG + POM  
**API Testing:** Postman + Newman  
**Defect Tracking:** Jira  
**Build Tool:** Maven

---

## 🎯 Objectives

* Validate critical e-commerce functionalities and user workflows.
* Identify functional, UI, usability, and API-related defects.
* Ensure the application meets expected business requirements.
* Create structured and professional QA documentation.
* Automate repetitive UI regression test scenarios.
* Validate API requests, responses, status codes, and error handling.
* Demonstrate an end-to-end SQA workflow.

---

# 🧪 Manual Testing

## 📋 Test Documentation

Prepared and maintained:

* Test Plan
* Test Scenarios
* Test Cases
* Test Execution Results
* Bug/Defect Reports
* Screenshots and supporting evidence

## 🔍 Testing Types

* Functional Testing
* UI Testing
* Usability Testing
* Smoke Testing
* Sanity Testing
* End-to-End Testing
* Regression Testing
* Form Validation Testing
* Positive & Negative Testing

## 🧾 Test Coverage

Designed and executed **40+ test cases** covering:

* Homepage and navigation
* Product categories
* Product search and filtering
* Product selection
* Add to Cart
* Cart management
* Shipping selection
* Checkout
* Form validation
* Order placement
* UI and usability validation

## 🐞 Defect Management

Identified and documented defects using **Jira**, including reproduction steps, expected/actual results, severity, priority, and supporting evidence.

---

# 🤖 Automation Testing

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java | Programming Language |
| Selenium WebDriver | Web UI Automation |
| TestNG | Test Execution & Assertions |
| Maven | Dependency & Build Management |
| Page Object Model | Framework Design |
| WebDriverManager | WebDriver Management |
| Git/GitHub | Version Control |

## 🏗️ Automation Framework

Developed a modular **Selenium-Java-TestNG framework** using the **Page Object Model (POM)**.

The framework includes:

* Reusable page components
* Maintainable locators
* Utility methods
* Explicit waits
* TestNG assertions
* Structured test organization
* Regression automation

## ⚙️ Automated Workflows

Automated critical workflows including:

1. Product navigation
2. Product search
3. Product filtering
4. Product selection
5. Add to Cart
6. Cart quantity updates
7. Shipping selection
8. Checkout
9. Form validation
10. Order workflow

---

# 🔌 API Testing

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Postman | API Testing & Test Scripts |
| Newman | Command-Line Test Execution |
| Newman HTML Extra Reporter | HTML Test Reporting |

## 🧪 API Test Coverage

Tested **8 API scenarios** covering:

* Product search/autocomplete
* Product selection using slug
* Product retrieval using ID
* Order creation
* Invalid product ID
* Invalid order quantity
* Invalid product/search term
* Invalid search limit

## 🔍 API Validations

Validated:

* HTTP status codes
* JSON response structure
* Required response fields
* Product information
* Product variants and prices
* Product status
* Order ID and order number
* Order total
* Error responses
* Invalid input handling
* Empty search results

## 📊 API Execution & Reporting

API collections can be executed through **Postman** or **Newman**.

```bash
newman run "Falaq Food API Testing.postman_collection.json" \
--env-var "base_url=https://shop.falaqdigital.com"
