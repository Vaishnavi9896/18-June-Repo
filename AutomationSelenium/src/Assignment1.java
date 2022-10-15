import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser open
	driver.get("https://www.google.co.in/");       //1st way Url Insert
  String url=driver.getCurrentUrl();    //verification whether the open webpage is correct or not
	System.out.println(url);
	String Expectedurl="https://www.google.co.in/";
	if(url.equalsIgnoreCase(Expectedurl))
	{
		System.out.println("Navigated to correct webpage");
	}
	else {
		System.out.println("Navigated to wrong webpage");
	}
	Thread.sleep(2000);                         //delay 2sec
	driver.manage().window().maximize();        //maximize browser
	Dimension D1=new Dimension(400 ,500);       //change size of the browser
	driver.manage().window().setSize(D1);
	
	Point p=new Point(500,600);                 //change position of browser
	driver.manage().window().setPosition(p);
	
	driver.close();                             //close the browser
}
}
