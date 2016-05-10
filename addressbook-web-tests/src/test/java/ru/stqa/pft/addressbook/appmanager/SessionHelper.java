package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Евгения on 03.05.2016.
 */
public class SessionHelper extends HelperBase {
 // private FirefoxDriver wd;

  public SessionHelper(WebDriver wd) {
    super(wd);
    //this.wd = wd;
  }

  public void login(String user, String password) {
    wd.get("http://localhost/addressbook/");
    type(By.name("user"),user);
    //wd.findElement(By.name("user")).click();
    //wd.findElement(By.name("user")).clear();
    //wd.findElement(By.name("user")).sendKeys(user);
    type(By.name("pass"),password);
   // wd.findElement(By.name("pass")).click();
    //wd.findElement(By.name("pass")).sendKeys("\\9");
    //wd.findElement(By.name("pass")).click();
    //wd.findElement(By.name("pass")).clear();
    //wd.findElement(By.name("pass")).sendKeys(password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
    //wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

}
