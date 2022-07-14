package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class navigationHelper extends HelperBase {

    public navigationHelper(WebDriver wd) {
        super(wd);
        this.wd = wd;
    }

    public void gotoGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;

        }

        click(By.linkText("groups"));
    }

    private boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void gotoHomePage () {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        click(By.linkText("Home"));
    }
}
