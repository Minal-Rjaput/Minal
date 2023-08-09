package TestNG;

 

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

 

public class user_creation {

    public WebDriver d;

    

    int countvalue = 0;
    		
    		@BeforeTest
    		
    		  public void a() throws InterruptedException {
    			  System.setProperty("webdriver.chrome.driver", "C:\\Jmeter\\chromedriver 114\\chromedriver.exe");
    			  d = new ChromeDriver();
    			  d.manage().window().maximize();
    d.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    		}
    		
    			  @Test
    			  public void Browser() throws InterruptedException {
    			  d.get("http://155.248.242.125:8090/");
    			  System.out.println("Browser launch Successfully");
    			  Thread.sleep(7000);
    		  }
    		
    			@Test
    	  public void login() throws InterruptedException {
    		System.out.println("Browser initialsied");
    		 d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[3]/div[1]/div[1]/input")).sendKeys("cosb@yopmail.com");
    		  Thread.sleep(9000);
    		 d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[3]/div[2]/div[1]/input")).sendKeys("Admin@1211");
    			Thread.sleep(5000);

    			d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[5]/input")).click();
    			d.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/form[1]/div/div[6]/button[1]/span")).click();
    			d.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-new-dashboard/app-scheme-modal/p-dialog/div/div/div[2]/ul/li/a")).click();

    // user master selection

    d.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-new-dashboard/div/div/div/div[1]/div/ul/li[3]/a/img")).click();

    Thread.sleep(3000);

    //entering user master

    d.findElement(By.xpath("//ul[contains(@class,'dashboard-menu-sub ng-star-inserted')]//li[1]")).click();

    Thread.sleep(3000);

    

    int j = 17;

    

    for (int i=0; i<=100; i++) {

        

    

    

    //clicking on add new button

    d.findElement(By.xpath("//div[contains(@class,'row')]//button[1]")).click();

    Thread.sleep(4000);

    

    //entering first name, last name & email

    String firstName = RandomString_generator();

    //d.findElement(By.xpath("//div[contains(@class,'full-width relative')]//input[@placeholder='Enter First Name']")).sendKeys("Riya"+charcount.charAt(countvalue));

    d.findElement(By.xpath("//div[contains(@class,'full-width relative')]//input[@placeholder='Enter First Name']")).sendKeys(firstName);

    Thread.sleep(3000);

    

    d.findElement(By.xpath("//div[contains(@class,'full-width relative')]//input[@placeholder='Enter Last Name']")).sendKeys("Khanna");

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[contains(@class,'full-width relative')]//input[@placeholder='Enter Email']")).sendKeys(firstName+"@yopmail.com");

    Thread.sleep(6000);

    

    //gender selection

    String k = String.valueOf(j);

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-"+k+"')]//span")).click();

    Thread.sleep(2000);

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper ng-tns-c54-"+k+"')]//ul//li[1]")).click();

    Thread.sleep(6000);

    

    k = String.valueOf(j-2);

    //DOB Selection

    d.findElement(By.xpath("//div[@class='full-width relative']//input[@class='ng-tns-c59-"+k+" p-inputtext p-component ng-star-inserted']")).click();

    Thread.sleep(2000);

    d.findElement(By.xpath("//div[@class='p-datepicker-title ng-tns-c59-"+k+"']//button[@class='p-datepicker-year p-link ng-tns-c59-"+k+" ng-star-inserted']")).click();

    Thread.sleep(2000);

    d.findElement(By.xpath("//div[@class='p-datepicker-header ng-tns-c59-"+k+"']//button[@class='p-ripple p-element p-datepicker-prev p-link ng-tns-c59-"+k+" ng-star-inserted']")).click();

    Thread.sleep(2000);

    d.findElement(By.xpath("//div[@class='p-datepicker-header ng-tns-c59-"+k+"']//button[@class='p-ripple p-element p-datepicker-prev p-link ng-tns-c59-"+k+" ng-star-inserted']")).click();

    Thread.sleep(2000);

    d.findElement(By.xpath("//div[@class='p-yearpicker ng-tns-c59-"+k+" ng-star-inserted']//span[@class='p-ripple p-element p-yearpicker-year ng-tns-c59-"+k+" ng-star-inserted']")).click();

    Thread.sleep(2000);

    d.findElement(By.xpath("//div[@class='p-monthpicker ng-tns-c59-"+k+" ng-star-inserted']//span[3]")).click();

    Thread.sleep(2000);

    d.findElement(By.xpath("//div[@class='p-datepicker-calendar-container ng-tns-c59-"+k+" ng-star-inserted']//tr//td//span[@class='p-ripple p-element ng-tns-c59-"+k+" ng-star-inserted']")).click();

    Thread.sleep(2000);

    

    

    //mobile number

    d.findElement(By.xpath("//div//input[@class='p-inputtext p-component p-element form-control ng-untouched ng-pristine ng-invalid ng-star-inserted']")).sendKeys(randomMobile());

    Thread.sleep(2000);

    

    k = String.valueOf(j+2);

    WebElement element = d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-"+k+"')]//span"));

    scroll_to_element(d, element);

    

    //pincode

    d.findElement(By.xpath("//div[contains(@class,'full-width relative')]//input[@placeholder='Enter Pincode']")).sendKeys("400051");

    Thread.sleep(6000);

    

    //district selection

    //d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-19')]//span")).click();

    element.click();

    Thread.sleep(1000);

    

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper ng-tns-c54-"+k+"')]//span")).click();

    Thread.sleep(6000);

    

    k = String.valueOf(j+3);

    //designation selection

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-"+k+"')]//span")).click();

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper ng-tns-c54-"+k+"']//ul//li[@aria-label='Manager']")).click();

    Thread.sleep(6000);

    

    k = String.valueOf(j+4);

    //dept selection

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-"+k+"')]//span")).click();

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper ng-tns-c54-"+k+"']//ul//li[@aria-label='COSMOS BANK']")).click();

    Thread.sleep(2000);

    

    element = d.findElement(By.xpath("//div[contains(@class,'full-width relative')]//input[@placeholder='Enter Level']"));

    scroll_to_element(d, element);

    Thread.sleep(1000);

    //Level

    d.findElement(By.xpath("//div[contains(@class,'full-width relative')]//input[@placeholder='Enter Level']")).sendKeys("L9");

    Thread.sleep(2000);

    

    k = String.valueOf(j+5);

    //selecting user type

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-"+k+"')]//span")).click();

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper ng-tns-c54-"+k+"')]//ul//li")).click();

    Thread.sleep(6000);

    

    k = String.valueOf(j+8);

    //bank mapping ddl

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-"+k+"')]//span")).click();

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper ng-tns-c54-"+k+"')]//ul//li")).click();

    Thread.sleep(2000);

    

    k = String.valueOf(j+9);

    //zone mapping

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-"+k+"')]")).click();

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper ng-tns-c54-"+k+"')]//ul//li[1]")).click();

    Thread.sleep(2000);

    

    k = String.valueOf(j+10);

    //branch mapping

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-"+k+"')]//span")).click();

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper ng-tns-c54-"+k+"')]//ul//li[@aria-label='IDBI A']")).click();

    Thread.sleep(2000);

    

    k = String.valueOf(j+11);

    //role selection

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-trigger ng-tns-c54-"+k+"')]")).click();

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[contains(@class,'p-dropdown-items-wrapper ng-tns-c54-"+k+"')]//ul//li[@aria-label='mlimaker']")).click();

    Thread.sleep(2000);

    

    k = String.valueOf(j-1);

    //scheme selection

    d.findElement(By.xpath("//div[contains(@class,'ng-tns-c110-"+k+" p-multiselect-trigger')]")).click();

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[contains(@class,'p-multiselect-filter-container ng-tns-c110-"+k+" ng-star-inserted')]//input")).sendKeys("Atmanirbhar");

    Thread.sleep(2000);

    

    d.findElement(By.xpath("//div[@class='p-checkbox p-component ng-tns-c110-"+k+" ng-star-inserted']")).click();

    Thread.sleep(2000);

    

    k = String.valueOf(j-3);

    //submit button

    d.findElement(By.xpath("//div[contains(@class,'p-dialog-footer ng-tns-c48-"+k+" ng-star-inserted')]//p-button[@label='Submit']")).click();

    Thread.sleep(6000);

    

    //OK button

    d.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-user-master/div[2]/div/div/app-global-lazy-load-checkbox-datatable/app-user-master-form/app-dialogue-popup/p-confirmdialog/div/div/div[3]/p-button/button")).click();

    Thread.sleep(2000);

    

    countvalue++;

    j = j+17;

    

    }

    }

    

    

