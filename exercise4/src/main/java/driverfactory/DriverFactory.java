package driverfactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    // Download from: https://sites.google.com/a/chromium.org/chromedriver/downloads

    public ChromeDriver generateDriver(){
        String pathToChromeDriver = System.getProperty("user.dir") + "/src/main/java/driverfactory/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);

        return new ChromeDriver();
    }

}
