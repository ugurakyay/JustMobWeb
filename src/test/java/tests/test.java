package tests;

import org.junit.Test;
import pageobjects.*;
import test.automation.framework.BaseWebAutomationTest;
import test.automation.framework.config.ConfigReader;

public class test extends BaseWebAutomationTest {


    private OrderPageObject order;
    private CleanderPageObject picdate;
    private ContactFormPageObject contact;
    private PaymentformPageObject payment;



    public test(){

        order = new OrderPageObject();
        picdate = new CleanderPageObject();
        contact = new ContactFormPageObject();
        payment = new PaymentformPageObject();


    }

    @Test

    public void addBook () throws InterruptedException {
        order.navigateTo();
        order.orderMob();
        picdate.CleanderSelect();
        contact.contact(ConfigReader.getInstance().getUserName(),ConfigReader.getInstance());
        payment.Payment(ConfigReader.getInstance().getUserName(),ConfigReader.getInstance());

    }
}
