package Tests;

import Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

public class Telefoni extends BaseTest{
    @Test
    public void testTelefoni(){
        ChromeDriver driver=new ChromeDriver();
        HomePage mtsMeni=new HomePage(driver);
        mtsMeni.clickonMeniItem();
        mtsMeni.clickonSearchButton();
        mtsMeni.searchByText("Iphone");
    }

}
