package testuniversity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DefaultExecutionOrder_Class {

  @BeforeClass
  public void setUp() {
	  System.out.println("Chrome - Setup System Property");
	  System.out.println("Open Chrome");
	  System.out.println("Open Test Application");
  }
  @Test (priority = 1)
  public void signIn() {
	  System.out.println("Sign-In to the Application");
  }
  @Test (priority = 2)
  public void searchTShirt() {
	  System.out.println("Search for TShirt!");
  }
  @Test (priority = 3)
  public void signOut() {
	  System.out.println("Sign-Out from the Application");
  }
  @AfterClass
  public void tearDown() {
	  System.out.println("Close Test Application");
	  System.out.println("Close Chrome");
	  System.out.println("Chrome - Cleanup All Cookies");
  }

}
