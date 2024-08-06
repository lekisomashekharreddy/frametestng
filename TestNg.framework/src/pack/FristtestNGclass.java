package pack;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.Apputil;




public class FristtestNGclass extends Apputil {

	@Test(priority = 0)
	public void pbanking()
	{
		driver.findElement(By.xpath("(//img)[4]"));
		Reporter.log("Running pbanking test",true);
	}
	@Test(enabled = false)
	public void cbanking()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("Running cbanking test",true);	

	}
	@Test(priority = 1,invocationCount = 7)
	public void ibanking()

	{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Reporter.log("Running ibanking test",true);
	}





}




