Feature: Adhoc

  @WEB @ADHOC @SANITY_PATH @CHECK
  Scenario: S1 - As a patient, I should navigate to the Patient Check-In Page.
    Given As a patient I am navigating to the patient check-in page


  @WEB @ADHOC @SANITY_PATH
  Scenario: S2 - As a patient, I should verify all the fields available on the patient check-in page.
    When As a patient I am on the patient check-in page
    Then I should verify all fields present on the patient check-in page
      | &PATIENT_CHECK_IN_PAGE_STRONG& | &PATIENT_CHECK_IN_PAGE_SPAN& | &PATIENT_CHECK_IN_PAGE_HEADER_TEXT& | &PATIENT_CHECK_IN_PAGE_MAT_LABEL& | &PATIENT_CHECK_IN_PAGE_PARA_TEXT& |

  @WEB @ADHOC @SANITY_PATH
  Scenario: S3 - As a patient, I should validate all buttons and links in Patient Check-In Page.
    When As a patient I am on the patient check-in page
    Then I should verify Join Now button is enabled after entering mandatory fields and accepting T&C on the patient check-in page
      | &PATIENT_DETAILS_MANDATORY& |
    And I should validate all button and links in patient check-in page
      | &PATIENT_CHECK_IN_MICRO_SPAN_TEXT& | &PATIENT_CHECK_IN_CAMERA_SPAN_TEXT& | &PATIENT_CHECK_IN_SOUND_SPAN_TEXT& |


  @WEB @ADHOC @SANITY_PATH
  Scenario Template: S4 - As a existing MMH patient, I should navigate to waiting area page
    Given As a patient I am on the patient check-in page
    When I should check-in as an existing Manage My Health user "<Email Address>" and "<Password>"
    And I should navigate to the waiting area page
    Then I should verify the patient is waiting on the waiting area page
#    And I should leave from the waiting area page

    Examples:
      | Email Address            | Password                    |  |
      | &EXISTING_PATIENT_EMAIL& | &EXISTING_PATIENT_PASSWORD& |  |


  @WEB @ADHOC @SANITY_PATH
  Scenario Template: S5 - As a existing MMH patient, I should validate all the buttons and actions in Waiting Area page.
    Then I should verify all options available on the waiting area page
    |&PATIENT_MUSIC_PLAYLIST_TABLE_DATA&|
    And I should give consent to view and download the health summary using existing "<Patient Email>" and "<Password>"

    Examples:
      | Patient Email            | Password                    |
      | &EXISTING_PATIENT_EMAIL& | &EXISTING_PATIENT_PASSWORD& |

  @WEB @ADHOC @SANITY_PATH
  Scenario Template: S6 - As a existing MMH patient, I should be able to accept/decline provider call
    When As a provider "<Provider Email>" and "<Provider Password>" I should be able to trigger a call alert from the waiting room mat card
    And As a patient I should get a call alert from the provider
    And As a patient I should decline the call alert
    And I should navigate to the provider waiting room mat card and trigger a call alert
    Then As a patient I should accept the call alert
    And As a provider I should end the call

    Examples:
      | Provider Email  | Provider Password  |
      | &PROVIDER_EMAIL& | &PROVIDER_PASSWORD& |


  @WEB @ADHOC @SANITY_PATH
  Scenario: S7 - As a new MMH patient, I should navigate to waiting area page
    Given As a patient I am on the patient check-in page
    When I should check-in as Manage My Health user
      | &NEW_PATIENT_DETAILS& |
    And I should navigate to the waiting area page
    Then I should verify the patient is waiting on the waiting area page
#    And I should leave from the waiting area page


  @WEB @ADHOC @SANITY_PATH
  Scenario Template: S8 - As a new MMH patient, I should validate all the buttons and actions in Waiting Area page.
    Then I should verify all options available on the waiting area page
    And I should give consent to view and download the health summary using existing "<Patient Email>" and "<Password>"
