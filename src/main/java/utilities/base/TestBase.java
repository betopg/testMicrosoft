package utilities.base;
import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.testUtilities.TestUtilities;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;
    //To read the properties file

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C://Users/juanalbp/Documents/Project documentation/testMicrosoft/src/main/java/utilities/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Function that will initialize all the browsers
    public static void initialization() {
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C://Users/juanalbp/Documents/Project documentation/testMicrosoft/src/main/resources/webdriverservers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGE_LOAD_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }
}
