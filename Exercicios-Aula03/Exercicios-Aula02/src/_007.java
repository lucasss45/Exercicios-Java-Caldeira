// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class _007 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int espartanos = 300; // Supondo que o número de espartanos seja 300 (pode ser alterado)

            boolean t = true;
            while (t) {
                System.out.println("Quantos Soldados Espartanos você acha que vai enfrentar?");
                int palpite = ler.nextInt();

                if (palpite > espartanos) {
                    System.out.println("O número de espartanos é maior do que você previu.");
                } else if (palpite < espartanos) {
                    System.out.println("O número de espartanos é menor do que você previu.");
                } else {
                    System.out.println("Parabéns Soldado, você venceu!!!");
                    t = false;
                }
            }

            ler.close();
        }
    }


