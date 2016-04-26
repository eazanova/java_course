package ru.stqa.pft.sandbox;

/**
 * Created by Евгения on 14.04.2016.
 */
public class Point {

 double x;
 double y;

  public Point(double x, double y) {
    this.x=x;
    this.y=y;
  }

  public double distance(Point p1) {
    //return Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2) );
    return Math.sqrt(Math.pow((p1.x - this.x), 2) + Math.pow((p1.y - this.y), 2));

  }

  }



