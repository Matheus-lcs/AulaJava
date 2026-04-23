import java.util.*;

public class Produto {

    private String codigo;
    private String nome;
    private double preco;
    private String categoria;

    // Construtor
    public Produto(String codigo, String nome, double preco, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    // Método exibir
    public void exibir() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Categoria: " + categoria);
    }

    // Main (teste)
    public static void main(String[] args) {

        Produto p1 = new Produto("001", "Cachorro quente", 12.0, "paes");
        Produto p2 = new Produto("002", "Suco de Laranja", 5.0, "Bebida");
        Produto p3 = new Produto("003", "Coca-Cola", 12.0, "Bebida");
        Produto p4 = new Produto("004", "Coxinha", 7.0, "Salgado");
        Produto p5 = new Produto("005", "Pastelao", 7.0, "Salgado");

        p1.exibir();
        p2.exibir();
        p3.exibir();
        p4.exibir();
        p5.exibir();

    }
}