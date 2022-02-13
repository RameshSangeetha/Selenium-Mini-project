package Xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEvents {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		WebElement rightclick = driver.findElement(By.xpath("//a[@class='gb_f']"));
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		ac.contextClick(rightclick).build().perform();
		
		Robot r = new Robot();
		
		
	}

}
