#Author: amandafloren11@gmail.com
@DZ-auto
Feature: Smoke test of Demoblaze website

  @DZ1
  Scenario Outline: Login with valid credential
    Given I navigate to demoblaze homepage
    When I click login button
    And I enter email <email> and pass <pass>
    And I click login button to access the page
    Then I can successfully login to the website

    Examples: 
      | email                                        | pass                       |
      | QRrURVCPUH0SnR9BFCgWT5q6W2I85QrJmrYXMFQPyoY= | '2rm/EshMJPMUd7ANOVq3Bw==' |
      
  @DZ2
  Scenario Outline: Login with invalid credential
    Given I navigate to demoblaze homepage
    When I click login button
    And I enter email <email> and pass <pass>
    And I click login button to access the page
    Then I should NOT be able to login successfully

    Examples: 
      | email                                        | pass                       |
      | VO7xacx+t8BIW7n7eMK6Z2tA9H9XZXjfj9ObXW1gtm8= | '2rm/EshMJPMUd7ANOVq3Bw==' |
  
  @DZ3
  Scenario Outline: Add to cart item with logged in account
    Given I navigate to demoblaze homepage
    When I click login button
    And I enter email <email> and pass <pass>
    And I click login button to access the page
    Then I can successfully login to the website
    Then I open an item product
    And I click add to cart button
   	Then I successfully added an item to cart

    Examples: 
      | email                                        | pass                       |
      | QRrURVCPUH0SnR9BFCgWT5q6W2I85QrJmrYXMFQPyoY= | '2rm/EshMJPMUd7ANOVq3Bw==' |
      
  @DZ4
  Scenario Outline: Checkout item with logged in account
    Given I navigate to demoblaze homepage
    When I click login button
    And I enter email <email> and pass <pass>
    And I click login button to access the page
    Then I can successfully login to the website
    Then I open an item product
    And I click add to cart button
   	Then I successfully added an item to cart
   	And I click cart button
   	And I click place order button
   	And I input Name <name>
   	And I input Country <country>
   	And I input City <city>
   	And I input Credit card <creditcard>
   	And I input Month <month>
   	And I input Year <year>
   	And I click purchase button
   	Then I place my order successfully

    Examples: 
      | email                                        | pass                       |  name	 | country  | city    | creditcard | month | year |
      | QRrURVCPUH0SnR9BFCgWT5q6W2I85QrJmrYXMFQPyoY= | '2rm/EshMJPMUd7ANOVq3Bw==' | Amanda | Indonesia| Jakarta |  11112222  |   07  | 2022 |
      
