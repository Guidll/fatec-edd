import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args)
    {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números inteiros (maiores que 0 e menores que 100). Digite 'sair' para terminar:");

        // Cria  lista de números desordenados
        while (true) {
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                int value = Integer.parseInt(entrada);

                if (value > 0 && value < 100) {
                    numeros.add(value);
                } else {
                    System.out.println("O número deve ser maior que 0 e menor que 100. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro ou 'sair' para terminar.");
            }
        }

        // Ordena os números
        Collections.sort(numeros);

        // Msg final
        System.out.println("Lista ordenada:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}