package Sanity_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static String strAppVersion;
    public static String strBrowserName;
    public static String strBrowserVersion;
    public static String strSystemName;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'LOG IN')]")
    protected WebElement elmntLoginBtn;



    @FindBy(how = How.XPATH, using = "//div[@class='row appVersion']/p")
    protected WebElement txtAppVersion;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Welcome, ')]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//mat-card-title[@class='mat-card-title mainheader web-display']//img")
    protected WebElement elmntCancelIcon;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Username']")
    protected WebElement txtBoxEmail;


    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Password']")
    protected WebElement txtBoxPassword;

    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement SignInBtn;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashBoard;

    @FindBy(how = How.XPATH, using = "//a//span[text() = 'Log out']")
    protected WebElement elmntlogoutbtn;

    @FindBy(how = How.XPATH, using = "(//img[@src='../../../assets/images/eye-outline-ds.svg\'])[1]")
    protected WebElement elmntwaitingroomeyeicon;

    @FindBy(how = How.XPATH, using = "//h5[text() = 'Waiting Room']")
    protected WebElement elmntwaitingroomsidebartxt;

    @FindBy(how = How.XPATH, using = "//mat-icon[text() = 'keyboard_arrow_down']")
    protected List<WebElement> elmntdropiconwaitingroom;

    @FindBy(how = How.XPATH, using = "//button[text() = ' REMOVE ']")
    protected WebElement elmntwaitingroomremovebtn;


    public void clickSignInButton() {
        waitForSeconds(3);
        if (verifyElement(SignInBtn)) {
            waitForElement(SignInBtn);
            jsClick(SignInBtn);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } else if (!verifyElement(SignInBtn)) {
            System.out.println("user already in the home page");
        }
    }

    public void visit() {
        driver.manage().deleteAllCookies();
        visit(TestDataUtil.getValue("&URL&"));
    }

    public void enterEmail(String strEmail) {
        waitForSeconds(5);
        waitForElementClickable(txtBoxEmail);
        enterValue(txtBoxEmail, strEmail);
    }

    public void enterpassword(String strPassword) {
        waitForElementClickable(txtBoxPassword);
        enterValue(txtBoxPassword, strPassword);
    }

    public boolean clickLoginButton() {
        boolean blResult = false;
        try {
            waitForElementClickable(elmntLoginBtn);
            click(elmntLoginBtn);
            driver.manage().deleteAllCookies();
            waitForSeconds(20);
            blResult = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


        public boolean clickLogout()
        {
            boolean blResult = false;
            try
            {
                waitForElement(elmntlogoutbtn);
                verifyElement(elmntlogoutbtn);
                click(elmntlogoutbtn);
                blResult = false;
            }catch(Exception e)
            {
                e.printStackTrace();
                System.out.println("Logout Button is not showing >>>");
            }

            return blResult;
        }

    public boolean verifyHomePageOfMMHPortal() {
        waitForSeconds(5);
        verifyElement(elmntCancelIcon);
        click(elmntCancelIcon);
        waitForElement(elmntVerifyHomePage);
        if (verifyElement(txtAppVersion)) {
            strAppVersion = txtAppVersion.getText();
            System.out.printf("TxtAPPVersion"+strAppVersion);
        }
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        strBrowserName = cap.getBrowserName();
        strBrowserVersion = cap.getVersion();
        try {
            strSystemName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return verifyElement(elmntVerifyHomePage);
    }


    public boolean clickDashBoard() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(8);
        jsScrollIntoView(elmntDashBoard);
        waitForElementClickable(elmntDashBoard);
        mouseClick(elmntDashBoard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        driver.navigate().refresh();
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        waitForElement(elmntVerifyHomePage);
        waitForSeconds(5);
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean clearAllWaitingRoomPatients() {
        boolean blResult = false;
        try
       {
        if (verifyElement(elmntwaitingroomeyeicon)) {
            click(elmntwaitingroomeyeicon);
            waitForElement(elmntwaitingroomsidebartxt);
            waitForSeconds(10);
            System.out.println("size:"+ (elmntdropiconwaitingroom.size() - 2));
            for (int i = 0; i < (elmntdropiconwaitingroom.size() - 2); i++) {
                click(elmntdropiconwaitingroom.get(i));
                waitForElement(elmntwaitingroomremovebtn);
                click(elmntwaitingroomremovebtn);
                waitForSeconds(3);
                blResult = true;
            }
        }
        else
        {
            blResult = true;
        }
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("validation Success: >>>");
        }
        return blResult;
    }





}



