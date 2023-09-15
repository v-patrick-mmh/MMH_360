Feature: Fundamentals

  @WEB @FUNDAMENTALS @SANITY_PATH
  Scenario: S1 - As a provider, I should be able to navigate to the Provider Registration page.
    Given As a user I am on MMH Home Page
    And I should be able to navigate to the provider registration page

  @WEB @FUNDAMENTALS @SANITY_PATH
  Scenario: S2 - As a provider, I should be able to verify all fields in the Provider Registration page.
    Given As a user, I am on the provider registration page
    Then I should verify that all fields are present on the provider registration page
      | &SIGN_UP_PAGE1_SPAN_TEXT& | &SIGN_UP_PAGE1_INPUT_PLACEHOLDER& | &SIGN_UP_PAGE1_STRONG_TEXT& | &SIGN_UP_PAGE1_MAT_LABEL_TEXT& | &SIGN_UP_PAGE1_DIV_TEXT& |

  # Manual intervention is required for Captcha
  @WEB @FUNDAMENTALS @SANITY_PATH
  Scenario: S3 - As a provider, I should be able to register in MMH360 using a verification code.
    Given As a user, I am on the provider registration page
    When I should enter all details on the provider registration page
      | &SIGN_UP_PAGE1_INPUT_PLACEHOLDER& | &SIGN_UP_PAGE1_INPUT_PLACEHOLDER_DATA_ONE& |
    And I should click the register button
    Then I should enter the verification code and confirm my email address

  @WEB @FUNDAMENTALS @SANITY_PATH
  Scenario Template: S4 - As a newly registered provider, I should be able to login to MMH360.
#    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    And I should click the logout button
    Examples:
      | Email Address                    | Password                    |  |
      | &NEW_PROVIDER_EMAIL_ADDRESS_ONE& | &NEW_PROVIDER_PASSWORD_ONE& |  |

     # Manual intervention is required for Captcha
  @WEB @FUNDAMENTALS @SANITY_PATH
  Scenario: S5 - As a provider, I should be able to register in MMH360 using the verify email button.
    Given As a user, I am on the provider registration page
    When I should enter all details on the provider registration page
        | &SIGN_UP_PAGE1_INPUT_PLACEHOLDER& | &SIGN_UP_PAGE1_INPUT_PLACEHOLDER_DATA_TWO& |
#    And I should click the register button
    Then I should verify email and confirm my email address

  @WEB @FUNDAMENTALS @SANITY_PATH
  Scenario Template: S6 - As a newly registered provider, I should be able to login to MMH360.
#    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    And I should click the logout button
    Examples:
      | Email Address                    | Password                    |  |
      | &NEW_PROVIDER_EMAIL_ADDRESS_TWO& | &NEW_PROVIDER_PASSWORD_TWO& |  |









