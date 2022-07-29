package com.trybe.acc.java.principal;

import com.trybe.acc.java.jogodasfazendas.Circle;
import com.trybe.acc.java.jogodasfazendas.Farm;
import com.trybe.acc.java.jogodasfazendas.PlayerResult;
import com.trybe.acc.java.jogodasfazendas.Rectangle;
import com.trybe.acc.java.jogodasfazendas.Square;
import com.trybe.acc.java.jogodasfazendas.Triangle;

public class Principal {

  public static void main(String[] args) {
    Square sq = new Square(4);
    Triangle tr = new Triangle(5, 32);
    Rectangle rc = new Rectangle(3.5, 20);
    Circle c = new Circle(10);

    Farm[] fazendas = {sq, tr, rc, c};
    PlayerResult p1 = new PlayerResult("Mathaus", fazendas);
    p1.score();

    p1.informacoes();
  }

}
