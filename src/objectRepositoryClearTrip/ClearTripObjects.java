package objectRepositoryClearTrip;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClearTripObjects {

	
WebDriver driver;

//search Flights
	
    By Round_Trip = By.xpath("//input[@id='RoundTrip']");
	By From_Loc = By.xpath("//input[@id='FromTag']");	
	By To_Loc = By.xpath("//input[@id='ToTag']");
	By Depart_date = By.xpath("//input[@id='DepartDate']");
	By Return_date = By.xpath("//input[@id='ReturnDate']");
	By Search_Button = By.xpath("//input[@id='SearchBtn']");
	
//Book the flights
	
	By Book_Button = By.xpath("(//button[@type='submit'])[4]");
	
//Itinerary Page
	
	By  Checkbox_Condition = By.xpath("//dd//div//input[@type='checkbox']");
	By  Confirm_booking_button = By.xpath("//input[@value='Continue booking']");
	
//EmailAddress Page
	
	By EmailAddress =By.xpath("//input[@etitle='Your email address']");
	By Continue_Button =By.xpath("(//input[@value='Continue'])[1]");
	
//Traveller Details
	
	By Title_dropdown =By.xpath("//select[@name='AdultTitle1']");
	By First_name = By.xpath("(//input[@id='AdultFname1'])[1]");
	By Last_name =By.xpath("(//input[@id='AdultLname1'])[1]");
	By Mobile_no =By.xpath("(//input[@id='mobileNumber'])[1]");
	
	By DOB_date =By.xpath("//select[@name='AdultDobDay1']");
	By DOB_Month = By.xpath("//select[@name='AdultDobMonth1']");
	By DOB_Year =By.xpath("//select[@name='AdultDobYear1']");
	By Nation =By.xpath("//span[text()='Nationality']/../..//input");
	By ContinueToPayment =By.xpath("(//dd//input[@value='Continue'])[2]");
	
	
	
	
	
	
	
	public ClearTripObjects(WebDriver driver)
	{
		this.driver=driver;			
	}
	
	
	//Create Method for all elements
	
	//Search Flight Page
	public WebElement RoundTrip()
	{
		return driver.findElement(Round_Trip);	
	}
	
	public WebElement FromLocation()
	{
		return driver.findElement(From_Loc);	
	}
	
	public WebElement ToLocation()
	{
		return driver.findElement(To_Loc);	
	}
	
	public WebElement DepartDate()
	{
		return driver.findElement(Depart_date);	
	}
	
	public WebElement ReturnDate()
	{
		return driver.findElement(Return_date);	
	}
	
	public WebElement SearchButton()
	{
		return driver.findElement(Search_Button);	
	}
	
//Book the flight
	public WebElement BookingButton()
	{
		return driver.findElement(Book_Button);	
	}
	
//Itinerary Page
	public WebElement CheckboxCheck()
	{
		return driver.findElement(Checkbox_Condition);	
	}
	
	public WebElement ConfirmButton()
	{
		return driver.findElement(Confirm_booking_button);	
	}
	
//EmailAddress Page
	
	
	public WebElement EmailAddress()
	{
		return driver.findElement(EmailAddress);	
	}
	
	
	public WebElement Continue()
	{
		return driver.findElement(Continue_Button);	
	}
	
//Traveller Details	
	
	public WebElement Titledropdown()
	{
		return driver.findElement(Title_dropdown);	
	}
	
	public WebElement FirstName()
	{
		return driver.findElement(First_name);	
	}
	
	
	public WebElement LastName()
	{
		return driver.findElement(Last_name);	
	}
	
	public WebElement Contact()
	{
		return driver.findElement(Mobile_no);	
	}
	
	public WebElement DOBDate()
	{
		return driver.findElement(DOB_date);	
	}
	
	
	

	
	public WebElement DOBMonth()
	{
		return driver.findElement(DOB_Month);	
	}
	
	public WebElement DOBYear()
	{
		return driver.findElement(DOB_Year);	
	}
	
	public WebElement Nationality()
	{
		return driver.findElement(Nation);	
	}
	public WebElement ContinueToPayment()
	{
		return driver.findElement(ContinueToPayment);	
	}
	
	
	
}
