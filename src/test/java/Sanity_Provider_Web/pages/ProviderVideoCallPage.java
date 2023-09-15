package Sanity_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import io.cucumber.messages.internal.com.google.common.net.HostAndPort;
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


public class ProviderVideoCallPage extends BasePage {

    public ProviderVideoCallPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'videoIconsContainer')]//div[@class = 'Video-elements']//div[@class = 'doctor-details']//ul//li[@class = 'docdetailssection']//span")
    protected WebElement elmntdocdetails;

    @FindBy(how = How.XPATH, using = "(//img[contains(@alt , 'Close')])[2]")
    protected WebElement btnendvideocall;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Welcome, ')]")
    protected WebElement elmntVerifyHomePage;

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

    @FindBy(how = How.XPATH, using = "(//p[contains(text(),'00')])[1]")
    protected WebElement elmnttimertxt;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Youtube player')]")
    protected WebElement elmntyoutubemenu;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Youtube player')]")
    protected WebElement elmntyoutubetxt;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Connection info')]")
    protected WebElement elmntconnectioninfomenu;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Good Connection')]")
    protected WebElement elmntgoodconnectiontxt;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'Windows windows-10')]")
    protected WebElement elmntwindowstxt;


    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Request a payment')]")
    protected WebElement elmntrequestpaymentmenu;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), ' Payment ')]")
    protected WebElement elmntpaymenttxt;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname = 'reason']")
    protected WebElement elmntreasontxtbox;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname = 'fee']")
    protected WebElement elmntfeetxtbox;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname = 'comment']")
    protected WebElement elmntcommentstxtbox;

    @FindBy(how = How.XPATH, using = "//button//span[text() = 'Request Payment']")
    protected WebElement elmntrequestpaymentbtn;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Invite Patient/Customer']")
    protected WebElement elmntinvitepatientmnu;
    @FindBy(how = How.XPATH, using = "//div[text() = 'Patient Queue']")
    protected WebElement elmntpatientqueuetab;
    @FindBy(how = How.XPATH, using = "(//p[contains(text(),' Waiting')])[1]")
    protected WebElement elmntwaitingtxt;

    @FindBy(how = How.XPATH, using = "//img[@src = 'assets/images/avatar-video.svg' and @alt = 'user']")
    protected List<WebElement> elmntvideoicon;

    @FindBy(how = How.XPATH, using = "//div[contains(@id, 'MP_OT_')]")
    protected List<WebElement> elmntvideopage;

    @FindBy(how = How.XPATH, using = "//p[text() = ' Invite patient ']")
    protected WebElement elmntinvitepatientheading;

    @FindBy(how = How.XPATH, using = "//div[text() = 'External Patient/Customer']")
    protected WebElement elmntexternalpatienttab;


    @FindBy(how = How.XPATH, using = "//button//span[text() = 'Virtual background']")
    protected WebElement elmntvirtualbackgroundmnu;

    @FindBy(how = How.XPATH, using = "//p[text() = 'Virtual background']")
    protected WebElement elmntvirtualbackgroundheading;

    @FindBy(how = How.XPATH, using = "//strong[text() = 'Video effects']")
    protected WebElement elmntvideoeffectstxt;

    @FindBy(how = How.XPATH, using = "//button[text() = 'Apply and turn on video']")
    protected WebElement elmntapplyandturnonbtn;

    @FindBy(how = How.XPATH, using = "//img[@alt = 'fill']")
    protected List<WebElement> elmntvirtualbackgroundimg;


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

    @FindBy(how = How.XPATH, using = "//button[text() = 'Add file']")
    protected WebElement elmntaddfilebtn;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'file(s) added ')]")
    protected WebElement elmntfileaddedtxt;

    @FindBy(how = How.XPATH, using = "//div[text() = 'Exit Call']")
    protected WebElement elmntexitcalltxt;

    @FindBy(how = How.XPATH, using = "//button[text() = 'Yes']")
    protected WebElement elmntyesbtn;





    protected String imgalt = new StringBuilder().append("//img[contains(@alt , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String spantxt = new StringBuilder().append("//span[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String matlabeltxt = new StringBuilder().append("//mat-label[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String ptxt = new StringBuilder().append("//p[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    public boolean verifyProviderVideoSection(String strProviderName) {
        boolean blResult = false, blResult1 = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntdocdetails);
            verifyElement(elmntdocdetails);
            waitForElement(elmnttimertxt);
            blResult1 = verifyElement(elmnttimertxt);
            System.out.println("Test Data Provider Name:" + strProviderName);
            String videoprovidername = elmntdocdetails.getText();
            System.out.println("Video Call Provider Name:" + videoprovidername);
            if (strProviderName.equalsIgnoreCase(videoprovidername)) {
                waitForSeconds(10);
                blResult = true;
            }
