package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class UserIcon extends BasePage{
    ChromeDriver driver;
    String UserIconUrl = "https://moj.mts.rs/Prijava-b2c";

    public UserIcon (ChromeDriver driver){
        super(driver);
        driver.get(UserIconUrl);
        this.driver=driver;
    }


}
