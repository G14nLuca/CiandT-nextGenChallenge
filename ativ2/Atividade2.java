package ativ2;
import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.List;

import org.junit.Test;

class Atividade2 {

    public static int menorValor(List<Integer> lista) {

        int menor = 0;
        for (Integer i : lista) {
            if (i >= 20) {
                if (menor == 0 || (i != 0 && i < menor)) {
                    menor = i;
                }
            }
        }

        return menor;
    }

    public static int maiorValor(List<Integer> lista) {
        int maior = 0;

        for (Integer i : lista) {
            if (i <= 500 && i > maior) {
                maior = i;
            }
        }

        return maior;
    }

    public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> tickets) {
        List<Integer> resultado = new ArrayList<Integer>(List.of(0, 0));

        for (List<Integer> ticket : tickets) {
            if (ticket.size() > 0) {
                Collections.sort(ticket);

                int ticketMenor = menorValor(ticket);
                int ticketMaior = maiorValor(ticket);
                int resultadoMenor = resultado.get(0);
                int resultadoMaior = resultado.get(1);

                if (resultadoMenor == 0 || ticketMenor < resultadoMenor) {
                    resultado.set(0, ticketMenor);
                }

                if (ticketMaior > resultadoMaior) {
                    resultado.set(1, ticketMaior);
                }
            }
        }

        return resultado;
    }

}

class RetornaMenorEMaiorValorDeVendasTests {
    @Test
    public void retornaOMenorEMaiorValorDeVendas() {
        List<Integer> expected0 = Arrays.asList(100, 300);
        List<Integer> actual0 = Atividade2
                .retornaMenorEMaiorValorDeVendas(Arrays.asList(Arrays.asList(200, 100), Arrays.asList(300)));
        assertEquals(expected0, actual0);
    }
}