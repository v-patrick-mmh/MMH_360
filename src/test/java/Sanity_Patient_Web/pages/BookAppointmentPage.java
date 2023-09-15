package Sanity_Patient_Web.pages;


import cap.common.BasePage;
import cap.utilities.BrowserHandlerUtil;
import cap.utilities.TestDataUtil;
import cap.utilities.BrowserHandlerUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class BookAppointmentPage extends BasePage {

    public BookAppointmentPage(WebDriver driver) {
        super(driver);
    }

    public static String strSlotDate;

    @FindBy(how = How.XPATH, using = "//p[contains(text() , 'Book appointment')]")
    protected WebElement elmntBookApptxt;

    @FindBy(how = How.XPATH, using = "//img[contains(@class, 'profile-pic img-fluid clinic-pic')]")
    protected WebElement elmntClinicLogo;

    @FindBy(how = How.XPATH, using = "//button[@class = 'cal-icon-btn']")
    protected WebElement elmntCalendarIcon;

    @FindBy(how = How.XPATH, using = "//p[@class = 'p-l-25']//strong[text() = 'By']")
    protected WebElement elmntbytxt;

    @FindBy(how = How.XPATH, using = "(//div//mat-select//div[contains(@class,'mat-select-trigger')])[2]")
    protected WebElement elmntapptypecombobox;

    @FindBy(how = How.XPATH, using = "//span[text() = ' Fever (5 mins) ']")
    protected WebElement elmntapptypevalue;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),  'Next available:')])[1]")
    protected WebElement elmntnextavailabletxt;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class, 'mat-checkbox-inner-container')])[1]")
    protected WebElement elmntareyouexistingcheckbox;

    @FindBy(how = How.XPATH, using = "(//strong[contains(text(), 'Fee ( incl GST ): NZ$')])[1]")
    protected WebElement elmntfirstfeetxt;

    @FindBy(how = How.XPATH, using = "(//strong[contains(text(), 'Fee ( incl GST ): NZ$')])[2]")
    protected WebElement elmntsecondfeetxt;

    @FindBy(how = How.XPATH, using = "(//button[contains(@class, 'mat-button-disabled')]//span[text() = 'CONFIRM'])[1]")
    protected WebElement elmntconfirmdisabledbtn;

    @FindBy(how = How.XPATH, using = "//button//span[text() = 'CONFIRM']")
    protected WebElement elmntconfirmenabledbtn;

    @FindBy(how = How.XPATH, using = "//p//strong[text() = 'Thanks for booking an appointment']")
    protected WebElement elmntbookappsuccessmessage1;

    @FindBy(how = How.XPATH, using = "//p[text() = 'You will receive an email shortly to confirm your appointment.']")
    protected WebElement elmntbookappsuccessmessage2;


    @FindBy(how = How.XPATH, using = "(//button[contains(@class, 'mat-button-disabled')]//span[text() = 'Proceed to payment'])[1]")
    protected WebElement elmntproceedpaymentdisabledbtn;

    @FindBy(how = How.XPATH, using = "//button[text() = 'Proceed to payment']")
    protected WebElement elmntproceedpaymentenabledbtn;

    @FindBy(how = How.XPATH, using = "//div[text() = 'Information!']")
    protected WebElement elmntinformationheadingtxt;

    @FindBy(how = How.XPATH, using = "//p[text() = 'Currently, Appointment slot is not available for this doctor']")
    protected WebElement elmntinformationmessagetxt;

    @FindBy(how = How.XPATH, using = "//button[text() = 'OK']")
    protected WebElement elmntokbtn;

    @FindBy(how = How.XPATH, using = "//strong[text() = ' How can we help you today?']")
    protected WebElement elmntbookappmainpagetxt;

    @FindBy(how = How.XPATH, using = "(//div[@class = 'mat-radio-outer-circle'])[2]")
    protected WebElement elmntcreditcardoption;

    @FindBy(how = How.XPATH, using = "(//div[@class = 'mat-radio-outer-circle'])[1]")
    protected WebElement elmntpaylateroption;



    protected String matcardtitletxt = new StringBuilder().append("//mat-card-title[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String strongtxt = new StringBuilder().append("//strong[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String spantxt = new StringBuilder().append("//span[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String matlabeltxt = new StringBuilder().append("//mat-label[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String ptxt = new StringBuilder().append("//p[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String htxt = new StringBuilder().append("//h1[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String matcardsubtitletxt = new StringBuilder().append("//mat-card-subtitle[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();

    protected String inputdataplaceholdertxt = new StringBuilder().append("//input[contains(@data-placeholder , '").append("<<REPLACEMENT>>").append("')] | ").append("//input[contains(@formcontrolname , '").append("<<REPLACEMENT1>>").append("')]").toString();
    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    public void navigateBookAppointmentPage(String URL) {
        driver.manage().deleteAllCookies();
        visit(TestDataUtil.getValue(URL));
    }

    public boolean verifyBookAppointmentPage()
    {
        boolean blResult = false;
        try
        {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntBookApptxt);
            blResult = verifyElement(elmntBookApptxt);
        }
        catch(Exception e)
        {
            System.out.println("Book Appointment Heading is not showing >>>");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean verifyBookAppointmentPageFields(List<String> strParaTextDetails, List<String> strStrongTextDetails,List<String> strSpanTextDetails,List<String> strMatLabelDetails) {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false;
        boolean blResult5 = false, blResult6 = false;

        try
        {
            for (String strDetails: strParaTextDetails)
            {
                WebElement elmntParaTextDetails = waitForElement(By.xpath(ptxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("Para Text Name:" + strDetails);
                blResult = verifyElement(elmntParaTextDetails);
            }

            waitForElement(elmntClinicLogo);
            blResult1 = verifyElement(elmntClinicLogo);

            waitForElement(elmntbytxt);
            blResult6 = verifyElement(elmntbytxt);

            for (String strDetails1: strStrongTextDetails)
            {
                WebElement elmntStrongTextDetails = waitForElement(By.xpath(strongtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails1))));
                System.out.println("Strong Text Name:" + strDetails1);
                blResult2 = verifyElement(elmntStrongTextDetails);
            }

            for (String strDetails2: strSpanTextDetails)
            {
                WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails2))));
                System.out.println("Span Text Name:" + strDetails2);
                blResult3 = verifyElement(elmntSpanTextDetails);
            }

            for (String strDetails3: strMatLabelDetails)
            {
                WebElement elmntMatLabelDetails = waitForElement(By.xpath(matlabeltxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails3))));
                System.out.println("Mat Label Name:" + strDetails3);
                blResult4 = verifyElement(elmntMatLabelDetails);
            }

            waitForElement(elmntCalendarIcon);
            blResult5 = verifyElement(elmntCalendarIcon);


        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("All fields is not showing >>>>");
        }
        return blResult && blResult1 && blResult2 && blResult3 && blResult4 && blResult5 && blResult6;
    }


    public boolean selectAppointmentType() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(10);
            waitForElement(elmntapptypecombobox);
            jsClick(elmntapptypecombobox);
            waitForElement(elmntapptypevalue);
            click(elmntapptypevalue);
            blResult = true;
        } catch (Exception e) {
            System.out.println("AppointmentType Dropdown is not showing");
            e.printStackTrace();
        }
        return blResult;
    }
        public boolean selectAppointmentTime()
        {
            boolean blResult = false;
            try {
                waitForSeconds(10);
                if(verifyElement(elmntnextavailabletxt))
                {
                    click(elmntnextavailabletxt);
                    waitForSeconds(10);
                    List<WebElement> lstAvailableSlots = driver.findElements(By.xpath("//div[@class = 'mat-chip-list-wrapper']//mat-chip[@aria-disabled = 'false']"));
                    lstAvailableSlots.size();
                    System.out.println("Available Slots:" + lstAvailableSlots);
                    strSlotDate = lstAvailableSlots.get(6).getText().trim();
                    System.out.println("Slot Date:"+ strSlotDate);
                    waitAndClick(lstAvailableSlots.get(6));
                    blResult = true;
                }
                else
                {
                    List<WebElement> lstAvailableSlots = driver.findElements(By.xpath("//div[@class = 'mat-chip-list-wrapper']//mat-chip[@aria-disabled = 'false']"));
                    lstAvailableSlots.size();
                    System.out.println("Available Slots:" + lstAvailableSlots);
                    strSlotDate = lstAvailableSlots.get(10).getText().trim();
                    System.out.println("Slot Date:"+ strSlotDate);
                    waitAndClick(lstAvailableSlots.get(10));
                    blResult = true;
                }
            } catch (Exception e) {
                System.out.println("Appointment Slot is not showing");
                e.printStackTrace();
            }
            return blResult;
        }

    public boolean verifyBookAppPatientDetailsPage(List<String> strParaTextDetails, List<String> strStrongTextDetails,List<String> strSpanTextDetails,List<String> strMatLabelDetails) {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false;
        boolean blResult5 = false, blResult6 = false;

        try
        {
            for (String strDetails: strParaTextDetails)
            {
                WebElement elmntParaTextDetails = waitForElement(By.xpath(ptxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("Para Text Name:" + strDetails);
                blResult = verifyElement(elmntParaTextDetails);
            }

            waitForElement(elmntfirstfeetxt);
            blResult1 = verifyElement(elmntfirstfeetxt);

            waitForElement(elmntsecondfeetxt);
            blResult6 = verifyElement(elmntsecondfeetxt);

            for (String strDetails1: strStrongTextDetails)
            {
                WebElement elmntStrongTextDetails = waitForElement(By.xpath(strongtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails1))));
                System.out.println("Strong Text Name:" + strDetails1);
                blResult2 = verifyElement(elmntStrongTextDetails);
            }

            for (String strDetails2: strSpanTextDetails)
            {
                WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails2))));
                System.out.println("Span Text Name:" + strDetails2);
                blResult3 = verifyElement(elmntSpanTextDetails);
            }

            for (String strDetails3: strMatLabelDetails)
            {
                WebElement elmntMatLabelDetails = waitForElement(By.xpath(matlabeltxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails3))));
                System.out.println("Mat Label Name:" + strDetails3);
                blResult4 = verifyElement(elmntMatLabelDetails);
            }

            waitForElement(elmntareyouexistingcheckbox);
            blResult5 = verifyElement(elmntareyouexistingcheckbox);


        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("All Book Appointment Patient page fields is not showing >>>>");
        }
        return blResult && blResult1 && blResult2 && blResult3 && blResult4 && blResult5 && blResult6;
    }

    public boolean verifyBookAppPatientCofirmationDetailsPage(List<String> strParaTextDetails, List<String> strMatSubtitleDetails, List<String> strStrongTextDetails,List<String> strSpanTextDetails) {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false, blResult4 = false;
        boolean blResult5 = false;

        try
        {
            for (String strDetails: strParaTextDetails)
            {
                WebElement elmntParaTextDetails = waitForElement(By.xpath(ptxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("Para Text Name:" + strDetails);
                blResult = verifyElement(elmntParaTextDetails);
            }

            for (String strDetails3: strMatSubtitleDetails)
            {
                WebElement elmntMatSubTitleDetails = waitForElement(By.xpath(matcardsubtitletxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails3))));
                System.out.println("Mat Label Name:" + strDetails3);
                blResult4 = verifyElement(elmntMatSubTitleDetails);
            }

            for (String strDetails1: strStrongTextDetails)
            {
                WebElement elmntStrongTextDetails = waitForElement(By.xpath(strongtxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails1))));
                System.out.println("Strong Text Name:" + strDetails1);
                blResult2 = verifyElement(elmntStrongTextDetails);
            }

            for (String strDetails2: strSpanTextDetails)
            {
                WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails2))));
                System.out.println("Span Text Name:" + strDetails2);
                blResult3 = verifyElement(elmntSpanTextDetails);
            }

            waitForElement(elmntfirstfeetxt);
            blResult1 = verifyElement(elmntfirstfeetxt);

            waitForElement(elmntareyouexistingcheckbox);
            blResult5 = verifyElement(elmntareyouexistingcheckbox);


        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("All Book Appointment Patient Confirmation page fields is not showing >>>>");
        }
        return blResult && blResult1 && blResult2 && blResult3 && blResult4 && blResult5;
    }


    public boolean clickConfirmButton()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntconfirmenabledbtn);
            verifyElement(elmntconfirmenabledbtn);
            click(elmntconfirmenabledbtn);
            blResult = true;
        }catch (Exception e)
        {
         e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyBookAppointmentSuccessMessage()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForElement(elmntbookappsuccessmessage1);
            blResult = verifyElement(elmntbookappsuccessmessage1);
            waitForElement(elmntbookappsuccessmessage2);
            blResult1 = verifyElement(elmntbookappsuccessmessage2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return blResult && blResult1;
    }

    public boolean verifyProceedToPaymentDisabled()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntproceedpaymentdisabledbtn);
            if(verifyElement(elmntproceedpaymentdisabledbtn))
            {
                blResult = true;
            }
            else if(verifyElement(elmntproceedpaymentenabledbtn))
            {
                blResult = false;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return blResult;
    }



    public boolean verifyConfirmDisabledButton()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntconfirmdisabledbtn);
            if(verifyElement(elmntconfirmdisabledbtn))
            {
                blResult = true;
            }
            else if(verifyElement(elmntconfirmenabledbtn))
            {
                blResult = false;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean enterPatientDetails(List<String> strPatientFields, List<String> strPatientData)
    {
        boolean blResult = false;
        int i = 0;

        try {
            for (String strFields : strPatientFields)
            {
                WebElement elmntMatLabelTextDetails = waitForElement(By.xpath(inputdataplaceholdertxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strFields)).replace("<<REPLACEMENT1>>", TestDataUtil.getValue(strFields))));
                elmntMatLabelTextDetails.clear();
                String MatLabelTextData = TestDataUtil.getValue(strPatientData.get(i));
                System.out.println("Mat-Label Field Name:" + strFields);
                System.out.println("Mat-Label Data Name:" + strPatientData.get(i));
                enterValue(elmntMatLabelTextDetails,MatLabelTextData);
                i = i+1;
            }
            if(i==strPatientData.size()-1)
            {
                blResult = true;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("All Patient Data entered: >>>>");
        }

        return blResult;
    }

    public boolean verifyInformationMessage()
    {
        boolean blResult = false, blResult1 = false, blResult2 = false, blResult3 = false;
        try
        {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntinformationheadingtxt);
            blResult = verifyElement(elmntinformationheadingtxt);
            waitForElement(elmntinformationmessagetxt);
            blResult1 = verifyElement(elmntinformationmessagetxt);
            waitForElement(elmntokbtn);
            blResult2 = verifyElement(elmntokbtn);
            click(elmntokbtn);
            waitForElement(elmntbookappmainpagetxt);
            blResult3 = verifyElement(elmntbookappmainpagetxt);

        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Information Popup is not showing >>>");
        }
        return blResult && blResult1 && blResult2 && blResult3;
    }

    public boolean clickCreditCardOption()
    {
        boolean blResult = false;
        try
        {
            waitForElement(elmntcreditcardoption);
            verifyElement(elmntcreditcardoption);
            blResult = click(elmntcreditcardoption);

        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Credit Card Option is not displayed >>>");
        }
        return blResult;
    }

    public boolean selectPayLaterOption()
    {
        boolean blResult = false;
        try
        {
            verifyElement(elmntpaylateroption);
            waitForElementClickable(elmntpaylateroption);
            blResult = click(elmntpaylateroption);
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Pay Later Option is not showing");
        }
        return blResult;
    }




}
