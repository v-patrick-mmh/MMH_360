package Sanity_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import cap.utilities.WindowsProcessUtil;
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


public class OtherPage extends BasePage {

    public OtherPage(WebDriver driver) {
        super(driver);
    }

    static Process pb = null;

    //Office 365

    @FindBy(how = How.XPATH, using = "(//div//div[text() = 'Sign in'])[1]")
    protected WebElement elmntofficesigninbtn;

    @FindBy(how = How.XPATH, using = "//input[@type = 'email' and @name = 'loginfmt']")
    protected WebElement elmntofficeemailtxtbox;

    @FindBy(how = How.XPATH, using = "//input[@type = 'submit']")
    protected WebElement elmntofficenextbtn;

    @FindBy(how = How.XPATH, using = "//div[@id = 'passwordArea']//input[@id = 'passwordInput' and @name = 'Password']")
    protected WebElement elmntofficepasswordtxtbox;

    @FindBy(how = How.XPATH, using = "//div[@id = 'submissionArea']//span[text() = 'Sign in']")
    protected WebElement elmntofficesignbtn;

    @FindBy(how = How.XPATH, using = "//div//button[@id = 'Mail' and @data-tid = 'Mail']")
    protected WebElement elmntoutlookbtn;

    @FindBy(how = How.XPATH, using = "(//div//span[text() = 'Manage My Health 360 Appointment invitation'])[1]")
    protected WebElement elmntinvitationmailtxt;

    @FindBy(how = How.XPATH, using = "//td//button[text() = 'Join video consultation']")
    protected WebElement elmntjoinvcbtn;


    //Yopmail

    @FindBy(how = How.XPATH, using = "//input[@id = 'login' and @placeholder = 'Enter your inbox here']")
    protected WebElement elmntyopmailsearchbox;

    @FindBy(how = How.XPATH, using = "//div[@id = 'refreshbut']//button[@title = 'Check Inbox @yopmail.com']")
    protected WebElement elmntrightarrownbtn;


    @FindBy(how = How.XPATH, using = "//iframe[@id = 'ifinbox']")
    protected WebElement frameinvitationmail;

    @FindBy(how = How.XPATH, using = "(//button[@class = 'lm'])[1]")
    protected WebElement elmntinvitationyopmailtxt;

    @FindBy(how = How.XPATH, using = "(//button[@class = 'lm'])[2]")
    protected WebElement elmntpaymentyopmailtxt;

    @FindBy(how = How.XPATH, using = "//button[@id = 'refresh']")
    protected WebElement elmntrefreshyopmailbtn;

    @FindBy(how = How.XPATH, using = "//iframe[@id = 'ifmail']")
    protected WebElement frameinvitationcontent;

    @FindBy(how = How.XPATH, using = "//button//a[text() = 'Join video consultation']")
    protected WebElement elmntJVCyopmailbtn;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Join video consultation']")
    protected WebElement elmntJVCyopmailtxt;

    @FindBy(how = How.XPATH, using = "//button//a[text() = 'Book appointment']")
    protected WebElement elmntbookappointmentyopmailbtn;

    @FindBy(how = How.XPATH, using = "//button//a[text() = 'Verify my email']")
    protected WebElement elmntverifymyemailyopmailbtn;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Appointment confirmation']")
    protected WebElement elmntappconfirmtxt;

    @FindBy(how = How.XPATH, using = "//button//a[text() = 'View receipt']")
    protected WebElement elmntviewreceiptbtn;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Payment confirmation']")
    protected WebElement elmntpaymentconfirmtxt;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Join video consultation']")
    protected WebElement elmntJVCtxt;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Book an appointment']")
    protected WebElement elmntBookAnAppointmenttxt;

    @FindBy(how = How.XPATH, using = "//strong[text() = 'Welcome to Manage My Health 360.']")
    protected WebElement elmntwelcomeyopmailtxt;

