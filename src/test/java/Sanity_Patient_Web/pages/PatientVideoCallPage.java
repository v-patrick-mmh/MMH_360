package Sanity_Patient_Web.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.net.ssl.HostnameVerifier;
import java.io.File;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class PatientVideoCallPage extends BasePage {

    public PatientVideoCallPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[@mattooltip = 'Close']")
    protected WebElement elmntmenuvideocallclosebtn;

    @FindBy(how = How.XPATH, using = "//div[contains(@id, 'MP_camera')]")
    protected WebElement elmntprovidervideocard;

    @FindBy(how = How.XPATH, using = "//button[text() = 'CONSULTATION NOTES']")
    protected WebElement elmntconsultationnotesbtn;

    @FindBy(how = How.XPATH, using = "//img[@title = 'Minimize']")
    protected WebElement elmntminimizebtn;

    @FindBy(how = How.XPATH, using = "//img[@title = 'Maximize']")
    protected WebElement elmntmaximizebtn;

    @FindBy(how = How.XPATH, using = "(//img[contains(@alt , 'menu')])[2]")
    protected WebElement elmntmenubtn;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Menu')]")
    protected WebElement elmntmenutxt;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'videoIconsContainer')]//div[@class = 'Video-elements']//div[@class = 'doctor-details']//ul//li[@class = 'docdetailssection']//span")
    protected WebElement elmntdocdetails;

    @FindBy(how = How.XPATH, using = "(//p[contains(text(),'00')])[1]")
    protected WebElement elmnttimertxt;

    @FindBy(how = How.XPATH, using = "(//img[contains(@alt , 'Close')])[2]")
    protected WebElement btnendvideocall;

    @FindBy(how = How.XPATH, using = "//img[contains(@alt , 'micOff')]")
    protected WebElement elmntunmuteoption;

    @FindBy(how = How.XPATH, using = "//img[contains(@alt , 'micOn')]")
    protected WebElement elmntmuteoption;

    @FindBy(how = How.XPATH, using = "//img[contains(@alt , 'videoOf')]")
    protected WebElement elmntvideoofoption;

    @FindBy(how = How.XPATH, using = "//img[contains(@alt , 'videoOn')]")
    protected WebElement elmntvideoonoption;

    @FindBy(how = How.XPATH, using = "//img[contains(@alt , 'settings')]")
    protected WebElement elmntsettingsoption;

    @FindBy(how = How.XPATH, using = "//img[contains(@alt , 'chat')]")
    protected WebElement elmntchatoption;

    @FindBy(how = How.XPATH, using = "//div[text() = 'Device settings']")
    protected WebElement elmntdevicesettingstxt;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Internal microphone']")
    protected WebElement elmntinternalmicrophonetxt;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Internal sound']")
    protected WebElement elmntinternalsoundtxt;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Internal camera']")
    protected WebElement elmntinternalcameratxt;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Close')]")
    protected WebElement elmntclosebtn;

    @FindBy(how = How.XPATH, using = "//p[text() = ' Chat ']")
    protected WebElement elmntchattxt;

    @FindBy(how = How.XPATH, using = "//input[@placeholder = 'Type your message here']")
    protected WebElement elmnttypemessagefield;

    @FindBy(how = How.XPATH, using = "//button[text() = 'SEND']")
    protected WebElement elmntsendbutton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Connection info')]")
    protected WebElement elmntconnectioninfomenu;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Good Connection')]")
    protected WebElement elmntgoodconnectiontxt;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Windows windows-10')]")
    protected WebElement elmntwindowstxt;

    @FindBy(how = How.XPATH, using = "//p[text() = 'Payment request']")
    protected WebElement elmntpaymentrequesttxt;

    @FindBy(how = How.XPATH, using = "//button//span[text() = 'Pay now']")
    protected WebElement elmntpaynowbtn;

    @FindBy(how = How.XPATH, using = "//h2[text() = 'Payment details']")
    protected WebElement elmntpaymentdetailstxt;

    @FindBy(how = How.XPATH, using = "//input[@name = 'number']")
    protected WebElement elmntcardnumbertxtbox;

    @FindBy(how = How.XPATH, using = "//input[@name = 'expiry']")
    protected WebElement elmntexpirytxtbox;

    @FindBy(how = How.XPATH, using = "//input[@name = 'cvc']")
    protected WebElement elmntcvctxtbox;

    @FindBy(how = How.XPATH, using = "//button//span[text() = 'Pay']")
    protected WebElement elmntpaybtn;

    @FindBy(how = How.XPATH, using = "//div[text() = 'Your payment is successful']")
    protected WebElement elmntpaymentsuccesstxt;

    @FindBy(how = How.XPATH, using = "//h1[text() = 'Your payment is successful']")
    protected WebElement elmntpaymentsuccessheadertxt;

    @FindBy(how = How.XPATH, using = "//button[text() = 'OK']")
    protected WebElement elmntokbtn;

    @FindBy(how = How.XPATH, using = "//div[contains(@id, 'MP_OT_')]")
    protected List<WebElement> elmntvideopage;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Patient enrolment']")
    protected WebElement elmntpatientenrolmentmenu;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Medical questionnaire']")
    protected WebElement elmntmedicalquestionmenu;

    @FindBy(how = How.XPATH, using = "//p[text() = 'Patient enrolment form']")
    protected WebElement elmntpatientenrolheading;

    @FindBy(how = How.XPATH, using = "//p[text() = 'Medical questionnaire form']")
    protected WebElement elmntmedicalquestionheading;

    @FindBy(how = How.XPATH, using = "//span[text() = 'File transfer']")
    protected WebElement elmntfiletransfermenu;

    @FindBy(how = How.XPATH, using = "//p[text() = ' Upload file ']")
    protected WebElement elmntuploadfileheading;

    @FindBy(how = How.XPATH, using = "//div[@class = 'maincontainer ng-star-inserted']")
    protected WebElement elmntaddfilebtn;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'file(s) added ')]")
    protected WebElement elmntfileaddedtxt;

    @FindBy(how = How.XPATH, using = "(//iframe[contains(@name, '__privateStripeFrame')])[1]")
    protected WebElement framepayment;



    protected String imgalt = new StringBuilder().append("//img[contains(@alt , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String spantxt = new StringBuilder().append("//span[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String matlabeltxt = new StringBuilder().append("//mat-label[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String ptxt = new StringBuilder().append("//p[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";


    protected String strUploadDocument = new StringBuilder()
            .append(System.getProperty("user.dir"))
            .append(File.separator)
            .append(Constants.CONFIG_FOLDER)
            .append(File.separator)
            .append(Constants.IMAGES_FOLDER)
            .append(File.separator)
            .append("<<FILENAME>>").toString();

    public String uploadedDocument = new StringBuilder()
            .append("//p[contains(text(),'")
            .append("<<DocumentName>>")
            .append("')]").toString();

    public boolean verifyAllMenusInPatientVideoCallPage(List<String> strAltTextDetails, List<String> strSpanTextDetails) {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false;
        boolean blResult5 = false, blResult6 = false, blResult7 = false, blResult8 = false, blResult9 = false, blResult10 = false, blResult11 = false;
        try {

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            for (String strDetails : strAltTextDetails) {
                WebElement elmntAltTextDetails = waitForElement(By.xpath(imgalt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("Alt Text Name:" + strDetails);
                blResult = verifyElement(elmntAltTextDetails);
            }

            waitForElement(elmntprovidervideocard);
            blResult3 = verifyElement(elmntprovidervideocard);

            blResult9 = verifyElement(elmntmenubtn);
            waitForElementClickable(elmntmenubtn);
            click(elmntmenubtn);


            waitForElement(elmntmenutxt);
            if (verifyElement(elmntmenutxt)) {
                for (String strDetails1 : strSpanTextDetails) {
                    WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails1))));
                    System.out.println("Span Text Name:" + strDetails1);
                    blResult1 = verifyElement(elmntSpanTextDetails);
                }

                waitForElement(elmntmenuvideocallclosebtn);
                blResult5 = verifyElement(elmntmenuvideocallclosebtn);
                click(elmntmenuvideocallclosebtn);
            }

            waitForElement(elmntdocdetails);
            blResult6 = verifyElement(elmntdocdetails);
            waitForElement(elmntminimizebtn);
            blResult7 = verifyElement(elmntminimizebtn);
            click(elmntminimizebtn);
            waitForElement(elmntmaximizebtn);
            blResult8 = verifyElement(elmntmaximizebtn);
            click(elmntmaximizebtn);
            waitForElement(btnendvideocall);
            blResult10 = verifyElement(btnendvideocall);
            waitForElement(elmnttimertxt);
            blResult11 = verifyElement(elmnttimertxt);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("All Menus or Options is not showing >>>>");
        }
        return blResult && blResult1 && blResult3 && blResult5 && blResult6 && blResult7 && blResult8 && blResult9 && blResult10 && blResult11;
    }


    public boolean validateMuteUnMuteOption() {
        boolean blResult = false, blResult1 = false;
        try {
            if (verifyElement(elmntunmuteoption)) {
                waitForElement(elmntunmuteoption);
                waitForElementClickable(elmntunmuteoption);
                click(elmntunmuteoption);
                blResult = verifyElement(elmntmuteoption);
                System.out.println("Now the Microphone Option is turned On >>>");
            } else if (verifyElement(elmntmuteoption)) {
                waitForElement(elmntmuteoption);
                waitForElementClickable(elmntmuteoption);
                click(elmntmuteoption);
                blResult1 = verifyElement(elmntunmuteoption);
                System.out.println("Now the Microphone Option is turned Off >>>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult || blResult1;
    }

    public boolean validateVideoOption() {
        boolean blResult = false, blResult1 = false;
        try {
            if (verifyElement(elmntvideoofoption)) {
                waitForElement(elmntvideoofoption);
                waitForElementClickable(elmntvideoofoption);
                click(elmntvideoofoption);
                blResult = verifyElement(elmntvideoonoption);
                System.out.println("Now the Video Option is turned On >>>");
            } else if (verifyElement(elmntvideoonoption)) {
                waitForElement(elmntvideoonoption);
                waitForElementClickable(elmntvideoonoption);
                click(elmntvideoonoption);
                blResult1 = verifyElement(elmntvideoofoption);
                System.out.println("Now the Video Option is turned Off >>>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult || blResult1;
    }

    public boolean validateSettingsOption() {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false;
        boolean blResult4 = false;
        try {
            waitForElement(elmntsettingsoption);
            waitForElementClickable(elmntsettingsoption);
            click(elmntsettingsoption);
            waitForElement(elmntdevicesettingstxt);
            blResult = verifyElement(elmntdevicesettingstxt);
            waitForElement(elmntinternalmicrophonetxt);
            blResult1 = verifyElement(elmntinternalmicrophonetxt);
            waitForElement(elmntinternalsoundtxt);
            blResult2 = verifyElement(elmntinternalsoundtxt);
            waitForElement(elmntinternalcameratxt);
            blResult3 = verifyElement(elmntinternalcameratxt);
            waitForElement(elmntclosebtn);
            blResult4 = verifyElement(elmntclosebtn);
            click(elmntclosebtn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return blResult && blResult1 && blResult2 && blResult3 && blResult4;
    }

    public boolean validateChatOption() {
        boolean blResult = false;
        waitForElement(elmntchatoption);
        try {
            if (verifyElement(elmntchatoption)) {
                click(elmntchatoption);
                waitForElement(elmntchattxt);
                verifyElement(elmntchattxt);
                waitForElement(elmnttypemessagefield);
                verifyElement(elmnttypemessagefield);
                enterValue(elmnttypemessagefield, TestDataUtil.getValue("&HI_TXT&"));
                waitForElement(elmntsendbutton);
                click(elmntsendbutton);
                click(elmntmenuvideocallclosebtn);
                blResult = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean validateConnectionInfoMenu()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForElement(elmntmenubtn);
            waitForElementClickable(elmntmenubtn);
            click(elmntmenubtn);
            verifyElement(elmntmenutxt);
            waitForElement(elmntconnectioninfomenu);
            waitForElementClickable(elmntconnectioninfomenu);
            click(elmntconnectioninfomenu);
            waitForElement(elmntgoodconnectiontxt);
            blResult = verifyElement(elmntgoodconnectiontxt);
            waitForElement(elmntwindowstxt);
            blResult1 = verifyElement(elmntwindowstxt);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Connection Info is not showing >>>");
        }
        return blResult && blResult1;
    }

    public boolean patientPayAmount()
    {
        boolean blResult2 = false, blResult3 = false, blResult4 = false, blResult5 = false;
        try
        {
            if(verifyElement(elmntpaymentrequesttxt)) {
                waitForElement(elmntpaymentrequesttxt);
                waitForElement(elmntpaynowbtn);
                waitForElementClickable(elmntpaynowbtn);
                jsClick(elmntpaynowbtn);
                waitForSeconds(5);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElement(elmntpaymentdetailstxt);
                blResult2 = verifyElement(elmntpaymentdetailstxt);
                driver.switchTo().frame(framepayment);
                enterValue(elmntcardnumbertxtbox, TestDataUtil.getValue("&PAYMENT_CARD_NUMBER&"));
                enterValue(elmntexpirytxtbox, TestDataUtil.getValue("&PAYMENT_EXPIRY&"));
                enterValue(elmntcvctxtbox, TestDataUtil.getValue("&PAYMENT_CVV&"));
                driver.switchTo().parentFrame();
                waitForElement(elmntpaybtn);
                verifyElement(elmntpaybtn);
                blResult3 = click(elmntpaybtn);
                waitForElement(elmntpaymentsuccesstxt);
                blResult4 = verifyElement(elmntpaymentsuccesstxt);
                waitForElement(elmntokbtn);
                verifyElement(elmntokbtn);
                blResult5 = click(elmntokbtn);
            }
            else
            {
                waitForSeconds(5);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElement(elmntpaymentdetailstxt);
                blResult2 = verifyElement(elmntpaymentdetailstxt);
                driver.switchTo().frame(framepayment);
                enterValue(elmntcardnumbertxtbox, TestDataUtil.getValue("&PAYMENT_CARD_NUMBER&"));
                enterValue(elmntexpirytxtbox, TestDataUtil.getValue("&PAYMENT_EXPIRY&"));
                enterValue(elmntcvctxtbox, TestDataUtil.getValue("&PAYMENT_CVV&"));
                driver.switchTo().parentFrame();
                waitForElement(elmntpaybtn);
                verifyElement(elmntpaybtn);
                blResult3 = click(elmntpaybtn);
                waitForElement(elmntpaymentsuccessheadertxt);
                blResult4 = verifyElement(elmntpaymentsuccessheadertxt);
                waitForElement(elmntclosebtn);
                verifyElement(elmntclosebtn);
                blResult5 = click(elmntclosebtn);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return blResult2 && blResult3 && blResult4  && blResult5;
    }

    public boolean verifyTwoSlideVideoSection()
    {
        boolean blResult = false;
        try
        {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(10);
            if(elmntvideopage.size()==2)
            {
                blResult = true;
            }
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Two Slides is not showing  >>>");
        }
        return blResult;
    }

    public boolean validatePatientEnrolmenu()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntmenubtn);
            verifyElement(elmntmenubtn);
            click(elmntmenubtn);
            waitForElement(elmntpatientenrolmentmenu);
            waitForElementClickable(elmntpatientenrolmentmenu);
            click(elmntpatientenrolmentmenu);
            waitForElement(elmntpatientenrolheading);
            blResult = verifyElement(elmntpatientenrolheading);
            click(elmntmenuvideocallclosebtn);

        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Patient Enrolment menu is not working properly >>>");
        }
        return blResult;
    }


    public boolean validateMedicalQuestionnairemenu()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntmenubtn);
            verifyElement(elmntmenubtn);
            click(elmntmenubtn);
            waitForElement(elmntmedicalquestionmenu);
            waitForElementClickable(elmntmedicalquestionmenu);
            click(elmntmedicalquestionmenu);
            waitForElement(elmntmedicalquestionheading);
            blResult = verifyElement(elmntmedicalquestionheading);
            click(elmntmenuvideocallclosebtn);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Medical Questionnaire menu is not working properly >>>");
        }
        return blResult;
    }

    public boolean validateFileTransferMenu(String strImage) {
        boolean blResult = false;
        try {
            waitForElement(elmntmenubtn);
            verifyElement(elmntmenubtn);
            click(elmntmenubtn);
            verifyElement(elmntfiletransfermenu);
            waitForElementClickable(elmntfiletransfermenu);
            click(elmntfiletransfermenu);
            waitForElement(elmntuploadfileheading);
            System.out.println("\nImage Name >>> ::" + strImage);
            System.out.println("\n X-Path for strUpload Document Name >>> :: " + strUploadDocument.replace("<<FILENAME>>", strImage));
            String strUploadDocumentName = strUploadDocument.replace("<<FILENAME>>", strImage);
            elmntaddfilebtn.sendKeys(strUploadDocumentName);

            System.out.println("X-path for uploadedDocumentName >>> :: " + uploadedDocument.replace("<<DocumentName>>", strImage));
            waitForSeconds(3);
            takeScreenshotSanity(driver);
            WebElement uploadedDocumentName = waitForElement(By.xpath(uploadedDocument.replace("<<DocumentName>>", strImage)));

            waitForElement(uploadedDocumentName);
            blResult = verifyElement(uploadedDocumentName);
            click(elmntmenuvideocallclosebtn);
        } catch (Exception e) {
            System.out.println("Failed to Upload Document  >>> ::");
            e.printStackTrace();
        }
        return blResult;
    }

    public void takeScreenshotSanity(WebDriver driver) {
        try {
            pageContainer.myScenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
