import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFBsignUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                //maximize the browser
	driver.get("https://www.facebook.com/");       //1st way Url Insert
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name=\'firstname\']")).sendKeys("vaishnavi");
	driver.findElement(By.xpath("//input[@name=\'lastname\']")).sendKeys("hatwar");
	driver.findElement(By.xpath("//input[@name=\'reg_email__\']")).sendKeys("vaish@gmail.com");
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("vaish");
	WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
	Select s=new Select(day);
	Thread.sleep(3000);
	s.selectByValue("9");
	
	WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
	Select s1=new Select(month);
	Thread.sleep(3000);
	s1.selectByValue("8");
	
	WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
	Select s2=new Select(year);
	Thread.sleep(3000);
	s2.selectByValue("1996");
	
	driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
}
}
