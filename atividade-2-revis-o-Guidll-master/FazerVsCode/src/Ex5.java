import java.util.Scanner;

public class Ex5
{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int value;

        // Solicita ao usuário um número entre 1 e 49
        do {
            System.out.print("Digite um número entre 1 e 49: ");
            value = scanner.nextInt();
        } while (value <= 0 || value >= 50);

        // Cria uma matriz com base no número digitado
        int[][] matriz = new int[value * value][2];
        int contador = 0;

        // Coloca os números na matriz
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                matriz[contador][0] = i;
                matriz[contador][1] = j;
                contador++;
            }
        }

        // Exibe a matriz
        System.out.println("Matriz resultante:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[" + matriz[i][0] + "," + matriz[i][1] + "] ");
        }

        scanner.close();
    }
}
