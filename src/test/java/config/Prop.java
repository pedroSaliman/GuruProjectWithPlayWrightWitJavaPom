package config;

import org.example.Base;
import org.example.EditCustomer;
import org.example.LoginTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Prop {
    public  static void proper() throws IOException, FileNotFoundException {
        Properties prop=new Properties();
        InputStream input = new FileInputStream("E://seleniumprojects//gitendtoend//Guru//src//test//java//config//config.properties");
       prop.load(input);
       String browser=prop.getProperty("browser");
        String URL=prop.getProperty("url");
        String theuserid= prop.getProperty("userid");
        String theuserpass= prop.getProperty("userpass");
        String theuseridedit= prop.getProperty("userid");
        String theuserpassedit= prop.getProperty("userpass");
        Base.browserName=browser;
        Base.url=URL;
        LoginTest.userid=theuserid;
        LoginTest.userPass=theuserpass;
        EditCustomer.useridEdit=theuseridedit;
        EditCustomer.userPassEdit=theuserpassedit;



    }


}
