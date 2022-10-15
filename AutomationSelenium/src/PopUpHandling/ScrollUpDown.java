package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
		
		WebDriver driver = new ChromeDriver();                  //Browser Launch
		driver.manage().window().maximize();                //maximize the browser
		driver.get("https://www.w3schools.com/js/js_popup.asp");       // Url Insert Main page             
		Thread.sleep(2000);
		
	
		 //SCROLL UP & DOWN with the help of WEBELEMENTS WebElement
		// WebElement TryIt=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
	     JavascriptExecutor js =(JavascriptExecutor) driver;                              //casting driver into JavaScriptExecutor Interface
		// js.executeScript("arguments[0].scrollIntoView(true)",TryIt);

	
		  //SCROLL UP & DOWN WITH THE HELP OF CO-ORDINATES
		 js.executeScript("window.scrollBy(0,2000)");               //scroll down the page
		 //intially page UP vr rahnr mg down kray sathi UP to DOWN +ve yenr &DOWN to UP -ve 
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,-3000)");             //scroll up the page
		 Thread.sleep(2000);
		
		
}
}
