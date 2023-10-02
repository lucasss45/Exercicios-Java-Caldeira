package exe004;



public class Conta implements Calculavel {
    @Override
    public int dividir(int n1, int n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
    }

    @Override
    public int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    enum Operacoes {
        Somar,
        Subtrair,
        Multiplicar,
        Dividir
    }

    public double calcular(int n1, int n2, Operacoes operacao) {
        try {
            switch (operacao) {
                case Somar:
                    return somar(n1, n2);
                case Subtrair:
                    return subtrair(n1, n2);
                case Multiplicar:
                    return multiplicar(n1, n2);
                case Dividir:
                    return dividir(n1, n2);
                default:
                    throw new IllegalArgumentException("Operação inválida.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return Double.NaN; // Retornar NaN (Not-a-Number) em caso de divisão por zero.
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return Double.NaN; // Retornar NaN para operações inválidas.
        }
    }
}
