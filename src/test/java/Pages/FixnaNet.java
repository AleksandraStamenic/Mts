package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class FixnaNet extends BasePage {
    public FixnaNet(ChromeDriver driver){
        super(driver);
    }
    public FixnaNet clickonFixnaNet(){
        fixnaNet.click();
        return new FixnaNet(driver);
    }


}
