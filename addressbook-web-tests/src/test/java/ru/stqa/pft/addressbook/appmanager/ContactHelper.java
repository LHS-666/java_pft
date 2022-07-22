package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.testng.Assert.assertTrue;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.name());
        type(By.name("lastname"), contactData.lastname());
        type(By.name("home"), contactData.phone());
        type(By.name("email"), contactData.email());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void gotoToHomePage() {
        click(By.linkText("home page"));
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void deleteContact() {
        click(By.xpath("//input[@value='Delete']"));
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    }

    public void selectContact() {
        click(By.cssSelector("[]"));
    }

    private String closeAlertAndGetItsText() {
      return null;
    }

    public void initContactModification() {
        // поправить на правильный локатор
        click(By.cssSelector("img[alt='Edit']"));
    }


    public void submitContactModification() {
        click(By.name("update"));
    }
}
