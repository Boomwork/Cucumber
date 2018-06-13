Feature: Testfeature schaaphok

  @schaaphok
  Scenario: Gebruiker met BSN logt in
    Given user navigates to "http://demo.nopcommerce.com/"
    Then the title "nopCommerce demo store" shown
    When user clicks on the textlink "Register"
    And user clicks on the label "Male"

    And user enters "John" in the textbox "First Name"
    And user enters "Doe" in the textbox "Last Name"
    And user enters "22" in the filter "Day"
    And user enters "March" in the filter "Month"
    And user enters "1969" in the filter "Year"
    And user enters "John@Doe.com" in the textbox "Email"
    
    And user enters "Atos" in the textbox "Company"
    
    And user clicks on the label "Newsletter"
    
    And user enters "John" in the textbox "Password"
    And user enters "John" in the textbox "ConfirmPassword"

