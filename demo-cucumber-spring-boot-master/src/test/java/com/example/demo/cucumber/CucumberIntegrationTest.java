package com.example.demo.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber"})
public class CucumberIntegrationTest {

}
