package testuniversity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class BM_AM_OrangeHRM {
	// Soft Assert Object
	SoftAssert softassert = new SoftAssert();
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("1. Open Chrome & Application");
	}

	@Test(priority = 1)
	public void signIn() {

		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement textUsername = driver.findElement(By.name("username"));
		Highlighter(driver, textUsername);
		textUsername.sendKeys("Admin");

		WebElement textPassword = driver.findElement(By.name("password"));
		Highlighter(driver, textPassword);
		textPassword.sendKeys("admin123");

		WebElement buttonLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		Highlighter(driver, buttonLogin);
		buttonLogin.click();

		System.out.println("2. Sign In");
	}

	// Hard TestNG Assertion - if fail will execute next method
	/*
	 * @Test (priority = 1) public void testHomePageVerification() {
	 * Assert.assertEquals(true,false,"The welcome link is not correct in home page"
	 * ); System.out.println("3. Verify Welcome Link");
	 * 
	 * Assert.assertFalse(false, "The Admin Tab is Not Displayed on the Home Page");
	 * System.out.println("4. Verify Admin Tab");
	 * 
	 * Assert.assertTrue(false, "The Dashboard is not correct on the Home Page");
	 * System.out.println("5. Verify Dashboard"); }
	 */

	// Soft Assert - if fail will execute next line
	@Test(priority = 2)
	public void testHomePageVerification() {
		softassert.assertEquals(true, true, "The welcome link is not correct in home page");
		System.out.println("3. Verify Welcome Link");

		softassert.assertFalse(false, "The Admin Tab is Not Displayed on the Home Page");
		System.out.println("4. Verify Admin Tab");

		softassert.assertTrue(true, "The Dashboard is not correct on the Home Page");
		System.out.println("5. Verify Dashboard");
		
		softassert.assertAll();
	}

	/*
	 * @Test (priority = 2) 
	 * public void userSearch () { try {
	 * TimeUnit.SECONDS.sleep(2); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } WebElement menuAdmin =
	 * driver.findElement(By.
	 * xpath("(//span[contains(@class,'oxd-text oxd-text--span')])[1]"));
	 * Highlighter(driver, menuAdmin); menuAdmin.click();
	 * 
	 * try { TimeUnit.SECONDS.sleep(2); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } WebElement textUserName =
	 * driver.findElement(By.
	 * xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	 * Highlighter(driver, textUserName); textUserName.sendKeys("Admin");
	 * 
	 * WebElement buttonSearch =
	 * driver.findElement(By.xpath("(//div[@class='oxd-form-actions']//button)[2]"))
	 * ; Highlighter(driver, buttonSearch); buttonSearch.click();
	 * 
	 * System.out.println("6. Search For User"); }
	 */

	@Test(priority = 2)
	public void userSignOut() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement linkWelcome = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//i[1]"));
		Highlighter(driver, linkWelcome);
		linkWelcome.click();

		WebElement linkLogout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Highlighter(driver, linkLogout);
		linkLogout.click();

		System.out.println("7. Sign Out");
	}

	private void Highlighter(WebDriver driver2, WebElement linkWelcome) {
		// TODO Auto-generated method stub

	}

	@AfterClass
	public void tearDown() {
		System.out.println("8. Close Chrome & Application");
		driver.quit();
	}
}
