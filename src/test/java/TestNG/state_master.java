package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class state_master extends data_provider {
	
	@Test
	  public void Test() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-new-dashboard/div/div/div/div[1]/div/ul/li[7]/a/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-new-dashboard/div/div/div/div[1]/div/ul[2]/li[2]/a/img")).click();
		Thread.sleep(1000);
		
	  }
	
	@Test (dataProvider = "state_master")
	
	  public void Test (String State, String GSTStateCode, String GSTStateName) throws InterruptedException {
		//Add Functionality
		driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/p-table/div/div[1]/div[2]/div/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/app-state-master-form/form/p-dialog/div/div/div[2]/div/div[1]/div/app-global-input-text/form/div/input")).sendKeys(State);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/app-state-master-form/form/p-dialog/div/div/div[2]/div/div[2]/div/app-global-input-text/form/div/input")).sendKeys(GSTStateCode);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/app-state-master-form/form/p-dialog/div/div/div[2]/div/div[3]/div/app-global-input-text/form/div/input")).sendKeys(GSTStateName);
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/app-state-master-form/form/p-dialog/div/div/div[2]/div/div[4]/div/app-global-dropdown/form/div/p-dropdown/div/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/app-state-master-form/form/p-dialog/div/div/div[2]/div/div[4]/div/app-global-dropdown/form/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]/li")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/app-state-master-form/form/p-dialog/div/div/div[3]/p-button[2]/button/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/app-state-master-form/app-dialogue-popup/p-confirmdialog/div/div/div[3]/p-button/button/span")).click();
	Thread.sleep(1000);
	}
	
	@AfterTest
	public void AfterTest() throws InterruptedException {
	//Delete Functionality
	driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/p-table/div/div[2]/table/tbody/tr[1]/td[7]/p-splitbutton/div/button[2]/span[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div/p-tieredmenusub/ul/li[3]/a/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/app-confirm-modal/form/p-dialog/div/div/div[2]/div/div[2]/div/textarea")).sendKeys("testing purpose");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-state-master/div[2]/div/div/app-global-datatable/app-confirm-modal/form/p-dialog/div/div/div[3]/p-button[2]/button/span")).click();
	Thread.sleep(1000);
	
	
	}
	

		//@DataProvider(name="state_master")
		
		//public Object[][] State() {
		//Object [][] data = new Object [2][3];
		//data [0][0] = "kam";
		//data [0][1] = "73";
		//data [0][2] = "kam";
		
		//data [1][0] = "sag";
		//data [1][1] = "72";
		//data [1][2] = "poa";
	
		//return data;
		
		
		
		
	  }

