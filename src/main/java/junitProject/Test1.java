package junitProject;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		System.out.println("This is before method");
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver102.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();// delete the cookies
		driver.manage().window().maximize(); // maximizing the window
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/test/102/index.php"); // using the url for going to the website
	}
	
	//Test 1: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.
	
	@Test
	public void myAvalidateToggleAllCheckBoxIsChecked() throws InterruptedException  {
		
		
		
		System.out.println("This is during test_1");
		WebElement CHECKBOX_Element = driver.findElement(By.name("allbox"));
		CHECKBOX_Element.click();
			Thread.sleep(3000);
	}

	@After
	public void tearDown() {
		driver.close();
	
	}
}