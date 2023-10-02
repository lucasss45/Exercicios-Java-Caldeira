//Exercício 6: Tratamento de Erros com Exceções Personalizadas (Exception)
//Crie uma exceção personalizada chamada SaldoInsuficienteException que herde de Exception.
// Crie uma classe ContaBancaria que represente uma conta com um saldo inicial. Escreva um método sacar(double valor)
// na classe ContaBancaria que lance a exceção SaldoInsuficienteException se o saldo for insuficiente para a retirada.
// Em um programa principal, trate essa exceção e forneça uma mensagem de erro adequada.

import java.util.Scanner;


public class exe006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o saldo inicial da conta:");
        double saldoInicial = input.nextDouble();

        ContaBancaria conta1 = new ContaBancaria(saldoInicial);

        System.out.println("Informe o valor a ser sacado:");
        double valorSaque = input.nextDouble();

        try {
            conta1.sacar(valorSaque);
            System.out.println("Novo saldo: " + conta1.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } 
    }
}



