package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	
	
	public static ExtentReports getReports() {
		
		String filepath="C:\\Users\\mukund\\eclipse-workspace\\Selenium_Framework\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(filepath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 15 Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Selenium Project");
		extent.setSystemInfo("Module Name", "ABC");
		extent.setSystemInfo("Automation", "Selenium Webdriver");
		extent.setSystemInfo("QA", "Mukund");
		return extent;
	
		
		
		
		
		
		
	}

}
