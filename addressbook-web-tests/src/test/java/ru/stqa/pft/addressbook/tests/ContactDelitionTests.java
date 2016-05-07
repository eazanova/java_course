package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDelitionTests extends TestBase {

    @Test
    public void testContactDelition() {
        app.getcontactHelper().returntoHome();
        app.getcontactHelper().selectContact();
        app.getcontactHelper().initContactDeletion();
        app.getcontactHelper().submitContactDeletion();
        app.getcontactHelper().returntoHome();
    }
}
