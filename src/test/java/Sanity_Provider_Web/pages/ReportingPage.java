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


public class ReportingPage extends BasePage {

    public ReportingPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    @FindBy(how = How.XPATH, using = "//span[text() = 'Reporting']")
    protected WebElement elmntreportingmenu;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Appointments list']")
    protected WebElement elmntappointmentlistmenu;

    @FindBy(how = How.XPATH, using = "(//h1[text() = 'Appointment list'])[1]")
    protected WebElement elmntapplisttxt;


    protected String matcardtitletxt = new StringBuilder().append("//mat-card-title[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String strongtxt = new StringBuilder().append("//strong[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String spantxt = new StringBuilder().append("//span[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String buttontxt = new StringBuilder().append("//button[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String matlabeltxt = new StringBuilder().append("//mat-label[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String ptxt = new StringBuilder().append("//p[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String htxt = new StringBuilder().append("//h1[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();
    protected String matcardsubtitletxt = new StringBuilder().append("//mat-card-subtitle[contains(text() , '").append("<<REPLACEMENT>>").append("')]").toString();

    protected String inputdataplaceholdertxt = new StringBuilder().append("//input[contains(@data-placeholder , '").append("<<REPLACEMENT>>").append("')] | ").append("//input[contains(@formcontrolname , '").append("<<REPLACEMENT1>>").append("')]").toString();
    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";


    public boolean verifyAndClickReportingMenu()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForElement(elmntreportingmenu);
            blResult = verifyElement(elmntreportingmenu);
            waitForElementClickable(elmntreportingmenu);
            blResult1 = click(elmntreportingmenu);
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Reporting Menu is not showing: ...");
        }
        return blResult && blResult1;
    }


    public boolean verifyAndClickAppointmentListMenu()
    {
        boolean blResult = false, blResult1 = false;
        try
        {
            waitForElement(elmntappointmentlistmenu);
            blResult = verifyElement(elmntappointmentlistmenu);
            waitForElementClickable(elmntappointmentlistmenu);
            blResult1 = click(elmntappointmentlistmenu);
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Appointment List Menu is not showing: ...");
        }
        return blResult && blResult1;
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

    public boolean verifyAppointmentListSearchFields(List<String> strMatLabelDetails, List<String> strSpanTextDetails, List<String> strButtonTextDetails) {
        boolean blResult = false, blResult1 = false, blResult2 = false;
        try
        {
            for (String strDetails: strMatLabelDetails)
            {
                WebElement elmntMatLabelTextDetails = waitForElement(By.xpath(matlabeltxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("Mat Label Text Name:" + strDetails);
                blResult = verifyElement(elmntMatLabelTextDetails);
            }


            for (String strDetails1: strSpanTextDetails)
            {
                WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails1))));
                System.out.println("Span Text Name:" + strDetails1);
                blResult1 = verifyElement(elmntSpanTextDetails);
            }

            for (String strDetails2: strButtonTextDetails)
            {
                WebElement elmntButtonTextDetails = waitForElement(By.xpath(buttontxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails2))));
                System.out.println("Button Text Name:" + strDetails2);
                blResult2 = verifyElement(elmntButtonTextDetails);
            }

        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("All Appointment List page fields is not showing >>>>");
        }
        return blResult && blResult1 && blResult2;
    }

    public boolean verifyAppointmentListResultFields(List<String> strSpanTextDetails) {
        boolean blResult = false;
        try
        {
            for (String strDetails: strSpanTextDetails)
            {
                WebElement elmntSpanTextDetails = waitForElement(By.xpath(spantxt.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strDetails))));
                System.out.println("Span Text Name:" + strDetails);
                blResult = verifyElement(elmntSpanTextDetails);
            }

        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("All Appointment List page fields is not showing >>>>");
        }
        return blResult;
    }



}