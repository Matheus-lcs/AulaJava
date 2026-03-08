public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro l2 = new Livro("O Cortiço", "Aluísio Azevedo", 1890);
        Livro l3 = new Livro("Capitães da Areia", "Jorge Amado", 1937);
        Livro l4 = new Livro("Vidas Secas", "Graciliano Ramos", 1938);

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);
        biblioteca.adicionarLivro(l4);

        biblioteca.listarLivros();

        biblioteca.buscarLivro("Vidas Secas");
        biblioteca.buscarLivro("Iracema");
    }
}