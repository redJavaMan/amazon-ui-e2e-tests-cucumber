# Amazon UI E2E Testing Framework

This repository contains an end-to-end testing framework for Amazon.com using Cucumber, Selenium WebDriver, and Java. The framework follows the Page Object Model design pattern to create maintainable and readable tests.

## Project Structure

```
amazon-ui-e2e-cucumber/
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── amazon/
│       │           └── ui/
│       │               └── e2e/
│       │                   └── tests/
│       │                       ├── config/
│       │                       │   └── WebDriverManager.java
│       │                       ├── hooks/
│       │                       │   └── Hooks.java
│       │                       ├── pages/
│       │                       │   ├── Header.java
│       │                       │   ├── HomePage.java
│       │                       │   ├── ProductPage.java
│       │                       │   └── SearchResultsPage.java
│       │                       ├── runners/
│       │                       │   └── ProductSearchTestRunner.java
│       │                       └── steps/
│       │                           └── ProductSearchSteps.java
│       └── resources/
│           └── features/
│               └── product_search.feature
├── .gitignore
├── pom.xml
└── README.md
```

## Features

- **BDD Approach**: Uses Cucumber to write tests in Gherkin language making them readable to non-technical stakeholders
- **Page Object Model**: Implements the POM design pattern for better maintainability
- **Screenshot Capture**: Automatically captures screenshots on test failures
- **Parallel Execution**: Configured to run tests in parallel for faster feedback
- **HTML Reports**: Generates detailed HTML reports after test execution

## Prerequisites

- Java JDK 11
- Maven
- Chrome Browser (latest version)
- ChromeDriver matching your Chrome version

## Setup

1. Clone this repository:
   ```
   git clone https://github.com/yourusername/amazon-ui-e2e-cucumber.git
   cd amazon-ui-e2e-cucumber
   ```

2. Install dependencies:
   ```
   mvn clean install -DskipTests
   ```

## Running Tests

Run all tests:
```
mvn test
```

Run specific tags:
```
mvn test -Dcucumber.filter.tags="@searchValidProduct"
```

## Test Scenarios

The framework currently includes the following test scenarios:

1. **Search for a valid product**:
   - Navigate to Amazon homepage
   - Search for "wireless headphones"
   - Verify search results contain relevant products

2. **Search with no results**:
   - Navigate to Amazon homepage
   - Search for a non-existent product
   - Verify "No results" message is displayed

3. **Use filters to refine product search**:
   - Search for "4K television"
   - Apply brand and price filters
   - Verify filtered results

4. **Product search with pagination**:
   - Search for "coffee maker"
   - Navigate to second page of results
   - Verify additional products are displayed

## Framework Components

### WebDriverManager

Manages WebDriver instance creation and cleanup.

### Page Objects

- **HomePage**: Represents Amazon's home page with methods for navigation and search
- **SearchResultsPage**: Contains methods to interact with search results, filters, and pagination
- **ProductPage**: Represents individual product pages
- **Header**: Contains common header elements across pages

### Hooks

Contains setup and teardown methods that run before and after each scenario, including screenshot capture on failure.

### Step Definitions

Implements the steps defined in the feature files, connecting the Gherkin language to actual automation code.

## Reports

After test execution, HTML reports are generated at:
```
target/html-report.html
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Authors
- **Lukmanudhin M**  - [redJavaMan](https://github.com/redJavaMan)

## Acknowledgments
- [nerdishShah](https://github.com/nerdishShah)
