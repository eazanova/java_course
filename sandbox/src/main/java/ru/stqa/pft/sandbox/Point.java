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

  public double distance(Point p2) {
    //return Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));
    return Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));

  }

  }



