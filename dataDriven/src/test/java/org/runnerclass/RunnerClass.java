package org.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(snippets = SnippetType.CAMELCASE, features = "src\\test\\resources", dryRun = false, glue = "com\\Stepdefinition", monochrome = true)

public class RunnerClass {

}
