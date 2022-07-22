package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().createContact(new ContactData("Vasya", "Pupkin", "911", "vasya@test.ru", "test1"), true);
    app.getNavigationHelper().gotoToHomePage();

  }


}
