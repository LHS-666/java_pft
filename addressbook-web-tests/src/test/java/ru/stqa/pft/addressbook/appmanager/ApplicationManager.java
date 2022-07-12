package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.BrowserType;

import java.time.Duration;

import static org.openqa.selenium.remote.BrowserType.*;

public class ApplicationManager {
    public WebDriver wd;
    private SessionHelper sessionHelper;
    private navigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private JavascriptExecutor js;
    private final String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {

        if (browser.equals(CHROME)) {
            wd = new ChromeDriver();
        }  else if (browser.equals(FIREFOX)) {
            wd = new ChromeDriver();
        }  else if (browser.equals(IE)) {
            wd = new InternetExplorerDriver();
        }

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
