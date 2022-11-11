import static org.junit.Assert.assertEquals;

import org.junit.Test;

class Atividade7 {
    public static Integer calculaTotalLeds(Integer altura, Integer largura) {
        
        if (altura != 0 && largura != 0) {
            return (largura + 1) * (altura + 1);
        }

        return 0;
    }
}

class CalculaTotalLedsTests {
    @Test
    public void teste1() {
      Integer expected0 = 12;
      Integer actual0 = Atividade7.calculaTotalLeds(2,3);
      assertEquals(expected0, actual0);
    }
  }