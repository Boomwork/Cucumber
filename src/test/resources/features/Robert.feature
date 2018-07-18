Feature: Testfeature

  Background:
    Given user navigates to "http://demo.nopcommerce.com/"
    Then the title "nopCommerce demo store" shown

  Scenario: Maak gebruiker aan
    When user clicks on the textlink "Register"
    And user clicks on the label "Male"
    And user enters "John" in the textbox "First Name"
    And user enters "Doe" in the textbox "Last Name"
    And user enters "John@Doe.com" in the textbox "Email"

    #nog afmaken

  @Verboom
  Scenario: Inloggen met Theo
    When user clicks on the textlink "Log in"
    Then the header "Welcome, Please Sign In!" is shown
    When user enters "theowesterhoff@testing.com" in the textbox "Email"
    And user enters "Test-001" in the textbox "Password"
    And user clicks on the checkbox "RememberMe"
    And user clicks on the button "Log in"
    Then the image "nopCommerce" is shown
    When user clicks on the textlink "Log out"
    

