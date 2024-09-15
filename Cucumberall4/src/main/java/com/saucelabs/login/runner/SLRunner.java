package com.saucelabs.login.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="features/SLLogin.feature",
                 glue="com.saucelabs.login.stepdefinition",
                 monochrome=true,
  //               tags="@TC1",
                 plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                 )

public class SLRunner {

}
