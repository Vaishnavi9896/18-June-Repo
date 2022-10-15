package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodwebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
		
		WebDriver driver = new ChromeDriver();                  //Browser Launch
		driver.manage().window().maximize();                //maximize the browser
		driver.get("https://www.facebook.com/");       //1st way Url Insert
		Thread.sleep(4000);
	
	//WebElement method =	driver.findElement(By.xpath("//a[text()='Create New Account'")).click();
		
		
		
		
		
		
}
}