import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Atividade6 {
    public static boolean checaNumeroEscondido(Integer numero,Integer numeroOculto) {
      
        String numeroStr = String.valueOf(numero);
        String[] ocultoStr = String.valueOf(numeroOculto).split("");
        
        int indexAnterior = 0;
        
        for(String s: ocultoStr){
          int indexAtual = numeroStr.indexOf(s, indexAnterior);
          
          if(indexAtual == -1 || indexAnterior > indexAtual){
            return false;
          } else {
            indexAnterior = indexAtual;
          }
          
        }
        
        return true;
      }
}

class ChecaNumeroEscondidoTests {
    @Test
    public void verificaSeONumeroEstaOcultoEmOutro() {
      boolean expected0 = true;
      boolean actual0 = Atividade6.checaNumeroEscondido(12345,235);
      assertEquals(expected0, actual0);
    }
  }
