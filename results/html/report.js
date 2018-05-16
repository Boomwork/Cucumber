$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5662747225,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Gebruiker met BSN logt in",
  "description": "",
  "id": "test;gebruiker-met-bsn-logt-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to \"http://demo.nopcommerce.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the title \"nopCommerce demo store\" shown",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the textlink \"Register\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the label \"Male\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters \"John\" in the textbox \"First Name\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters \"Doe\" in the textbox \"Last Name\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters \"John@Doe.com\" in the textbox \"Email\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://demo.nopcommerce.com/",
      "offset": 19
    }
  ],
  "location": "StepsGeneral.userNavigateTo(String)"
});
formatter.result({
  "duration": 1238271799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nopCommerce demo store",
      "offset": 11
    }
  ],
  "location": "StepsGeneral.theTitleShown(String)"
});
formatter.result({
  "duration": 12535666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 29
    }
  ],
  "location": "StepsGeneral.userClicksOnTheTextlink(String)"
});
formatter.result({
  "duration": 910152586,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 26
    }
  ],
  "location": "StepsGeneral.userClicksOnTheLabel(String)"
});
formatter.result({
  "duration": 73653951,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 13
    },
    {
      "val": "First Name",
      "offset": 35
    }
  ],
  "location": "StepsGeneral.user_enters_in_the_textbox(String,String)"
});
formatter.result({
  "duration": 634898521,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Doe",
      "offset": 13
    },
    {
      "val": "Last Name",
      "offset": 34
    }
  ],
  "location": "StepsGeneral.user_enters_in_the_textbox(String,String)"
});
formatter.result({
  "duration": 594608307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John@Doe.com",
      "offset": 13
    },
    {
      "val": "Email",
      "offset": 43
    }
  ],
  "location": "StepsGeneral.user_enters_in_the_textbox(String,String)"
});
formatter.result({
  "duration": 632601744,
  "status": "passed"
});
formatter.after({
  "duration": 2034005424,
  "status": "passed"
});
});