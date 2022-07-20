package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    initContactCreation();
    gotoNewContactPage();
    fillContactForm(new ContactData("Vasya", "Pupkin", "911", "vasya@test.ru"));
    submitContactCreation();
    gotoToHomePage();

  }


}
