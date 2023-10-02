package exe002;

//Exercício 2: Enum
//Crie um enum chamado DiaDaSemana que represente os dias da semana(por exemplo, SEGUNDA, TERCA, etc.).
//Escreva um programa que aceite um dia da semana do usuário e imprima uma mensagem de acordo com o dia escolhido.
public class Dia {
    enum Semana {
        Segunda,
        Terça,
        Quarta,
        Quinta,
        Sexta,
        Sabado,
        Domingo;
    }

    // Uso do enum em um método
    public void MensagemDoDia(Semana dia) {
        if (dia == Semana.Segunda) {
            System.out.println("Mas que Saco!!!!");
        } else if (dia == Semana.Terça) {
            System.out.println("Bom Vamo Nessa");
        } else if (dia == Semana.Quarta) {
            System.out.println("Dia Bonzim");
        } else if (dia == Semana.Quinta) {
            System.out.println("Bem Tranquilo");
        } else if (dia == Semana.Sexta) {
            System.out.println("Aeeeeee Finalmente");
        } else if (dia == Semana.Sabado) {
            System.out.println("Melhor Dia na Moral");
        } else if (dia == Semana.Domingo) {
            System.out.println("Que dia Sonolente e parado né");
        } else {
            System.out.println("Dia Invalido");
        }
    }

    public static void main(String[] args) {
        Dia DiadaSemana = new Dia();
        DiadaSemana.MensagemDoDia(Semana.Sabado);
    }
}
