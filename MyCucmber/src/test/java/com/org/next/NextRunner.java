package com.org.next;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/org/next/features/searchWithMultipleTests.feature"
                , plugin = {"pretty", "html:reports.html"}
                , dryRun = false)
public class NextRunner {
}
