package demo;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class main 
{


  @BeforeMethod
  public void beforeMethod() {

      System.out.println("Before Test");
  }

  @AfterMethod
  public void afterMethod() {
  System.out.println("After Test");
  }
}