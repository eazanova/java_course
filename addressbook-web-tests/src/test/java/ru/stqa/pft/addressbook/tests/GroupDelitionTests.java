package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

public class GroupDelitionTests extends  TestBase {

  @BeforeMethod
  public void enshurePreconditions() {
    app.goTo().GroupPage();
    //if (! app.group().isThereAgroup()){
    if (app.group().all().size() == 0){
      app.group().create(new GroupData().withName("test1"));
    }
  }

    @Test
    public void testGroupDelition() {
      Set<GroupData> before = app.group().all();
      GroupData deletedGroup = before.iterator().next();
      //int before = app.group().getGroupCount();
     // int index = before.size() - 1;
      app.group().delete(deletedGroup);
      Set<GroupData> after = app.group().all();
      //int after = app.group().getGroupCount();
      Assert.assertEquals(after.size(), before.size() - 1);

      before.remove(deletedGroup);
      // for (int i = 0; i <after.size(); i++) { //assertEquals сам умеет цикл
      Assert.assertEquals(before, after);

    }

}
