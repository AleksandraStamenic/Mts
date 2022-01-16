package Tests;

import Pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

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


    }
}
