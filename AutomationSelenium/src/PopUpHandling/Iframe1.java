package PopUpHandling;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
		
		WebDriver driver = new ChromeDriver();                  //Browser Launch
		driver.manage().window().maximize();                //maximize the browser
		driver.get("https://www.w3schools.com/js/js_popup.asp");       // Url Insert Main page              //index 0
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();                //child window at index 2
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();              //child window at index 1
		Thread.sleep(2000);

		ArrayList <String> ar = new ArrayList<String>(driver.getWindowHandles());          //object of arraylist //return id of main +child window
		driver.switchTo().window(ar.get(1));                                                //switch to child window present at index 1
		Thread.sleep(2000);
		
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));    //1st locate the iframe by using Attribute aur agr attribute
		                                                                                     // present nhi hoga to index use kr skte
		driver.switchTo().frame(Iframe);                                                     //switch to iframe by using frame(webelement)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();                   //click on Try it button
		Thread.sleep(4000);
		
		
		driver.switchTo().window(ar.get(2));                                                //switch to window present at index 1
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));     //locate the iframe
		driver.switchTo().frame("iframeResult");                                            //switch to iframe by using frame(class or ID)
		driver.findElement(By.xpath("//button[text()='Try it']")).click();                  //click on Try It button
				
				
}
}
