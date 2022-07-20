package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    app.initContactCreation();
    app.gotoNewContactPage();
    app.fillContactForm(new ContactData("Vasya", "Pupkin", "911", "vasya@test.ru"));
    app.submitContactCreation();
    app.gotoToHomePage();

  }


}
