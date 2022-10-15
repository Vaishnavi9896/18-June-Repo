package PopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
		
		WebDriver driver = new ChromeDriver();                 //Browser Launch
		driver.manage().window().maximize();                  //maximize the browser
		driver.get("https://demo.guru99.com/test/delete_customer.php");       //1st way Url Insert
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("vaishnavi");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
		Alert alt= driver.switchTo().alert();
		alt.accept();
		alt.accept();
		
		//alt.dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
	}		
}
