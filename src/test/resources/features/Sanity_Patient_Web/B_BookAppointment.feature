Feature: Book Appointment

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario: S1 - As a patient, I should navigate to the Book Appointment Page.
    Given As a patient I am navigating to the Book Appointment page


  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario: S2 - As a patient, I should verify all the fields available on the Book Appointment page.
    Given As a patient I am on the Book Appointment page
    Then I should verify all fields present on the Book Appointment page
      | &BOOK_APPOINTMENT_PAGE_PARA_TEXT& | &BOOK_APPOINTMENT_PAGE_STRONG_TEXT& | &BOOK_APPOINTMENT_PAGE_SPAN_TEXT& | &BOOK_APPOINTMENT_MAT_LABEL& |


  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario: S3 - As a patient, I should verify all the fields available on the Book Appointment Patient details.
    Given As a patient I am on the Book Appointment page
    When I should select the appointment type and appointment date
    Then I should verify all fields available on the Book Appointment Patient Details page
      | &BOOK_APPOINTMENT_FIRST_PARA_TEXT& | &BOOK_APPOINTMENT_FIRST_STRONG_TEXT& | &BOOK_APPOINTMENT_FIRST_SPAN_TEXT& | &BOOK_APPOINTMENT_FIRST_MAT_LABEL& |


  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: S4 - As an existing MMH patient, I should book an appointment in MMH 360 with the Pay Later option.
    When I should check-in as an existing Manage My Health user "<Email Address>" and "<Password>"
    And I should verify the booking appointment confirmation details and book the appointment
      | &BOOK_APP_CONFIRM_PARA_TEXT& | &BOOK_APP_CONFIRM_MAT_SUBTITLE_TXT& | &BOOK_APP_CONFIRM_STRONG_TXT& | &BOOK_APP_CONFIRM_SPAN_TXT& |
    Then I should verify the respective appointment confirmation mail from the patient "<Patient Email address>" mailbox and its details

    Examples:
      | Email Address            | Password                    | Patient Email address          |
      | &EXISTING_PATIENT_EMAIL& | &EXISTING_PATIENT_PASSWORD& | &INVITE_PATIENT_EMAIL_ADDRESS& |

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: S5 - As a new MMH patient, I should book an appointment in MMH 360 with the Pay Later option.
    Given As a patient I am on the Book Appointment page
    And I should select the appointment type and appointment date
    When I should book an appointment as a Manage My Health user
      | &NEW_PATIENT_BOOK_APP_PATIENT_FIELDS& | &NEW_PATIENT_BOOK_APP_PATIENT_DETAILS& |
    And I should verify the booking appointment confirmation details and book the appointment
      | &BOOK_APP_CONFIRM_PARA_TEXT& | &BOOK_APP_CONFIRM_MAT_SUBTITLE_TXT& | &BOOK_APP_CONFIRM_STRONG_TXT& | &BOOK_APP_CONFIRM_SPAN_TXT& |
    Then I should verify the respective appointment confirmation mail from the patient "<Patient Email address>" mailbox and its details

    Examples:
      | Patient Email address          |
      | &INVITE_PATIENT_EMAIL_ADDRESS& |


  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: S6- As a Patient, I should be able to share the book appointment link via share invitation email
    Given As a provider "<Provider Email>" and "<Provider Password>" I am on the Dashboard page
    When I send book appointment invitation to patient "<Patient Name>" and "<Patient Email address>" via share invitation
    Then I should verify the respective invitation mail from the patient "<Patient Email address>" mailbox

    Examples:
      | Patient Name          | Patient Email address          | Provider Email   | Provider Password   |  |  |
      | &INVITE_PATIENT_NAME& | &INVITE_PATIENT_EMAIL_ADDRESS& | &PROVIDER_EMAIL& | &PROVIDER_PASSWORD& |  |  |


  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: S7- As a Existing MMH Patient, I should be able to book an appointment via share invitation email
    #And I should open email box "<Username>" and "Password" to check the invitation received from the provider
    #And I should click the Join Video Consultation button in the invitation mail
    Given I should verify the respective invitation mail from the patient "<Patient Email address>" mailbox and click the JVC button
    When As a patient I should verify that I should navigate to the patient Book Appointment page
      | &BOOK_APPOINTMENT_PAGE_PARA_TEXT& | &BOOK_APPOINTMENT_PAGE_STRONG_TEXT& | &BOOK_APPOINTMENT_PAGE_SPAN_TEXT& | &BOOK_APPOINTMENT_MAT_LABEL& |
    And As an exising MMH patient "<Email Address>" and "<Password>", I should be able to book an appointment
    Then As a patient or provider "<Provider Email>" and "<Provider Password>", they should connect via video consultation

    Examples:
      |  | Patient Email address          | Provider Email   | Provider Password   | Email Address            | Password                    |
      |  | &INVITE_PATIENT_EMAIL_ADDRESS& | &PROVIDER_EMAIL& | &PROVIDER_PASSWORD& | &EXISTING_PATIENT_EMAIL& | &EXISTING_PATIENT_PASSWORD& |


  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario: S8- As an existing MMH Patient/Provider, I should verify all options/menus available in the Video call
    And As a provider, I should verify all menus and options on the provider video call page
      | &VIDEO_CALL_BOTTOM_ALT_MENUS& | &PROVIDER_VIDEO_CALL_SPAN_MENUS& | &VIDEO_CALL_PARA_TXT& |
    Then As a patient, I should verify all menus and options on the patient video call page
      | &VIDEO_CALL_BOTTOM_ALT_MENUS& | &PATIENT_VIDEO_CALL_SPAN_MENUS& | &VIDEO_CALL_PARA_TXT& |
