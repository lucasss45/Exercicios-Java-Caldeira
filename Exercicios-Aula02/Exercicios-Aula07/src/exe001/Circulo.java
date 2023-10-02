package exe001;

public class Circulo implements Desenhavel {
    private String Circulo;
    String NomeDaFigura = Circulo;
    @Override
    public void desenhar() {
        System.out.println("vou desenhar o " + NomeDaFigura);
    }
}
