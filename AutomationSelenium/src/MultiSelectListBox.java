import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                    //method chaining to browser maximize
	driver.get("http://practice.cybertekschool.com/dropdown");
	Thread.sleep(3000);
	WebElement lang=driver.findElement(By.xpath("//select[@name='Languages']"));
	Select s=new Select(lang);
	Thread.sleep(1000);
	s.selectByValue("js");
	Thread.sleep(1000);
	s.selectByValue("java");
	Thread.sleep(1000);
	s.selectByValue("c#");
	Thread.sleep(1000);
	WebElement firstSelected=s.getFirstSelectedOption();
	System.out.println(firstSelected);
	System.out.println(firstSelected);
	System.out.println(s.getFirstSelectedOption().getText());
	System.out.println(s.isMultiple());
	
	List<WebElement> l2 = s.getAllSelectedOptions();
	List<WebElement> l = s.getOptions();
	System.out.println(l.size());
	System.out.println(l2.size());
	
	for(int i=0;i< l.size();i++) {
		System.out.println(l.get(i).getText());
	}
	s.deselectByValue("java");
	Thread.sleep(3000);
	s.deselectByIndex(1);
	Thread.sleep(3000);
	s.deselectByVisibleText("C#");
	s.deselectAll();
	driver.close();
	
}
}
