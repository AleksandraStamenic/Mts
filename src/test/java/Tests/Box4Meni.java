package Tests;

import Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;


public class Box4Meni extends BaseTest {
    @Test
    public void testMtsMeni() {
        ChromeDriver driver = new ChromeDriver();
        HomePage mtsMeni = new HomePage(driver);
        mtsMeni.clickonMeniItem();
        mtsMeni.clickonBoxMeniItem();
        mtsMeni.clickonBox4MeniItem();
        mtsMeni.clickonFixnaNet();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.quit();
    }
}
