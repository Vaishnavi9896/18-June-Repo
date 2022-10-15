import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");   //open google webpage
	driver.manage().window().maximize();      //maximize the browser
	System.out.println(driver.getTitle());    //display title
	System.out.println(driver.getCurrentUrl());//display url of webpage as output
	driver.get("https://www.facebook.com/pages/create/");   //open facebook webpage
	Thread.sleep(2000);                                     //delay 2sec
	driver.navigate().back();              //navigate back to google page
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


	Thread.sleep(3000);                      //wait for 3 sec
	Dimension D=new Dimension(200,400);      //change size of browser
	driver.manage().window().setSize(D);
	Thread.sleep(2000);                      //wait 2sec
	Point p=new Point(100,500);              //change position of browser
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);                      //delay 2sec
	driver.manage().window().maximize();     //maximize browser
	Thread.sleep(2000);                      //wait for 2sec
	driver.navigate().back();                //navigate to fb page
	
	//driver.get("https://www.facebook.com/pages/create/");
	String url1=driver.getCurrentUrl();    //verification whether the open webpage is correct or not
	System.out.println(url1);
	String Expectedurl1="https://www.facebook.com/pages/create/";   //verify fb webpage open
	if(url1.equalsIgnoreCase(Expectedurl1))
	{
		System.out.println("Navigated to correct webpage");
	}
	else {
		System.out.println("Navigated to wrong webpage");
	}
	
	//System.out.println(driver.getCurrentUrl());
	driver.navigate().refresh();             //refresh the webpage
	Thread.sleep(2000);                      //delay 2sec
	driver.close();                          //closed browser
}
}
