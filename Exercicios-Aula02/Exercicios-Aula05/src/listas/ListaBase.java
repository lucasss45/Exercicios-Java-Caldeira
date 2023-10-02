package listas;

import java.util.ArrayList;
import java.util.List;

public class ListaBase {

    private List<Tarefa> lista = new ArrayList<>();

    public List<Tarefa> getLista() {
        return lista;
    }

    public void adicionar(Tarefa tarefa) {
        lista.add(tarefa);
    }

    public void remover(Tarefa tarefa) {
        lista.remove(tarefa);
    }

    public void imprimirTodas() {
        for (Tarefa tarefa : lista) {
            System.out.println("Nome: " + tarefa.nome);
            System.out.println("Descrição: " + tarefa.descricao);
            System.out.println("Data: " + tarefa.data);
            System.out.println();
        }
    }
}
