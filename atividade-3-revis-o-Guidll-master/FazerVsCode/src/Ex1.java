import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        int[] num = new int[10];
        int[] num_Pares = new int[10];
        int[] num_Impares = new int[10];

        // Contadores
        int cont_Pares = 0;
        int cont_Impares = 0;

        // Loop pra pegar a entrada do usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um value inteiro (entre 1 e 100): ");
            value = scanner.nextInt();

            // Verifica se o número é valido
            while (value <= 0 || value >= 100) {
                System.out.println("value inválido. Digite novamente (entre 1 e 100): ");
                value = scanner.nextInt();
            }

            // Armazenando o value no array padrão
            num[i] = value;

            // Verificando se o value é par ou ímpar
            if (value % 2 == 0) {
                num_Pares[cont_Pares] = value;
                cont_Pares++;
            } else {
                num_Impares[cont_Impares] = value;
                cont_Impares++;
            }
        }

        // Exibindo o array de números
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }

        // Exibindo o array de números pares
        System.out.println("\n\nNúmeros pares:");
        for (int i = 0; i < cont_Pares; i++) {
            System.out.print(num_Pares[i] + " ");
        }

        // Exibindo o array de números ímpares
        System.out.println("\n\nNúmeros ímpares:");
        for (int i = 0; i < cont_Impares; i++) {
            System.out.print(num_Impares[i] + " ");
        }

        scanner.close();
    }
}
