package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Proizvodi extends BasePage {
    public Proizvodi(ChromeDriver driver) {
        super(driver);
    }

    public ArrayList<WebElement> getlistofProducts() {
        ArrayList<WebElement> listOfProducts = new ArrayList<>(driver.findElementsByXPath("//*[@class='main-navigation-mobile-wrapper']"));
        return listOfProducts;
    }
}
