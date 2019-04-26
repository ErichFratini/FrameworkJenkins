package com.framework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber"},
        format={"json:target/cucumber/cucumber.json"},
        tags = {"@ID3"},
        features = "src/test/resources/")
public class RunTest {
}