#    And As a provider I should end the call

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario: S9- As an existing MMH Patient/Provider, I should be able to validate all options/menus in the Video call
    And As a patient or provider, I should be able to validate all bottom options in the video call page
    Then As a patient or provider, I should be able to validate all menus in the video call page

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: S10- As a new MMH Patient, I should be able to book an appointment via share invitation email
    Given I should verify the respective invitation mail from the patient "<Patient Email address>" mailbox and click the JVC button
    When As a patient I should verify that I should navigate to the patient Book Appointment page
      | &BOOK_APPOINTMENT_PAGE_PARA_TEXT& | &BOOK_APPOINTMENT_PAGE_STRONG_TEXT& | &BOOK_APPOINTMENT_PAGE_SPAN_TEXT& | &BOOK_APPOINTMENT_MAT_LABEL& |
    And As a new MMH patient, I should be able to book an appointment
      | &NEW_PATIENT_BOOK_APP_PATIENT_FIELDS& | &NEW_PATIENT_BOOK_APP_PATIENT_DETAILS& |
    Then As a patient or provider "<Provider Email>" and "<Provider Password>", they should connect via video consultation

    Examples:
      |  | Patient Email address          | Provider Email   | Provider Password   | Email Address            | Password                    |
      |  | &INVITE_PATIENT_EMAIL_ADDRESS& | &PROVIDER_EMAIL& | &PROVIDER_PASSWORD& | &EXISTING_PATIENT_EMAIL& | &EXISTING_PATIENT_PASSWORD& |

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario: S11- As a new MMH Patient/Provider, I should verify all options/menus available in the Video call
    And As a provider, I should verify all menus and options on the provider video call page
      | &VIDEO_CALL_BOTTOM_ALT_MENUS& | &PROVIDER_VIDEO_CALL_SPAN_MENUS& | &VIDEO_CALL_PARA_TXT& |
    Then As a patient, I should verify all menus and options on the patient video call page
      | &VIDEO_CALL_BOTTOM_ALT_MENUS& | &PATIENT_VIDEO_CALL_SPAN_MENUS& | &VIDEO_CALL_PARA_TXT& |
