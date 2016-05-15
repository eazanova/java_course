package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase  {

    @Test
    public void testContactCreation() {
        app.getcontactHelper().gotoCreationForm();
       // gotoCreationForm();
        app.getcontactHelper().fillContactForm(new ContactData("test", "test", "test", "test", "test.test@test.ru", "test1"), true);
        //fillContactForm(new ContactData("test", "test", "test", "test", "test.test@test.ru"));
        app.getcontactHelper().submitContactCreation();
        //submitContactCreation();
        app.getcontactHelper().returnToHomePage();
        //returnToHomePage();
    }

}
