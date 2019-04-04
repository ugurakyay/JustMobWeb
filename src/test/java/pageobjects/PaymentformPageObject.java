package pageobjects;

import org.openqa.selenium.By;
import test.automation.framework.config.ConfigReader;
import test.automation.framework.pageobject.PageObject;

public class PaymentformPageObject extends PageObject {

    @Override
    public void navigateTo() { browser.get(ConfigReader.getInstance().getHost()); }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void Payment (String email, ConfigReader instance) throws InterruptedException {

        //PaymentForm
        String aed = browser.findElement(By.cssSelector("#mobil-booking-summary-total")).getAttribute("textContent");
        String[] AED = aed.split(" ");
        String Price = AED[1];

        int result = Integer.parseInt(String.valueOf(Price));

        if (result > 350) {
            browser.findElement(By.id("vouncher-code-input")).sendKeys("testme");
            browser.findElement(By.id("voucher-code-button")).click();
            Thread.sleep(5000);
            String VoucherCode= browser.findElement(By.id("step4-error")).getText();
            System.out.println("Voucher Code is Valid: " +VoucherCode);

            browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_number\"]")).sendKeys("4242424242424242");
            browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_month\"]")).sendKeys("08");
            browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_year\"]")).sendKeys("2021");
            browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_cvc\"]")).sendKeys("100");
            Thread.sleep(2000);
            browser.findElement(By.cssSelector("body > div.wrapper > div:nth-child(2) > div > div.checkout-form > div.form-area > div.wizard-form > div.panel.wizard.active > div.panel-body > div > div.form-group.slider-buttons > div.half-quater > div")).click();
            Thread.sleep(10000);
            String PromoCode = browser.findElement(By.cssSelector("#promo_code")).getAttribute("textContent");
            System.out.println("Promo Code = " + PromoCode);
        }
        else {

            browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_number\"]")).sendKeys("4242424242424242");
            browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_month\"]")).sendKeys("08");
            browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_year\"]")).sendKeys("2021");
            browser.findElement(By.xpath("//*[@id=\"add_new_credit_card_cvc\"]")).sendKeys("100");
            Thread.sleep(2000);
            browser.findElement(By.cssSelector("body > div.wrapper > div:nth-child(2) > div > div.checkout-form > div.form-area > div.wizard-form > div.panel.wizard.active > div.panel-body > div > div.form-group.slider-buttons > div.half-quater > div")).click();
            Thread.sleep(10000);
            String PromoCode = browser.findElement(By.cssSelector("#promo_code")).getAttribute("textContent");
            System.out.println("Promo Code = " + PromoCode);


        }


    }

}
