package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.pages.HomePage;
import ui.pages.Windows;
import utilities.base.TestBase;

public class WindowsTest extends TestBase {

    HomePage homePage = new HomePage();
    Windows windows = new Windows();

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void printAllWindows10Objects() {
        homePage.clickOnWindows();
        windows.clickOnWindowsMenu();


    }

    @Test
    public void shoppingCartSearch(){
        homePage.clickOnWindows();
        windows.searchFor("Visual Studio");
    }
}
