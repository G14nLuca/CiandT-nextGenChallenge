package ativ1;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

class Atividade1 {

  public static Integer ultimaParada(Integer combustivel, Integer consumo, List<Integer> postosDeGasolina) {
    int limiteKm = combustivel * consumo;
    int ultimoPosto = -1;

    for (Integer i : postosDeGasolina) {
      if (i <= limiteKm && i > ultimoPosto) {
        ultimoPosto = i;
      }
    }

    return ultimoPosto;
  }

}

class UltimaParadaTests {
  @Test
  public void calculaOUltimoPostoDeCombustivelNaAutonomia() {
    Integer expected0 = 15;
    Integer actual0 = Atividade1.ultimaParada(2, 8, Arrays.asList(2, 15, 22, 11));
    assertEquals(expected0, actual0);
  }
}