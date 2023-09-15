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


public class FundamentalPage extends BasePage {

    public FundamentalPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    @FindBy(how = How.XPATH, using = "//span[text() = 'Sign up for free']")
    protected WebElement elmntsignupforfreebtn;

    @FindBy(how = How.XPATH, using = "//h4[text() = 'Hi! Tell us a bit about you.']")
    protected WebElement elmntsignupheadingtxt;

    @FindBy(how = How.XPATH, using = "//img[@src = 'assets/images/logo.svg\']")
    protected WebElement elmntmmhlogo;

    @FindBy(how = How.XPATH, using = "(//mat-select[@role = 'combobox'])[1]")
    protected WebElement elmntfirstcombobox;

    @FindBy(how = How.XPATH, using = "(//mat-select[@role = 'combobox'])[2]")
    protected WebElement elmntsecondcombobox;

    @FindBy(how = How.XPATH, using = "(//span[text()='Sign in'])[2]")
    protected WebElement elmntsecondsigninbtn;

    @FindBy(how = How.XPATH, using = "(//a[text() = ' SIGN IN NOW'])[1]")
    protected WebElement elmntsigninnowlink;

    @FindBy(how = How.XPATH, using = "(//a[text() = 'Terms of use'])[1]")
    protected WebElement elmnttermsofuselink;

    @FindBy(how = How.XPATH, using = "(//a[text() = 'Privacy policy'])[1]")
    protected WebElement elmntprivacypolicylink;

    @FindBy(how = How.XPATH, using = "//span[text() = ' Medicine/Medical Doctor ']")
    protected WebElement elmntspecialityoption;

    @FindBy(how = How.XPATH, using = "//button//span[text() = 'Register']")
    protected WebElement elmntregisterbtn;


    @FindBy(how = How.XPATH, using = "//p[text()= ' Thank you for registering with Manage My Health 360. You’re just a step away from accessing your account. ']")
    protected WebElement elmntregisterverifyfirsttxt;

