package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    public ChromeDriver wd;
    private SessionHelper sessionHelper;
    private navigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private JavascriptExecutor js;

    public void init() {
        wd = new ChromeDriver();
       wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        js = (JavascriptExecutor) wd;
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new navigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        wd.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }



    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ru.stqa.pft.addressbook.appmanager.navigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
