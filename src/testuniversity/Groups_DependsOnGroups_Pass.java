package testuniversity;

import org.testng.annotations.Test;

public class Groups_DependsOnGroups_Pass {
	// A class can also be added to a group
	@Test (groups = "initilize")
	public void test1_setUpChrome() {
		System.out.println("1. Setup and Open Browser");
	}
	@Test (dependsOnGroups = "initilize",groups="env_application")
	public void test2_openOrangeCRM() {
		//driver.get("http://opensource-demo.orangehrmlive.com/");
		System.out.println("2. Open Application");
	}
	 @Test (dependsOnGroups = "env_application")
	  public void test3_signIn() {
		  System.out.println("3. Sign Into the Application");
	  }
	  
	  @Test (dependsOnGroups = "env_application")
	  public void test4_searchUser() {
		  System.out.println("4. Search For User");
	  }
	  @Test (dependsOnGroups = "env_application")
	  public void test5_searchEmployee() {
		  System.out.println("5. Search For Employee");
	  }
	  @Test (dependsOnGroups = "env_application")
	  public void test6_searchCandidate() {
		  System.out.println("6. Search For Candidates");
	  }
	  
	  @Test (dependsOnGroups = "env_application")
	  public void test7_signOut() {
		  System.out.println("7. Sign Out from the Application");
	  }
}
