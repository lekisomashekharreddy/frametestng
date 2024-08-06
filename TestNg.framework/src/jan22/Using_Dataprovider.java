package jan22;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Using_Dataprovider {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void setup(String brw) {
		switch (brw) {
		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
		driver = new FirefoxDriver();
		break;

		default:
			System.out.println("browser value is not matching");
			break;
		}
		
	}
	@Test(dataProvider = "dp")
	public void verify_login( String user,String pass) {
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtUsername")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
		String Expected ="http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
		String Actual = driver.getCurrentUrl();
		try {
			
		
		Assert.assertEquals(Actual, Expected,"invalid username or invalidpassword");
		}catch(AssertionError e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

	@DataProvider
	public Object[][] dp() {
		Object login [][]= new Object[5][2];
		login[0][0]="Admin";
		login[0][1]="Qedge123!@#";
		login[1][0]="Test";
		login[1][1]="Qedge123!@#";
		login[2][0]="Admin";
		login[2][1]="Qedge";
		login[3][0]="Admin";
		login[3][1]="Qedge123!@#";
		login[4][0]="Admin";
		login[4][1]="Qedge123!@#";
		return login;
		

	}



	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
