// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Menu de Opções:");
        System.out.println("1. Sou Gestante");
        System.out.println("2. Sou Idosa");
        System.out.println("3. Sou Pessoa com Deficiência (PCD)");
        System.out.println("4. Não sou nenhum desses");
        System.out.println("Escolha: ");

        int e = ler.nextInt();

        switch (e) {
            case 1:
                System.out.println("Você tem direito à fila prioritária para Gestantes.");
                break;
            case 2:
                System.out.println("Você tem direito à fila prioritária para Idosos.");
                break;
            case 3:
                System.out.println("Você tem direito à fila prioritária para PCD (Pessoa com Deficiência).");
                break;
            case 4:
                System.out.println("Você não tem direito à fila prioritária.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
}

