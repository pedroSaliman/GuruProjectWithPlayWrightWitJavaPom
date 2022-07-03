package org.example;


import com.microsoft.playwright.Page;

public class Login {
    Action act;
    Page page;

    public Login(Page page) {
        this.page = page;
    }

public PersonalPage login(String user,String pass){
        act=new Action(page);
        act.type("input[name='uid']",user);
        act.type("input[name='password']",pass);
        act.click("input[value='LOGIN']");
        return new PersonalPage(page);

}

}
