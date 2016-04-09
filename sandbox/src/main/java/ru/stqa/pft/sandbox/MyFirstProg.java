package ru.stqa.pft.sandbox;

public class MyFirstProg {
  public static void main(String[] args) {
    Hello("wold");
    Hello("user");

    double l = 5;
    System.out.println("Площадь квадрата " + l + " = " + area(l));

    double a = 6;
    double b = 6;
    System.out.println("Площадь квадрата = " + area(a, b));

/*
    double l = 5;
    double s = l*l;
    System.out.println("Площадь квадрата " + l + " = " + s);*/
  }

  public static void Hello(String somebody) {
    System.out.println("Hello, " + somebody);
  }

  public static double area(double l) {
    return l * l;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}