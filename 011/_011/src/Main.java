// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = ler.nextLine(); // Lê uma palavra digitada pelo usuário e armazena em 'palavra'

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < palavra.length(); j++) {
            char letra = Character.toLowerCase(palavra.charAt(j));
            if (letra == 'a') {
                a++;
            } else if (letra == 'e') {
                e++;
            } else if (letra == 'i') {
                i++;
            } else if (letra == 'o') {
                o++;
            } else if (letra == 'u') {
                u++;
            }
        }

        int totalVogais = a + e + i + o + u;

        System.out.println("A palavra informada é: " + palavra);
        System.out.println("A palavra possui em vogais A=" + a + " E=" + e + " I=" + i + " O=" + o + " U=" + u);
        System.out.println("A palavra tem " + totalVogais + " vogais no total");
    }
}
