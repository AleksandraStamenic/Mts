package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Box4 extends BasePage{
    @FindBy (xpath = "(//*[@class='second-level-nav-btn js-nav-dropdown-btn'])[3]")
    private WebElement box4MenuItem;

    public Box4(ChromeDriver driver) {
        super(driver);
    }
}
