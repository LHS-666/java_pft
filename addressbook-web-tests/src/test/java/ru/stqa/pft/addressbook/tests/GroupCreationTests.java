package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation()  {
    app.getNavigationHelper().gotoGroupPage();
    Set<GroupData> before = app.getGroupHelper().all();
    GroupData group = new GroupData("test1", null, null);
    app.getGroupHelper().createGroup(group);
    Set<GroupData> after = app.getGroupHelper().all();
    Assert.assertEquals(after.size(), before.size() + 1);

    group.setId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());

    before.add(group);
    Assert.assertEquals(before, after);
  }

}
