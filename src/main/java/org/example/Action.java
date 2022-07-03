package org.example;

import com.microsoft.playwright.Page;

public class Action {
public      Page page;


    public Action(Page page) {
        this.page = page;
    }

public  void  click(String loc){

        page.isVisible(String.valueOf(loc));
        page.click(String.valueOf(loc));
}
    public  void  type(String locator, String val){

        page.isVisible(String.valueOf(locator));
        page.fill(String.valueOf(locator),val);
    }
    public  void  visible(String locator){

        page.isVisible(String.valueOf(locator));
    }
}
