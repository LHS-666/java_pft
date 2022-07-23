package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createContact(new ContactData("Vasya", "Pupkin", "911", "vasya@test.ru", "test1"), true);
    app.getNavigationHelper().gotoToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before + 1);
  }
}
