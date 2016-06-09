package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {

    @Test
    public void ContactModificationTests()  {
        app.getcontactHelper().returntoHome();
        if (! app.getcontactHelper().isThereAContact()){
            app.getcontactHelper().createContact(new ContactData("test", "test", "test", "test", "test.test@test.ru", "test1"));
        }

        List<ContactData> before = app.getcontactHelper().getContactList();

        app.getcontactHelper().selectContact(before.size() - 1);
        app.getcontactHelper().initContactModification();

        ContactData group = new ContactData(before.get(before.size() - 1).getId(), "test1", "test2", "test3", "test4", "test.test@test.ru", "test1");

        app.getcontactHelper().fillContactForm(group, false);
        app.getcontactHelper().submitContactModification();
        app.getcontactHelper().returnToHomePage();

        List<ContactData> after = app.getcontactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(group);
        Comparator<? super ContactData> byID = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byID);
        after.sort(byID);
        Assert.assertEquals(before, after);
    }
}
