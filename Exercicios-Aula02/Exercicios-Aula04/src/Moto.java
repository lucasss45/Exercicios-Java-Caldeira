import java.util.Scanner;
public class Moto extends Veiculo {
    @Override
    public double calcularCustoViagem(double distancia) {
        double custoTotal = distancia * 0.20;
        return custoTotal;
    }


    public Moto(String modelo, String marca, int Ano, int distancia) {
        super (modelo, marca, Ano, distancia);

    }



}
