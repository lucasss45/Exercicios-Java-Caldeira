import java.util.ArrayList;
//criar arraylist de tarefas, ok
// permitir adicionar tarefas à lista,ok
//criar menu pro usuario
// remover tarefas e exibir todas as tarefas na lista ok
//Tarefa deve ser uma classe do seu código com os atributos:
// titulo, data e descrição e métodos que você julgue necessários.
public class _003 extends ListaBase{
    public static void main(String[] args) {
        //ArrayList<Object> lista3 = new ArrayList<Object>();
        ListaBase lista3 = new ListaBase();
        Tarefa tarefa1 = new Tarefa("Ir no Zafari", "Comprar comida", "09-01-1010");
        Tarefa tarefa2 = new Tarefa("Treinar", "Preparar-se para a luta", "10/10/2100");


        lista3.adicionar(tarefa2);

        System.out.println("Tarefas na lista:");
        lista3.imprimirTodas();

        lista3.remover(tarefa1);

        System.out.println("Tarefas após a remoção:");
        lista3.imprimirTodas();

//

    }
}
