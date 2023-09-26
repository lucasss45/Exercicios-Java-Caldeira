import java.util.Arrays;
import java.util.Scanner;

public class _001 {

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
