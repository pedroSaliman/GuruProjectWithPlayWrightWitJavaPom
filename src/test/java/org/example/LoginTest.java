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

public class LoginTest extends Base {
    EditPage edit;
    Playwright play;
    Browser browser;
    Page page;
    Login log;
    PersonalPage person;
    Addcustomer cust;

 public  static  String userid=null;
    public  static  String userPass=null;





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
    @Test(dependsOnMethods = {"addcustomer"})
    void edit(){
        edit=new EditPage(page);
        person=new PersonalPage(page);
        person.editClick();
        edit.Edit("34555");
    }

}
