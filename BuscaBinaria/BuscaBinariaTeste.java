import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuscaBinariaTeste {
  
  @Test
  public void numeroInicio( ){
    int[] array = {0, 10, 20, 30, 40, 50};
    int chave = 10;

    assertEquals(1, BuscaBinaria.busca(array, chave));
  }

  @Test
  public void numeroFim( ){
    int[] array = {0, 10, 20, 30, 40, 50};
    int chave = 50;

    assertEquals(5, BuscaBinaria.busca(array, chave));
  }

  @Test
  public void numeroMeio( ){
    int[] array = {0, 10, 20, 30, 40, 50};
    int chave = 20;

    assertEquals(2, BuscaBinaria.busca(array, chave));
  }

  @Test
  public void numeroNaoExiste( ){
    int[] array = {0, 10, 20, 30, 40, 50};
    int chave = 33;

    assertEquals(-1, BuscaBinaria.busca(array, chave));
  }

  @Test
  public void arrayImpar( ){
    int[] array = {0, 10, 20, 30, 40};
    int chave = 20;

    assertEquals(2, BuscaBinaria.busca(array, chave));
  }

}
