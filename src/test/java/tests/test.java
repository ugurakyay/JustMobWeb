package tests;

import org.junit.Test;
import pageobjects.bookPageObject;
import test.automation.framework.BaseWebAutomationTest;
import test.automation.framework.config.ConfigReader;

public class test extends BaseWebAutomationTest {

    private bookPageObject bookpage;


    public test(){
        bookpage = new bookPageObject();

    }

    @Test

    public void addBook () throws InterruptedException {
        bookpage.navigateTo();
        bookpage.BookMob();
    }
}
