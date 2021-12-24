package Tests;

import Pages.BasePage;
import Pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;

public  abstract class BaseTest {


    public HomePage clickMtsMeni(ChromeDriver driver){
        BasePage page= new BasePage(driver);
        clickMtsMeni(driver);
        return new HomePage(driver);


        }


}
