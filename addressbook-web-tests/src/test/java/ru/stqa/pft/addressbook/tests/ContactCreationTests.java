package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase  {

    @Test
    public void testContactCreation() {
        List<ContactData> before = app.getcontactHelper().getContactList();
        ContactData group = new ContactData("test1", "test2", "test3", "test4", "test.test@test.ru", "test1");
        app.getcontactHelper().createContact(group);
        /*
        app.getcontactHelper().gotoCreationForm();
       // gotoCreationForm();
        app.getcontactHelper().fillContactForm(new ContactData("test", "test", "test", "test", "test.test@test.ru", "test1"), true);
        //fillContactForm(new ContactData("test", "test", "test", "test", "test.test@test.ru"));
        app.getcontactHelper().submitContactCreation();
        //submitContactCreation();
        app.getcontactHelper().returnToHomePage();
        //returnToHomePage();*/

        List<ContactData> after = app.getcontactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);

        before.add(group);
        Comparator<? super ContactData> byID = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byID);
        after.sort(byID);
        Assert.assertEquals(before, after);
    }

}
