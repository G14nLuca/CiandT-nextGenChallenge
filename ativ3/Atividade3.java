package ativ3;
import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.List;

import org.junit.Test;

class Atividade3 {

    public static Integer calculaNumeroDaSenha(List<String> senha) {
        int[] quantidadesUm = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        for (String code : senha) {
            String[] digitos = code.split("");

            for (int i = 0; i < 10; i++) {
                if (digitos[i].equals("1")) {
                    quantidadesUm[i] += 1;
                }
            }
        }

        int soma = 0;

        for (int id = 0; id < 10; id++) {
            if (quantidadesUm[9 - id] >= 5) {
                soma += Math.pow(2, id);
            }
        }

        return soma;
    }

}

class RetornaMenorEMaiorValorDeVendasTests {
    @Test
    public void retornaSenhaCorreta() {
        Integer expected0 = 724;
        Integer actual0 = Atividade3.calculaNumeroDaSenha(Arrays.asList("0110100000", "1001011111", "1110001010",
                "0111010101", "0011100110", "1010011001", "1101100100", "1011010100", "1001100111", "1000011000"));
        assertEquals(expected0, actual0);
    }
}