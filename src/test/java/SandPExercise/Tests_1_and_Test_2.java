package SandPExercise;

import base.BaseTests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


public class Tests_1_and_Test_2 extends BaseTests {

    public static WebDriver driver;

    @Test
    public void test_1_ClickRunButton(){
         HomePage run = new HomePage(driver);
         run.clickRunButton();
         String actualText= "Output text is incorrect in Dom";
         String expectedText= "Hello World";
        Assert.assertEquals(homePage.checkOutPut(),expectedText,actualText);
    }

    @Test
    public void test_2_Letter_K_ShareButton(){
        HomePage share = new HomePage(driver);
        share.clickShareButton();
      /*  String actualText= "link starts with correct Url";
        String expectedText= "https://dotnetfiddle.net/";
        Assert.assertTrue() */
    }

}
