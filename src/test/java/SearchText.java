import org.junit.Test;

public class SearchText extends TestBase {

    @Test
    public void shouldSearchForText(){
        googlePage.searchForText("virtual reality");
        searchPage.goToNews();
        System.out.println(newsPage.countNews());
        newsPage.clickOnNewsNumber(2);
        driver.navigate().back();
    }
}
