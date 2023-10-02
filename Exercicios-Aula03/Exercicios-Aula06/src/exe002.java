import java.util.Scanner;
//Exercício 2: HashMap com pessoas
//Crie um programa Java que utilize uma estrutura de dados do tipo HashMap para associar nomes a idades.
// Insira algumas entradas no mapa e, em seguida, acesse e imprima a idade de um nome específico.
// Crie um método para imprimir nomes das pessoas que estão na terceira idade. Certifique-se de lidar com o caso
// em que o nome não está presente no mapa.
public class exe002 {
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
