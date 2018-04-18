package myprojects.automation.lection3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By logoutImage = By.cssSelector("");
    private By logoutButton = By.id("");
    private By ordersTab = By.id("");

    public DashboardPage (WebDriver driver) {this.driver = driver;}

    public void clickLogoutImage(){
        driver.findElement(logoutImage).click();
    }
    public void clickLogoutButton() {driver.findElement(logoutButton).click();}
}
