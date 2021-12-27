package Pages;

import Tests.Telefoni;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class HomePage extends BasePage {
    String homePageUrl = "https://mts.rs/";
    ChromeDriver driver;

    // @FindBy (xpath = "(//*[@class='main-nav-tab js-nav-first-level-btn'])[3])")
    //public WebElement boxMenuItem;

    // @FindBy (xpath = "(//*[@class='second-level-nav-btn js-nav-dropdown-btn'])[3]")
    //private WebElement box4;

    // @FindBy (xpath = "//*[@id=\"main-header\"]/div[1]/div[2]/button/span")
    //public WebElement mtsMeni;

    //  @FindBy (className = "main-navigation-mobile-wrapper")
    // public WebElement Proizvodi;

    public HomePage(ChromeDriver driver) {
        super(driver);
        driver.get(homePageUrl);
        this.driver = driver;

    }

    public void clickonMeniItem() {
        driver.findElementByXPath("//*[@id=\"main-header\"]/div[1]/div[2]/button").click();
    }

    public void clickonBoxMeniItem() {
        driver.findElementByXPath("(//*[@class=\"main-nav-tab js-nav-first-level-btn\"])[3]").click();
    }

    public void clickonBox4MeniItem() {
        driver.findElementByXPath("(//*[@class=\"second-level-nav-btn js-nav-dropdown-btn\"])[3]").click();
    }

    public FixnaNet clickonFixnaNet() {
        driver.findElementByXPath("//*[@id=\"main-header\"]/div[2]/div/ul/li[1]/nav/ul/li[3]/div/ul/li[2]/ul/li[1]/a").click();
        return new FixnaNet(driver);

    }




         public void clickonSearchButton() {
        // try/catch blok sluzi da pokusa da izvrsi neki deo koda, i da uhvati gresku ukoliko se desi,
        // kako ceo program ne bi pukao ukoliko dodje do greske (ovde je potrebno koristiti try/catch zbog Thread.sleep poziva
        try {
        // posto je mts meni exapndable, u prvom trenutku kada se klikne mts meni dugme, search ikonica nije na pravoj pozociji pa moramo
        // da sacekamo da se meni otvori do kraja
        // htela sam da napisem custom funkciju za to ali da ne komplikujemo kod previse i da vas ne zbunjujem, samo cu pozvati java built-in metodu
        // da kazem testu da saceka 2 sekunde pre nego sto nastavi izvrsavanje (to je dovoljno vremena da se otvori meni ali napomena
        // da ovo nije dobra praksa ali je ovde primenjeno zbog jednostavnosti)
        Thread.sleep(2000); // ovo je built-in metoda koja "kaze programu da saceka x sekundi pre nego sto izvrsi sledecu liniju koda
        String searchIconXpath = "//*[@id=\"main-header\"]/div[1]/ul/li[1]/span"; // izdvojila sam xpath u promenljivu da ga ne bi kopirala vise puta u kodu
        // ovo ispod (WebDriverWait) nije potrebno posto eksplicitno cekamo 2 sekunde, ali samo kao primer da moze i ovako da se ceka
        // recimo kad se stranica ucitava ili se nesto drugo desava, pa element nije odma clickable, moze da se pozove webdriverwait (u ovom slucaju ce cekati do 15 sec da element bude clickable
        // znaci ako je odma clickable, nece cekati, ali ce do 15 sekundi pokusavati da ceka, i da proba da klikne element
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchIconXpath))).click();
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }

/**
 * Ova metoda prima String text koji upisuje u search polje i zatim poziva search (simulira da je pritisnut enter)
 * @param searchText, String, text koji ce se upisati u search polje
 */
public void searchByText(String searchText) {
        String inputXpath = "//*[@id=\"main-header\"]/div[1]/ul/li[1]/input";
        driver.findElementByXPath(inputXpath).sendKeys(searchText); // prvo unosimo text u input polje
        driver.findElementByXPath(inputXpath).sendKeys(Keys.ENTER); // saljemo 'enter' dugme u polje da bi se pokrenula pretgraga

        // mozete da dodate return ili ako zelite nesto dalje da radite sa pretragom
        }}