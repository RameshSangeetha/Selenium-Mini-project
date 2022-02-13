package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	//single frame
	driver.switchTo().frame("singleframe");
	WebElement textBox1 = driver.findElement(By.xpath("//input[@type='text']"));
	textBox1.sendKeys("Ramesh");
	driver.switchTo().defaultContent(); //defaultContent--exit from single frame to main page
	
	//multy frame
	
	WebElement textBox2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	textBox2.click();
	WebElement textBox3 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame("textBox3");
	
	//swith to the inner frame
	
	driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
	
	
	}

}
