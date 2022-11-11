import org.junit.Test;
import static org.junit.Assert.*;

class Atividade9 {
    public static String menorStringMaior(String name) {
      System.out.println(name);
      
      String[] letras = name.split("");
      String novaPalavra = "";
      
      for(int i = letras.length - 1; i > 0; i--){
        String holder = letras[i - 1];
        letras[i - 1] = letras[i];
        letras[i] = holder;
        
        novaPalavra = String.join("", letras);
        
        if(name.compareTo(novaPalavra) < 0){
          return novaPalavra;
        }
      }
      
      return "sem resposta";
      
    }
}

class MenorStringMaiorTests {
  @Test
  public void teste() {
    String expected0 = "abced";
    String actual0 = Atividade9.menorStringMaior("abcde");
    assertEquals(expected0, actual0);
  }
}