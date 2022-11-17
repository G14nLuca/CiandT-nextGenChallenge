import org.junit.Test;
import static org.junit.Assert.*;

public class Atividade8{

    public static String escolheTaxi(String tf1,String vqr1,String tf2,String vqr2) {
      
        double controle = 0;
        double mudanca = 0;
        
        boolean mudou = false;
        boolean tantoFaz = true;
        
        for(int i = 1; i <= 50; i++){
          double taxa1 = Double.valueOf(tf1) + (Double.valueOf(vqr1) * i);
          double taxa2 = Double.valueOf(tf2) + (Double.valueOf(vqr2) * i);
          controle = taxa1 - taxa2;
          
          if(controle > 0.0 || controle < 0.0){
            tantoFaz = false; 
          } 
          
          if(!tantoFaz && controle == 0){
            mudou = true;
            mudanca = (double) i;
          }
        }
        
        if(tantoFaz){
          return "Tanto faz";
        } else if(!mudou){
          if(controle > 0.0){
            return "Empresa 2";
          } else {
            return "Empresa 1";
          }
        } else{
          if(controle > 0.0){
            return String.format("Empresa 1 quando a distância < %.1f, Tanto faz quando a distância = %.1f, Empresa 2 quando a distância > %.1f", mudanca, mudanca, mudanca);
          } else {
            return String.format("Empresa 2 quando a distância < %.1f, Tanto faz quando a distância = %.1f, Empresa 1 quando a distância > %.1f", mudanca, mudanca, mudanca);
          }
        } 
      }
}


class EscolheTaxiTests {
  @Test
  public void teste() {
    String expected0 = "Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0";
    String actual0 = Atividade8.escolheTaxi("2.5","1.0","5.0","0.75");
    assertEquals(expected0, actual0);
  }
}