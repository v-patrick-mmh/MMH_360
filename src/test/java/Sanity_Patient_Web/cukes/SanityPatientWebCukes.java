package Sanity_Patient_Web.cukes;

import cap.utilities.TestDataUtil;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

import static Sanity_Patient_Web.pages.CheckInPage.*;

@CucumberOptions(features = {"src/test/resources/features/Sanity_Patient_Web"},
        monochrome = true,
        tags = "@CHECK",
        glue = {"Sanity_Patient_Web", "Sanity_Provider_Web"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json"

        })


public class SanityPatientWebCukes extends AbstractTestNGCucumberTests {

    @AfterClass
    public void teardown() {
        ExtentService.getInstance().setSystemInfo("Application Name", " MMH 360 Feature Development");
        ExtentService.getInstance().setSystemInfo("Application URL", TestDataUtil.getValue("&URL&"));
        ExtentService.getInstance().setSystemInfo("Execution Build", strAppVersion);
        ExtentService.getInstance().setSystemInfo("Operating System", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Execution Browser", strBrowserName);
        ExtentService.getInstance().setSystemInfo("Browser Version", strBrowserVersion);
        ExtentService.getInstance().setSystemInfo("Execution Machine", strSystemName);
        ExtentService.getInstance().setSystemInfo("Automation QA", System.getProperty("user.name"));


    }
}





//    clean test -Dapp=Sanity -Dexecution_type=browser -Drunner=DemoWebCukes -Dbrowser_name=chrome -Denv=PROD "-DargLine=-Dextent.reporter.spark.out=reports/Extent-Report/Web-QAResults.html -Dsysteminfo.AppName=Demo-QA"


