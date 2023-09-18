// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int n = ler.nextInt(); // Lê um número digitado pelo usuário e armazena em 'n'
        System.out.println("O número informado é: " + n); // Imprime o número informado
        int r = 1;
        for (int m = n - 1; m >= 1; m--) {

            r *= m; // Multiplica o resultado pelo valor de 'm'
        }

        System.out.println("O fatorial de " + n + " é: " + r);
    }

}
