package ru.stqa.pft.sandbox;

import java.awt.*;

public class MyFirstProg {
  public static void main(String[] args) {
    Hello("wold");
    Hello("user");

    Square s = new Square(5);
    //s.l = 5;

    System.out.println("Площадь квадрата " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(6,6);
    //r.a = 6;
    //r.b = 6;
    System.out.println("Площадь квадрата = " + area(r));

/*
    double l = 5;
    double s = l*l;
    System.out.println("Площадь квадрата " + l + " = " + s);*/
  }

  public static void Hello(String somebody) {
    System.out.println("Hello, " + somebody);
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }

}