import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GooglePage;
import pages.NewsPage;
import pages.SearchPage;

public class TestBase {
    WebDriver driver;
    String baseURL = "https://google.com";
    GooglePage googlePage;
    SearchPage searchPage;
    NewsPage newsPage;


    @Before
    public void setupSystem() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        googlePage = PageFactory.initElements(driver, GooglePage.class);
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        newsPage = PageFactory.initElements(driver, NewsPage.class);
        driver.get(baseURL);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement agree = driver.findElement(By.id("introAgreeButton"));
        agree.click();

    }

    @After
    public void teardown() {
        driver.quit();
        }

}
