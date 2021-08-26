package com.stepdefenition.com;

import org.junit.runner.Runner;
import org.openqa.selenium.WebDriver;

import com.CucumberAdactin.Demo_BaseofTestProject;
import com.CucumberAdactin.HotelReservation;
import com.CucumberAdactin.ReservationDetails;
import com.CucumberAdactin.loginPage;
import com.runner.com.RunnerTest;

import cucumber.api.java.en.*;

public class StepDefenition extends Demo_BaseofTestProject {

	public static WebDriver driver =RunnerTest.driver;

	loginPage lp = new loginPage(driver);
	ReservationDetails rd = new ReservationDetails(driver);
	HotelReservation hr = new HotelReservation(driver);
	
@Given("^user launch the application$")
public void user_launch_the_application() throws Throwable {
	
pagelaunch("https://adactinhotelapp.com/index.php");
}

@When("^user enters the username$")
public void user_enters_the_username() throws Throwable {
	sendValues(lp.getUsername(), "Jabdes1993"); 
}

@When("^user enter the user password$")
public void user_enter_the_user_password() throws Throwable {
	sendValues(lp.getPassword(), "Canada@202020");
  
}

@Then("^user clicks the login button and moves to next page$")
public void user_clicks_the_login_button_and_moves_to_next_page() throws Throwable {
	action(lp.getLogin());
   
}


@Given("^User logs in to the application$")
public void user_logs_in_to_the_application() throws Throwable {
    
}

@When("^user selects the location$")
public void user_selects_the_location() throws Throwable {
	selectValueFromDropDown("Brisbane", rd.getLocation());
}
   


@When("^user selects the hotels$")
public void user_selects_the_hotels() throws Throwable {
	selectValueFromDropDown("Hotel Hervey", rd.getHotels());
  
}

@When("^user selects the room type$")
public void user_selects_the_room_type() throws Throwable {
	selectValueFromDropDown("Super Deluxe", rd.getRoom());
 
}

@When("^user selects the number of rooms he/she wants$")
public void user_selects_the_number_of_rooms_he_she_wants() throws Throwable {
	selectValueFromDropDown("2", rd.getNos());
   
}

@When("^user enters the Check-in date$")
public void user_enters_the_Check_in_date() throws Throwable {
	sendValues(rd.getCheckin(), "22/08/2021");
    
}

@When("^user enters the Check-out date$")
public void user_enters_the_Check_out_date() throws Throwable {
	sendValues(rd.getCheckout(), "24/08/2021");
}

@When("^user selects the number of adults staying in the room$")
public void user_selects_the_number_of_adults_staying_in_the_room() throws Throwable {
	selectValueFromDropDown("4", rd.getAdult());
  
}

@When("^user selects the number of children staying in the room$")
public void user_selects_the_number_of_children_staying_in_the_room() throws Throwable {
	selectValueFromDropDown("0", rd.getChild());
   
}

@When("^user clicks on search button and moves to the next page$")
public void user_clicks_on_search_button_and_moves_to_the_next_page() throws Throwable {
	action(rd.getSearch());
    
}

@Given("^all the information is correct in reservation details page$")
public void all_the_information_is_correct_in_reservation_details_page() throws Throwable {
   
}

@Given("^user clicks on accepts the radio but for confirmation$")
public void user_clicks_on_accepts_the_radio_but_for_confirmation() throws Throwable {
   
}

@Then("^user clicks on continue button and goes to the next page$")
public void user_clicks_on_continue_button_and_goes_to_the_next_page() throws Throwable {
	action(rd.getAccept());
 
}

@Given("^user is able to accepts the charges and goes to next page$")
public void user_is_able_to_accepts_the_charges_and_goes_to_next_page() throws Throwable {
	action(rd.getCont());
}

@When("^user enter's first name$")
public void user_enter_s_first_name() throws Throwable {
	sendValues(hr.getFname(), "Jabez");
  
}

@When("^user enter's last name$")
public void user_enter_s_last_name() throws Throwable {
	sendValues(hr.getLname(), "Desilva");
}

@When("^user enter's Billing address$")
public void user_enter_s_Billing_address() throws Throwable {
	sendValues(hr.getAddress(), "Clem Jones Promenade, South Brisbane QLD 4101, Australia");
   
}

@When("^user provides credit card number$")
public void user_provides_credit_card_number() throws Throwable {
	sendValues(hr.getCredit(), "7871235123871238");
   
}

@When("^user provides credit card type$")
public void user_provides_credit_card_type() throws Throwable {
	selectValueFromDropDown("VISA", hr.getCardtype());
    
}

@When("^user provides credit card expiry month$")
public void user_provides_credit_card_expiry_month() throws Throwable {
	selectValueFromDropDown("4", hr.getCmonth());

}

@When("^user provides credit card expiry year$")
public void user_provides_credit_card_expiry_year() throws Throwable {
	selectValueFromDropDown("2021", hr.getCyear());
}

@When("^user provides cvv number$")
public void user_provides_cvv_number() throws Throwable {
	sendValues(hr.getCvv(), "767");
    
}

@When("^user selects Book now button and wait for the confirmation$")
public void user_selects_Book_now_button_and_wait_for_the_confirmation() throws Throwable {
	action(hr.getBook());
	Thread.sleep(5000);
	captureScreenshot(hr.getBook());
}

@When("^select logout button to logout from the application$")
public void select_logout_button_to_logout_from_the_application() throws Throwable {
	action(hr.getLogout());
 
}

@Then("^user clicks on Click here to login again$")
public void user_clicks_on_Click_here_to_login_again() throws Throwable {
	action(hr.getClickhere());
	closethepage();
	quitthedriver();
 
}

}