package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy (xpath = "//a[contains(text(),'Wiadomości')]")
    WebElement newsButton;

    public void goToNews(){
        newsButton.click();
    }
}
