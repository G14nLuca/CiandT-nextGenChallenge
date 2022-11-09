package ativ5;
import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.List;

import org.junit.Test;

class Atividade5 {

    public static List<Integer> calculaPorcentagemSorteio(List<Boolean> assinante, List<Integer> minutosAssistidos) {

        int sizeAssinantes = assinante.size();
        int totalChances = 0;
        List<Integer> chances = new ArrayList<Integer>();

        for (int i = 0; i < sizeAssinantes; i++) {

            int minutos = minutosAssistidos.get(i);
            chances.add(minutos / 60);

            if (minutos % 60 != 0) {
                chances.set(i, chances.get(i) + 1);
            }

            if (assinante.get(i)) {
                chances.set(i, chances.get(i) * 2);
            }

            totalChances += chances.get(i);

        }

        for (int i = 0; i < sizeAssinantes; i++) {
            chances.set(i, (int) Math.round(chances.get(i) * 100.0 / totalChances));
        }

        return chances;
    }

}

class RetornaMenorEMaiorValorDeVendasTests {
    @Test
    public void testeAssinanteENaoAssinante() {
        List<Integer> expected0 = Arrays.asList(50, 50);
        List<Integer> actual0 = Atividade5.calculaPorcentagemSorteio(Arrays.asList(true, false),
                Arrays.asList(60, 120));
        assertEquals(expected0, actual0);
    }
}