package Tests;

import Pages.HomePage;
import Pages.Telefoni;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class FilterTelefoni extends BaseTest {

    @Test
    public void testFilterTelefoni() {

        ChromeDriver driver = new ChromeDriver();
        HomePage mtsMeni = new HomePage(driver);
        mtsMeni.clickonMeniItem();
        mtsMeni.clickonUredjajiButton();
        mtsMeni.clickonPonudaUredjajaButton();
        mtsMeni.clickonTelefoniButton();
        mtsMeni.clickonFilterButton();
        Telefoni apple = mtsMeni.clickonAppleButton();

        driver.quit();
    }
    






    }





