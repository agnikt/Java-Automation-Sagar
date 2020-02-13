package java_first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class product_page_price {

	
public static void main (String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.diamondsfactory.co.uk/engagement-rings/classic-solitaire");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	
		driver.manage().window().maximize();
		 List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]/div"));
		    for (WebElement element : list) {
		        String link = element.getAttribute("href");
		        String text = element.getText();
		        System.out.println(element.getTagName() + "=" + link + ", " + text);
		    }
		
		
		

		
		}
}