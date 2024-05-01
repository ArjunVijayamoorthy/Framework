package dependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class URL {
	protected RemoteWebDriver driver= null;
	@BeforeMethod
	public void Startup() {
		driver = new ChromeDriver();
		String URL ="https://katalon-demo-cura.herokuapp.com/profile.php#login";
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
