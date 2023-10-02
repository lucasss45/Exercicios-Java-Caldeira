package desafio;

public class SeguroDeVida implements Tributavel {

    @Override
    public double calculaTributos() {
        return 42.0; // Tributação fixa de 42 reais para o Seguro de Vida.
    }
}
