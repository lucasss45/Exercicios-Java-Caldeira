package exe001;

public class Quadrado implements Desenhavel {
    private String Quadrado;
    String NomeDaFigura = Quadrado;
    @Override
    public void desenhar() {
        System.out.println("vou desenhar o " + NomeDaFigura);
    }
}