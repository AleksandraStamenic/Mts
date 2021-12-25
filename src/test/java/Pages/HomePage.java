package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    String homePageUrl = "https://mts.rs/";

    @FindBy (xpath = "(//*[@class='main-nav-tab js-nav-first-level-btn'])[3])")
    private WebElement boxMenuItem;

    @FindBy (xpath = "(//*[@class='second-level-nav-btn js-nav-dropdown-btn'])[3]")
    private WebElement box4;

    @FindBy (className = "hamburger-box")
    public WebElement mtsMeni;



    public HomePage(ChromeDriver driver) {
        super(driver);
        driver.get(homePageUrl);

    }
    public MtsMeni clickonboxMenuItem(){
        boxMenuItem.click();
        return new MtsMeni(driver);


    }
}
