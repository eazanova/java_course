package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.AplicationManager;

/**
 * Created by Евгения on 02.05.2016.
 */
public class TestBase {

  protected final AplicationManager app = new AplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
   // wd.quit();
   app.stop();
  }
}
