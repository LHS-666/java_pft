package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

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
    wd.get("http://localhost/addressbook/index.php");
    wd.findElement(By.linkText("Logout")).click();
  }

  private void gotoHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }

  private void submitNewEntry() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void EntryData(EntryData entryData) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(entryData.firstname());
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(entryData.lastname());
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(entryData.address());
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(entryData.phone());
  }

  private void gotoNewEntry() {
    wd.findElement(By.linkText("add new")).click();
  }


}
