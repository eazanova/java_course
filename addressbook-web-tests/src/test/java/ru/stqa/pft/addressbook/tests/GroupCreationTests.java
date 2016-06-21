package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.goTo().GroupPage();
  //  int before = app.group().getGroupCount();
    Set<GroupData> before = app.group().all();
    GroupData group = new GroupData().withName("test1");
    app.group().create(group);
    /*app.group().initGroupCreation();
    app.group().fillGroupForm(new GroupData("test1", null, null));
    app.group().submitGroupCtration();
    app.group().returnToGroupPage();*/
    //int after = app.group().getGroupCount();
    Set<GroupData> after = app.group().all();
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
    group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
    before.add(group);
    /*//Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after)); //заменили на новый
    Comparator<? super GroupData> byID = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byID);
    after.sort(byID);*/
    Assert.assertEquals(before, after);
    }

}
