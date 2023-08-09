package My_Project.Testing_Purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jmeter\\chromedriver 114\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://155.248.242.125:8090/");
			Thread.sleep(10000);
			driver.manage().window().maximize();
			//Login
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[3]/div[1]/div[1]/input")).sendKeys("cosb@yopmail.com");
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[3]/div[2]/div[1]/input")).sendKeys("Admin@123");
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[5]/input")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[6]/button[1]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-new-dashboard/app-scheme-modal/p-dialog/div/div/div[2]/ul/li/a")).click();
			Thread.sleep(2000);

		}

	}
