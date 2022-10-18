package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Users\\mcholavaram\\my-workspace\\CucumberBDDMaven\\src\\main\\java\\features\\login.feature", 
glue = {"com.stepdefinitions" }, 
plugin = { "html:Reports\\HTMLReports.html" })
public class TestRunner {

}
