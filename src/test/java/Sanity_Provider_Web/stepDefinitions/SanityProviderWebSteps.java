package Sanity_Provider_Web.stepDefinitions;

import cap.utilities.TestDataUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import Sanity_Provider_Web.SanityProviderPageContainer;
import Sanity_Patient_Web.SanityPatientPageContainer;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;
import java.util.List;


public class SanityProviderWebSteps {

    private SanityProviderPageContainer sanityProviderPageContainer;

    private SanityPatientPageContainer sanityPatientPageContainer;

    public SanityProviderWebSteps(SanityProviderPageContainer sanityProviderPageContainer, SanityPatientPageContainer sanityPatientPageContainer) {

        this.sanityProviderPageContainer = sanityProviderPageContainer;
        this.sanityPatientPageContainer = sanityPatientPageContainer;
    }


    //Login Page Started

    @Given("As a provider {string} and {string} I am on the Dashboard page")
    public void asAProviderAndIAmOnTheDashboardPage(String strEmail, String strPassword) {
        sanityProviderPageContainer.homePage.visit();
        Assert.assertTrue(sanityProviderPageContainer.homePage.clickLoginButton());
        sanityProviderPageContainer.homePage.enterEmail(TestDataUtil.getValue(strEmail));
        sanityProviderPageContainer.homePage.enterpassword(TestDataUtil.getValue(strPassword));
        sanityProviderPageContainer.homePage.clickSignInButton();
        Assert.assertTrue(sanityProviderPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.navigateToDashboard());

    }

    @Given("As a user I am on MMH login Page")
    public void asAUserIAmOnMMHLoginPage() {
        sanityProviderPageContainer.homePage.visit();
        Assert.assertTrue(sanityProviderPageContainer.homePage.clickLoginButton());
    }


    @Then("I should see user successfully logs in to the MMH portal")
    public void iShouldSeeUserSuccessfullyLogsInToTheMMHPortal() {
        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
    }


    @And("I enter {string} and {string} For Beta")
    public void iEnterAndForBeta(String strEmail, String strPassword) {
        sanityProviderPageContainer.homePage.enterEmail(TestDataUtil.getValue(strEmail));
        sanityProviderPageContainer.homePage.enterpassword(TestDataUtil.getValue(strPassword));
    }

    @When("I click SignIn button")
    public void iClickSignInButton() {
        sanityProviderPageContainer.homePage.clickSignInButton();
    }

    //Login Page Ended

    //Dashboard Page Started
    @Given("As a Existing user I am on HomePage and I click Dashboard")
    public void asAExistingUserIAmOnHomePageAndIClickDashboard() {
        Assert.assertTrue(sanityProviderPageContainer.homePage.clickDashBoard());
        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.navigateToDashboard());

    }


    @And("I should see all the mat cards on the dashboard")
    public void iShouldSeeAllTheMatCardsOnTheDashboard(String strMatCardHeading) {
        List<String> lstMatCardDetails = TestDataUtil.getListOfValue(strMatCardHeading);
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAllMatCards(lstMatCardDetails));
    }


    @And("I should see all the header menus and options available on the dashboard")
    public void iShouldSeeAllTheHeaderMenusOnTheDashboard() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAllHeaderMenus());
