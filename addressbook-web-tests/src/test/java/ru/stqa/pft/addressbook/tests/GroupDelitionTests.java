package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDelitionTests extends  TestBase {

    @Test
    public void testGroupDelition() {
      app.getNavigationHalper().gotoGroupPage();

      if (! app.getGroupHelper().isThereAgroup()){
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
      }
      List<GroupData> before = app.getGroupHelper().getGroupList();
      //int before = app.getGroupHelper().getGroupCount();
      app.getGroupHelper().selectGroup(before.size() - 1);
      app.getGroupHelper().deleteSelectedGroups();
      app.getGroupHelper().returnToGroupPage();
      List<GroupData> after = app.getGroupHelper().getGroupList();
      //int after = app.getGroupHelper().getGroupCount();
      Assert.assertEquals(after.size(), before.size() - 1);

      before.remove(before.size() - 1);
      // for (int i = 0; i <after.size(); i++) { //assertEquals сам умеет цикл
        Assert.assertEquals(before, after);

    }
}
