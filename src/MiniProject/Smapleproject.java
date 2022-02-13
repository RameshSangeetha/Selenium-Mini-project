package MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Smapleproject {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	
		/*
		WebElement Newuser = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[7]/td"));
		Newuser.click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("RameshSubramani");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("937XHI");
		WebElement confirmpass = driver.findElement(By.id("re_password"));
		confirmpass.sendKeys("ram@123");
		WebElement fullname = driver.findElement(By.id("full_name"));
		fullname.sendKeys("RameshSubramani");
		WebElement email = driver.findElement(By.id("email_add"));
		email.sendKeys("RameshSubramani.V@gmail.com");
		Thread.sleep(2000);
		WebElement captcha = driver.findElement(By.id("captcha-form"));
		captcha.sendKeys("sably");
		WebElement terms = driver.findElement(By.id("tnc_box"));
		terms.click();
		WebElement register = driver.findElement(By.id("Submit"));
		register.click();
	*/
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("RameshSubramani");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("937XHI");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement Location = driver.findElement(By.id("location"));		
		Select s = new Select (Location);
		s.selectByIndex(5);
		
		WebElement Hotel = driver.findElement(By.id("hotels"));		
		Select s1 = new Select (Hotel);
		s1.selectByIndex(1);
		
		WebElement Roomstype = driver.findElement(By.id("room_type"));		
		Select s2 = new Select (Roomstype);
		s2.selectByIndex(3);
		
		WebElement Numberofrooms = driver.findElement(By.id("room_nos"));		
		Select s3 = new Select (Numberofrooms);
		s3.selectByIndex(3);
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));		
		checkin.sendKeys("11/02/2022");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));		
		checkout.sendKeys("15/02/2022");
		
		WebElement adultsroom = driver.findElement(By.id("adult_room"));		
		Select s4 = new Select (adultsroom);
		s4.selectByIndex(2);
		
		WebElement childrenroom = driver.findElement(By.id("child_room"));		
		Select s5 = new Select (childrenroom);
		s5.selectByIndex(2);

		WebElement search = driver.findElement(By.id("Submit"));		
		search.click();
	
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));		
		radiobutton.click();
	
		WebElement submit = driver.findElement(By.id("continue"));		
		submit.click();

		WebElement firstname = driver.findElement(By.id("first_name"));		
		firstname.sendKeys("Ramesh");

		WebElement lastname = driver.findElement(By.id("last_name"));		
		lastname.sendKeys("S");

		WebElement billingaddress = driver.findElement(By.id("address"));		
		billingaddress.sendKeys("Green Technology DLF chennai 89");
		System.out.println("DLF branch Greens");

		WebElement creditno = driver.findElement(By.id("cc_num"));		
		creditno.sendKeys("1548587512547585");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));		
		Select s6 = new Select (cardtype);
		s6.selectByIndex(2);
		
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));		
		Select s7 = new Select (expmonth);
		s7.selectByIndex(6);
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));		
		Select s8 = new Select (expyear);
		s8.selectByIndex(8);

		WebElement ccv = driver.findElement(By.id("cc_cvv"));		
		ccv.sendKeys("235");

		WebElement booking = driver.findElement(By.id("book_now"));		
		booking.click();
		
		WebElement logout = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]"));		
		logout.click();
		System.out.println("Thank you");
		
		
		
	}

	
	
	
	
}