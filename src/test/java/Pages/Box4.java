package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Box4 extends BasePage{
    @FindBy (xpath = "(//*[@class='third-level-nav-link']) [3] ")
    private WebElement fixnaNet;

    public Box4(ChromeDriver driver) {
        super(driver);
    }
}
