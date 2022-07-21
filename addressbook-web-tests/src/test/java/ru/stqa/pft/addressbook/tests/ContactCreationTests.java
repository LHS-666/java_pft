package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    app.getContactHelper().initContactCreation();
    app.getNavigationHelper().gotoNewContactPage();
    app.getContactHelper().fillContactForm(new ContactData(null, null, null, null));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().gotoToHomePage();

  }


}
