package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting  {
	
	public static void generateJVMReport(String jsonFile) throws FileNotFoundException, IOException {
		File file = new File("C:\\Users\\10151\\eclipse-workspace\\DemoCyclos\\target");
		Configuration config = new Configuration(file, "GW-Cucumber");
		config.addClassifications("FirstName", "Rubert");
		config.addClassifications("LastName", "Kavin");
		config.addClassifications("Testing", "Cyclos");
		config.addClassifications("Browser", "Chrome");
		List<String> json = new ArrayList<String>();
		json.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(json, config);
		builder.generateReports();
	}
	
}
