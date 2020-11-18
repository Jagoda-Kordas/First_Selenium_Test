package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewsPage {
    @FindBy (xpath = "//div[@id=\"rso\"]/div")
    List<WebElement> newsList;

    public Integer countNews(){
        return newsList.size();
    }

    public void clickOnNewsNumber(Integer newsNumber){
        newsList.get(newsNumber).click();

    }



}
