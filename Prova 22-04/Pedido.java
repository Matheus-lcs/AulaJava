import java.util.*;

public class Pedido {

    private String cliente;
    private ArrayList<Produto> itens;

    // Construtor
    public Pedido(String cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // Adicionar produto
    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    // Exibir pedido
    public void exibirPedido() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Itens do pedido:");

        for (Produto p : itens) {
            p.exibir();
        }
    }

    // Calcular total
    public double calcularTotal() {
        double total = 0;

        for (Produto p : itens) {
            total += p.getPreco();
        }

        // aplica desconto se necessário
    if (total > 50.0) {
        total = total * 0.9; // 10% de desconto
    }


        return total;
    }
}