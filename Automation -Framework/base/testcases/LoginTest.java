package testcases;


import org.testng.annotations.Test;

import dependency.URL;
import webpages.LoginPage;

public class LoginTest extends URL {

	@Test
	
	public void TC01(){
		
		new LoginPage(driver)
		.Username("John Doe")
		.Password("ThisIsNotAPassword")
		.ClickLogin();
	}
	
	
}
