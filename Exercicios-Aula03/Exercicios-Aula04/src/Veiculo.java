import java.util.Scanner;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int distancia;
    protected int ano;
    protected double custoTotal;

    public double calcularCustoViagem(double distancia) {
        this.custoTotal = distancia  ;
        return custoTotal;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo(String modelo, String marca, int Ano, int distancia) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.distancia = distancia;
    }
}

//Métodos abstratos:
//
//calcularCustoViagem(int distancia): Este método deve ser abstrato e calcular o custo de uma viagem com bas e na distância fornecida.
//1.2 Crie duas classes concretas que herdem de Veiculo: Carro e Moto. Implemente o método calcularCustoViagem(int distancia) em cada uma dessas classes:
//
//Carro deve ter um custo fixo de R$0.20 por quilômetro.
//Moto deve ter um custo fixo de R$0.15 por quilômetro.
