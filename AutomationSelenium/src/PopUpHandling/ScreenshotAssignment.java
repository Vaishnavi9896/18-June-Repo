package PopUpHandling;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.opentelemetry.sdk.metrics.data.Data;

public class ScreenshotAssignment {
	//Method to take Screenshot
	public static void screenshots() throws IOException
	 {
		Date currentDate = new Date();
		String FileName = currentDate.toString().replace(" ", "-").replace(":", "-");
		WebDriver driver = new ChromeDriver();  
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		File Destination= new File("E:\\Vaishnavi\\Screenshots"+FileName+".jpg");
		FileHandler.copy(source, Destination);
	 }
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
		
		WebDriver driver = new ChromeDriver();                  //Browser Launch
		driver.manage().window().maximize();                //maximize the browser
		driver.get("https://www.w3schools.com/js/js_popup.asp");       // Url Insert Main page            
		
		ScreenshotAssignment.screenshots();
	
	}	
}
