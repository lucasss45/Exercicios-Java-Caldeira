// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        int hora = 10;
        int minuto = 30;
        int segundo = 45;

        int segundosDesdeMeiaNoite = (hora * 3600) + (minuto * 60) + segundo;
        int segundosParaMeiaNoite = (24 * 3600) - segundosDesdeMeiaNoite;

        System.out.println("Segundos desde a meia-noite: " + segundosDesdeMeiaNoite + " segundos");
        System.out.println("Segundos que faltam para a meia-noite: " + segundosParaMeiaNoite + " segundos");
    }
}
