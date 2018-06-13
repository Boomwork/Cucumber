Feature: Testfeature schaaphok

  @verboom    @bert @marcel
  Scenario: Maak gebruiker aan
    Given user navigates to "http://demo.nopcommerce.com/"
    Then the title "nopCommerce demo store" shown
    When user clicks on the textlink "Register"
    And user clicks on the label "Male"

    And user enters "John" in the textbox "First Name"
    And user enters "Doe" in the textbox "Last Name"
    And user enters "John@Doe.com" in the textbox "Email"

