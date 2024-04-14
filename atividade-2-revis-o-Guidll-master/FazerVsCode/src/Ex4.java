import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int value;

        // Estrutura de repetição para verificar se o número digitado é valido pelas regras do exercício
        do {
            System.out.print("Digite um número entre 1 e 99: ");
            value = scanner.nextInt();
        } while (value <= 0 || value >= 100);

        int[] array = new int[10];
        int soma = 0;

        // Coloca os números subsequentes
        for (int i = 0; i < 10; i++) {
            array[i] = value - i;
            soma += array[i];
        }

        // Exibe a lista de números
        System.out.print("Array resultante: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Soma de todos os números
        System.out.println("\nSoma dos números: " + soma);

        scanner.close();
    }
}
