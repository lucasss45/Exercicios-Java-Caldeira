public class Losango extends FormaGeometrica {
    private double perimetro;
    private double Dmaior;
    private  double length;
    private double width;
    private double Dmenor;
    public double Losango(double raio, double Dmenor, double Dmaior) {
        this.Dmaior = 13;
        this.length = 21;
        this.width = 34;
        this.Dmenor = 10;
        return 0;
    }

    @Override
    public double calcularArea() {
        return (Dmenor * Dmaior)/2;
    }

    @Override
    public double calcularPerimetro() {
        return perimetro = 2 * (this.length + this.width);
    }
}