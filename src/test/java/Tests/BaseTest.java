package Tests;

import Pages.BasePage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public  abstract class BaseTest {
        ChromeDriver driver=new ChromeDriver();

        public void clickonSearchButton() {
        try {

            Thread.sleep(2000);
            String searchIconXpath = "//*[@id=\"main-header\"]/div[1]/ul/li[1]/span";
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchIconXpath))).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void searchByText(String searchText) {
        String inputXpath = "//*[@id=\"main-header\"]/div[1]/ul/li[1]/input";
        driver.findElementByXPath(inputXpath).sendKeys(searchText);
        driver.findElementByXPath(inputXpath).sendKeys(Keys.ENTER);

    }
        public void clickonMeniItem() {
            driver.findElementByXPath("//*[@id=\"main-header\"]/div[1]/div[2]/button").click();
        }




}