//        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyTrialMessage());
//        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.clickHereToUpgradeLink());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.outstandingSetupStepsButton());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyVideoPreviewCard());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyVideoAndAudioToggle());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyVirtualBackgroundLink());
    }


    @And("I should see by default video and audio toggle is disabled and video preview card shows empty")
    public void iShouldSeeByDefaultVideoAndAudioToggleIsDisabledAndVideoPreviewCardShowsEmpty() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyVideoPreviewCard());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyVideoAndAudioToggle());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyVirtualBackgroundLink());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyVideoToggleDisabled());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAudioToggleDisabled());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyVideoPreviewCardEmpty());
    }


    @Then("I should enable the video and audio toggle")
    public void iShouldEnableTheVideoAndAudioToggle() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.enableVideoToggle());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.enableAudioToggle());
    }


    @And("I should see {string} on the provider card")
    public void iShouldSeeOnTheProviderCard(String providerName) {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyProviderNameMatCard(TestDataUtil.getValue(providerName)));
    }

    @And("I should verify the Waiting room link and Appointment link in the provider card")
    public void iShouldVerifyTheWaitingRoomLinkAndAppointmentLinkInTheProviderCard() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyWaitingRoomAndAppLinkProviderCard());
    }

    @Then("I should copy the {string} and {string} from the provider card")
    public void iShouldCopyTheAndFromTheProviderCard(String waitingRoomLink, String appointmentLink) {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyWaitingRoomAndAppLinkProviderCard());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyCopiedWaitingRoomLink(TestDataUtil.getValue(waitingRoomLink)));
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyCopiedAppointmentLink(TestDataUtil.getValue(appointmentLink)));
    }

    @And("I should verify the waiting room link and Appointment link information with the content on the provider card")
    public void iShouldVerifyTheWaitingRoomLinkAndAppointmentLinkInformationWithTheContentOnTheProviderCard() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyWaitingRoomInfoContent());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAppointmentInfoContent());
    }

    @When("I send adhoc invitation to patient {string} and {string} via share invitation")
    public void iSendAdhocInvitationToPatientAndViaShareInvitation(String strPatientName, String strEmailAddress) {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyShareViaButton());
        sanityProviderPageContainer.dashboardPage.clickShareViaButton();
        sanityProviderPageContainer.dashboardPage.enterPatientName(TestDataUtil.getValue(strPatientName));
        sanityProviderPageContainer.dashboardPage.enterPatientEmailAddress(TestDataUtil.getValue(strEmailAddress));
        sanityProviderPageContainer.dashboardPage.clickSendMessageButton();
        sanityProviderPageContainer.homePage.clickLogout();
    }


    @And("I should verify the Share via button is present on the provider card")
    public void iShouldVerifyTheShareViaButtonIsPresentOnTheProviderCard() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyShareViaButton());
    }

    @And("I should click the Share via button in the provider card")
    public void iShouldClickTheShareViaButtonInTheProviderCard() {
        sanityProviderPageContainer.dashboardPage.clickShareViaButton();
    }

    @And("I should enter details {string} and {string} in the Send Invitation tab")
    public void iShouldEnterDetailsAndInTheSendInvitationTab(String strPatientName, String strEmailAddress) {
        sanityProviderPageContainer.dashboardPage.enterPatientName(TestDataUtil.getValue(strPatientName));
        sanityProviderPageContainer.dashboardPage.enterPatientEmailAddress(TestDataUtil.getValue(strEmailAddress));

    }

    @And("I should click the Send Message button in the Send Invitation tab")
    public void iShouldClickTheSendMessageButtonInTheSendInvitationTab() {
        sanityProviderPageContainer.dashboardPage.clickSendMessageButton();
    }


    @Then("I should verify the respective invitation mail from the patient {string} mailbox")
    public void iShouldVerifyTheRespectiveInvitationMailFromThePatientMailbox(String strPatientEmailAddress) {
        sanityProviderPageContainer.otherPage.visitYopMail();
        sanityProviderPageContainer.otherPage.enterPatientEmailAddressYopmail(TestDataUtil.getValue(strPatientEmailAddress));
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickRightArrowYopmail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickInvitationMail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.verifyJoinVideoConsultationEmail());
    }

    @Given("I should verify the respective invitation mail from the patient {string} mailbox and click the JVC button")
    public void iShouldVerifyTheRespectiveInvitationMailFromThePatientMailboxAndClickTheJVCButton(String strPatientEmailAddress) {
        sanityProviderPageContainer.otherPage.visitYopMail();
        sanityProviderPageContainer.otherPage.enterPatientEmailAddressYopmail(TestDataUtil.getValue(strPatientEmailAddress));
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickRightArrowYopmail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickInvitationMail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickJoinVideoConsultationButton());
    }

    @When("I send book appointment invitation to patient {string} and {string} via share invitation")
    public void iSendBookAppointmentInvitationToPatientAndViaShareInvitation(String strPatientName, String strEmailAddress) {
        sanityProviderPageContainer.dashboardPage.copyAppointmentLink();
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyShareViaButton());
        sanityProviderPageContainer.dashboardPage.clickShareViaButton();
        sanityProviderPageContainer.dashboardPage.enterPatientName(TestDataUtil.getValue(strPatientName));
        sanityProviderPageContainer.dashboardPage.enterPatientEmailAddress(TestDataUtil.getValue(strEmailAddress));
        sanityProviderPageContainer.dashboardPage.clickSendMessageButton();
        sanityProviderPageContainer.homePage.clickLogout();
    }

    @Given("I change Windows {string}")
    public void iChangeWindows(String strTimeZone) {
        Assert.assertTrue(sanityProviderPageContainer.otherPage.changeTimeZone(strTimeZone));
    }

    @When("As a provider, I should connect the call to the patient")
    public void asAProviderIShouldConnectTheCallToThePatient() {
        sanityPatientPageContainer.waitingAreaPage.openNewWindow();
        sanityProviderPageContainer.homePage.enterEmail(TestDataUtil.getValue("&EMAIL&"));
        sanityProviderPageContainer.homePage.enterpassword(TestDataUtil.getValue("&PASSWORD&"));
        sanityProviderPageContainer.homePage.clickSignInButton();
        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAndClickVideoIcon());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyProviderVideoSection(TestDataUtil.getValue("&PROVIDERNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.acceptCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyPatientVideoSection(TestDataUtil.getValue("&EXISTINGPATIENTNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
    }

    @And("As a provider, I should verify all menus and options on the provider video call page")
    public void asAProviderIShouldVerifyAllMenusAndOptionsOnTheProviderVideoCallPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            System.out.println(list1);
            Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyAllMenusInVideoCallPage(list1, list2));
        }
    }

    @Given("As a user I am on MMH Home Page")
    public void asAUserIAmOnMMHHomePage() {
        sanityProviderPageContainer.homePage.visit();
    }

    @And("I should be able to navigate to the provider registration page")
    public void iShouldBeAbleToNavigateToTheProviderRegistrationPage() {
        Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.clickSignUpForFreeButton());
        Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.verifySignUpPage());
    }

    @Given("As a user, I am on the provider registration page")
    public void asAUserIAmOnTheProviderRegistrationPage() {
        sanityProviderPageContainer.homePage.visit();
        Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.clickSignUpForFreeButton());
        Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.verifySignUpPage());
    }

    @Then("I should verify that all fields are present on the provider registration page")
    public void iShouldVerifyThatAllFieldsArePresentOnTheProviderRegistrationPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            String strKey2 = tableData.get(i).get(2).trim();
            String strKey3 = tableData.get(i).get(3).trim();
            String strKey4 = tableData.get(i).get(4).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            List<String> list3 = TestDataUtil.getListOfValue(strKey2);
            List<String> list4 = TestDataUtil.getListOfValue(strKey3);
            List<String> list5 = TestDataUtil.getListOfValue(strKey4);
            Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.verifySignUpPageFields(list1, list2, list3, list4, list5));
        }
    }

    @When("I should enter all details on the provider registration page")
    public void iShouldEnterAllDetailsOnTheProviderRegistrationPage(DataTable dataTable) {
        List<List<String>> tableData = dataTable.asLists(String.class);
        for (int i = 0; i < tableData.size(); i++) {
            String strKey = tableData.get(i).get(0).trim();
            String strKey1 = tableData.get(i).get(1).trim();
            System.out.println(strKey);
            List<String> list1 = TestDataUtil.getListOfValue(strKey);
            List<String> list2 = TestDataUtil.getListOfValue(strKey1);
            System.out.println(list1);
            System.out.println(list2);
            Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.enterProviderDetails(list1, list2));
            Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.selectSpeciality());
            Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.acceptTC());
            sanityPatientPageContainer.waitingAreaPage.waitForSeconds(30);
        }
    }

    @And("I should click the register button")
    public void iShouldClickTheRegisterButton() {
        Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.clickRegisterButton());
    }

    @Then("I should enter the verification code and confirm my email address")
    public void iShouldEnterTheVerificationCodeAndConfirmMyEmailAddress() {
        Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.verifyVerificationCodePage());
        sanityProviderPageContainer.otherPage.openNewWindowYopmail();
        sanityProviderPageContainer.otherPage.enterPatientEmailAddressYopmail(TestDataUtil.getValue("&NEW_PROVIDER_EMAIL_ADDRESS_ONE&"));
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickRightArrowYopmail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickInvitationMail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.verifyEmailAndEnterCode());


    }

    @And("I should click the logout button")
    public void iShouldClickTheLogoutButton() {
        sanityProviderPageContainer.homePage.clickLogout();
    }

    @Then("I should verify email and confirm my email address")
    public void iShouldVerifyEmailAndConfirmMyEmailAddress() {
//        Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.verifyVerificationCodePage());
        sanityProviderPageContainer.otherPage.openNewWindowYopmail();
        sanityProviderPageContainer.otherPage.navigatetoSubWindow();
        sanityProviderPageContainer.otherPage.enterPatientEmailAddressYopmail(TestDataUtil.getValue("&NEW_PROVIDER_EMAIL_ADDRESS_TWO&"));
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickRightArrowYopmail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickInvitationMail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.verifyRegistrationEmail());
        Assert.assertTrue(sanityProviderPageContainer.otherPage.clickJoinVideoConsultationButton());
        sanityPatientPageContainer.waitingAreaPage.navigatetoSecondSubWindow();
        Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.verifyConfirmationpage());
        Assert.assertTrue(sanityProviderPageContainer.fundamentalPage.clickSignInLink());

    }

    @And("I should verify the appointment list symbol is present beside my profile picture")
    public void iShouldVerifyTheAppointmentListSymbolIsPresentBesideMyProfilePicture() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAppointmentListSymbol());
    }

    @When("I should click on the appointment list symbol")
    public void iShouldClickOnTheAppointmentListSymbol() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.clickAppointmentListSymbol());
    }

    @Then("I should navigate to the appointment list page")
    public void iShouldNavigateToTheAppointmentListPage() {
        Assert.assertTrue(sanityProviderPageContainer.reportingPage.verifyAppointmentListPage());
    }

    @And("I should see the waiting room mat card")
    public void iShouldSeeTheWaitingRoomMatCard() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyInitialWaitingRoomMatCard());
    }

    @When("The patient enters the waiting area")
    public void thePatientEntersTheWaitingArea() {
        sanityProviderPageContainer.otherPage.openNewWindow();
        sanityProviderPageContainer.otherPage.navigatetoSubWindow();
        sanityPatientPageContainer.checkInPage.navigateWaitingRoom();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyPatientCheckInPage());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
        sanityPatientPageContainer.checkInPage.enterEmail(TestDataUtil.getValue("&EXISTING_PATIENT_EMAIL&"));
        sanityPatientPageContainer.checkInPage.enterpassword(TestDataUtil.getValue("&EXISTING_PATIENT_PASSWORD&"));
        sanityPatientPageContainer.checkInPage.clickSignInButton();
        sanityPatientPageContainer.checkInPage.enterMobileNumber(TestDataUtil.getValue("&NEW_PATIENT_MOBILE_NUMBER&"));
        sanityProviderPageContainer.otherPage.waitSeconds(3);
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.acceptTermsAndConditions());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.clickJoinNowButton());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyInformedConsentPage());
        sanityPatientPageContainer.checkInPage.clickIConsentCheckbox();
        sanityPatientPageContainer.checkInPage.clickLetsGoButton();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.verifyWaitingAreaPage());
        sanityProviderPageContainer.otherPage.navigatetoMainWindow();
    }

    @Then("I should be able to verify patient details on the waiting room mat card")
    public void iShouldBeAbleToVerifyPatientDetailsOnTheWaitingRoomMatCard(String strWaitingRoomDetails) {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.viewWaitingRoomPatientDetails(TestDataUtil.getListOfValue(strWaitingRoomDetails)));
    }

    @And("I should be able to view and click the waiting room eye icon and verify the waiting room tab")
    public void iShouldBeAbleToViewAndClickTheWaitingRoomEyeIconAndVerifyTheWaitingRoomTab(String strWaitingRoomDetails) {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAndClickWaitingRoomEyeIcon());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.viewWaitingRoomTabPatientDetails(TestDataUtil.getListOfValue(strWaitingRoomDetails)));
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.clickCloseIcon());

    }

    @And("I should see the recent call mat card")
    public void iShouldSeeTheRecentCallMatCard() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyInitialRecentCallsMatCard());
    }

    @When("I should complete the call with the patient")
    public void iShouldCompleteTheCallWithThePatient() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAndClickVideoIcon());
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.verifyProviderVideoSection(TestDataUtil.getValue("&PROVIDER_NAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoSubWindow();
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.acceptCallAlert());
        Assert.assertTrue(sanityPatientPageContainer.waitingAreaPage.verifyPatientVideoSection(TestDataUtil.getValue("&EXISTINGPATIENTNAME&")));
        sanityPatientPageContainer.waitingAreaPage.navigatetoMainWindow();
        Assert.assertTrue(sanityProviderPageContainer.providerVideoCallPage.closeProviderCall());
    }

    @Then("I should be able to verify patient details on the recent call mat card")
    public void iShouldBeAbleToVerifyPatientDetailsOnTheRecentCallMatCard(String strRecentCallDetails) {

        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.viewRecentCallPatientDetails(TestDataUtil.getListOfValue(strRecentCallDetails)));
    }

    @And("I should be able to view and click the recent call eye icon and verify the recent call tab")
    public void iShouldBeAbleToViewAndClickTheRecentCallEyeIconAndVerifyTheRecentCallTab() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyAndClickRecentCallEyeIcon());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.viewRecentCallTabPatientDetails());
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.clickCloseIcon());
    }

    @And("I should see the upcoming appointment card")
    public void iShouldSeeTheUpcomingAppointmentCard() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.verifyInitialUpcomingAppointmentsCard());
    }

    @When("I should book a video appointment")
    public void iShouldBookAVideoAppointment() {
        sanityProviderPageContainer.otherPage.openNewWindow();
        sanityProviderPageContainer.otherPage.navigatetoSubWindow();
        sanityPatientPageContainer.bookAppointmentPage.navigateBookAppointmentPage(TestDataUtil.getValue("&APPOINTMENT_LINK&"));
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentPage());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.selectAppointmentType());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.selectAppointmentTime());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
        sanityPatientPageContainer.checkInPage.enterEmail(TestDataUtil.getValue("&EXISTING_PATIENT_EMAIL&"));
        sanityPatientPageContainer.checkInPage.enterpassword(TestDataUtil.getValue("&EXISTING_PATIENT_PASSWORD&"));
        sanityPatientPageContainer.checkInPage.clickSignInButton();
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.acceptTermsAndConditions());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.clickJoinNowButton());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.selectPayLaterOption());
        Assert.assertTrue(sanityPatientPageContainer.checkInPage.selectExistingMMHUserCheckbox());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.clickConfirmButton());
        Assert.assertTrue(sanityPatientPageContainer.bookAppointmentPage.verifyBookAppointmentSuccessMessage());
        sanityPatientPageContainer.waitingAreaPage.closeSubWindow();
        sanityProviderPageContainer.otherPage.navigatetoMainWindow();
    }

    @Then("I should be able to verify patient details on the upcoming appointment card")
    public void iShouldBeAbleToVerifyPatientDetailsOnTheUpcomingAppointmentCard() {
        Assert.assertTrue(sanityProviderPageContainer.dashboardPage.viewUpcomingAppointmentPatientDetails(TestDataUtil.getValue("&UPCOMING_APPOINTMENT_DATA&")));
    }


    @Given("I should be able to login the mmh application")
    public void iShouldBeAbleToLoginTheMmhApplication() {
        sanityProviderPageContainer.homePage.visit();
        Assert.assertTrue(sanityProviderPageContainer.homePage.clickLoginButton());
        sanityProviderPageContainer.homePage.enterEmail(TestDataUtil.getValue("&EMAIL&"));
        sanityProviderPageContainer.homePage.enterpassword(TestDataUtil.getValue("&PASSWORD&"));
        sanityProviderPageContainer.homePage.clickSignInButton();
        Assert.assertTrue(sanityProviderPageContainer.homePage.verifyHomePageOfMMHPortal());
    }

    @Then("I should verify that the reporting menu is displayed")
    public void iShouldVerifyThatTheReportingMenuIsDisplayed() {
        Assert.assertTrue(sanityProviderPageContainer.reportingPage.verifyAndClickReportingMenu());
    }

    @And("I should verify the appointment list menu under the reporting menu")
    public void iShouldVerifyTheAppointmentListMenuUnderTheReportingMenu() {
        Assert.assertTrue(sanityProviderPageContainer.reportingPage.verifyAndClickReportingMenu());
        Assert.assertTrue(sanityProviderPageContainer.reportingPage.verifyAndClickAppointmentListMenu());
    }

    @Then("I should verify all fields in the appointment list page")
    public void iShouldVerifyAllFieldsInTheAppointmentListPage(DataTable dataTable) {
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
            Assert.assertTrue(sanityProviderPageContainer.reportingPage.verifyAppointmentListSearchFields(list1, list2, list3));
            Assert.assertTrue(sanityProviderPageContainer.reportingPage.verifyAppointmentListResultFields(list4));
        }
    }

    @And("I should view the appointment list symbol near my profile picture")
    public void iShouldViewTheAppointmentListSymbolNearMyProfilePicture() {
       Assert.assertTrue(sanityProviderPageContainer.dashboardPage.viewAppointmentListSymbol());
    }
}


    //Dashboard Page Ended

    //Frequent Used Methods

        //Assert.assertTrue(sanityProviderPageContainer.homePage.clickLogout());








  















