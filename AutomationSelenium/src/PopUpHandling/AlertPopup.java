package PopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
		
		WebDriver driver = new ChromeDriver();                 //Browser Launch
		driver.manage().window().maximize();                  //maximize the browser
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");       //1st way Url Insert
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();                  //webelement locate by xpath
		
		//driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Thread.sleep(3000);
		Alert alt= driver.switchTo().alert();               //switch the focus from main window to alert popup
		//alt.getText();                                      //Fetch the Text on Alert pop-up
		alt.accept();
		//Accept (OK) the alert Pop-up
		
		//alt.dismiss();
		//dismiss(cancel) the alert pop-up
	
		
		//alt.sendKeys("vaishnavi");
		//enter the TEXT into input field of Alert Pop-up
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
