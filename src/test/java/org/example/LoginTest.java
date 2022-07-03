package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import config.Prop;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class LoginTest {
    Playwright play;
    Browser browser;
    Page page;
    Login log;
    PersonalPage person;
    Addcustomer cust;
  public static String browserName = null;
 public    static String url = null;
 public  static  String userid=null;
    public  static  String userPass=null;




    @BeforeTest
    void setup() throws IOException {
        Prop.proper();
        play = Playwright.create();
        switch (browserName){
            case "firefox":
                browser = play.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
                    break;
            case "chromium":
                browser = play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
                break;
            case "safari":
                browser = play.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
                break;
            default:
                System.out.println("good");
                break;

        }
    page=browser.newPage();
    page.navigate(url);



    }
    @Test
    void loginInfo() throws IOException {
     log=new Login(page);
        Prop.proper();
        person=  log.login( userid,userPass);
    }

    ////////////////////////////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"loginInfo"})
    void customer(){
        person=new PersonalPage(page);
        person.addnewcustomer();
    }
    //////////////////////////////
    @Test(dependsOnMethods = {"customer"})
    void addcustomer(){
        cust=new Addcustomer(page);
        cust.newCustomer("mansoura","mohamed","egypt","egypt","123456","011114447411","alrman@gmail.com","2521997");
    }
}
