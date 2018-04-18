package myprojects.automation.lection3.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;




public abstract class BaseTest {
    public static WebDriver getDriver() {
        WebDriver driver;
        String browser = Properties.getBrowser();
        switch (browser) {
            case "firefox":
                System.setProperty(
                        "webdriver.gecko.driver",
                        new File(BaseTest.class.getResource("/geckodriver.exe").getFile()).getPath());
                        driver = new FirefoxDriver();
            case "ie":
            case "internet explorer":
                System.setProperty(
                        "webdriver.ie.driver",
                        new File(BaseTest.class.getResource("/IEDriverServer.exe").getFile()).getPath());
                driver = new InternetExplorerDriver();
            case "chrome":
                default:
                    System.setProperty(
                            "webdriver.chrome.driver",
                            new File(BaseTest.class.getResource("/chromedriver.exe").getFile()).getPath());
                    driver = new ChromeDriver();




        }

        driver.manage().window().maximize();
        return driver;
    }
    public static  void quitDriver(WebDriver driver) {driver.quit();}
}
