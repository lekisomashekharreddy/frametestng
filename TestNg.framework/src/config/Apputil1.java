package config;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;



public class Apputil1 {
	public static WebDriver driver;
	@BeforeMethod
	public static void setup()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.primusbank.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='login']")).click();
	}

}
