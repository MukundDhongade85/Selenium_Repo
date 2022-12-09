package com.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_Sendkeys(WebElement element,String value) {
		try {
		element.sendKeys(value);
		test.log(Status.PASS, "Value successfully send=="+value);
		
	}catch(Exception e) {
		
		test.log(Status.FAIL, e.getMessage());
		
	}
}
	public static void custom_click(WebElement element) {
		
		try {
			element.click();
			test.log(Status.PASS, "Click successfully");
		}catch(Exception e) {
			
			test.log(Status.FAIL, e.getMessage());
			
		}
	}
	
	public static void Handle_dropdown(WebElement element,String text) {
		
		try {
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

   public static void ScrollIntoElement(WebDriver driver,WebElement element) {
		
		try {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].ScrollIntoView()", element);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
   public static Alert Handle_Alert(WebDriver driver) {
	   
	   return driver.switchTo().alert();
   }
	
	public static void MoveToelment_click(WebDriver driver,WebElement element) {
		try {
			
			Actions act=new Actions(driver);
			act.moveToElement(element).click().build().perform();
		}catch (Exception e){
				System.out.println(e.getMessage());
		}
	}
	
	public static void rightclickOnelement(WebDriver driver,WebElement element) {
		try {
			
			Actions act=new Actions (driver);
			act.contextClick(element).build().perform();
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public static String getText_element(WebElement element) {
		
		return element.getText();
	}
	
	public static void CopyText_Keyboard(WebDriver driver) {
		try {
			Actions act=new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
}