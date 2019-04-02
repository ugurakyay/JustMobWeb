package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

    public void BookMob() throws InterruptedException {
        browser.findElement(By.id("funnel-button")).click();

        //How often do you need your cleaner?
        browser.findElements(By.className("desktop-attribute")).get(0).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"duration\"]/ul/li[2]")).click();
        Thread.sleep(2000);

        //How many cleaners do you need?
        browser.findElements(By.className("desktop-attribute")).get(1).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"number_of_cleaners\"]/ul/li[2]")).click();
        Thread.sleep(1000);
        //browser.findElement(By.xpath("//*[@id=\"material\"]/div[2]")).click();
        //Thread.sleep(1000);
        browser.findElement(By.cssSelector("body > div.wrapper > div:nth-child(2) > div > div.checkout-form > div.form-area > div.wizard-form > div.panel.wizard.active > div.panel-body > div.form-group.slider-buttons > div")).click();
        Thread.sleep(1000);
        browser.findElement(By.cssSelector("#next-month > path")).click();

        Thread.sleep(1000);
        browser.findElement((By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/ul/li[19]"))).click();



        browser.findElement(By.className("btn btn-success btn-block slider-next-button")).click();
        browser.findElement(By.id("create_account_name")).sendKeys("ugur akyay");
        browser.findElement(By.id("create_account_phone")).sendKeys("5378340837");
        browser.findElement(By.id("create_account_email")).sendKeys("ugurakyay@gmail.com");
        browser.findElement(By.id("create_account_password")).sendKeys("123456");
        browser.findElement(By.xpath("//*[@id=\"create_account_city\"]/div[1]/svg")).click();
        browser.findElement(By.xpath("//*[@id=\"create_account_city\"]/div[2]/ul/li[3]")).click();
        browser.findElement(By.xpath("//*[@id=\"create_account_region\"]/div[1]/svg")).click();
        browser.findElement(By.xpath("//*[@id=\"create_account_region\"]/div[2]/ul/li[5]")).click();
        browser.findElement(By.id("create_account_address")).sendKeys("deneme deneme");
        browser.findElement(By.className("class=\"btn btn-success btn-block slider-next-button\"")).click();









    }
    }



