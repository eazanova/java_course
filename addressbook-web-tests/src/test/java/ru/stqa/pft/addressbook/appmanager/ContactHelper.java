package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Евгения on 05.05.2016.
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    //wd.findElement(By.linkText("home page")).click();
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {
    //wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"),contactData.getFarstname());
    //wd.findElement(By.name("firstname")).click();
    //wd.findElement(By.name("firstname")).clear();
    //wd.findElement(By.name("firstname")).sendKeys(contactData.getFarstname());
    type(By.name("lastname"),contactData.getLastname());
    type(By.name("address"),contactData.getAdress());
    type(By.name("home"),contactData.getHome());
    type(By.name("email"),contactData.getEmail());
    // wd.findElement(By.name("theform")).click();

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPreseent(By.name("new_group")));
    }
    /*
    if(isElementPreseent(By.name("new_group")))
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    */
  }

  public void gotoCreationForm() {
    //wd.findElement(By.linkText("add new")).click();
    click(By.linkText("add new"));
  }

  public void selectContact() {
    if (!wd.findElement(By.id("11")).isSelected()) { //не поняла пока как задавать нужный индекс
      wd.findElement(By.id("11")).click();
    }
  }

  public void initContactDeletion() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void submitContactDeletion() {
   // wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
    wd.switchTo().alert().accept();
  }

  public void returntoHome() {
    if (isElementPreseent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));
    //wd.findElement(By.linkText("home")).click();
  }

  public void submitContactModification() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    //wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
  }

  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    //wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
  }

}
