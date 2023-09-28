import java.util.ArrayList;
//criar arraylist de tarefas, ok

    public class _004 extends ListaBase{
        public static void main(String[] args) {
            //ArrayList<Object> lista3 = new ArrayList<Object>();
            ListaBase lista = new ListaBase();
            Tarefa tarefa1 = new Tarefa("Arroz", "Comida", "09/01/1919");
            Tarefa tarefa2 = new Tarefa("Espada", "Academia", "10/10/2000");


            lista.adicionar(tarefa2);

            System.out.println("Itens na lista:");
            lista.imprimirTodas();

            lista.remover(tarefa1);

            System.out.println("Itens após a remoção:");
            lista.imprimirTodas();


        }
    }


