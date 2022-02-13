package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class Alert {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		
		WebElement Alertbutton = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[9]"));
		Alertbutton.click();
		
		WebElement Alerbox1 = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		Alerbox1.click();
		
		org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		WebElement Alerbox2 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		Alerbox2.click();
		
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		//alert2.accept();
		alert1.dismiss();
		
		WebElement Alerbox3 = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		Alerbox3.click();
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("GreenTech DLF Chennai-89");
		String text = alert3.getText();
		System.out.println(text);
		alert3.accept();
		//alert3.dismiss();		
		 
		WebElement Alerbox4 = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		Alerbox4.click();
		org.openqa.selenium.Alert alert4 = driver.switchTo().alert();		
		String text2 = alert4.getText();
		System.out.println(text2);
		alert4.accept();
//		alert4.dismiss();
		
		WebElement Alerbox5 = driver.findElement(By.xpath("//button[@onclick='sweetalert()']"));
		Alerbox5.click();
		org.openqa.selenium.Alert alert5 = driver.switchTo().alert();		
		alert5.accept();

	}

}
