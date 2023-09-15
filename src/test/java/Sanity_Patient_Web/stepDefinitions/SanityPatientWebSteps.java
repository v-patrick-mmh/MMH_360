package Sanity_Patient_Web.stepDefinitions;

import Sanity_Patient_Web.SanityPatientPageContainer;
import Sanity_Provider_Web.SanityProviderPageContainer;
import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;
import java.util.List;


public class SanityPatientWebSteps {

    private SanityPatientPageContainer sanityPatientPageContainer;

    private SanityProviderPageContainer sanityProviderPageContainer;

    public SanityPatientWebSteps(SanityPatientPageContainer sanityPatientPageContainer, SanityProviderPageContainer sanityProviderPageContainer) {

        this.sanityPatientPageContainer = sanityPatientPageContainer;
        this.sanityProviderPageContainer = sanityProviderPageContainer;
    }


    //Patient Check-In First Page Started
    @Given("As a patient I am navigating to the patient check-in page")
    public void asAPatientIAmNavigatingToThePatientCheckInPage() {
        sanityPatientPageContainer.checkInPage.navigateWaitingRoom();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyPatientCheckInPage());
    }


    @When("As a patient I am on the patient check-in page")
    public void asAPatientIAmOnThePatientCheckInPage() {
        sanityPatientPageContainer.checkInPage.navigateWaitingRoom();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyPatientCheckInPage());
    }

    @And("I should verify all fields present on the patient check-in page")
    public void iShouldVerifyAllFieldsPresentInPatientCheckInPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            String strKey3 = tableData.get(i).get(2).trim();
            String strKey4 = tableData.get(i).get(3).trim();
            String strKey5 = tableData.get(i).get(4).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            List<String> list3 = TestDataUtil.getListOfValue(strKey3);
            List<String> list4 = TestDataUtil.getListOfValue(strKey4);
            List<String> list5 = TestDataUtil.getListOfValue(strKey5);
            System.out.println(list1);
            Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyPatientCheckInPageFields(list1, list2, list3, list4, list5));
        }
    }

    @When("I should check-in as an existing Manage My Health user {string} and {string}")
    public void iShouldCheckInAsAnExistingManageMyHealthUserAnd(String strEmail, String strPassword) {
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
        sanityPatientPageContainer.checkInPage.enterEmail(TestDataUtil.getValue(strEmail));
        sanityPatientPageContainer.checkInPage.enterpassword(TestDataUtil.getValue(strPassword));
        sanityPatientPageContainer.checkInPage.clickSignInButton();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.clickTakePhoto());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.acceptTermsAndConditions());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.clickJoinNowButton());
    }


    @And("I should enter {string}, {string}, {string}, {string} in patient check-in page")
    public void iShouldEnterInPatientCheckInPage(String strName, String strEmail, String strMobileNumber, String strNHI) {
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterPatientName(TestDataUtil.getValue(strName)));
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterEmailAddress(TestDataUtil.getValue(strEmail)));
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterMobileNumber(TestDataUtil.getValue(strMobileNumber)));
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterNHI(TestDataUtil.getValue(strNHI)));
        //Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectDOB(TestDataUtil.getValue(strDOB)));
    }

    @Then("I should verify Join Now button is enabled after entering mandatory fields and accepting T&C on the patient check-in page")
    public void iShouldVerifyJoinNowButtonIsEnabledAfterEnteringMandatoryFieldsAndAcceptingTCOnThePatientCheckInPage(String strPatientMandatoryDetails) {
        List<String> MandatoryData = TestDataUtil.getListOfValue(strPatientMandatoryDetails);
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyJoinNowButtonDisabled());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterPatientName(TestDataUtil.getValue(MandatoryData.get(0))));
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.acceptTermsAndConditions());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyJoinNowButtonEnabled());
    }


    @And("I should validate all button and links in patient check-in page")
    public void iShouldValidateAllButtonAndLinksInPatientCheckInPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey2 = tableData.get(i).get(1).trim();
            String strKey3 = tableData.get(i).get(2).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey2);
            List<String> list3 = TestDataUtil.getListOfValue(strKey3);
            System.out.println(list1);
            Assert.assertTrue(sanityPatientPageContainer.checkInPage.clickTakePhoto());
            Assert.assertTrue(sanityPatientPageContainer.checkInPage.viewTermsOfUsePage());
            Assert.assertTrue(sanityPatientPageContainer.checkInPage.viewPrivacyPolicyPage());
            Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyPreCallTestLink());
            Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyCameraAndSoundOptions(list1, list2, list3));

        }


    }
    // Patient Check-In First Page Ended

    // Patient Check-In Second Page Started


    @And("I should navigate to the waiting area page")
    public void iShouldNavigateToTheWaitingAreaPage() {
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyInformedConsentPage());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyLetsGoButtonDisabled());
        sanityPatientPageContainer.checkInPage.clickIConsentCheckbox();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyLetsGoButtonEnabled());
        sanityPatientPageContainer.checkInPage.clickLetsGoButton();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyMusicPlaylist());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyEmergencyContactLinkAndPopup());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyViewAndDownloadHSConsentCheckbox());
    }


    // Patient check-In Second Page Ended

    //Waiting Area Page Started

    @Then("I should verify all options available on the waiting area page")
    public void iShouldVerifyAllOptionsAvailableOnTheWaitingAreaPage(String strMusicList) {
        List<String> MusicData = TestDataUtil.getListOfValue(strMusicList);
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyMusicPlaylist());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyEmergencyContactLinkAndPopup());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyViewAndDownloadHSConsentCheckbox());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.validateMusicPlaylist(MusicData));
    }

    @Then("I should verify the patient is waiting on the waiting area page")
    public void iShouldVerifyThePatientIsWaitingOnTheWaitingAreaPage() {
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
    }


    @And("I should give consent to view and download the health summary using existing {string} and {string}")
    public void iShouldGiveConsentToViewAndDownloadTheHealthSummaryUsingExistingAnd(String strEmail, String
            strPassword) {
        sanityPatientPageContainer.waitingAreaPage.selectViewAndDownloadConsentCheckbox();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyEmailAndAddressFields());
        sanityPatientPageContainer.checkInPage.enterEmail(TestDataUtil.getValue(strEmail));
        sanityPatientPageContainer.checkInPage.enterpassword(TestDataUtil.getValue(strPassword));
        sanityPatientPageContainer.checkInPage.clickSignInButton();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyConsentSuccessMessage());
    }

    @And("I should leave from the waiting area page")
    public void iShouldLeaveFromTheWaitingAreaPage() {
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.closeWaitingAreaPage());
        sanityProviderPageContainer.homePage.visit();
        Assert.assertTrue(sanityProviderPageContainer.homePage.clickLoginButton());
        sanityProviderPageContainer.homePage.enterEmail(TestDataUtil.getValue("&EMAIL&"));
        sanityProviderPageContainer.homePage.enterpassword(TestDataUtil.getValue("&PASSWORD&"));
        sanityProviderPageContainer.homePage.clickSignInButton();
        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityProviderPageContainer.homePage.clearAllWaitingRoomPatients());
    }


    @And("As a patient I should get a call alert from the provider")
    public void asAPatientIShouldGetACallAlertFromTheProvider() {
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyCallAlert());
    }

    @And("As a patient I should decline the call alert")
    public void asAPatientIShouldDeclineTheCallAlert() {
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.declineCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
    }

    @Then("As a patient I should accept the call alert")
    public void asAPatientIShouldAcceptTheCallAlert() {
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.acceptCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyPatientVideoSection(TestDataUtil.getValue("&NEWPATIENTNAME&")));
    }

    @And("I should navigate to the provider waiting room mat card and trigger a call alert")
    public void iShouldNavigateToTheProviderWaitingRoomMatCardAndTriggerACallAlert() {
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAndClickVideoIcon());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyProviderVideoSection(TestDataUtil.getValue("&PROVIDERNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyCallAlert());
    }

    // Waiting Area Page Ended

    // Provider Page Started

    @When("As a provider {string} and {string} I should be able to trigger a call alert from the waiting room mat card")
    public void asAProviderAndIShouldBeAbleToTriggerACallAlertFromTheWaitingRoomMatCard(String strEmail, String
            strPassword) {
        sanityPatientPageContainer.waitingAreaPage.openNewWindow();
        System.out.println("Window Opened success");
        Assert.assertTrue(sanityProviderPageContainer.homePage.clickLoginButton());
        sanityProviderPageContainer.homePage.enterEmail(TestDataUtil.getValue(strEmail));
        sanityProviderPageContainer.homePage.enterpassword(TestDataUtil.getValue(strPassword));
        sanityProviderPageContainer.homePage.clickSignInButton();
        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyTakePhotoPic());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAndClickVideoIcon());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyProviderVideoSection(TestDataUtil.getValue("&PROVIDERNAME&")));
    }


