package testNG.mavenProject;

import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AssignmentFreeCrm {
	
	Scanner sc = new Scanner(System.in);
	
	//String browser = "edge";  
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("enter your desired browser: chrome | edge | firefox :");
		String browser = sc.next();
	    selectBrowser(browser);
	    //driver.get("https://classic.freecrm.com/register/");
	}
	
	
      @Test
	public void registration() throws Throwable
	{
    	String randonGenerateString = RandomStringUtils.randomAlphabetic(7);
    	  
    	//openBrowser();
        driver.get("https://classic.freecrm.com/register/");
        
		WebElement dropdown = driver.findElement(By.id("payment_plan_id"));
		Select selectObject = new Select(dropdown);
		selectObject.selectByVisibleText("Free Edition");
		
		String firstName = randonGenerateString;
		driver.findElement(By.cssSelector("div.text_normal form>div.form-group:nth-of-type(3) input")).sendKeys(firstName);
		
		String lastName = randonGenerateString;
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
		
		String emailInput = randonGenerateString +"@gmail.com";
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailInput);
		

		driver.findElement(By.cssSelector("form div.form-group:nth-of-type(6) input")).sendKeys(emailInput);
		
		String username = randonGenerateString;
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	
		String password = randonGenerateString;
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(password);
		
		WebElement checkbox = driver.findElement(By.cssSelector("div.checkbox label input "));
		checkbox.click();
		
		WebElement submit = driver.findElement(By.xpath("//button[@name='submitButton']"));
		submit.click();
		
		Thread.sleep(3000);
	}
		
	
	
		@AfterMethod
		public void closeBrowser()
		{
		driver.close();
		}
		
		
		
		public WebDriver selectBrowser(String browser)
		{
			switch(browser)
			{
			case "chrome":
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
	            break;
			}
			case "firefox":
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			}
			case "edge":
			{
				
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();  
				break;
			}
			default:
			
				throw new IllegalArgumentException("select browser chrome,firefox,edge: "+browser);
			}
		
			return driver;
		}
		
		
		//before method
		//after method
		//browser 3 option switch case
		//exception for browser
		//create method for browser
		//random selection for form elements name,email...
		//single quotes - backslash
		
		
	}

		
		


	
	