    @FindBy(how = How.XPATH, using = "//p[contains(text(), 'We have sent you a ten digit verification code')]")
    protected WebElement elmntregisterverifysecondtxt;


    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'mat-checkbox-inner-container')])[1]")
    protected WebElement elmntaccepttccheckbox;


    @FindBy(how = How.XPATH, using = "//h4[text() = ' Thanks for confirming your email.']")
    protected WebElement elmntconfirmingemailtxt;


    @FindBy(how = How.XPATH, using = "//strong[text() = 'Click here to ']")
    protected WebElement elmntclickheretxt;

    @FindBy(how = How.XPATH, using = "//a[text() = 'Sign In']")
    protected WebElement elmntsiginlink;

    @FindBy(how = How.XPATH, using = "//h4[text() = 'Sign in']")
    protected WebElement elmntsignintxt;

    protected String spantxt = new StringBuilder().append("//span[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String atxt = new StringBuilder().append("//a[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String inputplaceholder = new StringBuilder().append("//input[contains(@data-placeholder , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String strongtxt = new StringBuilder().append("//strong[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String matlabeltxt = new StringBuilder().append("//mat-label[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String divtxt = new StringBuilder().append("//div[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();


    public boolean clickSignUpForFreeButton()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForElement(elmntsignupforfreebtn);
            blResult = verifyElement(elmntsignupforfreebtn);
            waitForElementClickable(elmntsignupforfreebtn);
            blResult1 = click(elmntsignupforfreebtn);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("SignUp for Free button is not showing: >>>");
        }

        return blResult && blResult1;
    }


    public boolean verifySignUpPage()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntsignupheadingtxt);
            blResult = verifyElement(elmntsignupheadingtxt);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("SignUp Page Heading text is not showing: >>>");
        }

        return blResult;
    }


    public boolean verifySignUpPageFields(List<String> strSpanDetails,List<String> strInputDetails,List<String> strStrongDetails,List<String> strMatLabelDetails,List<String> strDivDetails) {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false;
        boolean blResult5 = false, blResult6 = false, blResult7 = false, blResult8 = false, blResult9 = false, blResult10 = false;
        boolean blResult11 = false, blResult12 = false, blResult13 = false;

        try
        {
            waitForElement(elmntmmhlogo);
            blResult = verifyElement(elmntmmhlogo);

            waitForElement(elmntsignupheadingtxt);
            blResult1 = verifyElement(elmntsignupheadingtxt);

            waitForElement(elmntsecondsigninbtn);
            blResult10 = verifyElement(elmntsecondsigninbtn);

            waitForElement(elmntsigninnowlink);
            blResult11 = verifyElement(elmntsigninnowlink);

            for (String strDetails: strSpanDetails)
            {
                WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("Span Text Name:" + strDetails);
                blResult2 = verifyElement(elmntSpanTextDetails);
            }

            for (String strDetails2: strInputDetails)
            {
                WebElement elmntInputPlaceholderDetails = waitForElement(By.xpath(inputplaceholder.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails2))));
                System.out.println("Input Text Name:" + strDetails2);
                blResult4 = verifyElement(elmntInputPlaceholderDetails);
            }

            waitForElement(elmntfirstcombobox);
            blResult8 = verifyElement(elmntfirstcombobox);

            waitForElement(elmntsecondcombobox);
            blResult9 = verifyElement(elmntsecondcombobox);


            for (String strDetails3: strStrongDetails)
            {
                WebElement elmntStrongTextDetails = waitForElement(By.xpath(strongtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails3))));
                System.out.println("Strong Text Name:" + strDetails3);
                blResult5 = verifyElement(elmntStrongTextDetails);
            }

            for (String strDetails4: strMatLabelDetails)
            {
                WebElement elmntMatLabelTextDetails = waitForElement(By.xpath(matlabeltxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails4))));
                System.out.println("Strong Text Name:" + strDetails4);
                blResult6 = verifyElement(elmntMatLabelTextDetails);
            }

            for (String strDetails5: strDivDetails)
            {
                WebElement elmntDivTextDetails = waitForElement(By.xpath(divtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails5))));
                System.out.println("Div Text Name:" + strDetails5);
                blResult7= verifyElement(elmntDivTextDetails);
            }

            waitForElement(elmnttermsofuselink);
            blResult12 = verifyElement(elmnttermsofuselink);

            waitForElement(elmntprivacypolicylink);
            blResult13 = verifyElement(elmntprivacypolicylink);

        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("All fields is not showing >>>>");
        }
        return blResult && blResult1 && blResult2 && blResult4 && blResult5 && blResult6 && blResult7 && blResult8 && blResult9 && blResult10 && blResult11 & blResult12 && blResult13;
    }


    public boolean enterProviderDetails(List<String> strProviderFields, List<String> strProviderData)
    {
        boolean blResult = false;
        int i = 0;
        try {
            for (String strFields : strProviderFields) {
                WebElement elmntInputTextDetails = waitForElement(By.xpath(inputplaceholder.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strFields))));
                String MatLabelTextData = TestDataUtil.getValue(strProviderData.get(i));
                System.out.println("Mat-Label Field Name:" + strFields);
                System.out.println("Mat-Label Data Name:" + strProviderData.get(i));
                enterValue(elmntInputTextDetails, MatLabelTextData);
                i = i + 1;
                if (i == (strProviderData.size() - 1)) {
                    blResult = true;
                    System.out.println("Details entered successfully:");
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("All Provider Data entered: >>>>");

        }

        return blResult;
    }

    public boolean selectSpeciality()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            System.out.println("Speciality Selection Started:");
            verifyElement(elmntsecondcombobox);
            waitForElementClickable(elmntsecondcombobox);
            blResult = click(elmntsecondcombobox);
            verifyElement(elmntspecialityoption);
            waitForElementClickable(elmntspecialityoption);
            blResult1 = click(elmntspecialityoption);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Speciality dropdown is not showing: >>>");
        }

        return blResult && blResult1;
    }


    public boolean clickRegisterButton()
    {
        boolean blResult = false;
        try
        {
            verifyElement(elmntregisterbtn);
            waitForElementClickable(elmntregisterbtn);
            blResult = click(elmntregisterbtn);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Register button is not working: >>>");
        }

        return blResult;
    }


    public boolean verifyVerificationCodePage()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForElement(elmntregisterverifyfirsttxt);
            blResult = verifyElement(elmntregisterverifyfirsttxt);
            waitForElement(elmntregisterverifysecondtxt);
            blResult1 = verifyElement(elmntregisterverifysecondtxt);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Verification Code Page is not showing: >>>");
        }

        return blResult && blResult1;
    }

    public boolean acceptTC()
    {
        boolean blResult = false;
        try
        {
            verifyElement(elmntaccepttccheckbox);
            waitForElementClickable(elmntaccepttccheckbox);
            blResult = click(elmntaccepttccheckbox);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Terms and Conditions check box is not working: >>>");
        }

        return blResult;
    }

    public boolean verifyConfirmationpage()
    {
        boolean blResult = false, blResult1 = false, blResult2 = false;
        try
        {
            waitForElement(elmntconfirmingemailtxt);
            blResult = verifyElement(elmntconfirmingemailtxt);
            waitForElement(elmntclickheretxt);
            blResult1 = verifyElement(elmntclickheretxt);
            waitForElement(elmntsiginlink);
            blResult2 = verifyElement(elmntsiginlink);
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Confirmation Page is not showing >>>");
        }
        return blResult && blResult1 && blResult2;
    }

    public boolean clickSignInLink()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            verifyElement(elmntsiginlink);
            waitForElementClickable(elmntsiginlink);
            blResult = click(elmntsiginlink);
            waitForElement(elmntsignintxt);
            blResult1 = verifyElement(elmntsignintxt);
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Sign In Link is not showing: >>>");
        }
        return blResult && blResult1;
    }




}