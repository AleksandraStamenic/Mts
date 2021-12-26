package Pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class HomePage extends BasePage {
    String homePageUrl = "https://mts.rs/";
    ChromeDriver driver;

    // @FindBy (xpath = "(//*[@class='main-nav-tab js-nav-first-level-btn'])[3])")
    //public WebElement boxMenuItem;

    // @FindBy (xpath = "(//*[@class='second-level-nav-btn js-nav-dropdown-btn'])[3]")
    //private WebElement box4;

    // @FindBy (xpath = "//*[@id=\"main-header\"]/div[1]/div[2]/button/span")
    //public WebElement mtsMeni;

    //  @FindBy (className = "main-navigation-mobile-wrapper")
    // public WebElement Proizvodi;

    public HomePage(ChromeDriver driver) {
        super(driver);
        driver.get(homePageUrl);
        this.driver = driver;

    }

    public void clickonMeniItem() {
        driver.findElementByXPath("//*[@id=\"main-header\"]/div[1]/div[2]/button").click();
    }

    public void clickonBoxMeniItem() {
        driver.findElementByXPath("(//*[@class=\"main-nav-tab js-nav-first-level-btn\"])[3]").click();
    }

    public void clickonBox4MeniItem() {
        driver.findElementByXPath("(//*[@class=\"second-level-nav-btn js-nav-dropdown-btn\"])[3]").click();
    }
    public FixnaNet clickonFixnaNet(){
        driver.findElementByXPath("//*[@id=\"main-header\"]/div[2]/div/ul/li[1]/nav/ul/li[3]/div/ul/li[2]/ul/li[1]/a").click();
        return new FixnaNet(driver);

    }

}
