import java.util.*;

public class Biblioteca {

    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        System.out.println("=== Acervo da Biblioteca ===");

        for (Livro livro : livros) {
            livro.exibirInformacoes();
        }
    }

    public void buscarLivro(String titulo) {
        System.out.println("=== Busca ===");

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.exibirInformacoes();
                return;
            }
        }

        System.out.println("Livro \"" + titulo + "\" não encontrado no acervo.");
    }
}