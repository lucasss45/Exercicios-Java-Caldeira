// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double n1 = ler.nextDouble();

        System.out.println("Informe o segundo número: ");
        double n2 = ler.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double n3 = ler.nextDouble();

        double maior = n1;
        if (n2 > maior) maior = n2;
        if (n3 > maior) maior = n3;

        double menor = n1;
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;

        double media = (n1 + n2 + n3) / 3.0;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritmética: " + media);
    }
}