package Tests;

import Pages.BasePage;
import Pages.HomePage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMts {
    @Test
    public void testOpenMts(){
        ChromeDriver driver=new ChromeDriver();
        HomePage homePage=new HomePage(driver);
        driver.manage().window().maximize();
        driver.quit();



    }


    }

