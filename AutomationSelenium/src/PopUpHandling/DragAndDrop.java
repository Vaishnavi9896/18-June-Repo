package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                //maximize the browser
	driver.get("https://demo.guru99.com/test/drag_drop.html");       // Url Insert Main page             
	Thread.sleep(2000);	
	
	Actions act = new Actions(driver);
	WebElement src= driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	//driver.findElement(By.xpath(""))
	
	//act.dragAndDrop(src, src).perform();
	act.clickAndHold().perform();
	act.release();
	
	
	
	
	
	
	
	
	
}
}
