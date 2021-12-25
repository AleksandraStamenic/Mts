package Tests;

import Pages.Box;
import Pages.HomePage;
import Pages.MtsMeni;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Box4Meni extends BaseTest{
    @Test
    public void testBoxMeni(){
        ChromeDriver driver=new ChromeDriver();
        HomePage mtsMeni=new HomePage(driver);
        clickonmtsMeni(driver);














    }
}
