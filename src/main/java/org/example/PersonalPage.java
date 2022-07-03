package org.example;

import com.microsoft.playwright.Page;

public class PersonalPage {
    Page page;
    Action act;

    public PersonalPage(Page page) {
        this.page = page;
    }
    public boolean headerVisible(){
        act=new Action(page);
        act.visible("tr[class='heading3'] td");
        return false;
    }
    public Addcustomer addnewcustomer(){
        act=new Action(page);
        act.click("a[href='addcustomerpage.php']");
        return new Addcustomer(page);
    }

}
