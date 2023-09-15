package Sanity_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import javafx.scene.input.Clipboard;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashBoard;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Welcome')]")
    protected WebElement elmntWelcomeMessage;

    @FindBy(how = How.XPATH, using = "//div[@class = 'ng-star-inserted']//p[contains(text(),' Your trial is ending in ')]")
    protected WebElement elmnttrial;


    @FindBy(how = How.XPATH, using = "//div[@class = 'ng-star-inserted']//a//u[contains(text(),'Click here to upgrade ')]")
    protected WebElement elmntupgradelink;


    @FindBy(how = How.XPATH, using = "(//span[text()= 'Outstanding setup steps'])[1]")
    protected WebElement elmntoutstandingsetup;

    @FindBy(how = How.XPATH, using = "//div[@class = 'wrapper-size-for-nocamera ng-star-inserted']//img[@src = '../../../../assets/images/videoavatar.svg']")
    protected WebElement elmntvideocard;

    @FindBy(how = How.XPATH, using = "//div[@id = 'MP_camera_publisher_default_controls']")
    protected WebElement elmntvideoenabled;

    @FindBy(how = How.XPATH, using = "//div//label[text(), 'Video ']")
    protected WebElement elmntvideolabel;

    @FindBy(how = How.XPATH, using = "(//mat-slide-toggle[contains(@class, 'mat-slide-toggle SlideToggle mat-accent')])[1]")
    protected WebElement elmntvideotoggle;

    @FindBy(how = How.XPATH, using = "(//mat-slide-toggle[contains(@class, 'mat-slide-toggle SlideToggle mat-accent')])[2]")
    protected WebElement elmntaudiotoggle;

    @FindBy(how = How.XPATH, using = "(//mat-slide-toggle[@class = 'mat-slide-toggle SlideToggle mat-accent'])[1]")
    protected WebElement elmntvideotoggledisabled;

    @FindBy(how = How.XPATH, using = "(//mat-slide-toggle[@class = 'mat-slide-toggle SlideToggle mat-accent'])[2]")
    protected WebElement elmntaudiotoggledisabled;

    @FindBy(how = How.XPATH, using = "(//mat-slide-toggle[@class = 'mat-slide-toggle SlideToggle mat-accent mat-checked'])[1]")
    protected WebElement elmntvideotoggleenabled;
    @FindBy(how = How.XPATH, using = "(//mat-slide-toggle[@class = 'mat-slide-toggle SlideToggle mat-accent mat-checked'])[2]")
    protected WebElement elmntaudiotoggleenabled;

    @FindBy(how = How.XPATH, using = "//div//label[text(), 'Audio ']")
    protected WebElement elmntaudiolabel;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Virtual background')]//img[@src = '../../../../assets/images/Link.svg']")
    protected WebElement elmntvirtualbackgroundlink;

