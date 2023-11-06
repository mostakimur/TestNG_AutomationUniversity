package testuniversity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DependsOnMethods_No {
	
	  @Test public void test1_setUpChrome() {
	  System.out.println("1. Setup and Open Browser"); }
	 
	@Test (dependsOnMethods = "test1_setUpChrome")
	public void test2_openOrangeCRM() {
		System.out.println("2. Open Application");
	}
	 @Test (dependsOnMethods = "test2_openOrangeCRM")
	  public void test3_signIn() {
		  System.out.println("3. Sign Into the Application");
	  }
	  
	  @Test (dependsOnMethods = {"test2_openOrangeCRM","test3_signIn"})
	  public void test4_searchUser() {
		  System.out.println("4. Search For User");
	  }
	  @Test (dependsOnMethods = {"test2_openOrangeCRM","test3_signIn"})
	  public void test5_searchEmployee() {
		  System.out.println("5. Search For Employee");
	  }
	  @Test (dependsOnMethods = {"test2_openOrangeCRM","test3_signIn"})
	  public void test6_searchCandidate() {
		  System.out.println("6. Search For Candidates");
	  }
	  
	  @Test (dependsOnMethods = {"test2_openOrangeCRM","test3_signIn"})
	  public void test7_signOut() {
		  System.out.println("7. Sign Out from the Application");
	  }
}
