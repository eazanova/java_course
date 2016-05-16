package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDelitionTests extends TestBase {

    @Test
    public void testContactDelition() {
        app.getcontactHelper().returntoHome();
        if (! app.getcontactHelper().isThereAContact()){
            app.getcontactHelper().createContact(new ContactData("test", "test", "test", "test", "test.test@test.ru", "test1"), true);
        }
        app.getcontactHelper().selectContact();
        app.getcontactHelper().initContactDeletion();
        app.getcontactHelper().submitContactDeletion();
        app.getcontactHelper().returntoHome();
    }
}
