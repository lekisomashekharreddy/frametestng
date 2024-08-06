package jan22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Test
	public void starttest()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
		String Expected="Gmail";
		String Actual=driver.getTitle();
		try {
		Assert.assertEquals(Actual, Expected,"title is not matching");
		}catch(AssertionError a)
		{
		System.out.println(a.getMessage());
		}
		driver.quit();
		
	}

}
