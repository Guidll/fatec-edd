public class Livro {
    private String nome;
    private String autor;
    private int ISBN;
    private int ano;

    // Construtor
    public Livro(String nome, String autor, int ISBN, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ano = ano;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Ano: " + ano);
    }
}