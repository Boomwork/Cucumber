$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4830857401,
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
  "duration": 1744153058,
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
  "duration": 11697660,
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
  "duration": 763726306,
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
  "duration": 62368136,
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
  "duration": 24207458,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //input[contains(@id,\u0027FirstName\u0027) or [contains(@name,\u0027] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//input[contains(@id,\u0027FirstName\u0027) or [contains(@name,\u0027]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d66.0.3359.139)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 16 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00272.52.0\u0027, revision: \u00274c2593cfc3689a7fcd7be52549167e5ccc93ad28\u0027, time: \u00272016-02-11 11:22:43\u0027\nSystem info: host: \u0027MC0ZR0VC\u0027, ip: \u002710.15.31.10\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91), userDataDir\u003dC:\\Users\\a666534\\AppData\\Local\\Temp\\scoped_dir7176_27889}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d66.0.3359.139, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: bf4e89fbc484b89a9d9a5d3aaa63d961\n*** Element info: {Using\u003dxpath, value\u003d//input[contains(@id,\u0027FirstName\u0027) or [contains(@name,\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat net.atos.testlab.cucumber.pageobjects.PoTextbox.\u003cinit\u003e(PoTextbox.java:15)\r\n\tat net.atos.testlab.cucumber.steps.StepsGeneral.user_enters_in_the_textbox(StepsGeneral.java:37)\r\n\tat ✽.And user enters \"John\" in the textbox \"First Name\"(test.feature:10)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1959011373,
  "status": "passed"
});
});