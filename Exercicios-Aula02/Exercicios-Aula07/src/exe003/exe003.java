package exe003;

//Exercício 3: Tratamento de Erros
//Crie um programa que solicite ao usuário que insira dois números inteiros.
// Utilize tratamento de exceções para lidar com a possibilidade de entrada inválida
// (por exemplo, uma entrada que não seja um número inteiro)e exiba uma mensagem de erro apropriada.
import java.util.Scanner;

public class exe003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int n1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o segundo número inteiro: ");
            int n2 = Integer.parseInt(scanner.nextLine());

            int resultado = n1 + n2;
            System.out.println("A soma dos números é: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
        } finally {
            scanner.close(); // Fecha o scanner, independentemente do resultado.
        }
    }
}

