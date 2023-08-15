package devopsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	@Test
	public void myTest() {
		System.out.println("I am in Test 1");
	}
	
	@Test
	public void myTest2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not match");
		driver.quit();
	}
	
	@Test
	public void myTest3() {
		System.out.println("I am in Test 3");
	}
}
