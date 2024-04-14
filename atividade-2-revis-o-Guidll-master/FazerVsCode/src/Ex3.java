import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int value;

        // Estrutura de repetição para verificar se o número digitado é valido pelas regras do exercício
        do {
            System.out.print("Digite um número entre 1 e 1000: ");
            value = scanner.nextInt();
        } while (value <= 0 || value >= 1000);
        
        int[] array = new int[value]; 
        
        // Coloca os números subsequentes
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Exibe o array com todos os números subsequentes partindo do 1
        System.out.print("Array resultante: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        scanner.close();
    }
}
