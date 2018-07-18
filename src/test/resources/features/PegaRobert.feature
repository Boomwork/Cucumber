Feature: Exploring PegaSite

  Background:
    Given user navigates to "https://pega.techlab.myatos.net:8443/prweb/"
    Then the title "Pega 7" shown


  @Pega
  Scenario: Inloggen op gebruik van textblok
    When user enters "theo@uno" in the textbox "User Name"
    And user enters "rules" in the textbox "Password"
    And user clicks on the button "Login"
    Then the title "Pega Case Manager Portal" shown


  Scenario: Inloggen op gebruik van Label
    When user enters "theo@uno" in the textbox after the label "User Name"
    When user enters "rules" in the textbox after the label "Password"
    And user clicks on the button "Login"
    Then the title "Pega Case Manager Portal" shown

  #@Keyword
   # Scenario: Inloggen met MFkeywords
   # When gebruiker "theo@uno" invuld in het tekstveld "txtUserID"
