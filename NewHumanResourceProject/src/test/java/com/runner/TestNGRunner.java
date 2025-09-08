package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
	    features = "C:\\Users\\91998\\eclipse-workspace\\NewHumanResourceProject\\src\\test\\resources\\Features",   // folder with your .feature files
	    glue = "stepDefinition",                   // package with your step definitions
	    tags = "~@Smoke or @Regression",
	    plugin = {"pretty", "html:target/cucumber-report.html"}, // reporting
	    
	    monochrome = true                           // readable console output
	)
	public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	/* This class extends AbstractTestNGCucumberTests to integrate 
	 * cucumber testNG
	 * 
	 * it will automatically run all the feature files defined in the 
	 * @CucumberOptions annotation
	 * 
	 * */
	}
	

