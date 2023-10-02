package exe001;


//Exercício 1: Interface
//Crie uma interface chamada Desenhavel com um método desenhar(). Em seguida, crie duas classes, Circulo e Quadrado, que implementam essa interface e tenham implementações diferentes para o método desenhar().
//
//---> O método desenhar pode só criar um print na dela dizendo "vou desenhar o 'nomedafigura'.
public class exe001 {
    static Quadrado quad = new Quadrado();
    static Circulo circulin = new Circulo();
    public static void main(String[] args) {
        quad.desenhar();
        circulin.desenhar();
    }


}
