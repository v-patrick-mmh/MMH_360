Feature: Reporting

  @WEB @REPORTING @SANITY_PATH
  Scenario: S1 - As a provider, I should be able to see the reporting menu in the MMH360 application
    Given I should be able to login the mmh application
    Then I should verify that the reporting menu is displayed

  @WEB @REPORTING @SANITY_PATH
  Scenario: S2 - As a provider, I should be able to verify the appointment list menu and fields on the appointment list page
    Given As a Existing user I am on HomePage and I click Dashboard
    And I should verify the appointment list menu under the reporting menu
    When I should navigate to the appointment list page
    Then I should verify all fields in the appointment list page
      | &APP_LIST_MAT_LABEL_TXT& | &APP_LIST_SPAN_TXT& | &APP_LIST_BUTTON_TXT& | &APP_LIST_RESULTS_SPAN_TXT& |