//    @And("As a  {string} and {string} I should be able to trigger a call alert from the waiting room mat card")
//    public void asAProviderIShouldBeAbleToTriggerACallAlertFromTheWaitingRoomMatCard(String strEmail,String strPassword) {
//        sanityPatientPageContainer.waitingAreaPage.openNewWindow();
//        System.out.println("Window Opened success");
//        Assert.assertTrue(sanityProviderPageContainer.homePage.clickLoginButton());
//        sanityProviderPageContainer.homePage.enterEmail(TestDataUtil.getValue(strEmail));
//        sanityProviderPageContainer.homePage.enterpassword(TestDataUtil.getValue(strPassword));
//        sanityProviderPageContainer.homePage.clickSignInButton();
//        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
//        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAndClickVideoIcon());
//        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyProviderVideoSection(TestDataUtil.getValue("&PROVIDERNAME&")));
//    }


    @And("As a provider I should end the call")
    public void asAProviderIShouldEndTheCall() {
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.closeProviderCall());
    }

    @And("As a patient I should verify that I should navigate to the patient check-in page")
    public void asAPatientIShouldVerifyThatIShouldNavigateToThePatientCheckInPage(String strStrongText, String
            strSpanText, String strHeaderText, String strMatLabel, String strParaText) {
        List<String> lstStrongTextDetails = TestDataUtil.getListOfValue(strStrongText);
        List<String> lstSpanTextDetails = TestDataUtil.getListOfValue(strSpanText);
        List<String> lstHeaderTextDetails = TestDataUtil.getListOfValue(strHeaderText);
        List<String> lstMatLabelDetails = TestDataUtil.getListOfValue(strMatLabel);
        List<String> lstParaTextDetails = TestDataUtil.getListOfValue(strParaText);
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyPatientCheckInPage());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyPatientCheckInPageFields(lstStrongTextDetails, lstSpanTextDetails, lstHeaderTextDetails, lstMatLabelDetails, lstParaTextDetails));
    }

    @When("I should check-in as Manage My Health user")
    public void iShouldCheckInAsManageMyHealthUser(String strPatientDetails) {
        System.out.println("SringPatientDetails:" + strPatientDetails);
        List<String> PatientData = TestDataUtil.getListOfValue(strPatientDetails);
        System.out.println("Patient Data:" + PatientData.get(0));
        System.out.println("Total size of patient details" + PatientData.size());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyJoinNowButtonDisabled());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterPatientName(TestDataUtil.getValue(PatientData.get(0))));
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterEmailAddress(TestDataUtil.getValue(PatientData.get(1))));
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterMobileNumber(TestDataUtil.getValue(PatientData.get(3))));
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterNHI(TestDataUtil.getValue(PatientData.get(4))));
//        Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectDOB(TestDataUtil.getValue(strDOB)));
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.acceptTermsAndConditions());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyJoinNowButtonEnabled());
        sanityPatientPageContainer.checkInPage.clickJoinNowButton();
    }

    @And("As a patient, I should accept or decline the call alert")
    public void asAPatientIShouldAcceptOrDeclineTheCallAlert() {
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        sanityProviderPageContainer.homePage.visit();
        Assert.assertTrue(sanityProviderPageContainer.homePage.clickLoginButton());
        sanityProviderPageContainer.homePage.enterEmail(TestDataUtil.getValue("&EMAIL&"));
        sanityProviderPageContainer.homePage.enterpassword(TestDataUtil.getValue("&PASSWORD&"));
        sanityProviderPageContainer.homePage.clickSignInButton();
        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyTakePhotoPic());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAndClickVideoIcon());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyProviderVideoSection(TestDataUtil.getValue("&PROVIDERNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.declineCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAndClickVideoIcon());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyProviderVideoSection(TestDataUtil.getValue("&PROVIDERNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.acceptCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyPatientVideoSection(TestDataUtil.getValue("&NEWPATIENTNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
//            Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.closeProviderCall());
    }

    //Book Appointment Page
    @Given("As a patient I am navigating to the Book Appointment page")
    public void asAPatientIAmNavigatingToTheBookAppointmentPage() {
        sanityPatientPageContainer.bookAppointmentPage.navigateBookAppointmentPage(TestDataUtil.getValue("&APPOINTMENTLINK&"));
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentPage());
    }

    @Given("As a patient I am on the Book Appointment page")
    public void asAPatientIAmOnTheBookAppointmentPage() {
        sanityPatientPageContainer.bookAppointmentPage.navigateBookAppointmentPage(TestDataUtil.getValue("&APPOINTMENTLINK&"));
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentPage());
    }

    @Then("I should verify all fields present on the Book Appointment page")
    public void iShouldVerifyAllFieldsPresentOnTheBookAppointmentPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            String strKey2 = tableData.get(i).get(2).trim();
            String strKey3 = tableData.get(i).get(3).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            List<String> list3 = TestDataUtil.getListOfValue(strKey2);
            List<String> list4 = TestDataUtil.getListOfValue(strKey3);
            System.out.println(list1);
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentPageFields(list1, list2, list3, list4));
        }
    }

    @When("I should select the appointment type and appointment date")
    public void iShouldSelectTheAppointmentTypeAndAppointmentDate() {
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.selectAppointmentType());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.selectAppointmentTime());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyProceedToPaymentDisabled());
    }

    @Then("I should verify all fields available on the Book Appointment Patient Details page")
    public void iShouldVerifyAllFieldsAvailableOnTheBookAppointmentPatientDetailsPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            String strKey2 = tableData.get(i).get(2).trim();
            String strKey3 = tableData.get(i).get(3).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            List<String> list3 = TestDataUtil.getListOfValue(strKey2);
            List<String> list4 = TestDataUtil.getListOfValue(strKey3);
            System.out.println(list1);
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppPatientDetailsPage(list1, list2, list3, list4));
        }


