package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                //maximize the browser
	driver.get("https://eaa7-54-235-125-244.ngrok.io");       // Url Insert Main page             
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Sign Up Free']")).click();
	driver.findElement(By.xpath("//input[@id='signupUsername']")).sendKeys("companyfounder");
	driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("companyfounder123@gmail.com");
	driver.findElement(By.xpath("//input[@id='signupPassword']")).sendKeys("company@123");
	driver.findElement(By.xpath("//input[@id='promoCode']")).sendKeys("FOUNDERS25");
	driver.findElement(By.xpath("//input[@id='signupTerms']")).click();
	driver.findElement(By.xpath("//input[@id='signupNews']")).click();
driver.findElement(By.xpath("//label[text()=' I have read and agree to the ']")).click();
	driver.findElement(By.xpath("//button[text()='Sign Up for Free']")).click();
	
	driver.findElement(By.xpath("//button[text()='Ok']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
