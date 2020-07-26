package java_first;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class java_demo {
	
	public static void main (String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.diamondsfactory.co.uk");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[1]/div[1]/div/ul/li[3]/a")).click();

      Thread.sleep(2000);
      
        js.executeScript("window.scrollBy(0,350)");
        
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"loc_container1\"]/div[2]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"serviceli\"]/li[1]/a")).click();

	driver.findElement(By.xpath("//*[@id=\"timings\"]/li[7]")).click();
	  js.executeScript("window.scrollBy(0,200)");
	
		
	driver.findElement(By.id("view_name")).sendKeys("ganesh");
	driver.findElement(By.id("view_email")).sendKeys("ganesh.n@diamondsfactory.in");
	driver.findElement(By.id("view_mobile")).sendKeys("9870336965");
	driver.findElement(By.xpath("//*[@id=\"appt_enquiry\"]")).sendKeys("hii am alok ");
	driver.findElement(By.id("appt_perms")).click();
	driver.findElement(By.xpath("//*[@id=\"button-viewing\"]")).click();
		 /* Test data to java ALOK ALOK 26-07-2020  */
		/*System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver1 =new FirefoxDriver();
		
		driver1.get("http://uk.df.net/");
		driver1.manage().window().maximize();
		*/
		
	}

}
