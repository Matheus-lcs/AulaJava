import java.util.*;

public class Lanchonete {

    private ArrayList<Produto> cardapio;
    private Queue<Pedido> filaDePedidos;
    private Stack<Pedido> historico;

    // Construtor
    public Lanchonete() {
        this.cardapio = new ArrayList<>();
        this.filaDePedidos = new LinkedList<>();
        this.historico = new Stack<>();
    }

    // =========================
    // ADICIONAR PRODUTO
    // =========================
    public void adicionarProduto(Produto produto) {
        cardapio.add(produto);
    }

    // =========================
    // MOSTRAR CARDÁPIO
    // =========================
    public void mostrarCardapio() {
        System.out.println("=== CARDÁPIO ===");
        for (Produto p : cardapio) {
            p.exibir();
        }
    }

    // =========================
    // BUSCAR PRODUTO POR CÓDIGO
    // =========================
    public Produto buscarProduto(String codigo) {
        for (Produto p : cardapio) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    // =========================
    // FAZER PEDIDO
    // =========================
    public void fazerPedido(Pedido pedido) {
        filaDePedidos.add(pedido);
        System.out.println("Pedido adicionado na fila!");
    }

    // =========================
    // ATENDER PRÓXIMO PEDIDO
    // =========================
    public void atenderProximo() {
        if (filaDePedidos.isEmpty()) {
            System.out.println("Nenhum pedido na fila.");
            return;
        }

        Pedido pedido = filaDePedidos.poll();
        historico.push(pedido);

        System.out.println("=== PEDIDO ATENDIDO ===");
        pedido.exibirPedido();
        System.out.println("Total: " + pedido.calcularTotal());
    }

    // =========================
    // VER ÚLTIMO ATENDIDO
    // =========================
    public void mostrarUltimoAtendido() {
        if (historico.isEmpty()) {
            System.out.println("Nenhum pedido foi atendido ainda.");
            return;
        }

        System.out.println("=== ÚLTIMO PEDIDO ATENDIDO ===");
        historico.peek().exibirPedido();
    }
}