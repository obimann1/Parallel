package newPackage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class TestNGPrograms {
  
  @BeforeClass
  public void login(){
		System.out.println("Login into application");
  }
	
  @Test
  public void advancedsearch(){
  	System.out.println("Advanced search operation");
  }





  @AfterClass
  public void logout(){
  	System.out.println("Logout operation");
  }
  	
}
