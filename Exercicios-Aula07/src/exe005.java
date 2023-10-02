//Exercício 5: Tratamento de Erros com Exceções Personalizadas (RuntimeException)
//Crie uma exceção personalizada chamada IdadeInvalidaException que herde de RuntimeException.
// Em um programa, peça ao usuário que insira sua idade.
// Se a idade for menor que 0 ou maior que 150, lance a exceção IdadeInvalidaException com uma mensagem apropriada.
public class exe005 {
        import java.util.Scanner;
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            System.out.println("Qual a sua idade?");
            int idade = input.nextInt();
    
            if (idade > 400 || idade < 0) {
                // Vamos criar uma exceção personalizada em vez de usar RuntimeException
                IdadeInvalidaException erro = new IdadeInvalidaException("Idade inválida: " + idade);
                throw erro;
            } else {
                System.out.println("Idade válida: " + idade);
            }
        }
    }
    
    // Você precisa definir sua própria exceção personalizada
    class IdadeInvalidaException extends RuntimeException {
        public IdadeInvalidaException(String mensagem) {
            super(mensagem);
        }
    }
    
    