//    @And("I should verify the Share via button is present on the provider card")
//    public void iShouldVerifyTheShareViaButtonIsPresentOnTheProviderCard() {
//        Assert.assertTrue(sanityPatientPageContainer.providerPage.verifyShareViaButton());
//    }

//    @And("I should click the Share via button in the provider card")
//    public void iShouldClickTheShareViaButtonInTheProviderCard() {
//        sanityPatientPageContainer.providerPage.clickShareViaButton();
//    }






/*  This below methods is belongs to navigate microsoft office

    @And("I should open email box {string} and {string} to check the invitation received from the provider")
    public void iShouldOpenEmailBoxAndToCheckTheInvitationReceivedFromTheProvider(String strEmailAddress, String strPassword) {
        sanityPatientPageContainer.providerPage.openNewWindowOffice();
        sanityPatientPageContainer.providerPage.clickOfficeSignInButton();
        sanityPatientPageContainer.providerPage.enterOfficeEmailAddress(TestDataUtil.getValue(strEmailAddress));
        sanityPatientPageContainer.providerPage.clickOfficeNextButton();
        sanityPatientPageContainer.providerPage.enterOfficePassword(TestDataUtil.getValue(strPassword));
        sanityPatientPageContainer.providerPage.clickOfficeSignButton();
        sanityPatientPageContainer.providerPage.clickOfficeOutlookButton();
        Assert.assertTrue(sanityPatientPageContainer.providerPage.clickOfficeOutlookInvitationMail());
    }

    @And("I should click the Join Video Consultation button in the invitation mail")
    public void iShouldClickTheJoinVideoConsultationButtonInTheInvitationMail() {
        Assert.assertTrue(sanityPatientPageContainer.providerPage.clickJVCButtonInInvitationMail());
    }

    */
    }

    @Then("I should verify the booking appointment confirmation details and book the appointment")
    public void iShouldVerifyTheBookingAppointmentConfirmationDetailsAndBookTheAppointment(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            String strKey2 = tableData.get(i).get(2).trim();
            String strKey3 = tableData.get(i).get(3).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            List<String> list3 = TestDataUtil.getListOfValue(strKey2);
            List<String> list4 = TestDataUtil.getListOfValue(strKey3);
            System.out.println(list1);
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppPatientCofirmationDetailsPage(list1, list2, list3, list4));
            System.out.println("First scenario passed:");
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyConfirmDisabledButton());
            Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.clickConfirmButton());
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentSuccessMessage());
        }
    }


    @Then("I should verify the respective appointment confirmation mail from the patient {string} mailbox and its details")
    public void iShouldVerifyTheRespectiveAppointmentConfirmationMailFromThePatientMailboxAndItsDetails(String strPatientEmailAddress) {
        sanityProviderPageContainer.otherPage.openNewWindowYopmail();
        sanityProviderPageContainer.otherPage.enterPatientEmailAddressYopmail(TestDataUtil.getValue(strPatientEmailAddress));
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickRightArrowYopmail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickInvitationMail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.verifyAppVideoConfirmation());
    }

    @Then("As an exising MMH patient {string} and {string}, I should be able to book an appointment")
    public void asAnExisingMMHPatientAndIShouldBeAbleToBookAnAppointment(String strEmail, String strPassword) {

        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.selectAppointmentType());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.selectAppointmentTime());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyProceedToPaymentDisabled());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
        sanityPatientPageContainer.checkInPage.enterEmail(TestDataUtil.getValue(strEmail));
        sanityPatientPageContainer.checkInPage.enterpassword(TestDataUtil.getValue(strPassword));
        sanityPatientPageContainer.checkInPage.clickSignInButton();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.acceptTermsAndConditions());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.clickJoinNowButton());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyConfirmDisabledButton());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.clickConfirmButton());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentSuccessMessage());
        sanityPatientPageContainer.waitingAreaPage.closeSubWindow();
    }

    @And("As a patient I should verify that I should navigate to the patient Book Appointment page")
    public void asAPatientIShouldVerifyThatIShouldNavigateToThePatientBookAppointmentPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            String strKey2 = tableData.get(i).get(2).trim();
            String strKey3 = tableData.get(i).get(3).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            List<String> list3 = TestDataUtil.getListOfValue(strKey2);
            List<String> list4 = TestDataUtil.getListOfValue(strKey3);
            System.out.println(list1);
            sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentPage());
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentPageFields(list1, list2, list3, list4));
        }
    }

    @Then("As a patient or provider {string} and {string}, they should connect via video consultation")
    public void asAPatientOrProviderTheyShouldConnectViaVideoConsultation(String strEmail, String strPassword) {
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        sanityProviderPageContainer.otherPage.clickYopmailRefreshButton();
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickInvitationMail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.verifyAppVideoConfirmation());
        sanityProviderPageContainer.otherPage.waitSeconds(600);
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickJoinVideoConsultationButton());
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        System.out.println("Window Opened success");
        sanityProviderPageContainer.homePage.visit();
        sanityProviderPageContainer.homePage.clickLoginButton();
        sanityProviderPageContainer.homePage.enterEmail(TestDataUtil.getValue(strEmail));
        sanityProviderPageContainer.homePage.enterpassword(TestDataUtil.getValue(strPassword));
        sanityProviderPageContainer.homePage.clickSignInButton();
        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.clickupcomingappvideoicon());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyProviderVideoSection(TestDataUtil.getValue("&PROVIDERNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.declineCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.clickupcomingappvideoicon());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyProviderVideoSection(TestDataUtil.getValue("&PROVIDERNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.acceptCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyPatientVideoSection(TestDataUtil.getValue("&NEWPATIENTNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
//            Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.closeProviderCall());
    }

    @When("I should book an appointment as a Manage My Health user")
    public void iShouldBookAnAppointmentAsAManageMyHealthUser(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            System.out.println(list1);
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyProceedToPaymentDisabled());
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.enterPatientDetails(list1, list2));
            sanityProviderPageContainer.otherPage.waitSeconds(50);
        }
    }

    @Given("As a patient, I should navigate to the waiting area page")
    public void asAPatientIShouldNavigateToTheWaitingAreaPage() {
        sanityPatientPageContainer.checkInPage.navigateWaitingRoom();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
        sanityPatientPageContainer.checkInPage.enterEmail(TestDataUtil.getValue("&EXISTING_PATIENT_EMAIL&"));
        sanityPatientPageContainer.checkInPage.enterpassword(TestDataUtil.getValue("&EXISTING_PATIENT_PASSWORD&"));
        sanityPatientPageContainer.checkInPage.clickSignInButton();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.acceptTermsAndConditions());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.clickJoinNowButton());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyInformedConsentPage());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyLetsGoButtonDisabled());
        sanityPatientPageContainer.checkInPage.clickIConsentCheckbox();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyLetsGoButtonEnabled());
        sanityPatientPageContainer.checkInPage.clickLetsGoButton();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
    }

    @Then("As a patient, I should verify all menus and options on the patient video call page")
    public void asAPatientIShouldVerifyAllMenusAndOptionsOnThePatientVideoCallPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            System.out.println(list1);
