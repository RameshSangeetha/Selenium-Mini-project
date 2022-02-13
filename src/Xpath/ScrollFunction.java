package Xpath;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunction {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
/*		WebElement seemore = driver.findElement(By.xpath("(//a[@class='nav_a'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", seemore);
		Thread.sleep(2000);
		*/
		
				
		WebElement all = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		all.click();
		WebElement all1 = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[1]"));
		all1.click();
		Thread.sleep(2000);
		WebElement all2 = driver.findElement(By.xpath("(//div[@aria-hidden='true'])[3]"));
		all2.click();
		
		
	}
	
	
	
}
