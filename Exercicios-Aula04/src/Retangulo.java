public class Retangulo extends FormaGeometrica {
    private double perimetro;
    private double Dmaior;
    private  double length;
    private double width;
    private double Dmenor;
    public double Retangulo(double raio, double Dmenor, double Dmaior) {
        this.Dmaior = 13;
        this.length = 21;
        this.width = 34;
        this.Dmenor = 10;
        return 0;
    }

    @Override
    public double calcularArea() {
        return (this.length + this.width);
    }

    @Override
    public double calcularPerimetro() {
        return ((2*this.width)+(2*this.length));
    }
}