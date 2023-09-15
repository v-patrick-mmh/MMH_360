package cap.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
public class BrowserHandlerUtil {
    public static void AllowCameraPopupChrome() throws InterruptedException, MalformedURLException {

            // Configure ChromeOptions to pass a fake media stream
            ChromeOptions options = new ChromeOptions();
            options.addArguments("use-fake-device-for-media-stream");
            options.addArguments("use-fake-ui-for-media-stream");
            WebDriver driver = new ChromeDriver(options);
            driver.quit();

        }

}

