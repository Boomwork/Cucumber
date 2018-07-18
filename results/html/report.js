$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PegaRobert.feature");
formatter.feature({
  "line": 1,
  "name": "Exploring PegaSite",
  "description": "",
  "id": "exploring-pegasite",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7774859309,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to \"https://pega.techlab.myatos.net:8443/prweb/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the title \"Pega 7\" shown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://pega.techlab.myatos.net:8443/prweb/",
      "offset": 19
    }
  ],
  "location": "StepsGeneral.userNavigateTo(String)"
});
formatter.result({
  "duration": 3662333327,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pega 7",
      "offset": 11
    }
  ],
  "location": "StepsGeneral.theTitleShown(String)"
});
formatter.result({
  "duration": 72032275,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Inloggen op gebruik van textblok",
  "description": "",
  "id": "exploring-pegasite;inloggen-op-gebruik-van-textblok",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Pega"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user enters \"theo@uno\" in the textbox \"txtUserID\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters \"rules\" in the textbox \"Password\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on the button \"Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the title \"Pega Case Manager Portal\" shown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "theo@uno",
      "offset": 13
    },
    {
      "val": "txtUserID",
      "offset": 39
    }
  ],
  "location": "StepsTextbox.user_enters_in_the_textbox(String,String)"
});
formatter.result({
  "duration": 323893398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rules",
      "offset": 13
    },
    {
      "val": "Password",
      "offset": 36
    }
  ],
  "location": "StepsTextbox.user_enters_in_the_textbox(String,String)"
});
formatter.result({
  "duration": 104717136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 27
    }
  ],
  "location": "StepsButton.userClicksOnTheButton(String)"
});
formatter.result({
  "duration": 2222379542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pega Case Manager Portal",
      "offset": 11
    }
  ],
  "location": "StepsGeneral.theTitleShown(String)"
});
formatter.result({
  "duration": 47331827,
  "status": "passed"
});
formatter.after({
  "duration": 3124175063,
  "status": "passed"
});
formatter.before({
  "duration": 5567910562,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user navigates to \"https://pega.techlab.myatos.net:8443/prweb/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the title \"Pega 7\" shown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://pega.techlab.myatos.net:8443/prweb/",
      "offset": 19
    }
  ],
  "location": "StepsGeneral.userNavigateTo(String)"
});
formatter.result({
  "duration": 4120580623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pega 7",
      "offset": 11
    }
  ],
  "location": "StepsGeneral.theTitleShown(String)"
});
formatter.result({
  "duration": 79243808,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Inloggen op gebruik van Label",
  "description": "",
  "id": "exploring-pegasite;inloggen-op-gebruik-van-label",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Pega"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user enters \"theo@uno\" in the textbox after the label \"User Name\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters \"rules\" in the textbox after the label \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user clicks on the button \"Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "the title \"Pega Case Manager Portal\" shown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "theo@uno",
      "offset": 13
    },
    {
      "val": "User Name",
      "offset": 55
    }
  ],
  "location": "StepsTextbox.userEntersInTheTextboxAfterTheLabel(String,String)"
});
formatter.result({
  "duration": 323954941,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rules",
      "offset": 13
    },
    {
      "val": "Password",
      "offset": 52
    }
  ],
  "location": "StepsTextbox.userEntersInTheTextboxAfterTheLabel(String,String)"
});
formatter.result({
  "duration": 150144891,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 27
    }
  ],
  "location": "StepsButton.userClicksOnTheButton(String)"
});
formatter.result({
  "duration": 2981749910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pega Case Manager Portal",
      "offset": 11
    }
  ],
  "location": "StepsGeneral.theTitleShown(String)"
});
formatter.result({
  "duration": 64944960,
  "status": "passed"
});
formatter.after({
  "duration": 3097556951,
  "status": "passed"
});
});