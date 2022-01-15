package Tests;

import Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn extends BaseTest{
    @Test

    public void testLogIn(){
        ChromeDriver driver=new ChromeDriver();
        HomePage mtsMeni=new HomePage(driver);
        mtsMeni.clickonUserIcon();



    }
}
