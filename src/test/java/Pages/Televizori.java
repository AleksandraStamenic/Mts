package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class Televizori  extends BasePage{
    ChromeDriver driver;
    String TelevizoriUrl = "https://mts.rs/oec/lista-tv-uredjaja/mts-tv-paketi/plus-mts-tv-paket";

    public Televizori (ChromeDriver driver){
        super(driver);
        driver.get(TelevizoriUrl);
        this.driver=driver;
    }

    public ArrayList<WebElement> getlistOfTv() {
        ArrayList<WebElement> listOfTv = new ArrayList<>(driver.findElementsByXPath("//*[@id=\"deviceListTemplateContainer\"]/li"));
        return listOfTv;
    }
    public ArrayList<String> getDeviceItem() {
        ArrayList<WebElement> listOfTv = new ArrayList<>(driver.findElementsByXPath("//*[@id=\"deviceListTemplateContainer\"]/li"));
        ArrayList<String> deviceItems = new ArrayList<>();
        for (int i = 0; i < listOfTv.size();i++) {
            String deviceItem = listOfTv.get(i).getText();
            deviceItems.add(deviceItem);
        }
        return deviceItems;


    }
    public String getDeviceItemofTv(WebElement product){


        return product.getText();



    }

    public Kupovina clickonKupiButton(){
        try {
            Thread.sleep(2000);
            String searchIconXpath = "//*[@id=\"submit-product-cart\"]";
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchIconXpath))).click();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Kupovina(driver);
    }
      //  driver.findElementByXPath("//*[@id=\"submit-product-cart\"]");
    }

