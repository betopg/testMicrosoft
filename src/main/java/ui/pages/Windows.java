package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.List;

public class Windows {

    @FindBy(xpath = ".//button[contains(text(),'Windows 10')]")
    private WebElement Windows10Button;

    @FindBy(xpath = ".//button[contains(text(),'Computers')]")
    private Button ComputersButton;

   @FindBy(xpath = ".//span[contains(text(),'Search Microsoft.com')]")
   private WebElement SearchButton;

    @FindBy(xpath = ".//input[@type='search']")
    private WebElement SearchInput;

    public void clickOnWindowsMenu() {
        Windows10Button.click();
    }


    public void searchFor(String input){
        SearchButton.click();
        SearchInput.sendKeys(input);
        SearchButton.click();
    }
}
