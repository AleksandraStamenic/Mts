package Tests;

import Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Televizori extends BaseTest{

    @Test
    public void testTelevizori() {
        ChromeDriver driver=new ChromeDriver();
        HomePage mtsMeni=new HomePage(driver);
        mtsMeni.clickonMeniItem();
        mtsMeni.clickonUredjajiButton();
        mtsMeni.clickonPonudaUredjajaButton();
        mtsMeni.clickonTelevizoriButton();

    }
}
