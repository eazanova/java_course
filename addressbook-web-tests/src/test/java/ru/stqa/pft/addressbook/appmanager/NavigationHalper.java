package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Евгения on 02.05.2016.
 */
public class NavigationHalper extends HelperBase {
  //private FirefoxDriver wd;

  public NavigationHalper(WebDriver wd) {
    super(wd);
    //this.wd = wd;
  }

  public void GroupPage() {
    if  (isElementPreseent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPreseent(By.name("new"))) {
        return;
    }
    click(By.linkText("groups"));
  }

  public void gotoContactCreationPage() {
       click(By.linkText("add new"));
  }

}
