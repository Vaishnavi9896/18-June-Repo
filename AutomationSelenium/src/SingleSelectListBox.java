import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                //maximize the browser
	driver.get("https://www.facebook.com/login/");       //1st way Url Insert
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	Thread.sleep(4000);
	
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));  //webele
	                                           //ment locate
	Select s =new Select(month);      //in select class object we give arg 
	Thread.sleep(4000);
	s.selectByIndex(1);                //index start from 0
	Thread.sleep(3000);
	s.selectByValue("1");
	Thread.sleep(3000);
	s.selectByVisibleText("Aug");

}
}
