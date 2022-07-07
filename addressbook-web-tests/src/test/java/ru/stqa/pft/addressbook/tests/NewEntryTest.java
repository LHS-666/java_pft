package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.EntryData;

public class NewEntryTest extends TestBase {

  @Test
  public void testNewEntry() throws Exception {

    gotoNewEntry();
    EntryData(new EntryData("Vasya", "Pupkin", "Red Square, Moscow", "911"));
    submitNewEntry();
    gotoHomePage();
    Logout();
  }

  private void Logout() {
    app.wd.get("http://localhost/addressbook/index.php");
    app.wd.findElement(By.linkText("Logout")).click();
  }

  private void gotoHomePage() {
    app.wd.findElement(By.linkText("home page")).click();
  }

  private void submitNewEntry() {
    app.wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void EntryData(EntryData entryData) {
    app.wd.findElement(By.name("firstname")).click();
    app.wd.findElement(By.name("firstname")).clear();
    app.wd.findElement(By.name("firstname")).sendKeys(entryData.firstname());
    app.wd.findElement(By.name("lastname")).click();
    app.wd.findElement(By.name("lastname")).clear();
    app.wd.findElement(By.name("lastname")).sendKeys(entryData.lastname());
    app.wd.findElement(By.name("address")).click();
    app.wd.findElement(By.name("address")).clear();
    app.wd.findElement(By.name("address")).sendKeys(entryData.address());
    app.wd.findElement(By.name("home")).click();
    app.wd.findElement(By.name("home")).clear();
    app.wd.findElement(By.name("home")).sendKeys(entryData.phone());
  }

  private void gotoNewEntry() {
    app.wd.findElement(By.linkText("add new")).click();
  }


}
