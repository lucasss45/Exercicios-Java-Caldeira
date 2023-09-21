public class Circulo extends FormaGeometrica {
    private double perimetro;
    private double raio;
    private  double length;
    private double width;
    private double Dmenor;
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}