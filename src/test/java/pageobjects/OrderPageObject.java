package pageobjects;

import org.openqa.selenium.By;
import test.automation.framework.config.ConfigReader;
import test.automation.framework.pageobject.PageObject;

public class OrderPageObject extends PageObject {


    @Override
    public void navigateTo() {browser.get(ConfigReader.getInstance().getHost());

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void orderMob () throws InterruptedException {

        browser.findElement(By.id("funnel-button")).click();

        //How often do you need your cleaner? 3 hours
        browser.findElements(By.className("desktop-attribute")).get(0).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"duration\"]/ul/li[5]")).click();
        Thread.sleep(2000);

        //How many cleaners do you need? 2
        browser.findElements(By.className("desktop-attribute")).get(1).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"number_of_cleaners\"]/ul/li[2]")).click();
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("body > div.wrapper > div:nth-child(2) > div > div.checkout-form > div.form-area > div.wizard-form > div.panel.wizard.active > div.panel-body > div.form-group.slider-buttons > div")).click();
        Thread.sleep(5000);

    }
}
