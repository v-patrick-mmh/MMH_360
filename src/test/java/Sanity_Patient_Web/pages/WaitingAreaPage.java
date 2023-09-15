package Sanity_Patient_Web.pages;


import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.net.ssl.HostnameVerifier;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class WaitingAreaPage extends BasePage {

    public WaitingAreaPage(WebDriver driver) {
        super(driver);
    }


    public static String strAppVersion;
    public static String strBrowserName;
    public static String strBrowserVersion;
    public static String strSystemName;
    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'hidingMobileForAudio audio matcard-audio main-box ng-star-inserted')]")
    protected WebElement elmntmusicsection;

    @FindBy(how = How.XPATH, using = "//div[@class = 'emergency']//p[@class = 'emergencylink' and text() = 'IS THIS AN EMERGENCY?']")
    protected WebElement elmntemergencylink;

    @FindBy(how = How.XPATH, using = "//div//h3[text() = 'Emergency alert']")
    protected WebElement elmntemergencyalerttxt;

    @FindBy(how = How.XPATH, using = "//button//span[text() = 'GOT IT']")
    protected WebElement elmntemergencygotit;

    @FindBy(how = How.XPATH, using = "//div[@class = 'para-div']//p[text() = 'If you are an existing Manage My Health user, you can provide access to view your electronic health record during consultation']")
    protected WebElement elmnthealthsummarytxt;

    @FindBy(how = How.XPATH, using = "(//div//div[@class = 'checkbox-dashboard']//mat-checkbox[contains(@class, 'mat-checkbox')])[1]")
    protected WebElement elmntviewconsentHSchkbox;

    @FindBy(how = How.XPATH, using = "//div//div[@class = 'checkbox-dashboard enable-healthsummary']//mat-checkbox[contains(@class, 'mat-checkbox')]")
    protected WebElement elmntdownloadconsentHSdisabledchkbox;

    @FindBy(how = How.XPATH, using = "(//div//div[@class = 'checkbox-dashboard']//mat-checkbox[contains(@class, 'mat-checkbox')])[2]")
    protected WebElement elmntdownloadconsentHSchkbox;

    @FindBy(how = How.XPATH, using = "//div//div//p[text() = 'To provide access to your doctor, please sign-in ']")
    protected WebElement elmntprovideaccesstxt;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'mat-form-field')]//input[@type = 'email']")
    protected WebElement txtBoxEmail;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'mat-form-field')]//input[@type = 'password']")
    protected WebElement txtBoxPassword;

    @FindBy(how = How.XPATH, using = "//div//button[text() = 'Sign in']")
    protected WebElement btnSignIn;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'para-div')]//p[@class = 'para-for-patientlogin' and text() = 'You have signed in to Manage My Health account. ']")
    protected WebElement elmntconsentsuccessmessagetxt;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'LOG IN')]")
    protected WebElement elmntLoginBtn;

    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement SignInBtn;


    @FindBy(how = How.XPATH, using = "//div[@class='row appVersion']/p")
    protected WebElement txtAppVersion;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Welcome, ')]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//mat-card-title[@class='mat-card-title mainheader web-display']//img")
    protected WebElement elmntCancelIcon;

    @FindBy(how = How.XPATH, using = "(//div//button//span[@class = 'mat-button-wrapper']//img[@src = 'assets/images/avatar-video.svg'])[1]")
    protected WebElement elmntfirstvideoicon;


    @FindBy(how = How.XPATH, using = "//div//div[@class = 'name-ringing']")
    protected WebElement elmntcallalert;

    @FindBy(how = How.XPATH, using = "//div[@class = 'accept-decline decline-call']")
    protected WebElement elmntdeclinecallalert;

    @FindBy(how = How.XPATH, using = "//div[@class = 'accept-decline']")
    protected WebElement elmntacceptcallalert;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'videoIconsContainer')]//div[@class = 'Video-elements']//div[@class = 'doctor-details']//ul//li[@class = 'docdetailssection']//span")
    protected WebElement elmntdocdetails;

    @FindBy(how = How.XPATH, using = "(//p[contains(text(),'00')])[1]")
    protected WebElement elmnttimertxt;
    @FindBy(how = How.XPATH, using = "//button//img[@src = 'assets/Videoimages/Close.svg' and @alt = 'Close']")
    protected WebElement btnendvideocall;

    @FindBy(how = How.XPATH, using = "//span[contains(@class, 'mat-expansion')]")
    protected WebElement elmntmusicdownarrowicon;



    protected String tdtxt = new StringBuilder().append("//td[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();

    protected String spantxt = new StringBuilder().append("//span[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    public boolean verifyMusicPlaylist() {
        boolean blResult = false;
        try {
            waitForElement(elmntmusicsection);
            blResult = verifyElement(elmntmusicsection);
            } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Music section is not displayed >>>>");
        }
        return blResult;
    }


    public boolean verifyEmergencyContactLinkAndPopup() {
        boolean blResult = false, blResult1 = false, blResult2 = false;
        try {
            jsScroll();
            waitForElement(elmntemergencylink);
            blResult1 = verifyElement(elmntemergencylink);
            click(elmntemergencylink);
            waitForElement(elmntemergencyalerttxt);
            blResult2 = verifyElement(elmntemergencyalerttxt);
            blResult = verifyElement(elmntemergencygotit);
            click(elmntemergencygotit);
            } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Emergency alert link is not displayed >>>>");
        }
        return blResult && blResult1 && blResult2;
    }

    public boolean verifyViewAndDownloadHSConsentCheckbox()
    {
        boolean blResult = false, blResult1 = false, blResult2 = false;
        try {
            jsScroll();
            waitForElement(elmnthealthsummarytxt);
            blResult1 = verifyElement(elmnthealthsummarytxt);
            waitForElement(elmntviewconsentHSchkbox);
            blResult2 = verifyElement(elmntviewconsentHSchkbox);
            waitForElement(elmntdownloadconsentHSdisabledchkbox);
            blResult = verifyElement(elmntdownloadconsentHSdisabledchkbox);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Health Summary consent checkbox is not displayed >>>>");
        }
        return blResult && blResult1 && blResult2;
    }

    public void selectViewAndDownloadConsentCheckbox()
    {
        jsScroll();
        waitForElementClickable(elmntviewconsentHSchkbox);
        click(elmntviewconsentHSchkbox);
        waitForElementClickable(elmntdownloadconsentHSchkbox);
        click(elmntdownloadconsentHSchkbox);
    }


    public boolean verifyEmailAndAddressFields()
    {
        boolean blResult = false, blResult1 = false, blResult2 = false;
        try {
            waitForElement(txtBoxEmail);
            blResult = verifyElement(txtBoxEmail);
            waitForElement(txtBoxPassword);
            blResult1 = verifyElement(txtBoxPassword);
            waitForElement(btnSignIn);
            blResult2 = verifyElement(btnSignIn);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Email address and password field is not displayed >>>>");
        }
        return blResult && blResult1 && blResult2;
    }


    public boolean verifyConsentSuccessMessage()
    {
        boolean blResult = false;
        try {
            waitForElement(elmntconsentsuccessmessagetxt);
            blResult = verifyElement(elmntconsentsuccessmessagetxt);
            }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Success message is not displayed >>>>");
        }
        return blResult;
    }

    public void openNewWindow() {
        String parentwindow=driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://uatwebmmh360.mmh-demo.com/authentication/login')");

        Set<String> s1 = driver.getWindowHandles();

        System.out.println("windows count is " + s1.size());

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            waitForSeconds(5);
        }
    }




    public void navigatetoMainWindow() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        waitForSeconds(20);

    }


    public void navigatetoSubWindow() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        waitForSeconds(10);
    }

    public void closeSubWindow() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        waitForSeconds(10);
    }


    public void navigatetoSecondSubWindow() {
        waitForSeconds(10);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        waitForSeconds(2);
    }

    public void navigatetoThirdSubWindow() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(3));
        waitForSeconds(10);
    }

    public void navigatetoFourthSubWindow() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(4));
        waitForSeconds(10);
    }

    public void navigatetoFifthSubWindow() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(4));
        waitForSeconds(10);
    }


    public boolean verifyCallAlert()
    {
        boolean blResult = false, blResult1 = false, blResult2 = false;
        try
        {
            waitForSeconds(3);
            waitForElement(elmntcallalert);
            blResult = verifyElement(elmntcallalert);
            waitForElement(elmntacceptcallalert);
            blResult1 = verifyElement(elmntacceptcallalert);
            waitForElement(elmntdeclinecallalert);
            blResult2 = verifyElement(elmntdeclinecallalert);
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Call Alert is not showing");
        }
        return blResult && blResult1 && blResult2;
    }


    public boolean declineCallAlert()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntcallalert);
            waitForElement(elmntdeclinecallalert);
            verifyElement(elmntdeclinecallalert);
            click(elmntdeclinecallalert);
            blResult = true;
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Unable to decline Call Alert: >>>>");
        }
        return blResult;
    }

    public boolean acceptCallAlert()
    {
        boolean blResult = false;
        try
        {
            waitForSeconds(3);
            waitForElement(elmntcallalert);
            waitForElement(elmntacceptcallalert);
            verifyElement(elmntacceptcallalert);
            click(elmntacceptcallalert);
            blResult = true;
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Unable to decline Call Alert: >>>>");
        }
        return blResult;
    }

    public boolean verifyPatientVideoSection(String strPatientName)
    {
        //String patientname = TestDataUtil.getValue("&NEWPATIENTNAME&");
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForSeconds(10);
            waitForElement(elmntdocdetails);
            verifyElement(elmntdocdetails);
            waitForElement(elmnttimertxt);
            blResult1 = verifyElement(elmnttimertxt);
            System.out.println("Test Data Patient Name:"+ strPatientName);
            String videopatientname = elmntdocdetails.getText();
            System.out.println("Video Call Patient Name:"+ videopatientname);
            if(strPatientName.equalsIgnoreCase(videopatientname))
            {
                waitForSeconds(10);
                blResult = true;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Patient Video Call is not started >>>>");
        }
        return blResult && blResult1;
    }

    public boolean validateMusicPlaylist(List<String> strMusicData) {
        boolean blResult = false, blResult1 = false;
        try {
            waitForElement(elmntmusicsection);
            verifyElement(elmntmusicsection);
            waitForElement(elmntmusicdownarrowicon);
            verifyElement(elmntmusicdownarrowicon);
            click(elmntmusicdownarrowicon);
            for (String strMusicDetails : strMusicData) {
                WebElement elmntTableDataTextDetails = waitForElement(By.xpath(tdtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMusicDetails))));
                System.out.println("Alt Text Name:" + strMusicDetails);
                blResult = verifyElement(elmntTableDataTextDetails);
            }

            for (String strMusicDetails : strMusicData) {
                WebElement elmntTableDataTextDetails = waitForElement(By.xpath(tdtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMusicDetails))));
                click(elmntTableDataTextDetails);
                WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strMusicDetails))));
                blResult1 = verifyElement(elmntSpanTextDetails);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Music section is not displayed >>>>");
        }
        return blResult && blResult1;
    }



}



