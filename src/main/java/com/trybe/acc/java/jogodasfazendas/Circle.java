package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe circulo.
 *
 */
public class Circle implements Farm {
  public static double PI = 3.14;
  private double radius;

  public double getRadius() {
    return radius;
  }


  public void setRadius(double radius) {
    this.radius = radius;
  }


  @Override
  public double area() {
    return getRadius() * getRadius() * Circle.PI;
  }


  public Circle(double radius) {
    this.radius = radius;
  }

}
