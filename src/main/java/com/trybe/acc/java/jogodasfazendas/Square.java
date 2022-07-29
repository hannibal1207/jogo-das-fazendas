package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe quadrado.
 *
 */
public class Square implements Farm {
  private double side;


  public Square(double side) {
    super();
    this.side = side;
  }



  public double getSide() {
    return side;
  }



  public void setSide(double side) {
    this.side = side;
  }



  @Override
  public double area() {
    return this.side * this.side;
  }
}
