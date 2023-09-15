package Sanity_Patient_Web.pages;


import Sanity_Provider_Web.pages.OtherPage;
import cap.common.BasePage;
import cap.utilities.BrowserHandlerUtil;
import cap.utilities.TestDataUtil;
import cap.utilities.BrowserHandlerUtil;
import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class CheckInPage extends BasePage {

    public CheckInPage(WebDriver driver) {
        super(driver);
    }

    public static String strAppVersion;
    public static String strBrowserName;
    public static String strBrowserVersion;
    public static String strSystemName;


    //Check In-Page First Page Started
    @FindBy(how = How.XPATH, using = "//p[@class = 'provider-name']//strong")
    protected WebElement elmntprovidername;

    @FindBy(how = How.XPATH, using = "//div//img[@class = 'profile']")
    protected WebElement elmntprofilepicture;

    @FindBy(how = How.XPATH, using = "//span[text() = 'is currently  ']//span[text() = ' Online']")
    protected WebElement elmntiscurrentlyonlinetxt;

    @FindBy(how = How.XPATH, using = "//span[text() = 'is currently  ']//span[text() = ' Offline']")
    protected WebElement elmntiscurrentlyofflinetxt;

    @FindBy(how = How.XPATH, using = "//p[@class = 'clinic-name']//strong")
    protected WebElement elmntclinicname;

    @FindBy(how = How.XPATH, using = "//div//div[text() = ' Are you an existing Manage My Health user? ']")
    protected WebElement elmntareyouexistingtxt;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'mat-checkbox-inner-container')])[1]")
    protected WebElement elmntareyouexistingcheckbox;

    @FindBy(how = How.XPATH, using = "//h1[@class = 'title-text' and text() = 'Your details']")
    protected WebElement elmntyourdetailstxt;

    @FindBy(how = How.XPATH, using = "//div//input[@formcontrolname = 'name']")
    protected WebElement elmntyournametxtbox;

    @FindBy(how = How.XPATH, using = "//div//input[@formcontrolname = 'email']")
    protected WebElement elmntemailtxtbox;

    @FindBy(how = How.XPATH, using = "(//input[@type= 'email'])[2]")
    protected WebElement elmntbookemailtxtbox;

    @FindBy(how = How.XPATH, using = "//div//input[@type = 'confirmEmailID']")
    protected WebElement elmntbookconfirmemailtxtbox;

    @FindBy(how = How.XPATH, using = "(//div//mat-select[@role = 'combobox'])[1]")
    protected WebElement elmntcodecombobox;

    @FindBy(how = How.XPATH, using = "//div//input[@formcontrolname = 'phoneNumber']")
    protected WebElement elmntmobilenumbertxtbox;

    @FindBy(how = How.XPATH, using = "//div//input[@data-placeholder = 'Mobile number']")
    protected WebElement elmntbookmobilenumbertxtbox;

    @FindBy(how = How.XPATH, using = "//div//input[@formcontrolname = 'nhiId']")
    protected WebElement elmntnhitxtbox;

    @FindBy(how = How.XPATH, using = "(//div//input[contains(@class, 'mat-datepicker')])[1]")
    protected WebElement elmntdobbox;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'mat-checkbox-inner-container')])[3]")
    protected WebElement elmntaccepttermscheckbox;

    @FindBy(how = How.XPATH, using = "//p[@class = 'acceptanceTermscondition' and text() = 'I accept the '] ")
    protected WebElement elmntaccepttermstxt;

    @FindBy(how = How.XPATH, using = "//p[@class = 'acceptanceTermscondition']//a[@href = 'https://www.managemyhealth.co.nz/terms-of-use/' and text() = ' Terms of use']")
    protected WebElement elmnttermsofuselink;

    @FindBy(how = How.XPATH, using = "//p[@class = 'acceptanceTermscondition']//a[@href = 'https://www.managemyhealth.co.nz/privacy-policy/' and text() = 'Privacy policy']")
    protected WebElement elmntprivacypolicylink;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'row joinbtn')]//button[contains(@class,'mat-button-base')]//span[text() = 'JOIN NOW']")
    protected WebElement elmntjoinnowenabledbtn;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'row joinbtn')]//button[contains(@class,'mat-button-base mat-button-disabled')]//span[text() = 'JOIN NOW']")
    protected WebElement elmntjoinnowdisabledbtn;

    @FindBy(how = How.XPATH, using = "//div//h1[text() = 'Private preview (Only you can see this)']")
    protected WebElement elmntprivatepreviewheading;

    @FindBy(how = How.XPATH, using = "//div[@class = 'webcam-wrapper']//video")
    protected WebElement elmntpreviewvideosection;

    @FindBy(how = How.XPATH, using = "//div[@class = 'footer btn-padd']//button[contains(@class,'mat-button-base')]//span[text() = 'Take photo ']//mat-icon[text() = 'camera_alt']")
    protected WebElement elmnttakephotobtn;

    @FindBy(how = How.XPATH, using = "//div[@class = 'footer btn-padd']//button[contains(@class,'mat-button-base')]//span[text() = 'Upload ']//mat-icon[text() = 'image']")
    protected WebElement elmntuploadbtn;

    @FindBy(how = How.XPATH, using = "//div//mat-select[@role = 'combobox']//div//div//span[text() = 'Microphone']")
    protected WebElement elmntmicrophonetxt;

    @FindBy(how = How.XPATH, using = "//div//mat-select[@role = 'combobox']//div//div//span[text() = 'Internal camera']")
    protected WebElement elmntinternalcameratxt;

    @FindBy(how = How.XPATH, using = "//div//mat-select[@role = 'combobox']//div//div//span[text() = 'Internal sound']")
    protected WebElement elmntinternalsoundtxt;

    @FindBy(how = How.XPATH, using = "//p[text() = 'Pre call test']")
    protected WebElement elmntprecalltestlink;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'mat-form-field')]//input[@type = 'email'])[1]")
    protected WebElement txtBoxEmail;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'mat-form-field')]//input[@type = 'password']")
    protected WebElement txtBoxPassword;

    @FindBy(how = How.XPATH, using = "//div//button[text() = 'Sign in']")
    protected WebElement btnSignIn;

    @FindBy(how = How.XPATH, using = "//div//h1[contains(text(), 'Privacy Policy')]")
    protected WebElement elmntprivacypolicytxt;

    @FindBy(how = How.XPATH, using = "//div//h1[contains(text(), 'Terms of use')]")
    protected WebElement elmnttermsofusetxt;


    // Check-In First Page Ended

    // Check-In Second Page Started
    @FindBy(how = How.XPATH, using = "//h1[@class = 'view-info' and text() = 'Informed consent']")
    protected WebElement elmntinformedconsenttxt;

    @FindBy(how = How.XPATH, using = "//div//mat-checkbox//label//div[@class = 'mat-checkbox-inner-container']")
    protected WebElement elmnticonsentchkbox;

    @FindBy(how = How.XPATH, using = "//button//span[text() = 'CANCEL']")
    protected WebElement elmntcancelbtn;

    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'mat-button-base')]//span[text() = 'Let’s go']")
    protected WebElement elmntletsgoenabledbtn;

    @FindBy(how = How.XPATH, using = "//button[contains(@class, 'mat-button-base mat-button-disabled')]//span[text() = 'Let’s go']")
    protected WebElement elmntletsgodisabledbtn;

    //Check-In Second Page Ended

    //Waiting Area Page Started
    @FindBy(how = How.XPATH, using = "//p[contains(@class, 'waitingpatient') and contains(text(), ' will be with you shortly!')]")
    protected WebElement elmntwaitingareapage;

    @FindBy(how = How.XPATH, using = "//div//p[text() = ' Leave the waiting area?']")
    protected WebElement elmntleavewaitingarealink;

    @FindBy(how = How.XPATH, using = "//div//div//ul//h2[@class = 'exitcall exi_call' and text() = 'Leave the queue?']")
    protected WebElement elmntleavethequeuetxt;


    @FindBy(how = How.XPATH, using = "//button//span[text() = 'Yes']")
    protected WebElement elmntyesbtn;

    @FindBy(how = How.XPATH, using = "//button//span[text() = 'No']")
    protected WebElement elmntnobtn;
    //Waiting Area Page Ended

    //Book Appointment Page Started

    @FindBy(how = How.XPATH, using = "//p[text() = 'Please provide your details']")
    protected WebElement elmntbookapppagetxt;

    @FindBy(how = How.XPATH, using = "//h1[text() = 'Your details']")
    protected WebElement elmntpatientcheckinpagetxt;

    @FindBy(how = How.XPATH, using = "(//button[contains(@class, 'mat-button-disabled')]//span[text() = 'Proceed to payment'])[1]")
    protected WebElement elmntproceedpaymentdisabledbtn;

    @FindBy(how = How.XPATH, using = "//button[text() = 'Proceed to payment']")
    protected WebElement elmntproceedpaymentenabledbtn;

    @FindBy(how = How.XPATH, using = "//img[@alt = 'showWebcam']")
    protected WebElement elmntprivatepreview;

    @FindBy(how = How.XPATH, using = "//h4[text() = 'Pre-call test is running']")
    protected WebElement elmntprecalltxt;

    @FindBy(how = How.XPATH, using = "//mat-icon[text() = 'unfold_more']")
    protected List<WebElement> elmntfoldicon;


    public static String PatientName = "";

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    protected String matcardtitletxt = new StringBuilder().append("//mat-card-title[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String strongtxt = new StringBuilder().append("//strong[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String spantxt = new StringBuilder().append("//span[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String matlabeltxt = new StringBuilder().append("//mat-label[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String ptxt = new StringBuilder().append("//p[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String htxt = new StringBuilder().append("//h1[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();


    //Check-In First Page Started

    public void navigateWaitingRoom() {
        driver.manage().deleteAllCookies();
        visit(TestDataUtil.getValue("&WAITING_ROOM_LINK&"));
    }


    public boolean verifyPatientCheckInPage() {
        boolean blResult = false;

        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            BrowserHandlerUtil.AllowCameraPopupChrome();
            waitForSeconds(20);
            waitForElement(elmntprovidername);
            verifyElement(elmntprovidername);
            String doctornamedata = TestDataUtil.getValue("&DOCTORNAME&");
            String doctornameapp = elmntprovidername.getText();
            if (doctornamedata.equalsIgnoreCase(doctornameapp)) {
                blResult = true;
            }
            waitForSeconds(20);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Doctor Name is not showing >>>>");
        }

        return blResult;
    }


    public boolean verifyPatientCheckInPageFields(List<String> strStrongTextDetails, List<String> strSpanTextDetails, List<String> strHeaderTextDetails, List<String> strMatLabelDetails, List<String> strParaTextDetails) {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false, blResult5 = false, blResult6 = false;
        boolean blResult7 = false, blResult8 = false, blResult9 = false, blResult10 = false, blResult11 = false, blResult12 = false, blResult13 = false;
        boolean blResult14 = false;
        try {


            waitForSeconds(50);
            waitForElement(elmntprofilepicture);
            blResult = verifyElement(elmntprofilepicture);

            for (String strDetails : strStrongTextDetails) {
                WebElement elmntStrongTextDetails = waitForElement(By.xpath(strongtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("Strong Text Name:" + strDetails);
                blResult11 = verifyElement(elmntStrongTextDetails);
            }

            for (String strDetails1 : strSpanTextDetails) {
                WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails1))));
                System.out.println("Span Text Name:" + strDetails1);
                blResult1 = verifyElement(elmntSpanTextDetails);
            }
            waitForElement(elmntareyouexistingtxt);
            blResult2 = verifyElement(elmntareyouexistingtxt);
            waitForElement(elmntareyouexistingcheckbox);
            blResult3 = verifyElement(elmntareyouexistingcheckbox);
            waitForElement(elmntyourdetailstxt);

            for (String strDetails2 : strHeaderTextDetails) {
                WebElement elmntHeaderTextDetails = waitForElement(By.xpath(htxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails2))));
                System.out.println("Header Text Name:" + strDetails2);
                blResult4 = verifyElement(elmntHeaderTextDetails);
            }

            for (String strDetails3 : strMatLabelDetails) {
                WebElement elmntMatLabelDetails = waitForElement(By.xpath(matlabeltxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails3))));
                System.out.println("Mat Label Name:" + strDetails3);
                blResult5 = verifyElement(elmntMatLabelDetails);
            }

            for (String strDetails4 : strParaTextDetails) {
                WebElement elmntParaTextDetails = waitForElement(By.xpath(ptxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails4))));
                System.out.println("Para Text Name:" + strDetails4);
                blResult6 = verifyElement(elmntParaTextDetails);
            }

            waitForElement(elmntaccepttermstxt);
            blResult14 = verifyElement(elmntaccepttermstxt);
            waitForElement(elmntaccepttermscheckbox);
            blResult7 = verifyElement(elmntaccepttermscheckbox);
            waitForElement(elmnttermsofuselink);
            blResult8 = verifyElement(elmnttermsofuselink);
            waitForElement(elmntprivacypolicylink);
            blResult9 = verifyElement(elmntprivacypolicylink);
            waitForElement(elmntpreviewvideosection);
            blResult10 = verifyElement(elmntpreviewvideosection);
            waitForElement(elmnttakephotobtn);
            blResult12 = verifyElement(elmnttakephotobtn);
            waitForElement(elmntuploadbtn);
            blResult13 = verifyElement(elmntuploadbtn);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("All fields is not showing >>>>");
        }
        return blResult && blResult1 && blResult2 && blResult3 && blResult4 && blResult5 && blResult6 && blResult7 && blResult8 && blResult9 && blResult10 && blResult11 && blResult12 && blResult13 && blResult14;
    }

    public boolean selectExistingMMHUserCheckbox() {
        boolean blResult = false;
        try {
            waitForElement(elmntareyouexistingcheckbox);
            verifyElement(elmntareyouexistingcheckbox);
            blResult = click(elmntareyouexistingcheckbox);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("All fields is not showing >>>>");
        }
        return blResult;
    }


    public void enterEmail(String strEmail) {

        waitForElementClickable(txtBoxEmail);
        enterValue(txtBoxEmail, strEmail);
    }

    public void enterpassword(String strPassword) {
        waitForElementClickable(txtBoxPassword);
        enterValue(txtBoxPassword, strPassword);
    }

    public void clickSignInButton() {
        waitForSeconds(3);
        if (verifyElement(btnSignIn)) {
            waitForElement(btnSignIn);
            jsClick(btnSignIn);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } else if (!verifyElement(btnSignIn)) {
            System.out.println("You are not selected the Existing MMH User Checkbox.");
        }
    }

    public boolean acceptTermsAndConditions() {
        boolean blResult = false;
        try {

            if (verifyElement(elmntpatientcheckinpagetxt)) {
                waitForElement(elmntaccepttermscheckbox);
                waitForElementClickable(elmntaccepttermscheckbox);
                jsClick(elmntaccepttermscheckbox);
                blResult = true;
            } else if (verifyElement(elmntbookapppagetxt)) {
                jsScroll();
                enterPhoneNumber(TestDataUtil.getValue("&NEW_PATIENT_MOBILE_NUMBER&"));
                enterBookEmailAddress(TestDataUtil.getValue("&NEWPATIENTEMAIL&"));
                enterBookConfirmEmailAddress(TestDataUtil.getValue("&NEWPATIENTEMAIL&"));
                blResult = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to select terms and conditions check box >>>>");
        }
        return blResult;
    }


    public boolean clickJoinNowButton() {
        boolean blResult = false;
        try {
            if (verifyElement(elmntpatientcheckinpagetxt)) {
                waitForElementClickable(elmntjoinnowenabledbtn);
                click(elmntjoinnowenabledbtn);
                blResult = true;
            } else if (verifyElement(elmntbookapppagetxt)) {
                verifyElement(elmntproceedpaymentenabledbtn);
                waitForElementClickable(elmntproceedpaymentenabledbtn);
                blResult = click(elmntproceedpaymentenabledbtn);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to click Join Now or Proceed Payment button >>>>");
        }
        return blResult;
    }


    public boolean enterPatientName(String strName) {
        boolean blResult = false;
        try {
            elmntyournametxtbox.clear();
            PatientName = strName;
            System.out.println("TestData Patient Name:" + PatientName);
            waitForElementClickable(elmntyournametxtbox);
            enterValue(elmntyournametxtbox, PatientName);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean enterEmailAddress(String strEmail) {
        boolean blResult = false;
        try {
            elmntemailtxtbox.clear();
            waitForElementClickable(elmntemailtxtbox);
            enterValue(elmntemailtxtbox, strEmail);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean enterBookEmailAddress(String strEmail) {
        boolean blResult = false;
        try {
            elmntbookemailtxtbox.clear();
            waitForElementClickable(elmntbookemailtxtbox);
            click(elmntbookemailtxtbox);
            enterValue(elmntbookemailtxtbox, strEmail);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean enterBookConfirmEmailAddress(String strEmail) {
        boolean blResult = false;
        try {
            elmntbookconfirmemailtxtbox.clear();
            waitForElementClickable(elmntbookconfirmemailtxtbox);
            enterValue(elmntbookconfirmemailtxtbox, strEmail);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean enterMobileNumber(String strMobileNumber) {
        boolean blResult = false;
        try {
            waitForElementClickable(elmntmobilenumbertxtbox);
            enterValue(elmntmobilenumbertxtbox, strMobileNumber);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean enterPhoneNumber(String strPhoneNumber) {
        boolean blResult = false;
        try {
            waitForElementClickable(elmntbookmobilenumbertxtbox);
            enterValue(elmntbookmobilenumbertxtbox, strPhoneNumber);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }


    public boolean enterNHI(String strNHI) {
        boolean blResult = false;
        try {
            waitForElementClickable(elmntnhitxtbox);
            enterValue(elmntnhitxtbox, strNHI);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean verifyJoinNowButtonDisabled() {
        boolean blResult = false;
        try {
            waitForElement(elmntprovidername);
            if (verifyElement(elmntjoinnowdisabledbtn)) {
                blResult = true;
            } else if (verifyElement(elmntjoinnowenabledbtn)) {
                blResult = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Join Now button is enabled >>>>");
        }
        return blResult;
    }

    public boolean verifyJoinNowButtonEnabled() {
        boolean blResult = false;
        try {
            waitForElement(elmntprovidername);
            if (verifyElement(elmntjoinnowenabledbtn)) {
                blResult = true;
            } else if (verifyElement(elmntjoinnowdisabledbtn)) {
                blResult = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Join Now button is disabled >>>>");
        }
        return blResult;
    }


    public boolean viewTermsOfUsePage() {
        boolean blResult = false, blResult1 = false;
        try {
            waitForElement(elmnttermsofuselink);
            blResult1 = verifyElement(elmnttermsofuselink);
            click(elmnttermsofuselink);
            waitForSeconds(10);
//           waitForSeconds(50);
//           String cu = driver.getCurrentUrl();
//           System.out.println("Current URL:"+cu);
//           if(cu.equalsIgnoreCase(strTermsOfUse))
//           {
            blResult = verifyElement(elmnttermsofusetxt);

//           }
//

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Terms of Use Page is not displayed >>>>");
        }
        return blResult && blResult1;
    }

    public boolean viewPrivacyPolicyPage() {
        boolean blResult = false, blResult1 = false;
        try {
            waitForElement(elmntprivacypolicylink);
            blResult1 = verifyElement(elmntprivacypolicylink);
            click(elmntprivacypolicylink);
            waitForSeconds(10);
//            String cu = driver.getCurrentUrl();
//            System.out.println("Current URL:"+cu);
//            if(cu.equalsIgnoreCase(strPrivacyPolicy))
//            {
            blResult = verifyElement(elmntprivacypolicytxt);

//            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Privacy Policy Page is not displayed >>>>");
        }
        return blResult && blResult1;
    }

    public boolean verifyPreCallTestLink() {
        boolean blResult = false, blResult1 = false;
        try {
            waitForElement(elmntprecalltestlink);
            verifyElement(elmntprecalltestlink);
            blResult = click(elmntprecalltestlink);
            navigatetoSubWindow();
            waitForSeconds(20);
            if (verifyElement(elmntprecalltxt)) {
                blResult1 = true;
            }
            navigatetoMainWindow();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Pre call Test Link is not working >>>>");
        }
        return blResult && blResult1;
    }


    //Check-In First Page Ended

    //Check-In Second Page Started
    public boolean verifyInformedConsentPage() {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false;
        try {
            waitForElement(elmntinformedconsenttxt);
            blResult = verifyElement(elmntinformedconsenttxt);
            waitForElement(elmnticonsentchkbox);
            blResult1 = verifyElement(elmnticonsentchkbox);
            waitForElement(elmntcancelbtn);
            blResult2 = verifyElement(elmntcancelbtn);
            waitForElement(elmntletsgoenabledbtn);
            blResult3 = verifyElement(elmntletsgoenabledbtn);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Informed Consent page is not showing >>>>");
        }
        return blResult && blResult1 && blResult2 && blResult3;
    }

    public void clickIConsentCheckbox() {
        waitForElement(elmnticonsentchkbox);
        waitForElementClickable(elmnticonsentchkbox);
        click(elmnticonsentchkbox);
    }

    public void clickLetsGoButton() {
        waitForElement(elmntletsgoenabledbtn);
        waitForElementClickable(elmntletsgoenabledbtn);
        click(elmntletsgoenabledbtn);
    }

    public boolean verifyLetsGoButtonDisabled() {
        boolean blResult = false;
        try {
            waitForElement(elmntinformedconsenttxt);
            if (verifyElement(elmntletsgodisabledbtn)) {
                blResult = true;
            } else if (verifyElement(elmntletsgoenabledbtn)) {
                blResult = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Let's go button is disabled >>>>");
        }
        return blResult;
    }


    public boolean verifyLetsGoButtonEnabled() {
        boolean blResult = false;
        try {
            waitForElement(elmntinformedconsenttxt);
            if (verifyElement(elmntletsgoenabledbtn)) {
                blResult = true;
            } else if (verifyElement(elmntletsgodisabledbtn)) {
                blResult = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lets go button is enabled >>>>");
        }
        return blResult;
    }


    //Check-In Second Page Ended


    //Waiting Area Page Started
    public boolean verifyWaitingAreaPage() {
        boolean blResult = false;
        try {
            waitForElement(elmntwaitingareapage);
            blResult = verifyElement(elmntwaitingareapage);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Waiting Area Page is not showing >>>>");
        }
        return blResult;
    }


    public boolean closeWaitingAreaPage() {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false;
        try {
            waitForElement(elmntleavewaitingarealink);
            click(elmntleavewaitingarealink);
            waitForElement(elmntleavethequeuetxt);
            blResult1 = verifyElement(elmntleavethequeuetxt);
            waitForElement(elmntyesbtn);
            blResult2 = verifyElement(elmntyesbtn);
            waitForElement(elmntnobtn);
            blResult3 = verifyElement(elmntnobtn);
            click(elmntyesbtn);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Waiting Area Page is not showing >>>>");
        }
        return blResult && blResult1 && blResult2 && blResult3;
    }


    public boolean clickTakePhoto() {
        boolean blResult = false, blResult1 = false;
        try {
            waitForElement(elmnttakephotobtn);
            blResult = verifyElement(elmnttakephotobtn);
            click(elmnttakephotobtn);
            waitForSeconds(3);
            waitForElement(elmntprivatepreview);
            blResult1 = verifyElement(elmntprivatepreview);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Waiting Area Page is not showing >>>>");
        }
        return blResult && blResult1;
    }

    public boolean verifyCameraAndSoundOptions(List<String> strMacroDetails, List<String> strCameraDetails, List<String> strSoundDetails) {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false, blResult5 = false;
        try {
            waitForElement(elmntfoldicon.get(0));
            verifyElement(elmntfoldicon.get(0));
            blResult = click(elmntfoldicon.get(0));
            for (String strDetails : strMacroDetails) {
                WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("Span Text Name:" + strDetails);
                blResult1 = verifyElement(elmntSpanTextDetails);
            }
            click(elmntfoldicon.get(0));
            waitForElement(elmntfoldicon.get(1));
            verifyElement(elmntfoldicon.get(1));
            blResult2 = click(elmntfoldicon.get(1));
            for (String strDetails1 : strCameraDetails) {
                WebElement elmntSpanTextDetails1 = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails1))));
                System.out.println("Span Text Name:" + strDetails1);
                blResult3 = verifyElement(elmntSpanTextDetails1);
            }

            click(elmntfoldicon.get(1));
            waitForElement(elmntfoldicon.get(2));
            verifyElement(elmntfoldicon.get(2));
            blResult4 = click(elmntfoldicon.get(2));
            for (String strDetails2 : strSoundDetails) {
                WebElement elmntSpanTextDetails2 = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails2))));
                System.out.println("Span Text Name:" + strDetails2);
                blResult5 = verifyElement(elmntSpanTextDetails2);
            }
            click(elmntfoldicon.get(1));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Camera and Sound option is not working properly >>>");
        }
        return blResult && blResult1 && blResult2 && blResult3 && blResult4 && blResult5;
    }

}






