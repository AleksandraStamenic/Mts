package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Kupovina extends BasePage{
    ChromeDriver driver;
    String KupovinaUrl="https://mts.rs/oec/identification";

    public Kupovina(ChromeDriver driver){
        super (driver);
        driver.get(KupovinaUrl);
        this.driver=driver;
    }
    public void  clickonNastaviButton(){
        driver.findElementByXPath("//*[@id=\"new-or-existing\"]/div/div[3]/button").click();
    }



}
