package myprojects.automation.lection3.tests;

import myprojects.automation.lection3.pages.DashboardPage;
import myprojects.automation.lection3.pages.LoginPage;
import myprojects.automation.lection3.utils.BaseTest;
import org.openqa.selenium.WebDriver;


public class MyTest extends BaseTest {

    public static void main(String[] args) {
        WebDriver driver = getDriver();

        LoginPage loginPage = new LoginPage(driver);


        loginPage.open();

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loginPage.fillEmailInput();
        loginPage.fillPasswordInput();
        loginPage.clickLoginButton();

        DashboardPage dashboardPage = new DashboardPage(driver);

        dashboardPage.clickLogoutImage();
        dashboardPage.clickLogoutButton();


        quitDriver(driver);
    }
}
