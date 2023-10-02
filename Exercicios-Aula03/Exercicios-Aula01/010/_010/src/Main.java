// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a temperatura em Graus Celsius: ");
        double celsius = ler.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}