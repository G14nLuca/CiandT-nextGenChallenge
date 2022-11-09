package ativ4;
import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.List;

import org.junit.Test;

class TermoComparator implements Comparator<Termo> {

    @Override
    public int compare(Termo o1, Termo o2) {

        Integer x1 = o1.getOcorrencias();
        Integer x2 = o2.getOcorrencias();
        int sComp = x1.compareTo(x2);

        if (sComp != 0) {
            return sComp;
        }

        x1 = o1.getPrimeiroIndex();
        x2 = o2.getPrimeiroIndex();
        return x2.compareTo(x1);
    }

}

class Termo {
    private String query;
    private int ocorrencias;
    private int primeiroIndex;

    public Termo(String query, int ocorrencias, int primeiroIndex) {
        this.query = query;
        this.ocorrencias = ocorrencias;
        this.primeiroIndex = primeiroIndex;
    }

    public String getQuery() {
        return this.query;
    }

    public int getOcorrencias() {
        return this.ocorrencias;
    }

    public int getPrimeiroIndex() {
        return this.primeiroIndex;
    }

    public String toString() {
        return this.getQuery() + " - " + this.getOcorrencias() + " - " + this.getPrimeiroIndex();
    }

}

class Atividade4 {

    public static List<String> calculaTopOcorrenciasDeQueries(String texto, List<String> queries, Integer k) {

        List<Termo> contador = new ArrayList<Termo>();

        for (String query : queries) {
            int ocorrencias = (texto.split(query, -1).length) - 1;
            int primeiroIndex = texto.indexOf(query);
            contador.add(new Termo(query, ocorrencias, primeiroIndex));
        }

        Collections.sort(contador, new TermoComparator());

        Collections.reverse(contador);

        for (Termo t : contador) {
            System.out.println(t.toString());
        }

        List<String> resultado = new ArrayList<String>();
        for (int i = 0; i < k; i++) {
            resultado.add(contador.get(i).getQuery());
        }

        return resultado;

    }
}

class CalculaTopOcorrenciasDeQueriesTests {
    @Test
    public void testaLoremIpsum() {
        List<String> expected0 = Arrays.asList("i", "a");
        List<String> actual0 = Atividade4.calculaTopOcorrenciasDeQueries(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                Arrays.asList("a", "em", "i", "el"), 2);
        assertEquals(expected0, actual0);
    }
}