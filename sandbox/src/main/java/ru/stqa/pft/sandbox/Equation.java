package ru.stqa.pft.sandbox;

/**
 * Created by Евгения on 07.05.2016.
 */
public class Equation {

  private double a;
  private double b;
  private double c;

  public int n;

  public Equation(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;

    double d = b*b - 4*a*c;

    if (d > 0){
      n = 2;
    }
      else {
        if (d == 0) {
          n = 1;
        }
          else {
          n = 0;
        }
    }
  }

  public int rootNumcer() {
    return n;
  }
}
