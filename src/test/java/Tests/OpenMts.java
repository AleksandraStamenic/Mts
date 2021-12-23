package Tests;

import Pages.BasePage;
import Pages.HomePage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMts extends BasePage {

    @Test
    public HomePage clickOnHomePageUrl(ChromeDriver driver) {
        BasePage page= new BasePage(driver);
        page.mtsMeni.click();
        return new HomePage(driver);



    }


    public OpenMts(ChromeDriver driver) {
        super(driver);
    }
}
