package scenarioClearTrip;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import objectRepositoryClearTrip.ClearTripObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class ClearTripScenario {
	
public static WebDriver driver=null;
	


	@BeforeClass
	public void first()
	{
		
		//For Handling GeoLocation Popup
		
		FirefoxProfile geoDisabled = new FirefoxProfile();
		geoDisabled.setPreference("geo.enabled", false);
		geoDisabled.setPreference("geo.provider.use_corelocation", false);
		geoDisabled.setPreference("geo.prompt.testing", false);
		geoDisabled.setPreference("geo.prompt.testing.allow", false);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, geoDisabled);
		
		driver = new  FirefoxDriver(geoDisabled);
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();*/
		driver.manage().deleteAllCookies();	
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
			
		System.out.println("");		
		System.out.println("BeforeClass method completed");
		System.out.println("**********************************************************************************");
				
		
	}
	
	@AfterClass
	public void last() throws Exception
	{
		Thread.sleep(4000);
		driver.quit();
		System.out.println("");
		System.out.println("AfterClass method completed");
		System.out.println("**********************************************************************************");			
		
	}
	
	
	@Test
	public void Registration() throws Exception
	{
		
		Thread.sleep(2000);
		//SR=Synfit_Registration_Screen
		ClearTripObjects SR = new  ClearTripObjects(driver);
		
		
		//search flights
		SR.RoundTrip().click();
		SR.FromLocation().sendKeys("Pune");
		Thread.sleep(3000);
		SR.ToLocation().sendKeys("Bangalore");
		Thread.sleep(3000);
		SR.DepartDate().sendKeys("08/08/2017");
		SR.ReturnDate().sendKeys("12/08/2017");
		Thread.sleep(3000);
		SR.ReturnDate().sendKeys(Keys.TAB);
		Reporter.log("Searched Flight Page is dispalyed ");
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:/ClearTrip/SearchFlight.png"));
		
		SR.SearchButton().click();
		
		//Book the flight
		File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("E:/ClearTrip/BookFlight.png"));
		
		Reporter.log("Booked the flight ");
		SR.BookingButton().click();
		Thread.sleep(3000);
		
		//popup occurs sometimes for price down
		if(driver.findElement(By.xpath("(//input[@value='Okay, continue'])[1]")).isDisplayed())
{
	driver.findElement(By.xpath("(//input[@value='Okay, continue'])[1]")).click();
	Thread.sleep(2000);
}
    
		
		
		
		
		//Itinerary
		File src2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("E:/ClearTrip/Itinerary.png"));
		
		SR.CheckboxCheck().click();
		SR.ConfirmButton().click();
		Thread.sleep(3000);
		
		//EmailAddress
		
		File src3= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3, new File("E:/ClearTrip/EmailId.png"));
		
		SR.EmailAddress().sendKeys("efgh@gmail.com");
		SR.Continue().click();
		Thread.sleep(3000);
				
		
		//Travellers details page
		Reporter.log("Traveller details entered");
		SR.FirstName().sendKeys("divya");
		SR.LastName().sendKeys("Singh");
		SR.Contact().sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		
		//Title selecting by value
				WebElement Title_options = SR.Titledropdown();
				Select Titledropdown = new Select (Title_options);
				Titledropdown.selectByValue("Ms");
				
/*		
try
		 
		{
			SR.Nationality().sendKeys("India");
			Thread.sleep(20000);
			SR.Nationality().sendKeys(Keys.TAB);
			//Date selecting by value
			WebElement DOB_dateOptions = SR.DOBDate();
			Select DOBDate = new Select (DOB_dateOptions);
			DOBDate.selectByValue("16");
			
			//Month selecting by value
			WebElement DOB_monthOptions = SR.DOBMonth();
			Select DOBMonth = new Select (DOB_monthOptions);
			DOBMonth.selectByValue("8");
			
			//Year selecting by value
			WebElement DOB_yearOptions = SR.DOBYear();
			Select DOBYear = new Select (DOB_yearOptions);
			DOBYear.selectByValue("1993");
		}catch(NoSuchElementException e){
	 
		   //Code for Handling the Exception 
	 

	 
		}*/
		
		
		
		
		File src4= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4, new File("E:/ClearTrip/TravellerDetails.png"));
		
		SR.ContinueToPayment().click();
		Thread.sleep(5000);
		File src5= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src5, new File("E:/ClearTrip/Payment.png"));
	
	
	}


	
}
