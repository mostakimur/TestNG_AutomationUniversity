package testuniversity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Configuration_Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Chrome - Setup System Property");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Open Chrome");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Open Test Application");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Sign-In to the Application");
	}

	@Test
	public void searchCustomer() {
		System.out.println("Search Customer!");
		//System.out.println(System.getProperty("user.dir"));
	}

	@Test
	public void searchProduct() {
		System.out.println("Search Product!");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Sign-Out from the Application");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Close Test Application");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Close Chrome");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Chrome - Cleanup All Cookies");
	}
	

}
