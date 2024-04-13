package com.org.next;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/org/next/features/searchWithScenarioOutLine.feature"
                    //features = "."
                , plugin = {"pretty", "html:reports.html"}
                , dryRun = false
                //, tags = "@SmokeTest"
                )
public class NextRunner {
}
