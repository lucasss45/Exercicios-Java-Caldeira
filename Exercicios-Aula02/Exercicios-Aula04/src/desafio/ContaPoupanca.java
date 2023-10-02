package desafio;

import banco.Conta;

public class ContaPoupanca extends Conta implements Tributavel {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calculaTributos() {
        return 0; // Conta Poupança não é tributável, portanto, retorna 0.
    }
}
