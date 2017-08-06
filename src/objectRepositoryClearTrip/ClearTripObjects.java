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
}
