package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.addressbook.appmanager.AplicationManager;

/**
 * Created by Евгения on 02.05.2016.
 */
public class TestBase {

  protected static final AplicationManager app = new AplicationManager(BrowserType.CHROME);

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite
  public void tearDown() {
   // wd.quit();
   app.stop();
  }
}
