import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	//driver.get("https://www.selenium.dev/downloads");       //1st way Url Insert
	
	driver.navigate().to("https://www.selenium.dev/downloads");  //2nd way to Insert URL //Method chaining
	
	String url=driver.getCurrentUrl();                        //return the URL of browser
	System.out.println(url);                                //print the url
	System.out.println(driver.getTitle());                    //return the Title of Tab
	
	Navigation nv= driver.navigate();
	nv.back();                          //backword 
	Thread.sleep(5000);                 //delay for 5 sec                 
	
	nv.forward();                       //forward//click on forward button
	Thread.sleep(5000);                 //wait for 5 sec
	
	nv.refresh();                       //refresh//reload browser
	Thread.sleep(5000);
	
	driver.close();                                         // Current Tab of browser closed
	driver.quit();                                          //All tab closed i.e., browser closed
	//driver.get("https://www.selenium.dev/downloads");     // Exception throw
	
	
}
}
