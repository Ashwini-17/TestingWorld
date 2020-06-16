package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {
	

	WebDriver driver;
	@Test
	public void startbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://thetestingworld.com/testings/index.php");
		 driver.findElement(By.xpath("//label[text()='Login']")).click();
		 driver.findElement(By.name("_txtUserName")).sendKeys("test");
		 driver.findElement(By.name("_txtPassword")).sendKeys("test");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
