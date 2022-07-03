package org.example;

import com.microsoft.playwright.Page;

public class EditPage {
    Page page;
    Action act;

    public EditPage(Page page) {
        this.page = page;
    }

    public void Edit(String editcustomer){
        act=new Action(page);
        act.type("input[name='cusid']",editcustomer);
        act.click("input[value='Submit']");

    }
    public void editPassword(){
        act=new Action(page);
        act.type("//input[@name='city']","");
        act.type("//input[@name='city']","Mansoura");
        act.click("input[value='Submit']");


    }






}
