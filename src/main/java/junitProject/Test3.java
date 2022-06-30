package junitProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
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
	//Test 3: Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
	@Test
		public void RemoveButton() {
			System.out.println("This is during test_3");
			WebElement CHECKBOX_Element = driver.findElement(By.name("allbox"));
			CHECKBOX_Element.click();
			WebElement REMOVE_BUTTON = driver.findElement(By.xpath("/html/body/div[3]/input[1]"));
			REMOVE_BUTTON.click();
		}

	@After
	public void tearDown() {
		driver.close();
	
	}

}
