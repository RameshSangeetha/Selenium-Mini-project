package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrms {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hrms.spi-global.com/#/login");
		driver.manage().window().maximize();
		
		WebElement offbutton = driver.findElement(By.xpath("//span[@class='onoffswitch-switch']"));
		offbutton.click();
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("ramesh.s1");
		WebElement pass = driver.findElement(By.name("Password"));
		pass.sendKeys("Dharshan@1234");
		
		boolean displayed = pass.isDisplayed();
		System.out.println("displayed:"+" "+displayed);
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
		login.click();
		
		Thread.sleep(2000);
		WebElement request = driver.findElement(By.xpath("(//button[@class='btn request_active_button'])[1]"));
		request.click();
		
		Thread.sleep(2000);
		WebElement wfh = driver.findElement(By.xpath("(//img[@title='Work From Home']"));
		wfh.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
