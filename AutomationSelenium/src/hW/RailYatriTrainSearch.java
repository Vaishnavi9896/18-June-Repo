package hW;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailYatriTrainSearch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                                            //Browser Launch
	driver.manage().window().maximize();                                             //maximize the browser
	driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");       //Url Insert
	Thread.sleep(4000);
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//CREATE ACCOUNT-1st Page
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8999897867");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("vaishnavihatwar@gmail.com");
	Thread.sleep(2000);
	WebElement ContinueButton1 = driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
	ContinueButton1.click();

    JavascriptExecutor js =(JavascriptExecutor) driver;                              //Scroll Down
	js.executeScript("arguments[0].scrollIntoView(true)",ContinueButton1);

//2nd Page
	driver.findElement(By.xpath("//input[@id='username-id']")).sendKeys("Vaishnavi vaish96");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vaishnavi96Vaish");
	
	driver.findElement(By.xpath("//input[@name='confirm password']")).sendKeys("vaishnavi96Vaish");
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("vaishnavi hatwar");

	driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='Student']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id=\"dob_field\"]")).click();
	driver.findElement(By.xpath("//td[text()='9']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//p[text()='Female']")).click();
	driver.findElement(By.xpath("//p[text()='Unmarried']")).click();
	
	 driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[2]")).click();
	
	//driver.findElement(By.xpath("//label[text()='select your country of residence']"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='India']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//label[text()='Security Question']"));
	 driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[3]")).click();
		
	driver.findElement(By.xpath("//a[text()='What was the name of your first school?']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='securityAns']")).sendKeys("Lbsv school");
	
	WebElement ContinueButton2=driver.findElement(By.xpath(" (//button[text()='Continue'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)",ContinueButton2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='prsnl-dtl-for-acc']")).click();
driver.findElement(By.xpath("//button[@class='continue-to-prsnl-detail']")).click();
}
}
