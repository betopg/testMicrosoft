package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.pages.HomePage;
import utilities.base.TestBase;
import org.openqa.selenium.NoSuchElementException;

public class HomePageTest extends TestBase {

    HomePage homePage = new HomePage();

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void validateMicrosoft365IsPresent() {

        try {
            homePage.Microsoft365IsPresent();
            System.out.println("Element Exist");
        }catch(NoSuchElementException e) {
            System.out.println("Element not Exist");
        }
    }

    @Test
    public void validateOfficeIsPresent() {

        try {
            homePage.OfficeIsPresent();
            System.out.println("Element Exist");
        }catch(NoSuchElementException e) {
            System.out.println("Element not Exist");
        }
    }
    @Test
    public void validateWindowsIsPresent() {

        try {
            homePage.windowsIsPresent();
            System.out.println("Element Exist");
        }catch(NoSuchElementException e) {
            System.out.println("Element not Exist");
        }
    }

    @Test
    public void validateSurfaceIsPresent() {

        try {
            homePage.surfaceIsPresent();
            System.out.println("Element Exist");
        }catch(NoSuchElementException e) {
            System.out.println("Element not Exist");
        }
    }

    @Test
    public void validateXboxIsPresent() {

        try {
            homePage.xboxIsPresent();
            System.out.println("Element Exist");
        }catch(NoSuchElementException e) {
            System.out.println("Element not Exist");
        }
    }

    @Test
    public void validateDealsIsPresent() {

        try {
            homePage.dealsIsPresent();
            System.out.println("Element Exist");
        }catch(NoSuchElementException e) {
            System.out.println("Element not Exist");
        }
    }

    @Test
    public void validateSupportIsPresent() {

        try {
            homePage.supportIsPresent();
            System.out.println("Element Exist");
        }catch(NoSuchElementException e) {
            System.out.println("Element not Exist");
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
