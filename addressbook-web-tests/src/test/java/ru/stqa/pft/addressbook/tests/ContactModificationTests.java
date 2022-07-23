package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Vasya", "Pupkin", "911", "vasya@test.ru", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);
    }
}
