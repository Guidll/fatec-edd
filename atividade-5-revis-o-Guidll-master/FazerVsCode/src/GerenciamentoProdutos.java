import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto
{
    private String nome;
    private String marca;
    private String cor;
    private double valor;

    public Produto(String nome, String marca, String cor, double valor) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "[Produto=" + nome + ", Marca=" + marca + ", Cor=" + cor + ", Valor=" + valor + "]";
    }
}

public class GerenciamentoProdutos
{
    private static List<Produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Deletar Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    criarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    atualizarProduto();
                    break;
                case 4:
                    deletarProduto();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void criarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a marca do produto: ");
        String marca = scanner.nextLine();
        System.out.print("Digite a cor do produto: ");
        String cor = scanner.nextLine();
        System.out.print("Digite o valor do produto: ");
        double valor = Double.parseDouble(scanner.nextLine());

        Produto produto = new Produto(nome, marca, cor, valor);
        produtos.add(produto);
        System.out.println("Produto criado com sucesso!");
    }

    private static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        } else {
            System.out.println("\nLista de Produtos:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + ". " + produtos.get(i));
            }
        }
    }

    private static void atualizarProduto() {
        listarProdutos();
        if (produtos.isEmpty()) {
            return;
        }
        System.out.print("Digite o número do produto que deseja atualizar: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index < 0 || index >= produtos.size()) {
            System.out.println("Produto inválido.");
            return;
        }

        Produto produto = produtos.get(index);

        System.out.print("Digite o novo nome do produto (atual: " + produto.getNome() + "): ");
        String nome = scanner.nextLine();
        if (!nome.isEmpty()) {
            produto.setNome(nome);
        }

        System.out.print("Digite a nova marca do produto (atual: " + produto.getMarca() + "): ");
        String marca = scanner.nextLine();
        if (!marca.isEmpty()) {
            produto.setMarca(marca);
        }

        System.out.print("Digite a nova cor do produto (atual: " + produto.getCor() + "): ");
        String cor = scanner.nextLine();
        if (!cor.isEmpty()) {
            produto.setCor(cor);
        }

        System.out.print("Digite o novo valor do produto (atual: " + produto.getValor() + "): ");
        String valorStr = scanner.nextLine();
        if (!valorStr.isEmpty()) {
            double valor = Double.parseDouble(valorStr);
            produto.setValor(valor);
        }

        System.out.println("Produto atualizado com sucesso!");
    }

    private static void deletarProduto() {
        listarProdutos();
        if (produtos.isEmpty()) {
            return;
        }
        System.out.print("Digite o número do produto que deseja deletar: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index < 0 || index >= produtos.size()) {
            System.out.println("Produto inválido.");
            return;
        }

        produtos.remove(index);
        System.out.println("Produto deletado com sucesso!");
    }
}
