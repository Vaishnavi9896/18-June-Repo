import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                    //method chaining to maximize the browser
	driver.get("https://www.facebook.com/");
	//driver.get("https://en-gb.facebook.com/");              //insert url
	Thread.sleep(5000);                                     //delay for 5 sec
	//FOR LOGIN ID
	driver.findElement(By.tagName("input")).sendKeys("vaishnavi");
	//driver.findElement(By.id("email")).sendKeys("vaishnavi");
	//driver.findElement(By.name("email")).sendKeys("vaishnavi");
	//driver.findElement(By.className("inputtext _55r1 inputtext _1kbt inputtext _1kbt")).sendKeys("vaishnavi");
	//className value is dynamic;it changes every time so that we can't locate the webelement by classname
	
	//FOR PASSWORD
	//driver.findElement(By.tagName("input")).sendKeys("vaishnavi");
	//driver.findElement(By.id("pass")).sendKeys("vaishnavi");
	//driver.findElement(By.name("pass")).sendKeys("vaishnavi");
	driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("vaishnavi");
	
	//FOR LOGIN BUTTON
	//driver.findElement(By.tagName("button")).click();
	//driver.findElement(By.id("loginbutton")).click();
	//driver.findElement(By.name("login")).click();
	driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
	
	/*driver.findElement(By.linkText("Email address or phone number")).sendKeys("Velocity Class");
	driver.findElement(By.className("inputtext _55r1 _6luy ")).sendKeys("password");
	driver.findElement(By.tagName("button")).click();
	driver.findElement(By.tagName("a")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vaishnavihatwar");
	driver.findElement(By.id("//input[@id='u_v_b_13']")).sendKeys("vaishnavi");
*/
}
}
