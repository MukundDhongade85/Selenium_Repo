package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() throws Exception {
		
		String filepath="C:\\Users\\mukund\\eclipse-workspace\\Selenium_Framework\\Config\\Config.Properties";
		
		FileInputStream fis=new FileInputStream(filepath);

		pro=new Properties();
		
	    pro.load(fis);
	}

		 public String getBaseUrl() {
			 
			 return pro.getProperty("BaseUrl");
			 
		 }
		 
		 public String getBrowserChrome() {
			 
			 return pro.getProperty("BrowserChrome");
		 }
		 
        public String getBrowserEdge() {
			 
			 return pro.getProperty("BrowserEdge");
		 }
		 
		 public String getExcelPath() {
			 return pro.getProperty("ExcelPath");
		 }
		 




}
