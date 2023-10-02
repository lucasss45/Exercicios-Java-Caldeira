// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salariominimo = 1320.0;
        System.out.println("Informe o valor do seu salário: ");
        double salario = ler.nextDouble();

        double salariosminimos = salario / salariominimo;

        System.out.println("Você ganha " + salariosminimos + " salários mínimos.");
    }
}
