package Tests;

import Pages.HomePage;
import Pages.Kupovina;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Televizori extends BaseTest{

    @Test
    public void testTelevizori() {
        ChromeDriver driver=new ChromeDriver();
        HomePage mtsMeni=new HomePage(driver);
        mtsMeni.clickonMeniItem();
        mtsMeni.clickonUredjajiButton();
        mtsMeni.clickonPonudaUredjajaButton();
        Pages.Televizori televizori=mtsMeni.clickonTelevizoriButton();
        ArrayList<String>listaTv=televizori.getDeviceItem();
        for (int i=0;i<listaTv.size();i++){
            if (listaTv.get(i).contains("UE55TU7022KXXH")){
                televizori.getlistOfTv().get(i).click();
            }
        }
        televizori.clickonKupiButton();
        Kupovina kupovina = new Kupovina(driver);
        kupovina.clickonNastaviButton();
        driver.findElementByXPath("//*[@id=\"jmbg-login\"]/div/form/div[1]/input").sendKeys("0406989865044");


    }
}
