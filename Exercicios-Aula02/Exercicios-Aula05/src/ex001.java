import java.util.Arrays;
import java.util.Scanner;

//Exercício 1: Uso de Array
//Descrição: Crie um programa Java que peça ao usuário para inserir 5 números inteiros e armazene-os
// em um array. Em seguida, calcule e exiba a soma e a média dos números inseridos.
public class ex001 {

    public static void main(String[] args) {
        int[] numeros = new int[5]; //

        Scanner ler = new Scanner(System.in);

        int i;
        int finalyu = 0;
        for (i= 0; i < numeros.length; i++){
            System.out.println("Diga o primeiro numero da lista");
            int l = ler.nextInt(); //
            numeros[i] = l;
            finalyu += l;

        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(finalyu/numeros.length);
      }
    }
