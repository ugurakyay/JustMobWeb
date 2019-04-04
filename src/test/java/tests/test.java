package tests;

import org.junit.Test;
import pageobjects.*;
import test.automation.framework.BaseWebAutomationTest;
import test.automation.framework.config.ConfigReader;

public class test extends BaseWebAutomationTest {


    private OrderPageObject order;
    private CleanderPageObject picDate;
    private ContactFormPageObject contact;
    private PaymentformPageObject payment;

    public test(){
        order = new OrderPageObject();
        picDate = new CleanderPageObject();
        contact = new ContactFormPageObject();
        payment = new PaymentformPageObject();
    }

    @Test
    public void addBook () throws InterruptedException {
        order.navigateTo();
        order.orderMob();
        picDate.cleanderSelect();
        contact.contact(ConfigReader.getInstance().getUserName(),ConfigReader.getInstance());
        payment.payment(ConfigReader.getInstance().getUserName(),ConfigReader.getInstance());

    }
}
