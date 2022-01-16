package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Telefoni extends BasePage {
    ChromeDriver driver;
    String TelefoniUrl = "https://mts.rs/oec/lista-mobilnih-uredjaja/postpejd-tarife/omorika-6";

    public Telefoni(ChromeDriver driver) {
        super(driver);
        driver.get(TelefoniUrl);
        this.driver = driver;
    }

        public ArrayList<String> getNamesOfPhones() {
            ArrayList<WebElement> listOfPhones = new ArrayList<>(driver.findElementByXPath("//*[@id=\"deviceListTemplateContainer\"]/li"));
            ArrayList<String> names = new ArrayList<>();
            for (int i = 0; i < listOfPhones.size(); i++) {
                String name = listOfPhones.get(i).getText();
                names.add(name);
            }
            return names;
        }
    }