//    @FindBy(how = How.XPATH, using = "//strong[contains(text(), ' is currently  ')]")

    @FindBy(how = How.XPATH, using = "(//mat-card[contains(@class,'cardHeightWaitingRoom')])[1]")
    protected WebElement elmntprovidercard;

    @FindBy(how = How.XPATH, using = "(//mat-card-title[@class = 'mat-card-title mainheader'])[1]")
    protected WebElement elmntprovidercardname;

    @FindBy(how = How.XPATH, using = "(//mat-card[contains(@class,'cardHeightWaitingRoom')])[2]")
    protected WebElement elmntwaitingroomcard;

    @FindBy(how = How.XPATH, using = "//img[@src = '../../../assets/images/waiting-room.svg']")
    protected WebElement elmntwaitingroomicon;

    @FindBy(how = How.XPATH, using = "//img[@src = '../../../assets/images/call-received.svg']")
    protected WebElement elmntrecentcallsicon;

    @FindBy(how = How.XPATH, using = "//img[@src = '../../../assets/images/calendar.svg']")
    protected WebElement elmntupcomingappointmentsicon;

    @FindBy(how = How.XPATH, using = "//mat-card-title[text() = 'Waiting room ']")
    protected WebElement elmntwaitingroomtxt;

    @FindBy(how = How.XPATH, using = "//mat-card-title[text() = ' Recent calls']")
    protected WebElement elmntrecentcalltxt;

    @FindBy(how = How.XPATH, using = "//mat-card-title[text() = ' Upcoming appointments']")
    protected WebElement elmntupcomingappointmentstxt;

    @FindBy(how = How.XPATH, using = "//mat-card-subtitle[text() = 'No one is currently waiting']")
    protected WebElement elmntnoonewaitingtxt;

    @FindBy(how = How.XPATH, using = "//mat-card-subtitle[text() = ' No recent calls ']")
    protected WebElement elmntnorecentcallstxt;

    @FindBy(how = How.XPATH, using = "//mat-card-subtitle[text() = 'No  upcoming appointments. ']")
    protected WebElement elmntnoupcomingappointmentstxt;

    @FindBy(how = How.XPATH, using = "(//mat-card[contains(@class,'cardHeightWaitingRoom')])[3]")
    protected WebElement elmntrecentcallscard;

    @FindBy(how = How.XPATH, using = "(//mat-card[contains(@class,'cardHeightWaitingRoom')])[4]")
    protected WebElement elmntupcomingappointmentscard;

    @FindBy(how = How.XPATH, using = "//a[text()= 'View all Appointments']")
    protected WebElement elmntviewallappointmentsbutton;

    @FindBy(how = How.XPATH, using = "//img[@src = 'assets/images/MMH_Logo_TypeLPng.svg']")
    protected WebElement elmntmmh360logo;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Video call usage limit: ')]")
    protected WebElement elmntvideocallusagetab;

    @FindBy(how = How.XPATH, using = "//div[@class = 'font-sizeforMobile']//span[contains(text(),'SMS usage limit:')]")
    protected WebElement elmntsmsusagetab;

    @FindBy(how = How.XPATH, using = "//img[@src='assets/images/book-app.svg']")
    protected WebElement elmntappointmentlistbtn;

    @FindBy(how = How.XPATH, using = "//img[@class='profile-pic img-fluid']")
    protected WebElement elmntprofilepic;

    @FindBy(how = How.XPATH, using = "//strong[text() = ' is currently  ']")
    protected WebElement elmntiscurrently;

    @FindBy(how = How.XPATH, using = "//span[text() = 'ONLINE ']")
    protected WebElement elmntonline;

    @FindBy(how = How.XPATH, using = "//div[@class = 'tes waiting-room']//mat-form-field[contains(@class, 'mat-form-field private-link')]")
    protected WebElement elmntwaitingroomlink;

    @FindBy(how = How.XPATH, using = "//div[@class = 'tes appointmment-link']//mat-form-field[contains(@class, 'mat-form-field private-link')]")
    protected WebElement elmntappointmentlink;

    @FindBy(how = How.XPATH, using = "(//img[@mattooltip = 'Copy'])[1]")
    protected WebElement elmntwaitingcopylink;

    @FindBy(how = How.XPATH, using = "(//img[@mattooltip = 'Copy'])[2]")
    protected WebElement elmntappointmentcopylink;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Clinic link copied!']")
    protected WebElement elmntcopymessage;

    @FindBy(how = How.XPATH, using = "(//mat-icon[text() = ' info_outline'])[1]")
    protected WebElement elmntwaitinginfoicon;

    @FindBy(how = How.XPATH, using = "(//mat-icon[text() = ' info_outline'])[2]")
    protected WebElement elmntappointmentinfoicon;

    @FindBy(how = How.XPATH, using = "//div[text() = 'Copy link / Share via']")
    protected WebElement elmntinfoheader;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'This link can be shared with your patients to join the waiting room instantly. Click the Copy icon')]")
    protected WebElement elmntwaitinginfocontent;

    @FindBy(how = How.XPATH, using = "//span[contains(@class, 'k-icon')]")
    protected WebElement elmntinfocloseicon;

    @FindBy(how = How.XPATH, using = "//button[text() = 'OK']")
    protected WebElement elmntinfookbutton;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'This link can be shared with your patients to book the appointments. Click the Copy icon')]")
    protected WebElement elmntappointmentinfocontent;

    @FindBy(how = How.XPATH, using = "//button//span[text() = ' SHARE VIA ']")
    protected WebElement elmntshareviabutton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Welcome, ')]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "(//div//button//span[@class = 'mat-button-wrapper']//img[@src = 'assets/images/avatar-video.svg'])[1]")
    protected WebElement elmntfirstvideoicon;


    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'mat-icon-button')]//span//img[@class = 'videoimage']")
    protected List<WebElement> elmntappvideoicon;

    @FindBy(how = How.XPATH, using = "//div//p[text() = ' Send invitation ']")
    protected WebElement elmntsendinvitationtxt;

    @FindBy(how = How.XPATH, using = "//div//p[text() = ' Invite to book an appointment ']")
    protected WebElement elmntinvitebookappointmenttxt;

    @FindBy(how = How.XPATH, using = "//div//input[@formcontrolname = 'patientName' and @data-placeholder = 'Patient/Customer name']")
    protected WebElement elmntpatientnametxtbox;

    @FindBy(how = How.XPATH, using = "//div//input[@formcontrolname = 'emailAddress' and @data-placeholder = 'Patient/Customer email address']")
    protected WebElement elmntpatientemailaddresstxtbox;

    @FindBy(how = How.XPATH, using = "//div//button//span[text() = ' SEND MESSAGE']")
    protected WebElement elmntsendmessagebtn;

    @FindBy(how = How.XPATH, using = "//img[@src = 'https://uatapimmh360.mmh-demo.com/All_Images/TempImages/PATIENTPROFILE/placeholder.PNG']")
    protected WebElement elmntdefaultproviderpic;

    @FindBy(how = How.XPATH, using = "//img[@src = 'assets/images/book-app.svg']")
    protected WebElement elmntapplistsymbol;

    @FindBy(how = How.XPATH, using = "//h1[text() = 'Appointment list']")
    protected WebElement elmntapplisttxt;

    @FindBy(how = How.XPATH, using = "(//img[@src = '../../../assets/images/eye-outline-ds.svg' and @alt = 'eyeoutline'])[1]")
    protected WebElement elmntwaitingroomeyeicon;

    @FindBy(how = How.XPATH, using = "(//img[@src = '../../../assets/images/eye-outline-ds.svg' and @alt = 'eyeoutline'])[2]")
    protected WebElement elmntrecentcalleyeicon;

    @FindBy(how = How.XPATH, using = "(//button[@mattooltip = 'Close'])[1]")
    protected WebElement elmntcloseicon;

    @FindBy(how = How.XPATH, using = "//mat-card-subtitle[contains(text() , 'Patient is waiting')]")
    protected WebElement elmntwaitingtxt;

    @FindBy(how = How.XPATH, using = "(//mat-list-item[contains(@class, 'mat-list-item-avatar')])[1]//div[1]//div[3]//div[1]")
    protected WebElement elmntrecentcalldata;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'patient-waiting')])[1]//div[1]//div[1]//p[1]")
    protected WebElement elmntrecentcalltabdata;





    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    protected String matcardtitletxt = new StringBuilder().append("//mat-card-title[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String strongtxt = new StringBuilder().append("//strong[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String spantxt = new StringBuilder().append("//span[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String matlabeltxt = new StringBuilder().append("//mat-label[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String ptxt = new StringBuilder().append("//p[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String htxt = new StringBuilder().append("//h1[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String divtxt = new StringBuilder().append("//div[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();





    public boolean navigateToDashboard() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
//            waitForElement(txtConnectAHealthCentre);
            jsScrollIntoView(elmntDashBoard);
            waitForElement(elmntDashBoard);
            waitForElementClickable(elmntDashBoard);
            jsClick(elmntDashBoard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntWelcomeMessage);
            blResult = verifyElement(elmntWelcomeMessage);
            takeScreenshotSanity(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

        } catch (Exception e) {
            System.out.println("Failed to navigate To Dashboard Page >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyTrialMessage() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmnttrial);
        } catch (Exception e) {
            System.out.println("Trial Message is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean clickHereToUpgradeLink() {
        boolean blResult = false;
        try {
            waitForElement(elmntupgradelink);
            blResult = verifyElement(elmntupgradelink);
        } catch (Exception e) {
            System.out.println("Click Here to Upgrade Link is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean outstandingSetupStepsButton() {
        boolean blResult = false;
        try {
            waitForElement(elmntoutstandingsetup);
            blResult = verifyElement(elmntoutstandingsetup);
        } catch (Exception e) {
            System.out.println("Outstanding setup steps button is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean verifyVideoPreviewCard() {
        boolean blResult = false;
        try {
            waitForElement(elmntvideocard);
            blResult = verifyElement(elmntvideocard);
        } catch (Exception e) {
            System.out.println("Video Preview Card is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean verifyVideoAndAudioToggle() {
        boolean blResult = false;
        boolean blResult1 = false;
        try {
            waitForElement(elmntvideotoggle);
            waitForElement(elmntaudiotoggle);
//            if(verifyElement(elmntvideolabel) && verifyElement(elmntaudiolabel))
//            {
            blResult = verifyElement(elmntvideotoggle);
            blResult1 = verifyElement(elmntaudiotoggle);
//            }

        } catch (Exception e) {
            System.out.println("Video and Audio toggle is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult && blResult1;

    }


    public boolean verifyVirtualBackgroundLink() {
        boolean blResult = false;
        try {
            waitForElement(elmntvirtualbackgroundlink);
            blResult = verifyElement(elmntvirtualbackgroundlink);
        } catch (Exception e) {
            System.out.println("Virtual Background Link is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean verifyAllMatCards(List<String> strMatCardDetails) {
        boolean blResult = false;
        boolean blResult1 = false;
        try {

            for (String strDetails : strMatCardDetails) {
                WebElement elmntMatCardDetails = waitForElement(By.xpath(matcardtitletxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("MatCard Heading" + strDetails);
                blResult = verifyElement(elmntMatCardDetails);
            }

//            waitForElement(elmntprovidercard);
//            verifyElement(elmntprovidercard);
//            waitForElement(elmntwaitingroomcard);
//            verifyElement(elmntwaitingroomcard);
//            waitForElement(elmntrecentcallscard);
//            verifyElement(elmntrecentcallscard);
//            waitForElement(elmntupcomingappointmentscard);
//            verifyElement(elmntupcomingappointmentscard);
            waitForElement(elmntviewallappointmentsbutton);
            blResult1 = verifyElement(elmntviewallappointmentsbutton);
        } catch (Exception e) {
            System.out.println("All Mat card is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult && blResult1;

    }


    public boolean verifyAllHeaderMenus() {
        boolean blResult = false;
        boolean blResult1 = false;
        boolean blResult2 = false;
        boolean blResult3 = false;
        boolean blResult4 = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntmmh360logo);
            blResult1 = verifyElement(elmntvideocallusagetab);
            blResult2 = verifyElement(elmntsmsusagetab);
            blResult3 = verifyElement(elmntappointmentlistbtn);
            blResult4 = verifyElement(elmntprofilepic);
        } catch (Exception e) {
            System.out.println("All Header menu is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult && blResult1 && blResult2 && blResult3 && blResult4;

    }


    public boolean verifyVideoToggleDisabled() {
        boolean blResult = false;
        try {
            waitForElement(elmntvideotoggle);
            if (verifyElement(elmntvideotoggle)) {
                blResult = verifyElement(elmntvideotoggledisabled);
            }

        } catch (Exception e) {
            System.out.println("Video toggle is enabled >>>:: ");
            e.printStackTrace();
        }
        return blResult;

    }


    public boolean verifyAudioToggleDisabled() {
        boolean blResult = false;
        try {
            waitForElement(elmntaudiotoggle);
            if (verifyElement(elmntaudiotoggle)) {
                blResult = verifyElement(elmntaudiotoggledisabled);
            }
        } catch (Exception e) {
            System.out.println("Audio toggle is enabled >>>:: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyVideoPreviewCardEmpty() {
        boolean blResult = false;
        try {
            waitForElement(elmntvideocard);
            blResult = verifyElement(elmntvideocard);
        } catch (Exception e) {
            System.out.println("Video Preview card is not empty >>>:: ");
            e.printStackTrace();
        }
        return blResult;
    }

    protected String v, a;


    public boolean enableVideoToggle() {

        boolean blResult = false;
        boolean blResult1 = false;
        try {
            waitForElement(elmntvideotoggle);
            if (verifyElement(elmntvideotoggledisabled)) {
                click(elmntvideotoggledisabled);
                waitForSeconds(10);
                click(elmntwaitingcopylink);
                waitForElement(elmntvideotoggleenabled);
                verifyElement(elmntvideotoggleenabled);
                System.out.println("Video Toggle enabled successfully");
                blResult = verifyElement(elmntvideotoggleenabled);
            }

            waitForElement(elmntvideotoggleenabled);
            if ((verifyElement(elmntvideotoggleenabled))) {
                click(elmntvideotoggleenabled);
                click(elmntwaitingcopylink);
                waitForElement(elmntvideotoggledisabled);
                blResult1 = verifyElement(elmntvideotoggledisabled);
                System.out.println("Video Toggle disabled successfully");
                click(elmntwaitingcopylink);

            }
        } catch (Exception e) {
            System.out.println("Video toggle is not enabled >>>:: ");
            e.printStackTrace();
        }
        return blResult || blResult1;
    }
//    public boolean enableVideoToggle()
//    {
//
//        boolean blResult = false;
//        try {
//            waitForElement(elmntvideotoggle);
//            waitForElement(elmntaudiotoggle);
//            if (verifyElement(elmntvideotoggledisabled)) {
//                String v = "DISABLED";
//            } else {
//                String v = "ENABLED";
//            }
//
//            switch (v) {
//                case "DISABLED":
//                    click(elmntvideotoggledisabled);
//                    waitForElement(elmntvideotoggleenabled);
//                    verifyElement(elmntvideotoggleenabled);
//                    System.out.println("Video Toggle enabled successfully");
//                    blResult = true;
//
//
//                case "ENABLED":
//                    click(elmntvideotoggleenabled);
//                    waitForElement(elmntvideotoggledisabled);
//                    verifyElement(elmntvideotoggledisabled);
//                    System.out.println("Video Toggle disabled successfully");
//                    blResult = true;
//
//            }
//        }
//        catch(Exception e){
//            System.out.println("Video toggle is not enabled >>>:: ");
//            e.printStackTrace();
//        }
//        return blResult;
//    }


    public boolean enableAudioToggle() {
        boolean blResult = false;
        boolean blResult1 = false;
        try {
            waitForSeconds(10);
            waitForElement(elmntaudiotoggle);
            if (verifyElement(elmntaudiotoggledisabled)) {
                click(elmntaudiotoggledisabled);
                waitForSeconds(5);
                click(elmntwaitingcopylink);
                waitForElement(elmntvideotoggleenabled);
                blResult = verifyElement(elmntvideotoggleenabled);
                System.out.println("Audio Toggle enabled successfully");
            } else if (verifyElement(elmntvideotoggleenabled)) {
                click(elmntvideotoggleenabled);
                click(elmntwaitingcopylink);
                waitForSeconds(5);
                click(elmntwaitingcopylink);
                waitForElement(elmntaudiotoggledisabled);
                blResult1 = verifyElement(elmntaudiotoggledisabled);
                System.out.println("Audio Toggle disabled successfully");
            }
        } catch (Exception e) {
            System.out.println("Audio toggle is not enabled >>>:: ");
            e.printStackTrace();
        }
        return blResult || blResult1;
    }

//    public boolean enableAudioToggle()
//    {
//        boolean blResult = false;
//        try {
//            waitForElement(elmntaudiotoggle);
//            waitForElement(elmntaudiotoggle);
//            if (verifyElement(elmntaudiotoggledisabled)) {
//                String a = "DISABLED";
//            } else {
//                String a = "ENABLED";
//            }
//
//            switch (a) {
//                case "DISABLED":
//                    click(elmntaudiotoggledisabled);
//                    waitForElement(elmntaudiotoggleenabled);
//                    verifyElement(elmntaudiotoggleenabled);
//                    System.out.println("Audio Toggle enabled successfully");
//                    blResult = true;
//                    break;
//
//                case "ENABLED":
//                    click(elmntaudiotoggleenabled);
//                    waitForElement(elmntaudiotoggledisabled);
//                    verifyElement(elmntaudiotoggledisabled);
//                    System.out.println("Audio Toggle disabled successfully");
//                    blResult = true;
//                    break;
//            }
//        }
//        catch(Exception e){
//            System.out.println("Video toggle is not enabled >>>:: ");
//            e.printStackTrace();
//        }
//        return blResult;
//    }

    public boolean verifyProviderNameMatCard(String providerName) {
        boolean blResult = false, blResult1 = false;

        try {
            waitForElement(elmntprovidercard);
            if (verifyElement(elmntprovidercard)) {

                String s = elmntprovidercardname.getText();
                System.out.println("Provider name:" + s);
                if (s.equalsIgnoreCase(providerName)) {
                    blResult = verifyElement(elmntiscurrently);
                    blResult1 = verifyElement(elmntonline);
                    System.out.println("Provider name:" + s);
                    blResult = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Header is not showing in first mat card >>>:: ");
            e.printStackTrace();
        }
        return blResult && blResult1;
    }


    public boolean verifyWaitingRoomAndAppLinkProviderCard() {
        boolean blResult = false, blResult1 = false;
        try {
            waitForElement(elmntprovidercard);
            if (verifyElement(elmntprovidercard)) {
                blResult = verifyElement(elmntwaitingroomlink);
                blResult1 = verifyElement(elmntappointmentlink);
            }
        } catch (Exception e) {
            System.out.println("Waiting and Appointment Link is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult && blResult1;
    }


    public boolean verifyCopiedWaitingRoomLink(String waitingRoomLink) {
        boolean blResult = false;
        try {
            waitForElement(elmntwaitingroomlink);
            if (verifyElement(elmntwaitingroomlink)) {
                verifyElement(elmntwaitingcopylink);
                click(elmntwaitingcopylink);
                verifyElement(elmntcopymessage);
                String s = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                System.out.println(s);
                waitForSeconds(10);
                if (s.equalsIgnoreCase(waitingRoomLink)) {
                    System.out.println(waitingRoomLink);
                    blResult = true;

                }
            }
        } catch (Exception e) {
            System.out.println("Unable to verify waiting room link >>>:: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean copyAppointmentLink() {
        boolean blResult = false;
        try {
            waitForElement(elmntappointmentlink);
            if (verifyElement(elmntappointmentlink)) {
                verifyElement(elmntappointmentcopylink);
                click(elmntappointmentcopylink);
                blResult = verifyElement(elmntcopymessage);
                String a = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println("Unable to copy appointment link >>>:: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifyCopiedAppointmentLink(String appointmentLink) {
        boolean blResult = false;
        try {
            waitForElement(elmntappointmentlink);
            if (verifyElement(elmntappointmentlink)) {
                verifyElement(elmntappointmentcopylink);
                click(elmntappointmentcopylink);
                verifyElement(elmntcopymessage);
                String a = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                System.out.println(a);
                waitForSeconds(10);
                if (a.equalsIgnoreCase(appointmentLink)) {
                    System.out.println(appointmentLink);
                    blResult = true;

                }
            }
        } catch (Exception e) {
            System.out.println("Unable to verify appointment link >>>:: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyWaitingRoomInfoContent() {
        boolean blResult = false;
        try {

            waitForElement(elmntwaitinginfoicon);
            verifyElement(elmntwaitinginfoicon);
            click(elmntwaitinginfoicon);
            waitForElement(elmntinfoheader);
            verifyElement(elmntinfoheader);
            verifyElement(elmntinfocloseicon);
            verifyElement(elmntinfookbutton);
            blResult = verifyElement(elmntwaitinginfocontent);
            click(elmntinfocloseicon);
        } catch (Exception e) {
            System.out.println("Waiting Room Info Icon function getting some error >>>:: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifyAppointmentInfoContent() {
        boolean blResult = false;
        try {
            waitForElement(elmntappointmentinfoicon);
            verifyElement(elmntappointmentinfoicon);
            click(elmntappointmentinfoicon);
            waitForElement(elmntinfoheader);
            verifyElement(elmntinfoheader);
            verifyElement(elmntinfocloseicon);
            verifyElement(elmntinfookbutton);
            blResult = verifyElement(elmntappointmentinfocontent);
            click(elmntinfookbutton);

        } catch (Exception e) {
            System.out.println("Appointment Info Icon function getting some error >>>:: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifyShareViaButton() {
        boolean blResult = false;
        try {
            waitForElement(elmntshareviabutton);
            blResult = verifyElement(elmntshareviabutton);
        } catch (Exception e) {
            System.out.println("Share via Button is not showing >>>:: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifyAndClickVideoIcon() {
        boolean blResult = false, blResult1 = false;
        try {
            waitForElement(elmntVerifyHomePage);
            waitForElement(elmntfirstvideoicon);
            blResult1 = verifyElement(elmntfirstvideoicon);
            click(elmntfirstvideoicon);
            waitForSeconds(5);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Video Icon is not showing");
        }
        return blResult && blResult1;
    }


    public void takeScreenshotSanity(WebDriver driver) {
        try {
            pageContainer.myScenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickShareViaButton() {
        waitForElement(elmntshareviabutton);
        verifyElement(elmntshareviabutton);
        click(elmntshareviabutton);
    }


    public void enterPatientName(String strPatientName) {

        if (verifyElement(elmntsendinvitationtxt) || verifyElement(elmntinvitebookappointmenttxt)) {
            waitForElementClickable(elmntpatientnametxtbox);
            enterValue(elmntpatientnametxtbox, strPatientName);
        }
    }

    public void enterPatientEmailAddress(String strPatientEmailAddress) {

        waitForElementClickable(elmntpatientemailaddresstxtbox);
        enterValue(elmntpatientemailaddresstxtbox, strPatientEmailAddress);
    }

    public void clickSendMessageButton() {
        waitForElement(elmntsendmessagebtn);
        verifyElement(elmntsendmessagebtn);
        waitForElementClickable(elmntsendmessagebtn);
        click(elmntsendmessagebtn);
    }

    public boolean clickupcomingappvideoicon() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(5);
            waitForElement(elmntappvideoicon.get(elmntappvideoicon.size() - 1));
            click(elmntappvideoicon.get(elmntappvideoicon.size() - 1));
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifyTakePhotoPic() {
        boolean blResult = false;
        try {
            if (verifyElement(elmntdefaultproviderpic)) {
                blResult = false;
            } else {
                blResult = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Default Provider Pic is not showing: >>>");
        }
        return blResult;
    }

    public boolean verifyAppointmentListSymbol()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntapplistsymbol);
            blResult = verifyElement(elmntapplistsymbol);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Appointment List Symbol is not showing: >>>");
        }
        return blResult;
    }


    public boolean clickAppointmentListSymbol()
    {
        boolean blResult = false;
        try
        {
            verifyElement(elmntapplistsymbol);
            waitForElementClickable(elmntapplistsymbol);
            blResult = click(elmntapplistsymbol);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Appointment List Symbol is not working: >>>");
        }
        return blResult;
    }

    public boolean verifyAppointmentListPage()
    {
        boolean blResult = false;
        try
        {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntapplisttxt);
            blResult = verifyElement(elmntapplisttxt);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Appointment List page is not showing: >>>");
        }
        return blResult;
    }

    public boolean verifyInitialWaitingRoomMatCard()
    {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false;
        try
        {
            waitForElement(elmntwaitingroomcard);
            blResult = verifyElement(elmntwaitingroomcard);
            waitForElement(elmntwaitingroomicon);
            blResult1 = verifyElement(elmntwaitingroomicon);
            waitForElement(elmntwaitingroomtxt);
            blResult2 = verifyElement(elmntwaitingroomtxt);
            waitForElement(elmntnoonewaitingtxt);
            blResult3 = verifyElement(elmntnoonewaitingtxt);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Waiting Room Mat Card is not showing: >>>");
        }
        return blResult && blResult1 && blResult2 && blResult3;
    }

    public boolean viewWaitingRoomPatientDetails(List<String> strWaitingRoomdetails)
    {
        boolean blResult = false, blResult1 = false, blResult2 = true, blResult3 = false;
        try
        {
            waitForSeconds(5);
            WebElement elmntPatientName = waitForElement(By.xpath(divtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strWaitingRoomdetails.get(0)))));
            System.out.println("Patient Name:" + elmntPatientName);
            blResult = verifyElement(elmntPatientName);

            WebElement elmntMobileNumber = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strWaitingRoomdetails.get(1)))));
            System.out.println("Patient Mobile Number:" + elmntMobileNumber);
            blResult1 = verifyElement(elmntMobileNumber);

                WebElement elmntPatientWaitingDetails = waitForElement(By.xpath(ptxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strWaitingRoomdetails.get(2)))));
                System.out.println("Patient Waiting txt:" + elmntPatientWaitingDetails);
                blResult2 = verifyElement(elmntPatientWaitingDetails);

            waitForElement(elmntwaitingtxt);
            blResult3 = verifyElement(elmntwaitingtxt);

        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("WaitingRoomPatient Details is not showing");
        }

            return blResult && blResult1 && blResult3 && blResult2;
    }

    public boolean verifyAndClickWaitingRoomEyeIcon()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForElement(elmntwaitingroomeyeicon);
            blResult = verifyElement(elmntwaitingroomeyeicon);
            waitForElementClickable(elmntwaitingroomeyeicon);
            blResult1 = click(elmntwaitingroomeyeicon);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Waiting Room Eye Icon is not showing: >>>");
        }
        return blResult && blResult1;
    }


    public boolean verifyAndClickRecentCallEyeIcon()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            if(verifyElement(elmntnoonewaitingtxt))
            {
                waitForElement(elmntwaitingroomeyeicon);
                blResult = verifyElement(elmntwaitingroomeyeicon);
                waitForElementClickable(elmntwaitingroomeyeicon);
                blResult1 = click(elmntwaitingroomeyeicon);
            }
            else if(verifyElement(elmntwaitingtxt))
            {
                waitForElement(elmntrecentcalleyeicon);
                blResult = verifyElement(elmntrecentcalleyeicon);
                waitForElementClickable(elmntrecentcalleyeicon);
                blResult1 = click(elmntrecentcalleyeicon);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Recent Call Eye Icon is not showing: >>>");
        }
        return blResult && blResult1;
    }


    public boolean viewWaitingRoomTabPatientDetails(List<String> strWaitingRoomdetails)
    {
        boolean blResult = false, blResult1 = false, blResult2 = false;
        try
        {
            waitForSeconds(5);
            WebElement elmntPatientName = waitForElement(By.xpath(ptxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strWaitingRoomdetails.get(0)))));
            System.out.println("Patient Name:" + elmntPatientName);
            blResult = verifyElement(elmntPatientName);

            WebElement elmntMobileNumber = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strWaitingRoomdetails.get(1)))));
            System.out.println("Patient Mobile Number:" + elmntMobileNumber);
            blResult1 = verifyElement(elmntMobileNumber);

            WebElement elmntPatientWaitingDetails = waitForElement(By.xpath(ptxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strWaitingRoomdetails.get(2)))));
            System.out.println("Patient Waiting txt:" + elmntPatientWaitingDetails);
            blResult2 = verifyElement(elmntPatientWaitingDetails);

        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("WaitingRoom Tab Patient Details is not showing");
        }

        return blResult && blResult1 && blResult2;
    }

    public boolean clickCloseIcon()
    {
        boolean blResult = false;
        try
        {
            verifyElement(elmntcloseicon);
            waitForElementClickable(elmntcloseicon);
            blResult = click(elmntcloseicon);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Waiting Room Close icon is not showing: >>>");
        }
        return blResult;
    }


    public boolean verifyInitialRecentCallsMatCard()
    {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false;
        try
        {
            waitForElement(elmntrecentcallscard);
            blResult = verifyElement(elmntrecentcallscard);
            waitForElement(elmntrecentcallsicon);
            blResult1 = verifyElement(elmntrecentcallsicon);
            waitForElement(elmntrecentcalltxt);
            blResult2 = verifyElement(elmntrecentcalltxt);
            waitForElement(elmntnorecentcallstxt);
            blResult3 = verifyElement(elmntnorecentcallstxt);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Recent calls Mat Card is not showing: >>>");
        }
        return blResult && blResult1 && blResult2 && blResult3;
    }


    public boolean viewRecentCallPatientDetails(List<String> strRecentCallDetails)
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForSeconds(5);
            WebElement elmntPatientName = waitForElement(By.xpath(divtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strRecentCallDetails.get(0)))));
            System.out.println("Patient Name:" + elmntPatientName);
            blResult = verifyElement(elmntPatientName);

            WebElement elmntMobileNumber = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strRecentCallDetails.get(1)))));
            System.out.println("Patient Mobile Number:" + elmntMobileNumber);
            blResult1 = verifyElement(elmntMobileNumber);


        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("RecentCallPatient Details is not showing");
        }

        return blResult && blResult1;
    }


    public boolean viewRecentCallTabPatientDetails()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntrecentcalltabdata);
            if(verifyElement(elmntrecentcalltabdata))
            {
                String orgPatientName1 = TestDataUtil.getValue("&EXISTING_PATIENT_FULL_NAME&");
                String recentPatientName1 = elmntrecentcalltabdata.getText();
                System.out.println("Recent Call Tab Patient Name:"+ recentPatientName1);
                System.out.println("Recent Call Original Patient Name:"+orgPatientName1);
                if(orgPatientName1.equalsIgnoreCase(recentPatientName1))
                {
                    blResult = true;
                }

            }
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Recent Call Tab Data is not showing");
        }
        return blResult;
    }

    public boolean verifyInitialUpcomingAppointmentsCard()
    {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false;
        try
        {
            waitForElement(elmntupcomingappointmentscard);
            blResult = verifyElement(elmntupcomingappointmentscard);
            waitForElement(elmntupcomingappointmentsicon);
            blResult1 = verifyElement(elmntupcomingappointmentsicon);
            waitForElement(elmntupcomingappointmentstxt);
            blResult2 = verifyElement(elmntupcomingappointmentstxt);
            waitForElement(elmntnoupcomingappointmentstxt);
            blResult3 = verifyElement(elmntnoupcomingappointmentstxt);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Upcoming Appointments Card is not showing: >>>");
        }
        return blResult && blResult1 && blResult2 && blResult3;
    }


    public boolean viewUpcomingAppointmentPatientDetails(String strUpcomingAppointmentDetails)
    {
        boolean blResult = false;
        try
        {
            WebElement elmntPatientDetails = waitForElement(By.xpath(ptxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strUpcomingAppointmentDetails))));
            waitForElement(elmntPatientDetails);
            blResult = verifyElement(elmntPatientDetails);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Upcoming Appointments Details is not showing: >>>");
        }
        return blResult;
    }

    public boolean viewAppointmentListSymbol()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntapplistsymbol);
            blResult = verifyElement(elmntapplistsymbol);

        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Appointment List Symbol is not s")
        }
        return blResult;
    }


}

