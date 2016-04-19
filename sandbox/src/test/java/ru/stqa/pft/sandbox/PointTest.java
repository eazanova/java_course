package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by Евгения on 18.04.2016.
 */
public class PointTest {

  @Test
  public void testArea(){
    Point p = new Point(1,1);
    Point pp = new Point(5,5);
    Assert.assertEquals(p.distance(pp),5.656854249492381);
  }
}
