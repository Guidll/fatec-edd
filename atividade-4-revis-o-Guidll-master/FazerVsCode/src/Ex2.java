import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        Queue<String> filaNormal = new LinkedList<>();
        Queue<String> filaPrioritaria = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        int contadorNormal = 0;
        int senhaNormal = 1;
        int senhaPrioritaria = 1;

        // Constroi lista de atendimento
        while (true) {
            System.out.println("Digite o tipo de atendimento (normal/prioritario) ou 'sair' para terminar:");
            String atendimento = scanner.nextLine().trim().toLowerCase();

            if (atendimento.equals("sair")) {
                break;
            }

            if (!atendimento.equals("normal") && !atendimento.equals("prioritario")) {
                System.out.println("Entrada inválida. Digite 'normal' ou 'prioritario'.");
                continue;
            }

            if (atendimento.equals("normal")) {
                String senha = "N" + senhaNormal++;
                filaNormal.add(senha);
                System.out.println("Senha " + senha + " (Normal) recebida.");
            } else if (atendimento.equals("prioritario")) {
                String senha = "P" + senhaPrioritaria++;
                filaPrioritaria.add(senha);
                System.out.println("Senha " + senha + " (Prioritário) recebida.");
            }

            System.out.println("Pessoas na fila Normal: " + filaNormal.size());
            System.out.println("Pessoas na fila Prioritária: " + filaPrioritaria.size());
        }

        // Simula a atendimento
        System.out.println("\nIniciando o atendimento...\n");
        
        // Simula a atendimento
        while (!filaNormal.isEmpty() || !filaPrioritaria.isEmpty()) {
            if (!filaPrioritaria.isEmpty() && contadorNormal < 3) {
                String senha = filaPrioritaria.poll();
                System.out.println("Atendendo senha " + senha + " (Prioritário).");
                contadorNormal++;
            } else if (!filaNormal.isEmpty()) {
                String senha = filaNormal.poll();
                System.out.println("Atendendo senha " + senha + " (Normal).");
                contadorNormal = 0; // Reinicia o contador após atender uma senha normal
            } else {
                // Reseta o contador se não houver senhas prioritárias
                contadorNormal = 0;
            }
        }

        // Msg final
        System.out.println("\nTodos os atendimentos foram concluídos.");
        scanner.close();
    }
}