#    And I should leave from the waiting area page

    Examples:
      | Patient Email            | Password                    |
      | &EXISTING_PATIENT_EMAIL& | &EXISTING_PATIENT_PASSWORD& |


  @WEB @ADHOC @SANITY_PATH
  Scenario Template: S9 - As a new MMH patient, I should be able to accept/decline provider call
    When As a provider "<Provider Email>" and "<Provider Password>" I should be able to trigger a call alert from the waiting room mat card
    And As a patient I should get a call alert from the provider
    And As a patient I should decline the call alert
    And I should navigate to the provider waiting room mat card and trigger a call alert
    Then As a patient I should accept the call alert
    And As a provider I should end the call

    Examples:
      | Provider Email  | Provider Password  |
      | &PROVIDER_EMAIL& | &PROVIDER_PASSWORD& |


  @WEB @ADHOC @SANITY_PATH
  Scenario Template: S10- As a Provider, I should be able to share the adhoc link via share invitation email
    Given As a provider "<Provider Email>" and "<Provider Password>" I am on the Dashboard page
    When I send adhoc invitation to patient "<Patient Name>" and "<Patient Email address>" via share invitation
    Then I should verify the respective invitation mail from the patient "<Patient Email address>" mailbox


    Examples:
      | Patient Name          | Patient Email address          | Provider Email   | Provider Password   |  |  |
      | &INVITE_PATIENT_NAME& | &INVITE_PATIENT_EMAIL_ADDRESS& | &PROVIDER_EMAIL& | &PROVIDER_PASSWORD& |  |  |


  @WEB @ADHOC @SANITY_PATH
  Scenario Template: S11- As a new MMH Patient, I should be able to connect video call via share invitation email
    Given I should verify the respective invitation mail from the patient "<Patient Email address>" mailbox and click the JVC button
    When As a patient I should verify that I should navigate to the patient check-in page
      | &PATIENT_CHECK_IN_PAGE_STRONG& | &PATIENT_CHECK_IN_PAGE_SPAN& | &PATIENT_CHECK_IN_PAGE_HEADER_TEXT& | &PATIENT_CHECK_IN_PAGE_MAT_LABEL& | &PATIENT_CHECK_IN_PAGE_PARA_TEXT& |
    And I should validate all button and links in patient check-in page
      | &PATIENT_CHECK_IN_MICRO_SPAN_TEXT& | &PATIENT_CHECK_IN_CAMERA_SPAN_TEXT& | &PATIENT_CHECK_IN_SOUND_SPAN_TEXT& |
    And I should check-in as Manage My Health user
      |&NEW_PATIENT_DETAILS&|
    And I should navigate to the waiting area page
    Then As a patient, I should accept or decline the call alert

    Examples:
      | Patient Email address          |
      | &INVITE_PATIENT_EMAIL_ADDRESS& |

  @WEB @ADHOC @SANITY_PATH
  Scenario: S12- As a new MMH Patient/Provider, I should verify all options/menus available in the Video call
#    Given As a patient, I should navigate to the waiting area page
#    When As a provider, I should connect the call to the patient
    And As a provider, I should verify all menus and options on the provider video call page
      | &VIDEO_CALL_BOTTOM_ALT_MENUS& | &PROVIDER_VIDEO_CALL_SPAN_MENUS& | &VIDEO_CALL_PARA_TXT& |
    Then As a patient, I should verify all menus and options on the patient video call page
      | &VIDEO_CALL_BOTTOM_ALT_MENUS& | &PATIENT_VIDEO_CALL_SPAN_MENUS& | &VIDEO_CALL_PARA_TXT& |
#    And As a provider I should end the call

  @WEB @ADHOC @SANITY_PATH
  Scenario: S13- As a new MMH Patient/Provider, I should be able to validate all options/menus in the Video call
#    Given As a patient, I should navigate to the waiting area page
#    When As a provider, I should connect the call to the patient
    And As a patient or provider, I should be able to validate all bottom options in the video call page
    Then As a patient or provider, I should be able to validate all menus in the video call page

  @WEB @ADHOC @SANITY_PATH
  Scenario Template: S14- As an existing MMH Patient, I should be able to connect video call via share invitation email
    Given I should verify the respective invitation mail from the patient "<Patient Email address>" mailbox and click the JVC button
    When As a patient I should verify that I should navigate to the patient check-in page
      | &PATIENT_CHECK_IN_PAGE_STRONG& | &PATIENT_CHECK_IN_PAGE_SPAN& | &PATIENT_CHECK_IN_PAGE_HEADER_TEXT& | &PATIENT_CHECK_IN_PAGE_MAT_LABEL& | &PATIENT_CHECK_IN_PAGE_PARA_TEXT& |
    And I should check-in as an existing Manage My Health user "<Email Address>" and "<Password>"
    And I should navigate to the waiting area page
    Then As a patient, I should accept or decline the call alert

    Examples:
      | Patient Email address          | Email Address            | Password                    |
      | &INVITE_PATIENT_EMAIL_ADDRESS& | &EXISTING_PATIENT_EMAIL& | &EXISTING_PATIENT_PASSWORD& |

  @WEB @ADHOC @SANITY_PATH
  Scenario: S15- As an existing MMH Patient/Provider, I should verify all options/menus available in the Video call
#    Given As a patient, I should navigate to the waiting area page
#    When As a provider, I should connect the call to the patient
    And As a provider, I should verify all menus and options on the provider video call page
      | &VIDEO_CALL_BOTTOM_ALT_MENUS& | &PROVIDER_VIDEO_CALL_SPAN_MENUS& | &VIDEO_CALL_PARA_TXT& |
    Then As a patient, I should verify all menus and options on the patient video call page
      | &VIDEO_CALL_BOTTOM_ALT_MENUS& | &PATIENT_VIDEO_CALL_SPAN_MENUS& | &VIDEO_CALL_PARA_TXT& |
#    And As a provider I should end the call

  @WEB @ADHOC @SANITY_PATH
  Scenario: S16- As an existing MMH Patient/Provider, I should be able to validate all options/menus in the Video call
#    Given As a patient, I should navigate to the waiting area page
#    When As a provider, I should connect the call to the patient
    And As a patient or provider, I should be able to validate all bottom options in the video call page
    And As a patient or provider, I should be able to validate all menus in the video call page



















