package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

/**
 * Created by Евгения on 05.05.2016.
 */
public class GroupModificationTests extends TestBase {

  @BeforeMethod
  public void enshurePreconditions() {
    app.goTo().GroupPage();
    if (app.group().all().size() == 0){
      app.group().create(new GroupData().withName("test1"));
    }
  }

  @Test
  public void testGroupModification() {
    Set<GroupData> before = app.group().all();
    //int before = app.group().getGroupCount();
    GroupData modifieddGroup = before.iterator().next();
    //int index = before.size() - 1;
    GroupData group = new GroupData().withId(modifieddGroup.getId()).withName("test1").withHead("test2").withFooter("test3");
    app.group().modify(group);
    Set<GroupData> after = app.group().all();
    //int after = app.group().getGroupCount();
    Assert.assertEquals(after.size(), before.size());

    before.remove(modifieddGroup);
    before.add(group);
    Assert.assertEquals(before, after);

  }
}

