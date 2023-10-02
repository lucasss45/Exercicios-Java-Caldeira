import java.util.Scanner;
//Exercício 1: Stack com livros
//Crie um programa Java que utilize uma estrutura de dados do tipo Stack para armazenar objetos da classe Livros.
// Implemente a classe Livro, com titulo e categoria, inicialize a pilha com alguns livros, imprimir os elementos da pilha,
// imprimir com base na categoria e implemente um loop para remover até que ela esteja vazia.
public class exe001 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Bem Vindo!!!!");
        System.out.println("Este programa é capaz de calcular os números primos entre dois números da sua escolha, sinta-se livre para testar");
        System.out.println("Qual é o primeiro número?");
        int n1 = ler.nextInt();
        System.out.println("Qual é o segundo número?");
        int n2 = ler.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
