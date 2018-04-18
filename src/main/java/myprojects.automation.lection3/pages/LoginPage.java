package myprojects.automation.lection3.pages;


import myprojects.automation.lection3.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import java.nio.ByteOrder;
import java.util.List;

//import java.util.Properties;

public class LoginPage {
    private WebDriver driver;
    private By emailInput = By.xpath("//input[@name='email']");
    private By passwordInput = By.id("passwd");
    private By loginBtn = By.name("submitLogin");
    private String email = "webinar.test@gmail.com";
    private String password = "Xcg7299bnSmMuRLp9ITw";

    public LoginPage(WebDriver driver) {this.driver = driver;}

    public void open() {driver.get(Properties.getBaseAdminUrl());}

    public void fillEmailInput() {driver.findElement(emailInput).sendKeys(email);}

    public void fillPasswordInput() {driver.findElement(passwordInput);}


    public void clickLoginButton() {driver.findElement(loginBtn).click();}

}
