package ru.stqa.pft.sandbox;

import java.awt.*;
//import java.awt.Point;

public class MyFirstProg {
  public static void main(String[] args) { //запускаемый класс
    Hello("wold");
    Hello("user");

    Square s = new Square(5);
    //s.l = 5;
    System.out.println("Площадь квадрата со сторонами " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(6,6);
    //r.a = 6;
    //r.b = 6;
    System.out.println("Площадь квадрата " + r.a + " и " + r.b + " = "  + r.area());

     Point p1 = new Point(1,1);
     Point p2 = new Point(5,5);
    System.out.println("Расстояние между точками: " + p2.distance(p1));
/*
    double l = 5;
    double s = l*l;
    System.out.println("Площадь квадрата " + l + " = " + s);*/
  }

  public static void Hello(String somebody) {  //функция
    System.out.println("Hello, " + somebody);
  }

}