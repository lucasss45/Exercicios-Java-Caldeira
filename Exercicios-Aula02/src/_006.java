import java.util.Scanner;

public class _006 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int espartanos = 300; // Supondo que o número de espartanos seja 300 (pode ser alterado)

        for (;;) {
            System.out.println("Quantos Soldados Espartanos você acha que vai enfrentar?");
            int palpite = ler.nextInt();

            if (palpite > espartanos) {
                System.out.println("O número de espartanos é maior do que você previu.");
            } else if (palpite < espartanos) {
                System.out.println("O número de espartanos é menor do que você previu.");
            } else {
                System.out.println("Parabéns Soldado, você venceu!!!");
                break; // Sai do loop quando o palpite for correto
            }
        }

        ler.close();
    }
}
