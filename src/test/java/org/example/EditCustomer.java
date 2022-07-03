package org.example;

import config.Prop;
import org.testng.annotations.Test;

import java.io.IOException;

public class EditCustomer extends Base{
    Login log;
    PersonalPage person;
    EditPage edit;
    public  static  String useridEdit=null;
    public  static  String userPassEdit=null;





    @Test
    void loginInfo() throws IOException {
        log=new Login(page);
        Prop.proper();
        person=  log.login( useridEdit,userPassEdit);
    }



    @Test(dependsOnMethods = {"loginInfo"})
    void edit(){
        person = new PersonalPage(page);
        person.editClick();
        edit=new EditPage(page);
        edit.Edit("34555");
        edit.editPassword();

    }





}
