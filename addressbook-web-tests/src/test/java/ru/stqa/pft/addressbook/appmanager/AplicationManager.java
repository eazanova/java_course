package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by Евгения on 02.05.2016.
 */
public class AplicationManager {
  WebDriver wd;

  private NavigationHalper navigationHalper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private ContactHelper contactHelper; //новый
  private String browser;

  public AplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() {
     // String browser = BrowserType.FIREFOX;
      if (browser == BrowserType.FIREFOX) {
        wd = new FirefoxDriver();
      } else if (browser == BrowserType.CHROME) {
        wd = new ChromeDriver();
      } else if (browser == BrowserType.IE) {
        wd = new InternetExplorerDriver();
      }


    wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    //groupHelper.wd.get("http://localhost/addressbook/"); у меня его почему-то нет
    groupHelper = new GroupHelper(wd);
    navigationHalper = new NavigationHalper(wd);
    sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd); //новый
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
    //было wd.stop();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHalper getNavigationHalper() {
    return navigationHalper;
  }

  public ContactHelper getcontactHelper() {
    return contactHelper;
  } //новый
}
