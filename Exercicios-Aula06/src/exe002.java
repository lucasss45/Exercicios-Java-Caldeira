import java.util.HashSet;
import java.util.Scanner;
//Exercício 2: HashMap com pessoas
//Crie um programa Java que utilize uma estrutura de dados do tipo HashMap para associar nomes a idades.
// Insira algumas entradas no mapa e, em seguida, acesse e imprima a idade de um nome específico.
// Crie um método para imprimir nomes das pessoas que estão na terceira idade. Certifique-se de lidar com o caso
// em que o nome não está presente no mapa.
import java.util.HashMap;



public class exe002 {
    public static void ImprimirIdosos(HashMap<String, Integer> pessoas) {
        for (String nome : pessoas.keySet()) {
            int idade = pessoas.get(nome);
            if (idade < 60) {
                System.out.println(nome + " é um idoso");
            }
        }
    }

    public static void main(String[] args) {
        // Criando um HashMap para associar nomes a idades
        HashMap<String, Integer> pessoas = new HashMap<>();

        // Adicionando pessoas com suas idades
        pessoas.put("Mario", 30);
        pessoas.put("Luigi", 28);
        pessoas.put("Yoshi", 25);
        pessoas.put("Peach", 32);

        // Acessando a idade de uma pessoa
        int idadeMario = pessoas.get("Mario");
        System.out.println("A idade de Mario é: " + idadeMario);

        // Chame o método ImprimirIdosos para imprimir nomes de pessoas com menos de 60 anos
        ImprimirIdosos(pessoas);
    }
}


