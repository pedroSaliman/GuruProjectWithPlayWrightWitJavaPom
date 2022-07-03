package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import config.Prop;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Base {
    Playwright play;
 public static    String browserName=null;
 public static    String url=null;
    Browser browser;
    Page page;
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
}
