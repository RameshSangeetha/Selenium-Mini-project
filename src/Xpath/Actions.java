package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {


public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/buttons");
	Thread.sleep(3000);
	driver.manage().window().maximize();

	WebElement clickbutton = driver.findElement(By.xpath("//button[text()= 'Click Me']"));
	org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
	ac.click(clickbutton).build().perform();
	
	WebElement drog2 = driver.findElement(By.id("rightClickBtn"));
	ac.contextClick(drog2).build().perform();
	
	WebElement drog3 = driver.findElement(By.id("doubleClickBtn"));
	ac.doubleClick(drog3).build().perform();
	
	driver.navigate().to("http://www.leafground.com/pages/drop.html");
	WebElement draganddrop1 = driver.findElement(By.id("draggable"));
	WebElement draganddrop2 = driver.findElement(By.id("droppable"));
	ac.dragAndDrop(draganddrop1, draganddrop2).build().perform();
	
	WebElement moveto = driver.findElement(By.id("draggable"));
	ac.moveToElement(moveto).build().perform();
	
	
//	WebElement drog4 = driver.findElement(By.id("mydiv"));
	//ac.moveToElement(drog4).build().perform();

	
	
	
	
	
	
	
}
	
}
