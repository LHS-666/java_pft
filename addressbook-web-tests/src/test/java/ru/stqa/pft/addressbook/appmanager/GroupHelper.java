package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupHelper extends HelperBase {
    public GroupHelper(WebDriver wd) {
        super(wd);
    }
    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }
    public void submitGroupCreation() {
        click(By.name("submit"));
    }
    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.header());
        type(By.name("group_footer"), groupData.footer());
    }
    public void initGroupCreation() {
        click(By.name("new"));
    }
    public void deleteSelectedGroup() {
        click(By.name("delete"));
    }

    public void selectGroupById(int id) {
        wd.findElement(By.cssSelector("input[value='" + id + "']")).click();
    }
    public void initGroupModification() {
        click(By.name("edit"));
    }
    public void submitGroupModification() {
        click(By.name("update"));
    }
    public void createGroup(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }
    public void ModifyGroup(GroupData group) {
        selectGroupById(group.getId());
        initGroupModification();
        fillGroupForm(group);
        submitGroupModification();
        returnToGroupPage();
    }

    public void deleteGroup(GroupData deletedGroup) {
        selectGroupById(deletedGroup.getId());
        deleteSelectedGroup();
        returnToGroupPage();
    }
    public boolean isTheAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public Set<GroupData> all() {
        Set<GroupData> groups = new HashSet<GroupData>();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements) {
            String name = element.getText();
            int id =  Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupData group = new GroupData(id, name, null, null);
            groups.add(group);
        }
        return groups;
    }

}
