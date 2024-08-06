package pack;



import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.Apputil1;




public class SecondtestNGclass  extends Apputil1{
	@Test
	public static void branches()
	{
		driver.findElement(By.xpath("(//img)[5]"));
		Reporter.log("executing branches test",true);
	}
	@Test
	public void roles() {
		driver.findElement(By.xpath("(//img)[6]"));
		Reporter.log("executing roles test",true);
	}
	@Test
	public void users()
	{
		driver.findElement(By.xpath("(//img)[7]"));
		Reporter.log("executing users test",true);
	}
}
