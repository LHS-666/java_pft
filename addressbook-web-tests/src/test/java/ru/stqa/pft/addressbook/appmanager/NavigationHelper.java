package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
      click(By.linkText("groups"));
    }

    public void gotoToHomePage() {
      click(By.linkText("home"));

    }

    public void gotoNewContactPage() {
      wd.get("http://localhost/addressbook/edit.php");
    }
}