//                sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
            sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
            Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.verifyAllMenusInPatientVideoCallPage(list1, list2));
        }
    }


    @And("As a patient or provider, I should be able to validate all bottom options in the video call page")
    public void asAPatientOrProviderIShouldBeAbleToValidateAllBottomOptionsInTheVideoCallPage() {
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateMuteUnMuteOption());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateVideoOption());
//        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateScreenShareOption());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateSettingsOption());
//        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validatePhotoCaptureOption());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateChatOption());
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateMuteUnMuteOption());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateVideoOption());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateSettingsOption());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateChatOption());
    }


    @Then("As a patient or provider, I should be able to validate all menus in the video call page")
    public void asAPatientOrProviderIShouldBeAbleToValidateAllMenusInTheVideoCallPage() {
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.validateYoutubePlayerMenu());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateConnectionInfoMenu());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.providerRequestPayment());
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.patientPayAmount());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateConnectionInfoMenu());
        sanityPatientPageContainer.waitingAreaPage.openNewWindow();
        sanityPatientPageContainer.waitingAreaPage.navigatetoSecondSubWindow();
        sanityPatientPageContainer.checkInPage.navigateWaitingRoom();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.enterPatientName(TestDataUtil.getValue("&NEWPATIENTNAME&")));
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.acceptTermsAndConditions());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.clickJoinNowButton());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyInformedConsentPage());
        sanityPatientPageContainer.checkInPage.clickIConsentCheckbox();
        sanityPatientPageContainer.checkInPage.clickLetsGoButton();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.validateInvitePatientMenu());
        sanityPatientPageContainer.waitingAreaPage.navigatetoSecondSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.acceptCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.verifyTwoSlideVideoSection());
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.verifyTwoSlideVideoSection());
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.verifyTwoSlideVideoSection());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.validateVirtualBackgroundMenu());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validatePatientEnrolmenu());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateMedicalQuestionnairemenu());
//        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateFileTransferMenu(TestDataUtil.getValue("&FILE_NAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
//        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateFileTransferMenu(TestDataUtil.getValue("&FILE_NAME&")));
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validatePatientEnrolmenu());
        Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.validateMedicalQuestionnairemenu());
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.closeProviderCall());

    }

    @And("As a new MMH patient, I should be able to book an appointment")
    public void asANewMMHPatientIShouldBeAbleToBookAnAppointment(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            System.out.println(list1);
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyProceedToPaymentDisabled());
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.enterPatientDetails(list1, list2));
            sanityProviderPageContainer.otherPage.waitSeconds(20);
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyConfirmDisabledButton());
            Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.clickConfirmButton());
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentSuccessMessage());
        }
    }


    @Given("As a patient, I am opening the Book Appointment page")
    public void asAPatientIAmOpeningTheBookAppointmentPage() {
        sanityPatientPageContainer.bookAppointmentPage.navigateBookAppointmentPage(TestDataUtil.getValue("&NO_SLOT_APPOINTMENT_LINK&"));
    }

    @Then("I should verify the information message displayed for the unavailable slot")
    public void iShouldVerifyTheInformationMessageDisplayedForTheUnavailableSlot() {
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyInformationMessage());
    }

    @And("I should click on the link to navigate to Book Appointment page")
    public void iShouldClickOnTheLinkToNavigateToBookAppointmentPage() {
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickInvitationMail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickJoinVideoConsultationButton());
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
    }

    @And("I should verify the booking appointment confirmation details and book the appointment with credit card option")
    public void iShouldVerifyTheBookingAppointmentConfirmationDetailsAndBookTheAppointmentWithCreditCardOption(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            String strKey2 = tableData.get(i).get(2).trim();
            String strKey3 = tableData.get(i).get(3).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            List<String> list3 = TestDataUtil.getListOfValue(strKey2);
            List<String> list4 = TestDataUtil.getListOfValue(strKey3);
            System.out.println(list1);
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppPatientCofirmationDetailsPage(list1, list2, list3, list4));
            System.out.println("First scenario passed:");
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyConfirmDisabledButton());
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.clickCreditCardOption());
            Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.clickConfirmButton());
            Assert.assertTrue(sanityPatientPageContainer.patientVideoCallPage.patientPayAmount());
        }
    }

    @Then("I should verify the payment and respective appointment confirmation mail from the patient {string} mailbox and its details")
    public void iShouldVerifyThePaymentAndRespectiveAppointmentConfirmationMailFromThePatientMailboxAndItsDetails(String strPatientEmailAddress) {
        sanityProviderPageContainer.otherPage.openNewWindowYopmail();
        sanityProviderPageContainer.otherPage.enterPatientEmailAddressYopmail(TestDataUtil.getValue(strPatientEmailAddress));
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickRightArrowYopmail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickInvitationMail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.verifyPaymentConfirmation());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.verifyAppVideoConfirmationPayment());
    }

    @And("I should able to edit patient details on the Book Appointment page")
    public void iShouldAbleToEditPatientDetailsOnTheBookAppointmentPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            System.out.println(list1);
            Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.enterPatientDetails(list1, list2));
            sanityProviderPageContainer.otherPage.closeWindow(1);
            sanityProviderPageContainer.otherPage.waitSeconds(50);


        }
    }


}