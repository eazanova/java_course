package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHalper().gotoGroupPage();
  //  int before = app.getGroupHelper().getGroupCount();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData group = new GroupData("test1", null, null);
    app.getGroupHelper().createGroup(group);
    /*app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelper().submitGroupCtration();
    app.getGroupHelper().returnToGroupPage();*/
    //int after = app.getGroupHelper().getGroupCount();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);

/* //простой способ поиска максимального id
    int max = 0;
    for (GroupData g : after){
      if (g. getId() > max) {
        max = g. getId();
      }
    }*/

   // group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId()); // заменили на новый способ сравления
   // group.setId(max);
    before.add(group);
    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after)); //заменили на новый
    Comparator<? super GroupData> byID = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byID);
    after.sort(byID);
    Assert.assertEquals(before, after);
    }

}
