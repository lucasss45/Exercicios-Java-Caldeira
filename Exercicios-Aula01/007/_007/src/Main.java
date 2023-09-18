// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();

        System.out.println("Informe seu salário: ");
        double salario = ler.nextDouble();

        if (idade >= 18 && salario > 2000.00) {
            System.out.println("Você pode comprar um automóvel. Aproveite para acessar nossos modelos");
        } else {
            System.out.println("Desculpa, você não pode comprar um automóvel.");
        }
    }
}
