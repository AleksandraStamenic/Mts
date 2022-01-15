package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Televizori  extends BasePage{
    ChromeDriver driver;
    String TelevizoriUrl = "https://mts.rs/oec/lista-tv-uredjaja/mts-tv-paketi/plus-mts-tv-paket";

    public Televizori (ChromeDriver driver){
        super(driver);
        driver.get(TelevizoriUrl);
        this.driver=driver;
    }
}
