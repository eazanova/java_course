package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void ContactModificationTests()  {
        app.getcontactHelper().returntoHome();
        if (! app.getcontactHelper().isThereAContact()){
            app.getcontactHelper().createContact(new ContactData("test", "test", "test", "test", "test.test@test.ru", "test1"), true);
        }
        app.getcontactHelper().selectContact();
        app.getcontactHelper().initContactModification();
        app.getcontactHelper().fillContactForm(new ContactData("test1", "test2", "test3", "test4", "test6.test@test.ru", null), false);
        app.getcontactHelper().submitContactModification();
        app.getcontactHelper().returnToHomePage();
    }
}
