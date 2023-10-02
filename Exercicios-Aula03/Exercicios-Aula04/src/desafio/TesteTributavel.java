package desafio;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaPoupanca poupanca1 = new ContaPoupanca(1000.0);
        ContaCorrente corrente1 = new ContaCorrente(2000.0);
        SeguroDeVida seguro1 = new SeguroDeVida();

        // Calcula tributos para cada objeto tributável
        double tributosPoupanca = poupanca1.calculaTributos();
        double tributosCorrente = corrente1.calculaTributos();
        double tributosSeguro = seguro1.calculaTributos();

        System.out.println("Tributos da Conta Poupança: R$" + tributosPoupanca);
        System.out.println("Tributos da Conta Corrente: R$" + tributosCorrente);
        System.out.println("Tributos do Seguro de Vida: R$" + tributosSeguro);


        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();


        gerenciador.adicionarTributavel(poupanca1);
        gerenciador.adicionarTributavel(corrente1);
        gerenciador.adicionarTributavel(seguro1);


        double totalTributos = gerenciador.calcularTotal();
        System.out.println("Total de Tributos: R$" + totalTributos);
    }
}