package PopUpHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBroPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
		
		WebDriver driver = new ChromeDriver();                  //Browser Launch
		driver.manage().window().maximize();                //maximize the browser
		driver.get("https://www.w3schools.com/js/js_popup.asp");       //1st way Url Insert
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']")).click();
		Thread.sleep(2000);

String mainWindowId = driver.getWindowHandle();              //return ID of main window

String expUrl="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
String expUrl1="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
//String expId="";
Set<String> allAdd = driver.getWindowHandles();             //return ID of main + child windows

for(String s : allAdd) {
	System.out.println(s);             //fetching one by one from set
	driver.switchTo().window(s);       //switch to new window by using ID
	String actualUrl=driver.getCurrentUrl();   //fetching the Url of new window after switch
	if(expUrl.equals(actualUrl)) {
		System.out.println("correct window");
   // expId=s;             //stored Id after switch to new window
		break;
	} else{
		System.out.println("wrong window");
	}
	}
	driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
	//driver.switchTo().window(expId);
	driver.close();
	Thread.sleep(3000);
	
	Set <String> windowId = driver.getWindowHandles();
	System.out.println(windowId);
	
	System.out.println();
	
	for(String s : windowId) {
		System.out.println(s);             //fetching one by one from set
		driver.switchTo().window(s);       //switch to new window by using ID
		String actualUrl=driver.getCurrentUrl();   //fetching the Url of new window after switch
		if(expUrl1.equals(actualUrl)) {
			System.out.println("correct window");
			break;
		} else{
			System.out.println("wrong window");
		}
		}
	driver.close();
	System.out.println(driver.getWindowHandles());
	}	
}
