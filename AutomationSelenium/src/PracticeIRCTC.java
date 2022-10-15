import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeIRCTC {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                //maximize the browser
	driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");       //1st way Url Insert
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8999897867");
	driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("vaishnavihatwar@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[text()='Continue'])[1]")).click();
	
	driver.findElement(By.xpath("//input[@id='username-id']")).sendKeys("vaishnaviVaishnavi");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vaishnavi96Vaish");
	//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vaishnavi Hatwar");
	driver.findElement(By.xpath("//input[@name='confirm password']")).sendKeys("vaishnavi96Vaish");
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("vaishnavi hatwar");
	//driver.findElement(By.xpath("//input[@name='occupation']")).click();
	driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='Student']")).click();
	
	//driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle'])[1]")).click();
	
	//driver.findElement(By.xpath("//button[text()='Government']")).click();
	
	//driver.findElement(By.xpath("//input[@name='dob']")).click();
	driver.findElement(By.xpath("//input[@id=\"dob_field\"]")).click();
	//Actions act = new Actions(driver);
	
	//WebElement date=driver.findElement(By.xpath("//th[text()='September 2004']"));
	//act.doubleClick(date);
	//driver.findElement(By.xpath("//span[text()='1996']")).click();
	//driver.findElement(By.xpath("//span[text()='Aug']")).click();

	//driver.findElement(By.xpath("//th[text()='1996']")).click();
	driver.findElement(By.xpath("//td[text()='9']")).click();
	driver.findElement(By.xpath("//p[text()='Female']")).click();
	
	
	
	
	
	
}
}
