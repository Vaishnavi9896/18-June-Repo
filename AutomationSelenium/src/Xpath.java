import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/downloads");       //1st way Url Insert
	//XPATH BY ATTRIBUTE
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vaishnavi");
	
	//XPATH BY TEXT
	//driver.findElement(By.xpath(""))
	//XPATH BY CONTAINS
	
	//XPATH BY INDEX
	//Navigation nv=driver.navigate();
	//driver.findElement(By.xpath("//input")).c
}
}
