import java.util.Stack;

public class LivroPilha {
    private Stack<Livro> LivroPilha;

    // Construtor
    public LivroPilha() {
        this.LivroPilha = new Stack<>();
    }

    public void adicionarLivro(Livro livro) {
        if (LivroPilha.size() < 15) {
            LivroPilha.push(livro);
            System.out.println("Livro adicionado com sucesso!");
        } else {
            System.out.println("Pilha de livros está cheia!");
        }
    }

    public void mostrarLivros() {
        for (Livro livro : LivroPilha) {
            livro.mostrarDetalhes();
            System.out.println("---------");
        }
    }

    public int quantidadeLivros() {
        return LivroPilha.size();
    }

    public static void main(String[] args) {
        LivroPilha pilha = new LivroPilha();

        Livro livro1 = new Livro("Livro 1", "Autor 1", 1, 1981);
        Livro livro2 = new Livro("Livro 2", "Autor 2", 2, 1982);
        Livro livro3 = new Livro("Livro 3", "Autor 3", 3, 1983);
        Livro livro4 = new Livro("Livro 4", "Autor 4", 4, 1984);
        Livro livro5 = new Livro("Livro 5", "Autor 5", 5, 1985);

        pilha.adicionarLivro(livro1);
        pilha.adicionarLivro(livro2);
        pilha.adicionarLivro(livro3);
        pilha.adicionarLivro(livro4);
        pilha.adicionarLivro(livro5);

        System.out.println("Quantidade de livros na pilha: " + pilha.quantidadeLivros());
        System.out.println("Detalhes dos livros na pilha:");
        pilha.mostrarLivros();
    }
}