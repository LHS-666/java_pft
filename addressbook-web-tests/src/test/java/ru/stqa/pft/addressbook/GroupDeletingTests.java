package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupDeletingTests extends TestBase {

  @Test
  public void testGroupDeleting() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroup();
    returnToGroupPafe();
  }

}
