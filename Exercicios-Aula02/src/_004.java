import java.util.Scanner;

public class _004 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Qual é o primeiro número?");
            int n1 = ler.nextInt();
            System.out.println("Qual é o segundo número?");
            int n2 = ler.nextInt();

            System.out.println("Digite '+' para somar");
            System.out.println("Digite '-' para subtrair");
            System.out.println("Digite '/' para dividir");
            System.out.println("Digite '*' para multiplicar");
            System.out.println("Caso a operação seja inválida, você deve repetir.");

            char operacao = ler.next().charAt(0);

            int resultado = 0;
            boolean operacaoValida = true;

            if (operacao == '+') {
                resultado = n1 + n2;
            } else if (operacao == '-') {
                resultado = n1 - n2;
            } else if (operacao == '/') {
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    operacaoValida = false;
                }
            } else if (operacao == '*') {
                resultado = n1 * n2;
            } else {
                System.out.println("Operação inválida.");
                operacaoValida = false;
            }

            if (operacaoValida) {
                System.out.println("O resultado da operação é: " + resultado);
            }

            System.out.println("Deseja parar de calcular? [s/n]");
            char resposta = ler.next().charAt(0);
            if (resposta == 'n' || resposta == 'N') {
                break;
            }
        }

        ler.close();
    }
}
