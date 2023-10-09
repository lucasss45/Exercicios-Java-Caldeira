//Exercício 2: Gradle + Streams
//Crie um projeto Java usando o Gradle que processe uma lista de objetos do tipo "Produto"
// com os seguintes atributos: nome (String), preço (double) e quantidade (int).
// Utilizando Streams, implemente as seguintes operações:
// a) Encontre o produto mais caro na lista.
// b) Calcule o preço total de todos os produtos na lista.
// c) Filtre os produtos com quantidade superior a 10 e crie uma nova lista com eles.

package org.example;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crie uma lista de objetos Caracteristicas
        List<Caracteristicas> listaCaracteristicas = new ArrayList<>();

        Caracteristicas produtoA = new Caracteristicas("PS5", 10.0, 5);
        Caracteristicas produtoB = new Caracteristicas("Violão", 8.5, 3);
        Caracteristicas produtoC = new Caracteristicas("Katana", 10.0, 5);
        Caracteristicas produtoD = new Caracteristicas("Carro", 8.5, 3);

        listaCaracteristicas.add(produtoA);
        listaCaracteristicas.add(produtoB);
        listaCaracteristicas.add(produtoC);
        listaCaracteristicas.add(produtoD);

        // Imprima a lista de objetos Caracteristicas
        System.out.println(listaCaracteristicas);
    }
}
