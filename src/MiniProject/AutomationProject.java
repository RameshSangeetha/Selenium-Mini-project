package MiniProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationProject {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
			
		/*WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("b.sc.rameshs1990@gmail.com");
		
		boolean displayed = email.isDisplayed();
		System.out.println("Displayed is:"+displayed);
		
		WebElement account = driver.findElement(By.id("SubmitCreate"));
		account.click();
		
		WebElement gender = driver.findElement(By.id("id_gender1"));
		gender.click();
		
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("Ramesh");
		
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("S");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Varsith@123");
		
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("11");
		
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByValue("11");
		
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1990");
		
		WebElement company = driver.findElement(By.id("company"));	
		company.sendKeys("Wipro");
		
		WebElement address1 = driver.findElement(By.id("address1"));			
		address1.sendKeys("W.R. Grace Building, New York");
		String text = address1.getText();
		System.out.println(text);
		
		WebElement address2 = driver.findElement(By.id("address2"));			
		address2.sendKeys("1114 Avenue of the Americas, 50th floor New York,");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("New York");
		
		WebElement state = driver.findElement(By.id("id_state"));
		state.sendKeys("New York");
		
		WebElement postalcode = driver.findElement(By.id("postcode"));
		postalcode.sendKeys("10036");
		
//		WebElement country = driver.findElement(By.id("id_country"));
//		Select s3 = new Select(country);
//	    s3.selectByValue("1");
				
		WebElement Additionalinformation = driver.findElement(By.id("other"));
		Additionalinformation.sendKeys("9094776107");
		
		WebElement homenumber = driver.findElement(By.id("phone"));
		homenumber.sendKeys("+212-895-1100");
		
		WebElement mobilenumber = driver.findElement(By.id("phone"));
		mobilenumber.sendKeys("9094776108");
		
		WebElement assign = driver.findElement(By.id("alias"));
		assign.sendKeys("New York");

		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();
				
*/
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement email21 = driver.findElement(By.id("email"));
		email21.sendKeys("srameshstar12121@gmail.com");
		
		WebElement password22 = driver.findElement(By.id("passwd"));
		password22.sendKeys("Dharshan@123");
		
		WebElement login2 = driver.findElement(By.id("SubmitLogin"));
		login2.click();

		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		tshirt.click();
		
		WebElement orderview = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]"));
		orderview.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement addtocart = driver.findElement(By.id("add_to_cart"));
		addtocart.click();
		
		WebElement proceedcheckout1 = driver.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
		proceedcheckout1.click();

		WebElement closing = driver.findElement(By.xpath("//a[@title='Close']"));
		closing.click();
		
	//	WebElement checkout = driver.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
		//checkout.click();
	
		WebElement checkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		checkout2.click();
		
/*		WebElement email2 = driver.findElement(By.id("email"));
		email2.sendKeys("b.sc.ramesh1990@gmail.com");
		
		WebElement password2 = driver.findElement(By.id("passwd"));
		password2.sendKeys("Varsith@123");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
	*/
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();

		
		WebElement checkbox = driver.findElement(By.id("cgv"));
		checkbox.click();

		WebElement shipping = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		shipping.click();
		
		//WebElement closing = driver.findElement(By.xpath("//a[@title='Close']"));
		//closing.click();

//		WebElement shipping1 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
	//	shipping1.click();

		WebElement payment = driver.findElement(By.xpath("//a[@class='cheque']"));
		payment.click();

		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();
		
		TakesScreenshot ram = (TakesScreenshot) driver;
		File source = ram.getScreenshotAs(OutputType.FILE);
		File deom = new File("C:\\Users\\elcot\\eclipse-workspace\\Testing\\Screenshot\\Orderdone.png");
		FileUtils.copyFile(source, deom);
	}
	
}