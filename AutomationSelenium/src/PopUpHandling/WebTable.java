package PopUpHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                //maximize the browser
	driver.get("https://www.w3schools.com/html/html_tables.asp");       // Url Insert Main page             
	Thread.sleep(2000);
	
	List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
	System.out.println(rows.size());
	
	List<WebElement> headerCells=driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
	List<WebElement> remainingCells=driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
System.out.println(headerCells.size() + remainingCells.size());
	
for(int i=1; i<=rows.size(); i++)	 {
	List <WebElement> row_Cells;
	
	if(i==1)  {
		row_Cells=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th"));
		}
	else {
		row_Cells=driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td"));
	}
	for(int j=0; j<row_Cells.size(); j++) {
	System.out.print(row_Cells.get(j).getText()+"  ");	
	}
	System.out.println();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
