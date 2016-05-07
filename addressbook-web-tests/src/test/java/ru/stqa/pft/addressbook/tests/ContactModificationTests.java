package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void ContactModificationTests()  {
        app.getcontactHelper().returntoHome();
        app.getcontactHelper().selectContact();
        app.getcontactHelper().initContactModification();
        app.getcontactHelper().fillContactForm(new ContactData("test2", "test3", "test4", "test5", "test6.test@test.ru"));
        app.getcontactHelper().submitContactModification();
        app.getcontactHelper().returnToHomePage();
    }
}
