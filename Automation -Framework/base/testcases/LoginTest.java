package testcases;

import org.testng.annotations.Test;

import webpages.LoginPage;

public class LoginTest {

	@Test
	
	public void TC01(){
		
		new LoginPage()
		.Username("John Doe")
		.Password("ThisIsNotAPassword")
		.ClickLogin();
	}
	
	
}
