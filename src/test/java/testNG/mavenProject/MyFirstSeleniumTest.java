package testNG.mavenProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSeleniumTest {
	
	@Test
	public void validateLogInFunctionality()
	{
	// Set up the logic of driver
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		
	// Initialize a driver instance	
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		
		// also we can write as... child class  inherits parents class
		WebDriver driver = new ChromeDriver();
		
    //Load a page url get("string..."); inside double quotes
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	// Identify elements on webpage
		WebElement emailInput = driver.findElement(By.id("input-email"));
		
		WebElement passwordInput = driver.findElement(By.cssSelector("input[name='password']"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		
		
	// perform actions
		emailInput.sendKeys("katepqa@gmail.com");
		
		passwordInput.sendKeys("Tester01");
		
		loginBtn.click();
		
	// close browser
		
		driver.close();
	}

}
