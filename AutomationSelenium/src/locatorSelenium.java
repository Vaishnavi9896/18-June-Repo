import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorSelenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(4000);
	driver.findElement(By.tagName("input")).sendKeys("Vaishnavi");
	Thread.sleep(5000);
	driver.findElement(By.name("password")).sendKeys("vaishnavi");
	driver.findElement(By.tagName("div")).click();
	//driver.findElement(By.xpath("//div[text()='Log In']")).click();
}
}