        public String RandomString_generator() {

            int length = 10; // Length of the random string

            String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Characters to choose from

            StringBuilder randomString = new StringBuilder();

 

     

 

            Random random = new Random();

            for (int i = 0; i < length; i++) {

                int randomIndex = random.nextInt(characters.length());

                char randomChar = characters.charAt(randomIndex);

                randomString.append(randomChar);

            }

 

     

 

            System.out.println("Random String: " + randomString.toString());

            return randomString.toString();

        }

        public String randomMobile() {

            Random random = new Random();

            StringBuilder mobileNumber = new StringBuilder("9"); // Start with 9 to follow common mobile number patterns

 

            for (int i = 0; i < 9; i++) {

                int digit = random.nextInt(10); // Generate a random digit between 0 and 9

                mobileNumber.append(digit);

            }

 

     

 

            System.out.println("Random Mobile Number: " + mobileNumber.toString());

            return mobileNumber.toString();

        }

        public void scroll_to_element(WebDriver driver, WebElement element) throws InterruptedException {

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        

        // Scroll down by pixel offset int scrollOffset = 500;

        // Change this value as needed jsExecutor.executeScript("window.scrollBy(0, " + scrollOffset + ");");

        // Scroll to a specific element

        // For example, scrolling to an element with the ID "elementId"

        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

        Thread.sleep(2000);

    }

}

