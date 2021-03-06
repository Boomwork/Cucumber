Feature: Test Bert
  Background: Dit wordt voor ieder Scenario dat uitgevoerd wordt gedraaid

    @smoketest
  Scenario: Gebruiker met BSN logt in
    Given user navigates to "http://demo.nopcommerce.com/"
    Then the title "nopCommerce demo store" shown
    When user clicks on the textlink "Register"
    And user clicks on the label "Male"

    And user enters "John" in the textbox "First NName"
    And user enters "Doe" in the textbox "Last Name"
    And user enters "John@Doe.com" in the textbox "Email"

  @Test2
  Scenario: Search for books
    Given user navigates to "http://demo.nopcommerce.com/"
    When user clicks on the textlink "Books"
    Then the header "Books" is shown
    Then the header "PullRequest" is shown
    When user clicks on the textlink "Computers" in the navbar "haeder-menu"