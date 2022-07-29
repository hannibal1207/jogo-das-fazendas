package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe retângulo.
 *
 */
public class Rectangle extends Polygon {

  public Rectangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double area() {
    return this.getBase() * this.getHeight();
  }


}
