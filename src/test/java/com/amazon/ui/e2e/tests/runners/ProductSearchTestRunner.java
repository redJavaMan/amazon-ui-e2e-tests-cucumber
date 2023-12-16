package com.amazon.ui.e2e.tests.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to the feature files
        glue = "com.amazon.ui.e2e.tests", // Path to the step definitions
        tags = "@productSearch", // Tag to filter which scenarios to run
        plugin = { "pretty", "html:target/html-report.html" }, // Plugins for reporting
        monochrome = true, // Display the console output in a readable way
        dryRun = false

)
public class ProductSearchTestRunner {
    // No need to add any code here
}

