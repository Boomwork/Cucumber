$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test feature",
  "description": "",
  "id": "test-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4674682257,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search for books",
  "description": "",
  "id": "test-feature;search-for-books",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user navigates to \"http://demo.nopcommerce.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user clicks on the textlink \"Books\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the header \"Books\" is shown",
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
  "duration": 1335131367,
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
  "duration": 1214154521,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 12
    }
  ],
  "location": "StepsGeneral.theHeaderIsShown(String)"
});
formatter.result({
  "duration": 529371262,
  "status": "passed"
});
formatter.after({
  "duration": 1655188879,
  "status": "passed"
});
});