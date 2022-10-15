package PopUpHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserArrayList {
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

		//Set <String> allAdd= driver.getWindowHandles();
		//ArrayList <String> ar=new ArrayList<String>(allAdd);
		
		//OR
		ArrayList <String> ar = new ArrayList<String>(driver.getWindowHandles());
		String id=ar.get(2);
		driver.switchTo().window(id);
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		for(int i=0;i<=ar.size()-1;i++) {
			System.out.println(ar.get(i));
		}
		System.out.println();
		
		String id1=ar.get(3);
		driver.switchTo().window(id1);
		driver.close();
		Set <String> windowId= driver.getWindowHandles();
		ArrayList <String> Id=new ArrayList<String>(windowId);
		for(int j=0;j<=Id.size()-1;j++) {
			System.out.println(Id.get(j));
		}
}
}