package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

		public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ramesh@gmail.com");
		
		boolean displayed = email.isDisplayed();
		System.out.println("Displayd:"+" "+displayed);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("ramsan@123");

		boolean enabled = pass.isEnabled();
		System.out.println("enabled:"+" "+enabled);

		//WebElement log = driver.findElement(By.name("login"));
		//log.click();
		
		//boolean selected= log.isSelected();
		//System.out.println("selected"+" "+selected);
		
		WebElement text = driver.findElement(By.xpath("//div[@class='_6ltj']"));
		System.out.println("Forgotten password?");
		
		WebElement creatbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		creatbutton.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));		
		firstname.sendKeys("Ramesh");
		
		boolean enabled2 = firstname.isEnabled();
		System.out.println("Displayd:"+" "+enabled2);

		WebElement lastname = driver.findElement(By.name("lastname"));		
		firstname.sendKeys("S");
		
		boolean enabled3 = lastname.isEnabled();
		System.out.println("Displayd:"+" "+enabled3);

		Thread.sleep(3000);

		WebElement day = driver.findElement(By.id("day"));		
		Select s = new Select (day);
		s.selectByValue("11");
		
		WebElement month = driver.findElement(By.id("month"));		
		Select s1 = new Select (month);
		s1.selectByValue("11");
		
		WebElement year = driver.findElement(By.id("year"));		
		Select s2 = new Select (year);
		s2.selectByValue("1990");
	
		WebElement female = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));		
		female.click();
		
		//Select s3 = new Select (female);
		//s3.selectByValue("Female");
	
		WebElement male = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));		
		Select s4 = new Select (male);
		s4.selectByValue("Male");
	
		WebElement custom = driver.findElement(By.xpath("(//label[@class='_58mt'])[3]"));		
		Select s5 = new Select (custom);
		s5.selectByValue("Custom");

		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.name("websubmit"));		
		signup.click();		
		
		
/*		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));

		Select s = new Select(multiple);
		
		boolean multiple1 = s.isMultiple();
		System.out.println("multiple:"+multiple1 );
		
		s.selectByValue("1");
		s.selectByVisibleText("Loadrunner");
		s.selectByValue("3");

//		s.deselectAll();
		
		List<WebElement> allOptions = s.getOptions();	
		for(WebElement opt :allOptions) {
			
			String text = opt.getText();
			System.out.println(text);
					
		}
		
		System.out.println();
		System.out.println("All options");
		List<WebElement> allSelected = s.getAllSelectedOptions();	
		for(WebElement all : allSelected) {

			String text = all.getText();	
			System.out.println(text);
		}
		System.out.println();
		System.out.println("First Selected option");
		WebElement firstSelected = s.getFirstSelectedOption();
		String text = firstSelected.getText();
		System.out.println(text);
		
		*/
	}
}
