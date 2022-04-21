package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By runButton =By.id("run-button");
    private By outputWindow = By.id("output");
    private By clickShare = By.id("Share");
    private By urlLink = By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div[1]/span/a[1]");

    public HomePage(WebDriver driver){
    this.driver = driver;
    }
    public void clickRunButton(){
    driver.findElement(runButton).click();
    }

    public String checkOutPut(){
        return driver.findElement(outputWindow).getText();
    }
    public void clickShareButton(){
    driver.findElement(clickShare).click();
    }
    public String ShareLinkStartsWith(){
        return driver.findElement(urlLink).getText();
    }

}