    @FindBy(how = How.XPATH, using = "(//a[contains(@style, 'text-decoration')])[4]")
    protected WebElement elmntverifycodearea;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder = 'Enter 10-digit code']")
    protected WebElement elmntverificationcodebox;

    @FindBy(how = How.XPATH, using = "//button//span[text() = 'Verify']")
    protected WebElement elmntverifybtn;

    @FindBy(how = How.XPATH, using = "//div[text() = 'Success!']")
    protected WebElement elmntsuccessheadingtxt;

    @FindBy(how = How.XPATH, using = "//p[text() = 'Your account has been successfully activated.']")
    protected WebElement elmntsuccessmessagetxt;

    @FindBy(how = How.XPATH, using = "//button[text() = 'OK']")
    protected WebElement elmntokbtn;

    @FindBy(how = How.XPATH, using = "//h4[text() = 'Sign in']")
    protected WebElement elmntsignintxt;





    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'mat-checkbox-inner-container')])[1]")
    protected WebElement elmntaccepttccheckbox;



    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";



    public void visitYopMail() {
        driver.manage().deleteAllCookies();
        visit(TestDataUtil.getValue("&YURL&"));
    }

    public void navigatetoMainWindow() {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        waitForSeconds(20);

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
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(4));
        waitForSeconds(10);
    }

    public void openNewWindowYopmail() {
        String parentwindow = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://yopmail.com/en/')");

        Set<String> s1 = driver.getWindowHandles();

        System.out.println("windows count is " + s1.size());

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            waitForSeconds(5);
        }
    }

    public void enterPatientEmailAddressYopmail(String strPatientEmailAddress) {

        waitForElement(elmntyopmailsearchbox);
        verifyElement(elmntyopmailsearchbox);
        waitForElementClickable(elmntyopmailsearchbox);
        enterValue(elmntyopmailsearchbox, strPatientEmailAddress);
    }


    public boolean clickRightArrowYopmail()

    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntrightarrownbtn);
            verifyElement(elmntrightarrownbtn);
            waitForElementClickable(elmntrightarrownbtn);
            click(elmntrightarrownbtn);
            blResult = true;
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Yop Mail Right arrow Icon is not showing >>>");
        }
        return blResult;
    }

    public boolean clickInvitationMail()

    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForSeconds(10);
            System.out.println("Verification Started >>>");
            driver.switchTo().frame(frameinvitationmail);
            waitForElement(elmntinvitationyopmailtxt);
            blResult = verifyElement(elmntinvitationyopmailtxt);
            System.out.println("Verification Completed");
            waitForElementClickable(elmntinvitationyopmailtxt);
            jsClick((elmntinvitationyopmailtxt));
            driver.switchTo().parentFrame();
            blResult1 = true;
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Invitation Email is not showing >>>");
        }
        return blResult && blResult1;
    }


    public boolean clickYopmailRefreshButton()

    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForSeconds(5);
            System.out.println("Verification Started >>>");
            waitForElement(elmntrefreshyopmailbtn);
            blResult = verifyElement(elmntrefreshyopmailbtn);
            System.out.println("Verification Completed");
            waitForElementClickable(elmntrefreshyopmailbtn);
            jsClick((elmntrefreshyopmailbtn));
            blResult1 = true;
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Yopmail Refresh Button is not showing >>>");
        }
        return blResult && blResult1;
    }



    public boolean clickJoinVideoConsultationButton()

    {
        boolean blResult = false, blResult1 = false;
        try
        {
            driver.switchTo().frame(frameinvitationcontent);
            if(verifyElement(elmntJVCtxt) || verifyElement(elmntJVCyopmailbtn)) {
                waitForElement(elmntJVCyopmailbtn);
                blResult = verifyElement(elmntJVCyopmailbtn);
                waitForElementClickable(elmntJVCyopmailbtn);
                click(elmntJVCyopmailbtn);
                driver.switchTo().parentFrame();
                blResult1 = true;
            }

            else if(verifyElement(elmntBookAnAppointmenttxt)) {
                waitForElement(elmntbookappointmentyopmailbtn);
                blResult = verifyElement(elmntbookappointmentyopmailbtn);
                waitForElementClickable(elmntbookappointmentyopmailbtn);
                click(elmntbookappointmentyopmailbtn);
                driver.switchTo().parentFrame();
                blResult1 = true;
            }

            else if(verifyElement(elmntwelcomeyopmailtxt))
            {
                waitForElement(elmntverifymyemailyopmailbtn);
                blResult = verifyElement(elmntverifymyemailyopmailbtn);
                waitForElementClickable(elmntverifymyemailyopmailbtn);
                click(elmntverifymyemailyopmailbtn);
                driver.switchTo().parentFrame();
                blResult1 = true;
            }

        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Join Video Consultation or Book Appointment button is not showing >>>");
        }
        return blResult && blResult1;
    }


    public boolean verifyAppVideoConfirmation()

    {
        boolean blResult = false, blResult1 = false;
        try
        {
            driver.switchTo().frame(frameinvitationcontent);
            waitForElement(elmntappconfirmtxt);
            blResult = verifyElement(elmntappconfirmtxt);
            waitForElement(elmntJVCyopmailbtn);
            blResult1 = verifyElement(elmntJVCyopmailbtn);
            driver.switchTo().parentFrame();
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Join Video Consultation button is not showing >>>");
        }
        return blResult && blResult1;
    }


    public boolean verifyAppVideoConfirmationPayment()

    {
        boolean blResult = false, blResult1 = false;
        try
        {
            click(elmntpaymentyopmailtxt);
            driver.switchTo().frame(frameinvitationcontent);
            waitForElement(elmntappconfirmtxt);
            blResult = verifyElement(elmntappconfirmtxt);
            waitForElement(elmntJVCyopmailbtn);
            blResult1 = verifyElement(elmntJVCyopmailbtn);
            driver.switchTo().parentFrame();
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Join Video Consultation button is not showing >>>");
        }
        return blResult && blResult1;
    }

    public boolean verifyJoinVideoConsultationEmail()

    {
        boolean blResult = false, blResult1 = false;
        try
        {
            driver.switchTo().frame(frameinvitationcontent);
            if(verifyElement(elmntJVCyopmailtxt)) {
                waitForElement(elmntJVCyopmailtxt);
                blResult = verifyElement(elmntJVCyopmailtxt);
                waitForElement(elmntJVCyopmailbtn);
                blResult1 = verifyElement(elmntJVCyopmailbtn);
                driver.switchTo().parentFrame();
            }
            else if(verifyElement(elmntBookAnAppointmenttxt)) {
                waitForElement(elmntBookAnAppointmenttxt);
                blResult = verifyElement(elmntBookAnAppointmenttxt);
                waitForElement(elmntbookappointmentyopmailbtn);
                blResult1 = verifyElement(elmntbookappointmentyopmailbtn);
                driver.switchTo().parentFrame();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Join Video Consultation button is not showing >>>");
        }
        return blResult && blResult1;
    }

    public boolean verifyPaymentConfirmation()

    {
        boolean blResult = false, blResult1 = false;
        try
        {
            driver.switchTo().frame(frameinvitationcontent);
            waitForElement(elmntpaymentconfirmtxt);
            blResult = verifyElement(elmntpaymentconfirmtxt);
            waitForElement(elmntviewreceiptbtn);
            blResult1 = verifyElement(elmntviewreceiptbtn);
            driver.switchTo().parentFrame();
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("View Receipt button is not showing >>>");
        }
        return blResult && blResult1;
    }



    public boolean verifyEmailAndEnterCode()

    {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false, blResult5 = false, blResult6 = false;
        try
        {
            driver.switchTo().frame(frameinvitationcontent);
            blResult = verifyElement(elmntwelcomeyopmailtxt);
            waitForElement(elmntverifycodearea);
            String s = elmntverifycodearea.getText();
            driver.switchTo().parentFrame();
            navigatetoMainWindow();
            verifyElement(elmntverificationcodebox);
            waitForElementClickable(elmntverificationcodebox);
            enterValue(elmntverificationcodebox,s);
            waitForElement(elmntaccepttccheckbox);
            verifyElement(elmntaccepttccheckbox);
            blResult1 = click(elmntaccepttccheckbox);
            waitForSeconds(30);
            verifyElement(elmntverifybtn);
            waitForElementClickable(elmntverifybtn);
            blResult2 = click(elmntverifybtn);
            waitForElement(elmntsuccessheadingtxt);
            blResult3 = verifyElement(elmntsuccessheadingtxt);
            waitForElement(elmntsuccessmessagetxt);
            blResult4 = verifyElement(elmntsuccessheadingtxt);
            verifyElement(elmntokbtn);
            waitForElementClickable(elmntokbtn);
            blResult5 = click(elmntokbtn);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntsignintxt);
            blResult6 = verifyElement(elmntsignintxt);
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Verification code is not showing >>>");
        }
        return blResult && blResult1 && blResult2 && blResult3 && blResult4 && blResult5 && blResult6;
    }


    public boolean verifyRegistrationEmail()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            driver.switchTo().frame(frameinvitationcontent);
            waitForElement(elmntwelcomeyopmailtxt);
            blResult = verifyElement(elmntwelcomeyopmailtxt);
            waitForElement(elmntverifymyemailyopmailbtn);
            blResult1 = verifyElement(elmntverifymyemailyopmailbtn);
            driver.switchTo().parentFrame();
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Verification mail is not showing >>>");
        }
        return blResult && blResult1;
    }




