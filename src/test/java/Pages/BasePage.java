package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public ChromeDriver driver;

  //  @FindBy (xpath = "//*[@id=\"main-header\"]/div[1]/div[2]/button/span")
    //public WebElement mtsMeni;


    //@FindBy (xpath = "//*[@class='main-nav-item js-main-nav-item '])[11]")
    //public WebElement boxButton;

    //@FindBy (xpath = "//*[@class='second-level-nav-btn js-nav-dropdown-btn'])[3]")
    //public WebElement box4Button;

    //@FindBy (xpath = "(//*[@class='third-level-nav-link']) [3] ")
    //public WebElement fixnaNet;

    // @FindBy (xpath = "(//*[@class='nav-footer-link'])[2]")
    // public WebElement privatniButton;

            public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    //public BasePage(ChromeDriver driver) {
        
    }


  //  protected void click() {


