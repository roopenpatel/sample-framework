package com.nopcommerce.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Jay Vaghani
 */
@CucumberOptions(features = "src/test/resources/features",
        glue = {"com/nopcommerce/demo/steps"},
        tags = "@smoke",
        plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunCuke extends AbstractTestNGCucumberTests {

}