#    And As a provider I should end the call

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario: S12- As a new MMH Patient/Provider, I should be able to validate all options/menus in the Video call
    And As a patient or provider, I should be able to validate all bottom options in the video call page
    Then As a patient or provider, I should be able to validate all menus in the video call page

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario: S13- As a MMH patient, I should be able to see an information message when the slot is not available
    Given As a patient, I am opening the Book Appointment page
    Then I should verify the information message displayed for the unavailable slot


  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: S14- As a MMH patient, I should be able to  see an information message when the slot is not available via the share invitation link
    Given As a provider "<Provider Email>" and "<Provider Password>" I am on the Dashboard page
    When I send book appointment invitation to patient "<Patient Name>" and "<Patient Email address>" via share invitation
    And I should verify the respective invitation mail from the patient "<Patient Email address>" mailbox
    And I should click on the link to navigate to Book Appointment page
    Then I should verify the information message displayed for the unavailable slot

    Examples:
      | Patient Name          | Patient Email address          | Provider Email   | Provider Password   |  |  |
      | &INVITE_PATIENT_NAME& | &INVITE_PATIENT_EMAIL_ADDRESS& | &PROVIDER_EMAIL& | &PROVIDER_PASSWORD& |  |  |

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: S15 - As an existing MMH patient, I should book an appointment in MMH 360 with the Credit Card option.
    Given As a patient I am on the Book Appointment page
    And I should select the appointment type and appointment date
    When I should check-in as an existing Manage My Health user "<Email Address>" and "<Password>"
    And I should verify the booking appointment confirmation details and book the appointment with credit card option
      | &BOOK_APP_CONFIRM_PARA_TEXT& | &BOOK_APP_CONFIRM_MAT_SUBTITLE_TXT& | &BOOK_APP_CONFIRM_STRONG_TXT& | &BOOK_APP_CONFIRM_SPAN_TXT& |
    Then I should verify the payment and respective appointment confirmation mail from the patient "<Patient Email address>" mailbox and its details

    Examples:
      | Email Address            | Password                    | Patient Email address          |
      | &EXISTING_PATIENT_EMAIL& | &EXISTING_PATIENT_PASSWORD& | &INVITE_PATIENT_EMAIL_ADDRESS& |

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: S16 - As a new MMH patient, I should book an appointment in MMH 360 with the Credit Card option.
    Given As a patient I am on the Book Appointment page
    And I should select the appointment type and appointment date
    When I should book an appointment as a Manage My Health user
      | &NEW_PATIENT_BOOK_APP_PATIENT_FIELDS& | &NEW_PATIENT_BOOK_APP_PATIENT_DETAILS& |
    And I should verify the booking appointment confirmation details and book the appointment
      | &BOOK_APP_CONFIRM_PARA_TEXT& | &BOOK_APP_CONFIRM_MAT_SUBTITLE_TXT& | &BOOK_APP_CONFIRM_STRONG_TXT& | &BOOK_APP_CONFIRM_SPAN_TXT& |
    Then I should verify the payment and respective appointment confirmation mail from the patient "<Patient Email address>" mailbox and its details

    Examples:
      | Patient Email address          |
      | &INVITE_PATIENT_EMAIL_ADDRESS& |

  @WEB @BOOK_APPOINTMENT @SANITY_PATH
  Scenario Template: S17 - As a patient, I should be able to edit patient details on the Book Appointment page.
    Given As a patient I am on the Book Appointment page
    And I should select the appointment type and appointment date
    When I should check-in as an existing Manage My Health user "<Email Address>" and "<Password>"
    And I should able to edit patient details on the Book Appointment page
      | &NEW_PATIENT_BOOK_APP_PATIENT_FIELDS& | &NEW_PATIENT_BOOK_APP_PATIENT_DETAILS& |

    Examples:
      | Email Address            | Password                    |  |
      | &EXISTING_PATIENT_EMAIL& | &EXISTING_PATIENT_PASSWORD& |  |





