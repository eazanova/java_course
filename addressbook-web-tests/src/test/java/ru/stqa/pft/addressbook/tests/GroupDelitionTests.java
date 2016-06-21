package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDelitionTests extends  TestBase {

  @BeforeMethod
  public void enshurePreconditions() {
    app.goTo().GroupPage();
    //if (! app.group().isThereAgroup()){
    if (app.group().list().size() == 0){
      app.group().create(new GroupData().withName("test1"));
    }
  }

    @Test
    public void testGroupDelition() {
      List<GroupData> before = app.group().list();
      //int before = app.group().getGroupCount();
      int index = before.size() - 1;
      app.group().delete(index);
      List<GroupData> after = app.group().list();
      //int after = app.group().getGroupCount();
      Assert.assertEquals(after.size(), before.size() - 1);

      before.remove(index);
      // for (int i = 0; i <after.size(); i++) { //assertEquals сам умеет цикл
      Assert.assertEquals(before, after);

    }

}
