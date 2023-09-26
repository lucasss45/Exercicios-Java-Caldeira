import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class _002 {

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

