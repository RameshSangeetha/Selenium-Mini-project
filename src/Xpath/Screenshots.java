package Xpath;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		//large interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//TakesScreenshot small interface----narrving type casting methods
		TakesScreenshot ram = (TakesScreenshot) driver; //common coding
		
		//getScreenshotAS
		 File var = ram.getScreenshotAs(OutputType.FILE); //common coding
		 
		//location to store the screenshto
		 File deom = new File("C:\\Users\\elcot\\eclipse-workspace\\Testing\\Screenshot\\flipkart.png");
		
		 //copy the screenshot to the required location
		 FileUtils.copyFile(var, deom);
		 
		 WebElement emailid = driver.findElement(By.xpath("//input[@autocomplete='off'][1]"));
		 emailid.sendKeys("ramesh@gmail.com");
		 
		 boolean displayed = emailid.isDisplayed();
		 System.out.println(displayed);
		 
		 boolean enabled = emailid.isEnabled();
		 System.out.println(enabled);
		 
		 WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		 pass.sendKeys("ram@123");
		
		 WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		 login.click();
		//TakesScreenshot small interface----narrving type casting methods
			TakesScreenshot ram1 = (TakesScreenshot) driver; //default coding
			
			//getScreenshotAS
			 File var1 = ram1.getScreenshotAs(OutputType.FILE);
			 
			//location to store the screenshto
			 File deom1 = new File("C:\\Users\\elcot\\eclipse-workspace\\Testing\\Screenshot\\flipkart1.png");
			
			 //copy the screenshot to the required location
			 FileUtils.copyFile(var1, deom1);
		 

	}

}
