package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDelitionTests extends TestBase {

    @Test
    public void testContactDelition() {
        app.getcontactHelper().returntoHome();
        if (! app.getcontactHelper().isThereAContact()){
            app.getcontactHelper().createContact(new ContactData("test", "test", "test", "test", "test.test@test.ru", "test1"));
        }
        List<ContactData> before = app.getcontactHelper().getContactList();
       // app.getcontactHelper().selectContact();
        app.getcontactHelper().selectContact(before.size() - 1);
        app.getcontactHelper().initContactDeletion();
        app.getcontactHelper().submitContactDeletion();
        app.getcontactHelper().returntoHome();
        List<ContactData> after = app.getcontactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);
        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }
}
