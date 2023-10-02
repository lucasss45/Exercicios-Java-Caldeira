import java.util.Scanner;

public class _002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Diga uma frase maneira pra ficar para a posteridade:");
        String normal = ler.nextLine(); // Use nextLine() para ler a frase completa
        StringBuilder reversed = new StringBuilder(normal);
        reversed.reverse();

        String result = reversed.toString();
        System.out.println("Frase Original: " + normal);
        System.out.println("Frase Invertida: " + result);
    }
}
