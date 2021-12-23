package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MtsMeni extends BasePage{

    @FindBy (xpath = "(//*[@class='second-level-nav-btn js-nav-dropdown-btn'])[3]")
    private WebElement boxMenuItem;

    public MtsMeni(ChromeDriver driver) {
        super(driver);
    }

    public Box clickOnBoxMenuItem() {
        boxMenuItem.click();
        return new Box(driver);
    }




}