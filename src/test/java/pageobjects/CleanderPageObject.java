package pageobjects;

import org.openqa.selenium.By;
import test.automation.framework.pageobject.PageObject;

public class CleanderPageObject extends PageObject {
    @Override
    public void navigateTo() {
    }
    @Override
    public boolean isPresent() {
        return false;
    }

    public void cleanderSelect () throws InterruptedException {
        //2 May 2019
        browser.findElement(By.xpath("//*[@id=\"next-month\"]")).click();
        Thread.sleep(4000);
        browser.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/ul/li[5]")).click();
        Thread.sleep(3000);
        browser.findElement(By.cssSelector("body > div.wrapper > div:nth-child(2) > div > div.checkout-form > div.form-area > div.wizard-form > div.panel.wizard.active > div.panel-body > div.form-group.slider-buttons > div.half-quater > div")).click();
    }
}
