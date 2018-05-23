package newPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver; 



public class Testng2 {
	  
	WebDriver driver;
	
	@Parameters("browser")

	@BeforeClass
	
	public void beforeclass(String browser) throws InterruptedException{
		
		if(browser.equalsIgnoreCase("googlechrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
			
			 driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\IEDriverServer.exe");
			
			 driver= new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("HtmlUnitDriver")) {
			
			driver = new HtmlUnitDriver();
			
		}else if(browser.equalsIgnoreCase("MicrosoftEdge")){
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\MicrosoftWebDriver.exe");
			
			 driver= new EdgeDriver();
		}
				
	driver.get("http://www.google.com");
	Thread.sleep(5000);		
		
	}
	
	@Test(priority = 0)
	
	public void search(){
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Canada");
		
		element.submit();
		System.out.println("Page title of the search method is: " + driver.getTitle());
	}
	
	@Test(priority = 1)
	
	public void back() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().back();
		String testUrl = driver.getCurrentUrl();
		System.out.println("Page title of the back method is: " + testUrl );
	}
	
	
	
	@AfterClass()
	
	public void logout() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("This is the last test");
	}
 }


