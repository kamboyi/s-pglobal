package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {

    private static WebDriver driver;
    //private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://dotnetfiddle.net/");
        homePage = new HomePage(driver);
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

  /*  public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    } */
}
