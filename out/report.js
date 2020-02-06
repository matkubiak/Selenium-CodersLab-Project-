$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/buy.feature");
formatter.feature({
  "line": 1,
  "name": "Buy",
  "description": "",
  "id": "buy",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful buy product",
  "description": "",
  "id": "buy;successful-buy-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to login.html page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I provide username and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I search \"Hummingbird printed sweater\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on product",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select size \"M\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select quantity",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click checkout",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on continue address button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on continue shipping button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on pay by check",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I agree on term",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on order button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Take screenshot",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "ShopSteps.iOpenChromeBrowser()"
});
formatter.result({
  "duration": 10516253100,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iNavigateToLoginHtmlPage()"
});
formatter.result({
  "duration": 1862615700,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iProvideUsernameAsHiAndPasswordAsHi()"
});
formatter.result({
  "duration": 431508000,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 7247784200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hummingbird printed sweater",
      "offset": 10
    }
  ],
  "location": "ShopSteps.iSearch(String)"
});
formatter.result({
  "duration": 594252400,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickOnProduct()"
});
formatter.result({
  "duration": 1263846200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 15
    }
  ],
  "location": "ShopSteps.iSelectSize(String)"
});
formatter.result({
  "duration": 602543900,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iSelectQuantity()"
});
formatter.result({
  "duration": 2205662000,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickOnAddToCart()"
});
formatter.result({
  "duration": 565277000,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickCheckout()"
});
formatter.result({
  "duration": 1040511200,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickProceedToCheckout()"
});
formatter.result({
  "duration": 836449800,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickOnContinueAddressButton()"
});
formatter.result({
  "duration": 1068672300,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickOnContinueShippingButton()"
});
formatter.result({
  "duration": 1060032700,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickOnPayByCheck()"
});
formatter.result({
  "duration": 387785800,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickOnAcceptTerm()"
});
formatter.result({
  "duration": 372579300,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.iClickOnOrderButton()"
});
formatter.result({
  "duration": 1596722800,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.takeScreenshot()"
});
formatter.result({
  "duration": 684124900,
  "status": "passed"
});
formatter.match({
  "location": "ShopSteps.closeBrowser()"
});
formatter.result({
  "duration": 786079800,
  "status": "passed"
});
});