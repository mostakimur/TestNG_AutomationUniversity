package testuniversity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmDP {
	WebDriver driver;
	
	@Test (dataProviderClass = SignInDP.class, dataProvider = "signin-provider")
	public void signIn (String usename, String password, boolean success) 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");		
		
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("username")).sendKeys(usename);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Sign In Credentials: " + "\n" +
										"  Username = " + usename + "\n" +
										"  Password = " + password + "\n" +
										"  Successful Sign In = " + success + "\n" );
		
		String actualResult = driver.findElement(By.id("welcome")).getText();
		String expectedResult = "Welcome Admin";
		Assert.assertEquals(actualResult, expectedResult, "The Actual & Expected Results Do Not Match");
		
		driver.quit();
	}	
}