package desafio;

public class GerenciadorDeImpostoDeRenda {
    private double totalTributos = 0;

    public void adicionarTributavel(Tributavel objeto) {
        totalTributos += objeto.calculaTributos();
    }

    public double calcularTotal() {
        return totalTributos;
    }
}