/*  This below methods is belongs to navigate microsoft office

    public void openNewWindowOffice() {
        String parentwindow=driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.office.com/')");

        Set<String> s1 = driver.getWindowHandles();

        System.out.println("windows count is " + s1.size());

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            waitForSeconds(5);
        }
    }

    public void clickOfficeSignInButton()
    {
        waitForSeconds(10);
        waitForElement(elmntofficesigninbtn);
        verifyElement(elmntofficesigninbtn);
        waitForElementClickable(elmntofficesigninbtn);
        click(elmntofficesigninbtn);
    }

    public void enterOfficeEmailAddress(String strEmailAddress) {

        waitForSeconds(10);
        waitForElementClickable(elmntofficeemailtxtbox);
        enterValue(elmntofficeemailtxtbox, strEmailAddress);
    }

    public void clickOfficeNextButton()
    {
        waitForElement(elmntofficenextbtn);
        verifyElement(elmntofficenextbtn);
        waitForElementClickable(elmntofficenextbtn);
        click(elmntofficenextbtn);
    }

    public void enterOfficePassword(String strPassword) {

        waitForSeconds(10);
        waitForElementClickable(elmntofficepasswordtxtbox);
        enterValue(elmntofficepasswordtxtbox, strPassword);
    }

    public void clickOfficeSignButton()
    {
        waitForElement(elmntofficesignbtn);
        verifyElement(elmntofficesignbtn);
        waitForElementClickable(elmntofficesignbtn);
        click(elmntofficesignbtn);
    }


    public void clickOfficeOutlookButton()
    {
        waitForSeconds(10);
        waitForElement(elmntoutlookbtn);
        verifyElement(elmntoutlookbtn);
        waitForElementClickable(elmntoutlookbtn);
        click(elmntoutlookbtn);
    }

    public boolean clickOfficeOutlookInvitationMail()
    {
        boolean blResult = false;
        try {
            waitForSeconds(10);
            waitForElement(elmntinvitationmailtxt);
            verifyElement(elmntinvitationmailtxt);
            waitForElementClickable(elmntinvitationmailtxt);
            click(elmntinvitationmailtxt);
            blResult = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean clickJVCButtonInInvitationMail()
    {
        boolean blResult = false;
        try {
            waitForSeconds(10);
            waitForElement(elmntjoinvcbtn);
            verifyElement(elmntjoinvcbtn);
            waitForElementClickable(elmntjoinvcbtn);
            click(elmntjoinvcbtn);
            blResult = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return blResult;
    }


 */

    public void waitSeconds(int value)
    {
       waitForSeconds(value);
    }

    public boolean changeTimeZone(String strTimeZone) {
        boolean blResult = false;
        try {
            pb = WindowsProcessUtil.startTimeZoneProcess(strTimeZone);
            waitForSeconds(5);
            WindowsProcessUtil.stopProcess(pb);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

}