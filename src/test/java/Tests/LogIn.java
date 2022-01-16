package Tests;

import Pages.HomePage;
import Pages.UserIcon;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn extends BaseTest{
    @Test

    public void testLogIn(){
        ChromeDriver driver=new ChromeDriver();
        HomePage mtsMeni=new HomePage(driver);
        mtsMeni.clickonUserIcon();

    }
     @Test

     public void InvalidLogin(){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://moj.mts.rs/Prijava-b2c");

        driver.findElementByXPath("//*[@id=\"selfCareComponent\"]/section/section/div[3]/form[1]/label[1]/input").sendKeys("alex@gmail.com");
        driver.findElementByXPath("//*[@id=\"selfCareComponent\"]/section/section/div[3]/form[1]/label[2]").sendKeys("Password");
        driver.findElementByXPath("//*[@id=\"pass-input16\"]/span").click();
        driver.findElementByXPath("//*[@id=\"selfCareComponent\"]/section/section/div[3]/form[1]/div/button").click();
        String actual_error=driver.findElementByXPath("//*[@id=\"origamiPageWrap\"]/div[6]").getText();
        String expected_error="Uneti podaci nisu ispravni.";
        if (actual_error.equals(expected_error)){
            System.out.println("TRUE");
        }


     }}
