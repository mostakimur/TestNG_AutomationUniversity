package testuniversity;

import org.testng.annotations.Test;

public class HardAssert_SoftAssert {
  @Test
  public void exampleAssertTest() {
	  System.out.println("1. Open Browser");
	  // We will use hard assert
	  System.out.println("2. Open Application");
	  // We will use hard assert
	  
	  System.out.println("3. Sign Into the Application");
	  // We will use hard assert
	  
	  System.out.println("4. Go to Home Page and Verify Home Page");
	  // We will use soft assert
	  
	  System.out.println("5. Go to Search Page and Verify Search Page");
	  // We will use soft assert
	  
	  System.out.println("6. Search For User");
	  // We will use soft assert
	  
	  System.out.println("7. Sign Out from the Application");
	// We will use soft assert
  }
}
