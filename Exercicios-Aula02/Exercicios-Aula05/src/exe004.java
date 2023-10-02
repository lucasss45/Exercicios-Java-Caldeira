import listas.ListaBase;
import listas.Tarefa;

//Exercício 4: Uso de List e ArrayList
//Descrição: Crie um programa Java que simule uma lista de compras.
// O programa deve permitir que o usuário adicione itens à lista, remova itens da lista e exiba a lista de compras atual.
// Use um ArrayList para armazenar os itens da lista de compras.
// Compra deve ser uma classe do seu código com os atributos: nome e data de validade e métodos que você julgue necessários.

    public class exe004 extends ListaBase{
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


