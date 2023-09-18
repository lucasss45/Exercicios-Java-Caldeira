
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor em dólares a ser convertido: ");
        double n = ler.nextDouble(); // Lê um número digitado pelo usuário e armazena em 'n'

        Scanner ler2 = new Scanner(System.in);
        System.out.println("Escolha uma moeda (Real ou Euro): ");
        String moeda = ler2.nextLine(); // Lê a escolha da moeda

        double f = 0;

        if (moeda.equalsIgnoreCase("real") || moeda.equalsIgnoreCase("r")) {
            f = n * 5.3; // Supondo que 1 Dólar seja equivalente a 5.3 Reais
        } else if (moeda.equalsIgnoreCase("euro") || moeda.equalsIgnoreCase("e")) {
            f = n * 0.9; // Supondo que 1 Dólar seja equivalente a 0.9 Euros
        } else {
            System.out.println("Moeda inválida. Escolha entre Real ou Euro.");
        }

        System.out.println("O valor em " + moeda + " é: " + f); // Imprime o valor convertido
    }
}

