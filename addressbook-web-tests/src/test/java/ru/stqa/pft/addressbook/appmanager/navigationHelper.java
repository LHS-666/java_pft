package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationHelper extends HelperBase {

    public navigationHelper(ChromeDriver wd) {
        super(wd);
        this.wd = wd;
    }

    public void gotoGroupPage() {

        click(By.linkText("groups"));
    }
}
