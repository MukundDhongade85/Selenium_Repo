package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.LoginPom;
import com.utility.BaseClass;
import com.utility.Library;

public class Test_1 extends BaseClass {
	
	// test cases steps
	@Test 
	public void verify_loginpage() {
		
		//element --> username , passsword,login button
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
	
		Library.custom_Sendkeys(login.getEmail(), excel.getStringData_Excel("Login", 0, 0));
		Library.custom_Sendkeys(login.getPass(), excel.getStringData_Excel("Login", 0, 1));
		Library.custom_click(login.getLogbutton());
		
//		Library.Handle_dropdown(null, null);
//		
//		Library.ScrollIntoElement(driver, null);
//		
//		Library.Handle_Alert(driver).accept();
//		Library.Handle_Alert(driver).dismiss();
//		String text=Library.Handle_Alert(driver).getText();
//		
//		Library.rightclickOnelement(driver, null);
//		
//		Library.MoveToelment_click(driver, null);
//		
//		String text1=Library.getText_element(null);
		
		
		
	}

}
