package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Евгения on 02.05.2016.
 */
public class AplicationManager {
  FirefoxDriver wd;

  private NavigationHalper navigationHalper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;

    public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    //groupHelper.wd.get("http://localhost/addressbook/"); у меня его почему-то нет
    groupHelper = new GroupHelper(wd);
    navigationHalper = new NavigationHalper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.close();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHalper getNavigationHalper() {
    return navigationHalper;
  }
}
