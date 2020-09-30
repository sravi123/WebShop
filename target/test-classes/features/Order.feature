Feature: OrderPlacing Functionality

  @test
  Scenario: Verify Order Placing functionality.
    Given user navigates to the website "http://demowebshop.tricentis.com/"
    And I click on "Log in" button
    Then I log into user "atest@gmail.com" with password "123456"
    And I select "Books" from catagories
    And I select a book and click on "Add to cart"
    And  I Click on “shopping cart”
    Then I Click on “Check-out”
    And I fill the following details
      | Billing address  | Billing          |
      | Shipping Address | Shipping         |
      | Shipping method  | Next Day Air     |
      | Payment method   | Cash on delivery |
    And I Validate the message “You will pay by COD”
    And I click on "Confirm" order
    And I click on "Log out" button

