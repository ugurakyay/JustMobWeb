package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;
import test.automation.framework.config.ConfigReader;
import test.automation.framework.pageobject.PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class bookPageObject extends PageObject {


    private WebElement clientDropDown;

    @Override
    public void navigateTo() {
        browser.get(ConfigReader.getInstance().getHost());
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void BookMob(String email) throws InterruptedException {
        browser.findElement(By.id("funnel-button")).click();

        //How often do you need your cleaner? 3 hours
        browser.findElements(By.className("desktop-attribute")).get(0).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"duration\"]/ul/li[2]")).click();
        Thread.sleep(2000);

        //How many cleaners do you need? 2
        browser.findElements(By.className("desktop-attribute")).get(1).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"number_of_cleaners\"]/ul/li[2]")).click();
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("body > div.wrapper > div:nth-child(2) > div > div.checkout-form > div.form-area > div.wizard-form > div.panel.wizard.active > div.panel-body > div.form-group.slider-buttons > div")).click();
        Thread.sleep(5000);

        //2 May 2019
        browser.findElement(By.xpath("//*[@id=\"next-month\"]")).click();
        Thread.sleep(4000);
        browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/ul/li[5]")).click();
        Thread.sleep(3000);
        browser.findElement(By.cssSelector("body > div.wrapper > div:nth-child(2) > div > div.checkout-form > div.form-area > div.wizard-form > div.panel.wizard.active > div.panel-body > div.form-group.slider-buttons > div.half-quater > div")).click();

        browser.findElement(By.id("create_account_name")).sendKeys("Akyay");
        browser.findElement(By.id("create_account_phone")).sendKeys("586623204");
        browser.findElement(By.id("create_account_email")).sendKeys(email);
        browser.findElement(By.id("create_account_password")).sendKeys("123456");
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"create_account_city\"]/div[1]")).click();
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"create_account_city\"]/div[2]/ul/li[2]")).click();
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"create_account_region\"]")).click();
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"create_account_region\"]/div[2]/ul/li[2]")).click();
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"create_account_address\"]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"create_account_address\"]")).sendKeys("Adres deneme deneme");
        Thread.sleep(3000);
        browser.findElement(By.cssSelector("body > div.wrapper > div:nth-child(2) > div > div.checkout-form > div.form-area > div.wizard-form > div.panel.wizard.active > div.panel-body > div.checkout-login.active > div.checkout-form-register > form > div.form-group.slider-buttons > div.half-quater > div")).click();
        Thread.sleep(3000);


        browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_number\"]")).sendKeys("4242424242424242");
        browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_month\"]")).sendKeys("08");
        browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_year\"]")).sendKeys("2021");
        browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_cvc\"]")).sendKeys("100");
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("body > div.wrapper > div:nth-child(2) > div > div.checkout-form > div.form-area > div.wizard-form > div.panel.wizard.active > div.panel-body > div > div.form-group.slider-buttons > div.half-quater > div")).click();
        Thread.sleep(3000);

        WebElement promocode = browser.findElement(By.xpath("//*[@id=\"promo_code\"]")).getText();
        System.out.println("user promo code: "+ promocode.getAttribute());

        System.out.println();






    }
    }



