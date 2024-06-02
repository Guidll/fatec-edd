import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        // Cria a fila com a lib
        Queue<String> filaDeImpressao = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Loop para criar a lista de arquivos
        while (true) {
            System.out.println("Digite o nome do documento a ser adicionado à fila (ou 'sair' para terminar):");
            String nomeDoc = scanner.nextLine();

            if (nomeDoc.equalsIgnoreCase("sair")) {
                break;
            }

            filaDeImpressao.add(nomeDoc);
            System.out.println("Documento '" + nomeDoc + "' adicionado à fila de impressão.");
        }

        // Simula a impressão dos docs
        System.out.println("\nIniciando a impressão dos documentos...\n");
        
        // Simula a impressão dos docs
        while (! filaDeImpressao.isEmpty()) {
            String docASerImpresso = filaDeImpressao.poll();
            System.out.println("Imprimindo documento: " + docASerImpresso);
        }

        // Msg final
        System.out.println("\nTodos os documentos foram impressos.");
        scanner.close();
    }
}