package Xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Magnus {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magnusedu.spi-global.com/");
		driver.manage().window().maximize();
		
		WebElement domain= driver.findElement(By.id("domain"));
		Select s = new Select(domain);
		s.selectByVisibleText("MAGNUS");		
	
		WebElement email= driver.findElement(By.id("username"));
		email.sendKeys("ramesh.s");
		
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("Subramani@123");
		
		WebElement login= driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
	
		/*WebElement production = driver.findElement(By.xpath("//a[text()=' PRODUCTION']"));
		production.click();
		Select butts = new Select(production);
		butts.selectByValue("1");
		 */
		WebElement production1 = driver.findElement(By.xpath("//a[@class='small-box-footer']"));
		production1.click();
		WebElement open = driver.findElement(By.id("OpenCheckout"));
		open.click();

		WebElement checkout = driver.findElement(By.id("FinalCheckIn"));
		Thread.sleep(2000);
		checkout.click();

		WebElement Finalcheckout = driver.findElement(By.id("FinalCheckInput"));
		Thread.sleep(2000);
		Finalcheckout.click();

		
	}

}

