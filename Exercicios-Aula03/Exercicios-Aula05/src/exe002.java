import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
//Exercício 2: Uso de Array
//Descrição: Crie um programa Java que gere automaticamente um array de 10 números inteiros aleatórios entre 1 e 100.
// Em seguida, peça ao usuário para inserir um número e verifique se esse número está presente no array.
// Exiba uma mensagem indicando se o número foi encontrado ou não.
public class exe002 {

    public static void main(String[] args) {
        int[] numeros2 = new int[5]; //
        Scanner ler = new Scanner(System.in);
        int i;
        int finalyu = 0;
        for (i= 0; i < numeros2.length; i++){
            Random random = new Random();
            int l = random.nextInt(100);; //
            numeros2[i] = l;
            finalyu += l;

        }
        System.out.println(Arrays.toString(numeros2));
        System.out.println(finalyu/numeros2.length);
    }
}

