package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe jogador.
 */
public class PlayerResult {
  private String playerName;
  protected Farm[] farms;

  /**
   * Classe jogador.
   */
  public PlayerResult(String playerName, Farm[] farms) {
    super();
    this.playerName = playerName;
    this.farms = farms;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public Farm[] getFarms() {
    return farms;
  }

  public void setFarms(Farm[] farms) {
    this.farms = farms;
  }

  /** funçao que calcula os pontos do jogador. */
  public double score() {
    double somaArea = 0;
    for (Farm farm : farms) {
      somaArea += farm.area();
    }
    return somaArea;
  }

  public void informacoes() {
    System.out
        .println("As Fazendas de" + playerName + " teve um total de " + this.score() + " pontos");
    for (Farm fazenda : this.farms) {
      System.out.println("|" + fazenda.area() + "\t|");
    }
  }
}
