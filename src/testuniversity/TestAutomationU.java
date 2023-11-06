package testuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestAutomationU {
	WebDriver driver;
		
	@Test
	@Parameters ({"URL","BrowserType"})
	public void verifyTAU (String url, String browserType)
	{
		if (browserType.equalsIgnoreCase("Internet Explorer"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\resources\\msedgedriver.exe");
			driver = new EdgeDriver();
		} 
		else if (browserType.equalsIgnoreCase("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserType.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
				
		driver.manage().window().maximize();
		driver.get(url);
				
		System.out.println("\n" + "Open " + browserType);
		System.out.println("   " +  driver.getTitle());
		System.out.println("   " +  driver.findElement(By.xpath("//h1[@class='jumbotron-heading heroText']")).getText());
		System.out.println("Close " + browserType + "\n");
			
		driver.quit();
	}
}
