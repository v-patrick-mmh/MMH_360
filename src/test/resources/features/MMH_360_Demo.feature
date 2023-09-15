Feature: MMH_360_Demo

  @WEB  @MMH_360
  Scenario Template: User Successfully logs in to the MMH Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |
