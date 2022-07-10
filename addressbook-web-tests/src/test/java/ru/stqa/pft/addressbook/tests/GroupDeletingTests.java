package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletingTests extends TestBase {

  @Test
  public void testGroupDeleting() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPafe();
  }

}
