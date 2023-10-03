package exe01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class exe01 {
      {
        @Test
        void somarNumeros() {
            // Preparação
            Calculadora calculadora = new Calculadora();

            // Ação
            int soma = calculadora.somar(1, 2);

            // Verificação
            Assertions.assertEquals(3, soma);
        }
    }
}
