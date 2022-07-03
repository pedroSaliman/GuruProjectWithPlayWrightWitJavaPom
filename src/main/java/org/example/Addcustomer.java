package org.example;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Addcustomer {
    Page page;
    Action act;

    public Addcustomer(Page page) {
        this.page = page;
    }
    public void newCustomer(String address,String name,String country,String state,String pin,String mobile,String email,String password){
        act=new Action(page);
        act.type("textarea[name='addr']",address);
        act.type("input[name='name']",name);
        act.type("//input[@id='dob']","2000-05-25");



        act.type("input[name='city']",country);
        act.type("input[name='state']",state);
        act.type("input[name='pinno']",pin);
        act.type("input[name='telephoneno']",mobile);
        act.type("input[name='emailid']",email);
        act.type("input[name='password']",password);
        act.click("input[value='Submit']");



    }









}