//            if (elmntvideopage.size() == 1) {
//                blResult1 = true;
//            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Video Call is not started >>>>");
        }
        return blResult && blResult1;
    }


    public boolean closeProviderCall() {
        boolean blResult = false, blResult1 = false , blResult2 = false, blResult3 = false;
        try {
            waitForElement(btnendvideocall);
            verifyElement(btnendvideocall);
            blResult = click(btnendvideocall);
            waitForElement(elmntexitcalltxt);
            blResult2 = verifyElement(elmntexitcalltxt);
            waitForElement(elmntyesbtn);
            verifyElement(elmntyesbtn);
            blResult3 = click(elmntyesbtn);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifyHomePage);
            blResult1 = verifyElement(elmntVerifyHomePage);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Video Call End Button is not Showing >>>>");
        }
        return blResult && blResult1 && blResult2 && blResult3;
    }

    public boolean verifyAllMenusInVideoCallPage(List<String> strAltTextDetails, List<String> strSpanTextDetails) {
        boolean blResult = false, blResult1 = false, blResult3 = false, blResult4 = false;
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

            waitForElement(elmntconsultationnotesbtn);
            blResult4 = verifyElement(elmntconsultationnotesbtn);
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
        return blResult && blResult1 && blResult3 && blResult4 && blResult5 && blResult6 && blResult7 && blResult8 && blResult9 && blResult10 && blResult11;
    }

    public boolean validateYoutubePlayerMenu() {
        boolean blResult = false;
        try {
            waitForElement(elmntmenubtn);
            waitForElementClickable(elmntmenubtn);
            click(elmntmenubtn);
            verifyElement(elmntmenutxt);
            waitForElement(elmntyoutubemenu);
            waitForElementClickable(elmntyoutubemenu);
            click(elmntyoutubemenu);
            waitForElement(elmntyoutubetxt);
            blResult = verifyElement(elmntyoutubetxt);
            click(elmntmenuvideocallclosebtn);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Youtube Player is not showing >>>");
        }
        return blResult;
    }


    public boolean providerRequestPayment() {
        boolean blResult = false, blResult1 = false;
        try {
            waitForElement(elmntmenubtn);
            waitForElementClickable(elmntmenubtn);
            click(elmntmenubtn);
            verifyElement(elmntmenutxt);
            waitForElement(elmntrequestpaymentmenu);
            waitForElementClickable(elmntrequestpaymentmenu);
            click(elmntrequestpaymentmenu);
            waitForElement(elmntpaymenttxt);
            blResult = verifyElement(elmntpaymenttxt);
            enterValue(elmntreasontxtbox, TestDataUtil.getValue("&PAYMENT_REASON&"));
            enterValue(elmntfeetxtbox, TestDataUtil.getValue("&PAYMENT_FEE&"));
            enterValue(elmntcommentstxtbox, TestDataUtil.getValue("&PAYMENT_COMMENTS&"));
            blResult1 = click(elmntrequestpaymentbtn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult && blResult1;
    }


    public boolean validateInvitePatientMenu() {
        boolean blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false;
        try {

            waitForElement(elmntmenubtn);
            verifyElement(elmntmenubtn);
            click(elmntmenubtn);
            verifyElement(elmntinvitepatientmnu);
            waitForElementClickable(elmntinvitepatientmnu);
            click(elmntinvitepatientmnu);
            waitForElement(elmntinvitepatientheading);
            blResult1 = verifyElement(elmntinvitepatientheading);
            waitForElement(elmntpatientqueuetab);
            blResult2 = verifyElement(elmntpatientqueuetab);
            waitForElement(elmntexternalpatienttab);
            blResult3 = verifyElement(elmntexternalpatienttab);
            click(elmntpatientqueuetab);
            if (elmntvideoicon.size() > 1)
            {
                waitForElement(elmntvideoicon.get(elmntvideoicon.size() - 3));
                verifyElement(elmntvideoicon.get(elmntvideoicon.size() - 3));
                blResult4 = click(elmntvideoicon.get(elmntvideoicon.size() - 3));
            }
            else if (elmntvideoicon.size() == 1)
            {
                waitForElement(elmntvideoicon.get(0));
                verifyElement(elmntvideoicon.get(0));
                blResult4 = click(elmntvideoicon.get(0));
            }
            else
            {
                blResult4 = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Invite Patient/Customer Menu is not working proper >>>");
        }
        return blResult1 && blResult2 && blResult3 && blResult4;
    }


    public boolean validateVirtualBackgroundMenu()
    {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false, blResult5 = false;
        try
        {
            waitForElement(elmntmenubtn);
            verifyElement(elmntmenubtn);
            click(elmntmenubtn);
            waitForElement(elmntvirtualbackgroundmnu);
            verifyElement(elmntvirtualbackgroundmnu);
            waitForElementClickable(elmntvirtualbackgroundmnu);
            click(elmntvirtualbackgroundmnu);
            waitForElement(elmntvirtualbackgroundheading);
            blResult = verifyElement(elmntvirtualbackgroundheading);
            waitForElement(elmntvideoeffectstxt);
            blResult1 = verifyElement(elmntvideoeffectstxt);
            waitForElement(elmntapplyandturnonbtn);
            blResult2 = verifyElement(elmntapplyandturnonbtn);
            for(int i =0; i < elmntvirtualbackgroundimg.size();i++)
            {
                waitForElement(elmntvirtualbackgroundimg.get(i));
                blResult3 = verifyElement(elmntvirtualbackgroundimg.get(i));
            }
            blResult4 = click(elmntvirtualbackgroundimg.get(0));
            blResult5 = click(elmntapplyandturnonbtn);
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Virtual Background option is not working properly >>>");
        }

        return blResult && blResult1 && blResult2 && blResult3 && blResult4 && blResult5;
    }

}





