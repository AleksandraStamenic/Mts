package Tests;

import Pages.HomePage;
import Pages.MtsMeni;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Box4Meni {
    @Test
    public void testBox4Meni(){
        ChromeDriver driver=new ChromeDriver();
        HomePage homePage=new HomePage(driver);
        MtsMeni box=homePage.clickonboxMenuItem();





    }
}
