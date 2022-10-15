package PopUpHandling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeftRight {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                //maximize the browser
	driver.get("https://www.w3schools.com/js/js_popup.asp");       // Url Insert Main page             
	Thread.sleep(2000);
	
	JavascriptExecutor js =(JavascriptExecutor) driver;                              //casting driver into JavaScriptExecutor Interfa
	
	//Scroll LEFT & RIGHT
	 js.executeScript("window.scrollBy(2000,0)");             //scroll RIGHT the page
	 //intially page LEFT vr rahnr mg RIGHT kray sathi  +ve yenr & RIGHT to LEFT -ve 
	 Thread.sleep(2000);
	 
	 js.executeScript("window.scrollBy(-3000,0)");            //scroll LEFT the page
	 Thread.sleep(2000);
	 
	//
	 js.executeScript("window.scrollBy(2000,0)");             //scroll RIGHT the page
	 Thread.sleep(2000);
	 
	 js.executeScript("window.scrollBy(-3000,0)");            //scroll LEFT the page
	 Thread.sleep(2000);
	 
	 js.executeScript("window.scrollBy(2000,0)");             //scroll RIGHT the page
	 Thread.sleep(2000);
	 
	 js.executeScript("window.scrollBy(-3000,0)");            //scroll LEFT the page
	 Thread.sleep(2000);
	 
}
}
