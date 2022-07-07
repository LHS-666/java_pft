package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletingTests extends TestBase {

  @Test
  public void testGroupDeleting() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroup();
    app.returnToGroupPafe();
  }

}
