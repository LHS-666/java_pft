package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class navigationHelper extends HelperBase {

    public navigationHelper(WebDriver wd) {
        super(wd);
        this.wd = wd;
    }

    public void gotoGroupPage() {

        click(By.linkText("groups"));
    }
}
