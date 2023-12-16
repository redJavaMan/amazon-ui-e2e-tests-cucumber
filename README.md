# Cucumber Selenium Project

## Overview
This project is an automated testing framework using Cucumber and Selenium WebDriver. It is designed to perform end-to-end testing on web applications, focusing on behavior-driven development (BDD) approaches.

## Prerequisites
- Java JDK (version 8 or higher)
- Maven (version 3.6.0 or higher)
- Web browsers (e.g., Chrome, Firefox) with their respective WebDriver executables

## Setup
1. Clone the repository: `git clone  https://github.com/redJavaMan/amazon-ui-e2e-tests-cucumber.git`
2. Navigate to the project directory: `cd amazon-ui-e2e-cucumber`
3. Install dependencies: `mvn install`


## Configuration
- Update `src/test/resources/config.properties` file to set browser preferences and other configurations.

## Running Tests
To execute the test suite, run: `mvn test`

## Structure
- **src/main/java**: Contains the main application code (if applicable).
- **src/test/java**: Contains the test code with step definitions and support classes.
  - **com.amazon.ui.e2e.tests.steps**: Cucumber step definitions.
  - **com.amazon.ui.e2e.tests.pages**: Page Object Model classes.
  - **com.amazon.ui.e2e.tests.runners**: Cucumber runner classes.
  - **com.amazon.ui.e2e.tests.utils**: Utility classes for common functions.
- **src/test/resources**: Contains Cucumber feature files and test resources.
  - **features**: Cucumber feature files written in Gherkin.

## Reports
After test execution, reports are generated in `target/cucumber-reports`. This includes HTML, JSON, and XML reports.

## Contributing
Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## License
This project is licensed under the [LICENSE.md](LICENSE.md).

## Authors
- **Lukmanudhin M**  - [redJavaMan](https://github.com/redJavaMan)

## Acknowledgments
- [nerdishShah] (https://github.com/nerdishShah)
