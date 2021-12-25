package Pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class HomePage extends BasePage {
    String homePageUrl = "https://mts.rs/";
    String sectionXpath = "//section[@class = 'product-list--featured']";

    @FindBy (xpath = "(//*[@class='main-nav-tab js-nav-first-level-btn'])[3])")
    private WebElement boxMenuItem;

    @FindBy (xpath = "(//*[@class='second-level-nav-btn js-nav-dropdown-btn'])[3]")
    private WebElement box4;

    @FindBy (className = "hamburger-box")
    public WebElement mtsMeni;

    @FindBy (className = "main-navigation-mobile-wrapper")
    public WebElement Proizvodi;



    public HomePage(ChromeDriver driver) {
        super(driver);
        driver.get(homePageUrl);

    }
    public MtsMeni clickonMeniItem(){
        BasePage mtsMeni = new BasePage();
        mtsMeni.click();
        return new MtsMeni(driver);


    }


    public MtsMeni clickonMtsMeniItem() {
        MtsMeni mtsMeni;click();
        return new MtsMeni(driver);
    }
    public Box clickonBox(){
        Box box;click();
        return new Box(driver);
    }
    public Box4 clickonBox4(){
        Box4 box4;click();
        return new Box4(driver);

    }
    public ArrayList<WebElement> getlistofProducts() {
        ArrayList<WebElement> proizvodi = new ArrayList<>(driver.findElements(By.xpath("//*[@class='main-navigation-mobile-wrapper']")));
        return proizvodi;
}
}
