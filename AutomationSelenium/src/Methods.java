import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.get("https://www.selenium.dev/downloads");       //1st way Url Insert
	
	driver.manage().window().maximize();                    //method chaining to maximize the browser
	Thread.sleep(4000);
	
	driver.manage().window().minimize();                    //(in old version 3.14 Ans-no;) in new version possible//minimize the browesr
	Thread.sleep(4000);
	
	Options op = driver.manage();                          
	Window w = op.window();
	w.maximize();
	
	Dimension D = new Dimension(200,500);                //height and width of browser
	driver.manage().window().setSize(D);                 //set the size of browser
	Thread.sleep(4000);
	
	Point p = new Point(400,700);                        //x and y coordinates of browser
	driver.manage().window().setPosition(p);             //set or change the position of browser
	
}
}


