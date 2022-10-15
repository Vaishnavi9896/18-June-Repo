package hW;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonShopping {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", 
			//"C:\\Users\\V\\Downloads\\chromedriver_win32\\chromedriver.exe");  //path provide
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\V\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  //path provide
	
	WebDriver driver = new ChromeDriver();                  //Browser Launch
	driver.manage().window().maximize();                    //maximize the browser
	driver.get("https://www.amazon.in/");                 // Url Insert Main page 
	Thread.sleep(2000);	

WebElement accountAndListDropdown = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
accountAndListDropdown.click();
Thread.sleep(2000);

WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
userName.sendKeys("8208918475");
Thread.sleep(2000);

WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
continueButton.click();

WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
password.sendKeys("Piuhatwar");
Thread.sleep(2000);

WebElement signInButton=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
signInButton.click();
Thread.sleep(2000);

WebElement searchBox = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
Thread.sleep(2000);

  Select selectOption= new Select(searchBox);
  selectOption.selectByVisibleText("Books");
        //WebElement selectOptionBook = driver.findElement(By.xpath("//option[text()='Books']"));
        // selectOptionBook.click();	
WebElement searchTextEntered = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
searchTextEntered.sendKeys("wings of fire");
Thread.sleep(2000);

WebElement searchButtonClick=driver.findElement(By.xpath("//input[@type='submit']"));
searchButtonClick.click();
Thread.sleep(2000);

     JavascriptExecutor js =(JavascriptExecutor) driver; 
     //js.executeScript("window.scrollBy(0,1000)");               //scroll down the page
     //Thread.sleep(2000);
WebElement selectBookWant = driver.findElement(By.xpath("//span[text()='WINGS OF FIRE: AUTOBIOGRAPHY OF ABDUL KALAM']"));
selectBookWant.click();
Thread.sleep(2000);

Set <String> returnIdChildBrowser= driver.getWindowHandles();
ArrayList <String> ar = new ArrayList<String>(returnIdChildBrowser);
String id=ar.get(1);
driver.switchTo().window(id);

  js.executeScript("window.scrollBy(0,3000)");               //scroll down the page
  Thread.sleep(2000);

     WebElement quantity = driver.findElement(By.xpath("//select[@id='quantity']"));
     Select selectQuantity = new Select(quantity);
     selectQuantity.selectByVisibleText("2");
     Thread.sleep(2000);
     
 WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
 addToCart.click();
 Thread.sleep(2000);
 
 js.executeScript("window.scrollBy(0,3000)");               //scroll down the page
 Thread.sleep(2000);
 
 WebElement proceedToBuy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
 proceedToBuy.click();
 Thread.sleep(2000);
 
	/*
	 * WebElement addNewAddress = driver.findElement(By.xpath(
	 * "//input[@id='address-ui-widgets-enterAddressFullName']"));
	 * addNewAddress.click(); Thread.sleep(2000);
	 * 
	 * //Add Address window Open WebElement fullName
	 * =driver.findElement(By.xpath("//input[@aria-label='Full name']"));
	 * fullName.sendKeys("Vaishnavi Hatwar"); Thread.sleep(2000);
	 * 
	 * WebElement mobileNumber=
	 * driver.findElement(By.xpath("//input[@aria-label='Mobile number']"));
	 * mobileNumber.sendKeys("8999301087"); Thread.sleep(2000);
	 * 
	 * WebElement pinCode=
	 * driver.findElement(By.xpath("//input[@aria-label='Pincode']"));
	 * pinCode.sendKeys("441904"); Thread.sleep(2000);
	 * 
	 * WebElement enterAddressLine1 = driver.findElement(By.
	 * xpath("//input[@aria-label='Flat, House no., Building, Company, Apartment']")
	 * ); enterAddressLine1.sendKeys("Jamnalal Bajaj Ward"); Thread.sleep(2000);
	 * 
	 * WebElement enterArea = driver.findElement(By.
	 * xpath("//input[@aria-label='Area, Street, Sector, Village']"));
	 * enterArea.sendKeys("Bhandara"); Thread.sleep(1000);
	 * 
	 * WebElement enterCity=
	 * driver.findElement(By.xpath("//input[@aria-label='Town/City']"));
	 * enterCity.sendKeys("Bhandara"); Thread.sleep(2000);
	 * 
	 * WebElement selectState =
	 * driver.findElement(By.xpath("//a[text()= 'MAHARASHTRA']"));
	 * selectState.click(); Thread.sleep(2000);
	 * 
	 * WebElement selectAddressType =
	 * driver.findElement(By.xpath("//a[text()= ' Select an Address Type ']"));
	 * selectAddressType.click();
	 * 
	 * WebElement selectAddressTypeHome =
	 * driver.findElement(By.xpath("//a[text()=' Home (7 am – 9 pm delivery) ']"));
	 * selectAddressTypeHome.click();
	 */
// WebElement useThisAddress = driver.findElement(By.xpath("//span[text()='Use this address']"));
// useThisAddress.click();
 WebElement useThisAddress = driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
 useThisAddress.click();
 Thread.sleep(2000);
 
 WebElement selectPayOnDelivery = driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
 selectPayOnDelivery.click();
 Thread.sleep(2000);
 
 WebElement useThisPaymentMethod=driver.findElement(By.xpath("(//input[@class='a-button-input a-button-text'])[5]"));
 useThisPaymentMethod.click();
 
 Thread.sleep(2000);
 js.executeScript("window.scrollBy(0,3000)");               //scroll down the page
 Thread.sleep(2000);

 WebElement amazonHomePage= driver.findElement(By.xpath("//a[text()='Amazon.in homepage']"));
 amazonHomePage.click();
 Thread.sleep(2000);
 
 WebElement accountAndListDropdownSignOut = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
 accountAndListDropdownSignOut.click();
 Thread.sleep(2000);
 
WebElement signOut= driver.findElement(By.xpath("//span[text()='Sign Out']"));
signOut.click();
Thread.sleep(2000);

driver.quit();
	/*
	 * //driver.findElement(By.
	 * xpath("(//a[@title='Listen to a sample of Wings of Fire'])[1]")).click();
	 * //driver.findElement(By.
	 * xpath("//span[text()='WINGS OF FIRE: AUTOBIOGRAPHY OF ABDUL KALAM']")).click(
	 * ); //driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[9]")).
	 * click();
	 * //driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]")).click
	 * ();
	 * driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).
	 * click();
	 * driver.findElement(By.xpath("//a[text()='View Your List']")).click();
	 * driver.findElement(By.xpath("(//input[@class='a-button-input'])[8]")).click()
	 * ; //driver.findElement(By.xpath("(//a[@href='#'])[9]")).click();
	 * driver.findElement(By.xpath("//input[@name='submit.deleteItem']")).click();
	 * driver.findElement(By.xpath("//i[text()='your account']")).click();
	 */
	 //JavascriptExecutor js =(JavascriptExecutor) driver;                              //page scroll down
		/*
		 * WebElement signOut= driver.findElement(By.xpath("//a[text()='Sign Out']"));
		 * js.executeScript("arguments[0].scrollIntoView(true)",signOut);
		 * 
		 * signOut.click();
		 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
