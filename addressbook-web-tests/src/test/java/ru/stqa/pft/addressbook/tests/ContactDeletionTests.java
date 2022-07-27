package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.getNavigationHelper().gotoToHomePage();
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Vasya", "Pupkin", "911", "vasya@test.ru", "test1"), true);
    }
    app.getContactHelper().selectContact(before);
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().gotoToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before+1);
  }


}
