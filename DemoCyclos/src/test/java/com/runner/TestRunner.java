package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@five", glue = "com.stepdefinition", features = "src\\test\\resources", dryRun = true)//, plugin = {
		//"json:target\\report.json" })
public class TestRunner {

	//@AfterClass
	//public static void afterClass() throws FileNotFoundException, IOException {
		//Reporting.generateJVMReport("C:\\Users\\10151\\eclipse-workspace\\DemoCyclos\\target\\report.json");
	//}

}
