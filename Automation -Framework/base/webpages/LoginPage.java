package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import dependency.URL;
@Test 
public class LoginPage extends URL{	
	 RemoteWebDriver driver;

	public LoginPage(RemoteWebDriver driver) {
		this.driver  = driver;
	}
	
	public LoginPage Username(String username) {
		 driver.findElement(By.id("txt-username")).sendKeys(username);
		 return this;
	}

	public LoginPage Password(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
		return this;
	}

	public Homepage ClickLogin() {
		driver.findElement(By.id("btn-login")).click();
		return new Homepage();
	}
	
	public void Login(String username, String pasword) {
		Username(username);
		Password(pasword);
		ClickLogin();
	}

}
