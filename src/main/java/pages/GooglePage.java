package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
    @FindBy (name = "q")
    WebElement searchWindow;

    public void searchForText(String text){
        searchWindow.sendKeys(text);
        searchWindow.submit();
    }

}
