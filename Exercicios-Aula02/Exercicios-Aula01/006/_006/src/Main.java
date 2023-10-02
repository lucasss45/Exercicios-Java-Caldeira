// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();

        if (idade < 16) {
            System.out.println("Você não tem idade suficiente pra votar.");
        } else if (idade >= 16 && idade <= 17 || idade > 65) {
            System.out.println("Você pode votar se quiser.");
        } else {
            System.out.println("O voto é obrigatório.");
        }
    }
}
