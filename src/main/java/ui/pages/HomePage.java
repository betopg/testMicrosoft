package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.base.TestBase;

public class HomePage extends TestBase {

        //PAGE FACTORY - OR
        @FindBy(xpath = "//a[contains(text(),'Microsoft 365')]")
        WebElement Microsoft365;

        @FindBy (xpath = "//a[contains(text(),'Office')]")
        WebElement Office;

        @FindBy (xpath = "//a[contains(text(),'Windows')]")
        WebElement Windows;

        @FindBy (xpath = "//a[contains(text(),'Surface')]")
        WebElement Surface;

        @FindBy (xpath = "//a[contains(text(),'Xbox')]")
        WebElement Xbox;

        @FindBy (xpath = "//a[contains(text(),'Deals')]")
        WebElement Deals;

        @FindBy (xpath = "//a[contains(text(),'Support')]")
        WebElement Support;

        //Creation of constructor to initialize all the web elements
        public HomePage() {
            PageFactory.initElements(driver, this);
        }

        //Actions

        public WebElement Microsoft365IsPresent(){
            return Microsoft365;
        }

        public WebElement OfficeIsPresent(){
        return Office;
        }

        public WebElement windowsIsPresent(){
            return Windows;
        }

        public WebElement surfaceIsPresent(){
            return Surface;
        }

        public WebElement xboxIsPresent(){
            return Xbox;
        }

        public WebElement dealsIsPresent(){
            return Deals;
        }

        public WebElement supportIsPresent(){
            return Support;
        }

    public void clickOnWindows() {
            Windows.click();
        }

}
