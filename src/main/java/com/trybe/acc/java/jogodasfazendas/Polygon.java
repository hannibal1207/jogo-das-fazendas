package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe abstrata quadrilatero.
 *
 */
public abstract class Polygon implements Farm {
  private double base;
  private double height;

  public Polygon(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public abstract double area();



}
