package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {
	public static WebDriver driver;
		
		@BeforeTest
		
		  public void a() throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", "C:\\Jmeter\\chromedriver 114\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		}
		
			  @Test
			  public void Browser() throws InterruptedException {
			  driver.get("http://155.248.242.125:8090/");
			  System.out.println("Browser launch Successfully");
			  Thread.sleep(7000);
		  }
		
			@Test
	  public void login() throws InterruptedException {
		System.out.println("Browser initialsied");
		 driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[3]/div[1]/div[1]/input")).sendKeys("cosb@yopmail.com");
		  Thread.sleep(9000);
		 driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[3]/div[2]/div[1]/input")).sendKeys("Admin@123");
			Thread.sleep(5000);
		  driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[5]/input")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[6]/button[1]/span")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-new-dashboard/app-scheme-modal/p-dialog/div/div/div[2]/ul/li/a")).click();
	  }  
  

}
