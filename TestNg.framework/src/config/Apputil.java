package config;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;






public class Apputil {
	public static WebDriver driver;
	@BeforeTest
	public static void setup()
	{
		driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("running precondation",true);

	}

	@AfterTest
	public static void teardown()
	{
		driver.quit();
		Reporter.log("running postcondation",true);
	}
}
