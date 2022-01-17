package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Telefoni extends BasePage {
    ChromeDriver driver;
    String TelefoniUrl = "https://mts.rs/oec/lista-mobilnih-uredjaja/postpejd-tarife/omorika-6?filters=YXR0ciU1QjE2NiU1RCU1QjgwNSU1RCUzREFwcGxlJTNEdW5kZWZpbmVk";

    public Telefoni(ChromeDriver driver) {
        super(driver);
        driver.get(TelefoniUrl);
        this.driver = driver;
    }}








