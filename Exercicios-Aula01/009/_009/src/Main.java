// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.Calendar;

public class Main {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            System.out.println("Informe seu ano de nascimento: ");
            int anoNascimento = ler.nextInt();
            int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
            int idade = anoAtual - anoNascimento;
            System.out.println("Informe o mês do seu aniversário (1-12): ");
            int mesNascimento = ler.nextInt();

            System.out.println("Informe o dia do seu aniversário (1-31): ");
            int diaNascimento = ler.nextInt();


            Calendar hoje = Calendar.getInstance();
            int mesAtual = hoje.get(Calendar.MONTH) + 1;
            int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

            if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
                idade--;
            }

            System.out.println("Sua idade é: " + idade + " anos");
        }
    }
