import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

class Atividade10 {
    public static List<Integer> shuffleMusicas(List<Integer> musicasTocadas) {
      
      int tamanho = musicasTocadas.size();
      
      if(tamanho > 1){
      List<Integer> resultado = new ArrayList<Integer>();
      Collections.sort(musicasTocadas);
      
      for(int i = 0; i < tamanho / 2; i++){
        resultado.add(musicasTocadas.get(tamanho - 1 - i));
        resultado.add(musicasTocadas.get(i));
      }
      
      if(tamanho % 2 != 0){
        resultado.add(musicasTocadas.get(tamanho / 2));
      }
        
      return resultado;
    } else {
        return musicasTocadas;
      }
    }
}

class ShuffleMusicasTests {
    @Test
    public void teste() {
      List<Integer> expected0 = Arrays.asList(10,2,5,3);
      List<Integer> actual0 = Atividade10.shuffleMusicas(Arrays.asList(2,10,5,3));
      assertEquals(expected0, actual0);
    }
  }