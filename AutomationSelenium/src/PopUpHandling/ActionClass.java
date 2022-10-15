package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                //maximize the browser
	driver.get("https://www.amazon.in/");       // Url Insert Main page             
	Thread.sleep(2000);	
	
	Actions act = new Actions(driver);
	WebElement ChangeLang = driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));
	
	act.moveToElement(ChangeLang).perform();             //move mouse cursor on particular webelement
	
    act.contextClick().perform();                       //Right click
    act.contextClick(ChangeLang).perform();             //Right click on particular WebElement
    
	act.click().perform();                              //Left or Regular click
	act.click(ChangeLang).perform();                   //Left click on particular WebElement
	
	act.doubleClick().perform();                       //Double click 
	act.doubleClick(ChangeLang).perform();             //Double click on Particular WebElement
	
	//Combining and Executing multiple actions in 1 line
	act.moveToElement(ChangeLang).click().build().perform();          //BUILD is used to combine the 2 actions
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
