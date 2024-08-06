package pack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.Apputil;

public class ThirdtestiNGclass  extends Apputil{
	@Test(groups = "primusbank")
	public void home()
	{
		driver.findElement(By.xpath("(//img)[3]")).click();
	}
	@Test(dependsOnMethods = "home")
	public void pbanking()
	{
		driver.findElement(By.xpath("(//img)[4]")).click();
	}

	@Test(dependsOnMethods = "pbanking")	
	public void cbanking()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
	}
	@Test(dependsOnMethods = "cbanking")
	public void ibanking()
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
	}
	@Test(dependsOnMethods = "ibanking")
	public void aboutus()
	{
		driver.findElement(By.xpath("(//img)[7]")).click();
	}
}

