package testuniversity;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fail_ConfigurationAnnotation {
  
  @BeforeClass
  public void setUp() {
	  System.out.println("1. Open Browser");
	  System.out.println("2. Open Application");
  }
  
  @BeforeMethod
  public void signIn() {
	  System.out.println("3. Sign Into the Application");
  }
  
  @Test
  public void userSearch() {
	  System.out.println("4. Search For User");
  }
  
  @AfterMethod
  public void signOut() {
	  System.out.println("5. Sign Out from the Application");
  }
 
  @AfterClass
  public void tearDown() {
	  System.out.println("6. Remove all browser cookies");
  }
}
