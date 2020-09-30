$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Order.feature");
formatter.feature({
  "name": "OrderPlacing Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Order Placing functionality.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user navigates to the website \"http://demowebshop.tricentis.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.userNavigatesToTheWebsite(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Log in\" button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.iClickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log into user \"atest@gmail.com\" with password \"123456\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.logIntoUserWithPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Books\" from catagories",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.iSelectFromCatagories(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a book and click on \"Add to cart\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.iSelectABookByGivingFolloawingDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on “shopping cart”",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.iClickOnShoppingCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on “Check-out”",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.iClickOnCheckOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the following details",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.iFillTheFollowingDetails(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Validate the message “You will pay by COD”",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.iValidateTheMessageYouWillPayByCOD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Confirm\" order",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.iClickOnConfirmOrder(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Log out\" button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OrderStepdefinition.iClickOnButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});