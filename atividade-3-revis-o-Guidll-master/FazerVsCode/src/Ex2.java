import java.util.Scanner;
import java.util.Stack;

public class Ex2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;

        // Criando a pilha
        Stack<Integer> numeros = new Stack<>();

        // Loop pra pegar a entrada do usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um value inteiro (entre 1 e 100): ");
            value = scanner.nextInt();

            // Verifica se o número é valido
            while (value <= 0 || value >= 100) {
                System.out.println("value inválido. Digite novamente (entre 1 e 100): ");
                value = scanner.nextInt();
            }

            // Inserindo número par na pilha
            numeros.push(value);
            
            // Verificando se o value ímpar e remove da
            if (value % 2 != 0) {
         
                if (numeros.isEmpty()) {
                    System.out.println("A pilha está vazia!");
                } else {
                    // Removendo número ímpar da pilha
                    numeros.pop(); 
                }
            }
        }

        System.out.println("\nElementos da pilha (Não desempilhados):");
        System.out.println("\n" + numeros);
        System.out.println("\nElementos da pilha (desempilhados):");
        
        while (!numeros.isEmpty()) {
            System.out.print(numeros.pop() + " ");
        }

        scanner.close();
    }
}
