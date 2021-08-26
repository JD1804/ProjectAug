Feature: Adactin application
Scenario: login functionality 
Given user launch the application
When user enters the username 
And user enter the user password 
Then user clicks the login button and moves to next page

Scenario: Reservation Details 
Given User logs in to the application
When user selects the location 
And user selects the hotels
And user selects the room type 
And user selects the number of rooms he/she wants 
And user enters the Check-in date
And user enters the Check-out date
And user selects the number of adults staying in the room
And user selects the number of children staying in the room
And user clicks on search button and moves to the next page

Scenario: Booking confirmation
Given all the information is correct in reservation details page
And user clicks on accepts the radio but for confirmation
Then user clicks on continue button and goes to the next page

Scenario: Booking details
Given user is able to accepts the charges and goes to next page
When user enter's first name
And user enter's last name
And user enter's Billing address
And user provides credit card number
And user provides credit card type
And user provides credit card expiry month
And user provides credit card expiry year
And user provides cvv number
And user selects Book now button and wait for the confirmation
And select logout button to logout from the application
Then user clicks on Click here to login again