Feature: Dashboard

  @WEB @DASHBOARD @SANITY_PATH
  Scenario Template: S1- User successfully logs in to the beta v2 Portal.
    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
  Examples:
    | Email Address | Password   |  |
    | &EMAIL&       | &PASSWORD& |  |


  @WEB @DASHBOARD @SANITY_PATH
  Scenario: S2- As a user, I should be able to view the dashboard page.
    Given As a Existing user I am on HomePage and I click Dashboard
    And I should see all the header menus and options available on the dashboard
    Then I should see all the mat cards on the dashboard
      | &MAT_CARD_DETAILS& |


#Allow Popup need to handle
  @WEB @DASHBOARD @SANITY_PATH
  Scenario: S3- As a user, I should be able to view Video and audio sections on the dashboard page.
    Given As a Existing user I am on HomePage and I click Dashboard
    And I should see by default video and audio toggle is disabled and video preview card shows empty
    Then I should enable the video and audio toggle


  @WEB @DASHBOARD @SANITY_PATH
  Scenario Template: S4- As a user, I should be able to verify the provider card and its functions on the dashboard page.
    Given As a Existing user I am on HomePage and I click Dashboard
    And I should see "<Provider name>" on the provider card
    Then  I should copy the "<Waiting room link>" and "<Appointment link>" from the provider card
    And I should verify the waiting room link and Appointment link information with the content on the provider card
    And I should verify the Share via button is present on the provider card


    Examples:
      | Provider name   | Waiting room link   | Appointment link   |  |
      | &PROVIDER_NAME& | &WAITING_ROOM_LINK& | &APPOINTMENT_LINK& |  |

  # Below scenario won't work because of current deployment

#  @WEB @DASHBOARD @SANITY_PATH
#  Scenario: S5- As a user, I should be able to view the Appointment List page when the user clicks the Appointment List symbol.
#    Given As a Existing user I am on HomePage and I click Dashboard
#    And I should verify the appointment list symbol is present beside my profile picture
#    When I should click on the appointment list symbol
#    Then I should navigate to the appointment list page

  @WEB @DASHBOARD @SANITY_PATH
  Scenario: S6- As a user, I should be able to see the waiting room mat card and its functions
    Given As a Existing user I am on HomePage and I click Dashboard
    And I should see the waiting room mat card
    When The patient enters the waiting area
    Then I should be able to verify patient details on the waiting room mat card
    |&WAITING_ROOM_DETAILS&|
    And I should be able to view and click the waiting room eye icon and verify the waiting room tab
    |&WAITING_ROOM_DETAILS&|

  @WEB @DASHBOARD @SANITY_PATH
  Scenario: S7- As a user, I should be able to see the recent calls mat card and its functions
    Given As a Existing user I am on HomePage and I click Dashboard
    And I should see the recent call mat card
    When I should complete the call with the patient
    Then I should be able to verify patient details on the recent call mat card
    |&RECENT_CALL_DETAILS&|
    And I should be able to view and click the recent call eye icon and verify the recent call tab

    #Need to execute
  @WEB @DASHBOARD @SANITY_PATH
  Scenario: S8- As a user, I should be able to see the upcoming appointments card and its functions
    Given As a Existing user I am on HomePage and I click Dashboard
    And I should see the upcoming appointment card
    When I should book a video appointment
    Then I should be able to verify patient details on the upcoming appointment card

  @WEB @DASHBOARD @SANITY_PATH
  Scenario: S9- As a user, I should be able to view the appointment List page using the header appointment list symbol
    Given As a Existing user I am on HomePage and I click Dashboard
    And I should view the appointment list symbol near my profile picture
































