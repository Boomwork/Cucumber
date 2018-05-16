$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
    "description": "Wat gaat hier gebeuren...",
  "id": "test",
  "keyword": "Feature"
});
formatter.before({
    "duration": 4513847881,
  "status": "passed"
});
formatter.scenario({
    "line": 16,
    "name": "Search for books",
  "description": "",
    "id": "test;search-for-books",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
        "line": 15,
        "name": "@Test2"
    }
  ]
});
formatter.step({
    "line": 17,
  "name": "user navigates to \"http://demo.nopcommerce.com/\"",
  "keyword": "Given "
});
formatter.step({
    "line": 18,
    "name": "user clicks on the textlink \"Books\"",
  "keyword": "When "
});
formatter.step({
    "line": 19,
    "name": "then the title \"Books\" is shown",
    "keyword": "Then "
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
    "duration": 1424181934,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
        "val": "Books",
      "offset": 29
    }
  ],
  "location": "StepsGeneral.userClicksOnTheTextlink(String)"
});
formatter.result({
    "duration": 1071035474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
        "val": "Books",
        "offset": 16
    }
  ],
    "location": "StepsGeneral.thenTheTitleIsShown(String)"
});
formatter.result({
    "duration": 539588244,
  "status": "passed"
});
formatter.after({
    "duration": 1597289324,
  "status": "passed"
});
});