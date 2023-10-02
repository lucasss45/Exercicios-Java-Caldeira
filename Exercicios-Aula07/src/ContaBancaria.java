//Exercício 6: Tratamento de Erros com Exceções Personalizadas (Exception)
//Crie uma exceção personalizada chamada SaldoInsuficienteException que herde de Exception.
// Crie uma classe ContaBancaria que represente uma conta com um saldo inicial. Escreva um método sacar(double valor)
// na classe ContaBancaria que lance a exceção SaldoInsuficienteException se o saldo for insuficiente para a retirada.
// Em um programa principal, trate essa exceção e forneça uma mensagem de erro adequada.

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

