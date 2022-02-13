package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		//All data

		System.out.println("**All Data**");
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement all: alldata) {
			String text = all.getText();
			System.out.println(text);
					}
		System.out.println();

		//particular data
		System.out.println("**Particular Data");
 		WebElement particulardata = driver.findElement(By.xpath("(//table/tbody/tr[4]/td[4])"));
		String text1 = particulardata.getText();
		System.out.println(text1);
		System.out.println();
		
		//Headers
		System.out.println("**All Header");
		List<WebElement> allheaders = driver.findElements(By.xpath("(//table/tbody/tr[1])"));
		for(WebElement all1: allheaders) {
			String text2 = all1.getText();
			System.out.println(text2);
					}
		System.out.println();

		

	}

}
