package pageobjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import test.automation.framework.config.ConfigReader;
import test.automation.framework.pageobject.PageObject;

public class ContactFormPageObject extends PageObject {

    @Override
    public void navigateTo() { browser.get(ConfigReader.getInstance().getHost()); }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void contact (String email, ConfigReader instance) throws InterruptedException{
    //contactform
    browser.findElement(By.id("create_account_name")).sendKeys("Akyay");
    browser.findElement(By.id("create_account_phone")).sendKeys("586623204");
    browser.findElement(By.id("create_account_email")).sendKeys("ugur"+"akyay"+ RandomStringUtils.random(999)+"@yobmail.com");
    browser.findElement(By.id("create_account_password")).sendKeys("123456");
    Thread.sleep(4000);
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

    }

}
