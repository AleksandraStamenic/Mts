package Pages;

import io.netty.handler.codec.spdy.SpdyHttpResponseStreamIdHandler;
import org.openqa.selenium.chrome.ChromeDriver;

public class FixnaNet extends BasePage {
    ChromeDriver   driver;
    String FixnaNetUrl = "https://mts.rs/Privatni/BOX/BOX-4/FIKSNA-NET-TV-MOB";

    public FixnaNet(ChromeDriver driver){
        super(driver);
        driver.get(FixnaNetUrl);
        this.driver=driver;
    }

}


