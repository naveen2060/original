package Pageobject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Booleanvalidation {
	
	public ChromeDriver driver;
	
	
  @Test
  public void oneway() {
	  
	  driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]/span")).click();
	  
	  
	boolean printcondition =  driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]/span")).isDisplayed();
	  
	  System.out.println(printcondition);
	  
    WebElement element = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]/span"));
	  
	 
	 if(element.isEnabled()) {
		
		System.out.println("passed");
	}
	else {
		System.out.println("failed");
	}
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.savaari.com/");
  
  
  
  }

  @AfterTest
  public void afterTest() {
  }

}
