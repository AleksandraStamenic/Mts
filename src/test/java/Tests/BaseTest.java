package Tests;

import Pages.BasePage;
import Pages.HomePage;
import Pages.MtsMeni;
import org.openqa.selenium.chrome.ChromeDriver;

public  abstract class BaseTest {


    public void clickMtsMeni(ChromeDriver driver){
        BasePage page= new BasePage();
        clickMtsMeni(driver);

    }

    public HomePage clickonmtsMeni(ChromeDriver driver){
        BasePage basePage=new BasePage(driver);
        clickMtsMeni(driver);
        return new HomePage(driver);


}

}
