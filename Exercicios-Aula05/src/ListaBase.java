import java.util.ArrayList;
import java.util.List;

//criar uma lista de tarefas. O programa deve permitir adicionar
// tarefas à lista, remover tarefas e exibir todas as tarefas na lista.
public class ListaBase{

    private List<tarefa> lista = new ArrayList<>();

    public <lista> List<tarefa> ImprimeTudo(lista) {
        return lista;
    }
    public int Apaga(Object item) {
        lista.remove(item);
    }
    public void Adiciona( item){
        lista.add(item);
    }
}
