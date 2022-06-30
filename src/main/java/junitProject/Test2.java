package junitProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
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
//	//Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected
	@Test
	public void myBvalidateSingleListItemRemovedUsingRemoveButton() {
		System.out.println("This is during test_2");
		WebElement CHECKBOX_Element = driver.findElement(By.name("todo[2]"));
		CHECKBOX_Element.click();
}

	//@After
	public void tearDown() {
	driver.close();
	
}

}