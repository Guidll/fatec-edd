import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Texto no terminal
        System.out.print("Digite um valor menor ou igual a 20: ");
        int value = scanner.nextInt();
    
        // Array de 10 números exponeciais
        if (value <= 20) {
            int[] array = new int[10];

            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    array[i] = value;
                } else {
                    array[i] = array[i - 1] * 2;
                }
            }
            
            // Exibe o array resultante
            System.out.print("Array resultante: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

        }
        else {
            System.out.println("O valor digitado é maior que 20.");
        }
    
        scanner.close();
    }
}
