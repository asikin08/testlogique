@smokeTestDeposit
Feature: Deposit in my profile

	@Scenario1
  Scenario: Navigate to Deposit tabe
    Given Go to Lelang page
    When  Input login form
    And 	Verify after successfully login
    Then  Navigate to deposit tab
    Then 	Validation after redirected to Deposit page