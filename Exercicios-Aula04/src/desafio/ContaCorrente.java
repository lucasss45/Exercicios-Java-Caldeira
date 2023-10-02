package desafio;

import banco.Conta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calculaTributos() {
        return getSaldo() * 0.01; // 1% de tributo sobre o saldo da Conta Corrente.
    }

    private double getSaldo() {
        return 0;
    }
}
