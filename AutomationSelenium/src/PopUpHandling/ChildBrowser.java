package PopUpHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
		
		WebDriver driver = new ChromeDriver();                  //Browser Launch
		driver.manage().window().maximize();                //maximize the browser
		driver.get("https://www.w3schools.com/js/js_popup.asp");       //1st way Url Insert
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(2000);
		String mainWindowHandle= driver.getWindowHandle();
		String expUrl="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		//String expId="";
		Set <String> allAdd= driver.getWindowHandles();
		for(String s : allAdd) {
			System.out.println(s);
			driver.switchTo().window(s);
			String actualUrl=driver.getCurrentUrl();
			if(expUrl.equals(actualUrl)) {
				System.out.println("correct window");
				//expId=s;
				break;
			}else {
				System.out.println("wrong window");
			}
		
		}
		//driver.switchTo().window(expId);
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();	
		
		
}
}