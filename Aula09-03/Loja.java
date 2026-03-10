import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void cadastrarCliente(String nome, String cpf) {
        clientes.add(new Cliente(nome, cpf));
    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }

    public Produto getProduto(int indice) {
        return produtos.get(indice);
    }

    public void registrarVenda(Venda venda) {
        vendas.add(venda);
        System.out.println("Venda #" + vendas.size() + " finalizada para "
                + venda.getCliente().getNome()
                + " — Total: R$ " + String.format("%.2f", venda.calcularTotal()));
    }

    public void imprimirRecibos() {
        for (int i = 0; i < vendas.size(); i++) {
            vendas.get(i).imprimirRecibo(i + 1);
        }
    }

    public void imprimirResumoPorCliente() {
        System.out.println("\n-------- RESUMO POR CLIENTE --------");
        for (Cliente c : clientes) {
            double gastoTotal = 0;
            for (Venda v : vendas) {
                if (v.getCliente() == c) {
                    gastoTotal += v.calcularTotal();
                }
            }
            System.out.printf("%-15s | Total gasto: R$ %.2f%n", c.getNome(), gastoTotal);
        }
    }

    public void imprimirEstoque() {
        System.out.println("\n-------- ESTOQUE ATUAL --------");
        for (Produto p : produtos) {
            System.out.printf("%-14s | Estoque: %3d un.%n", p.getNome(), p.getEstoque());
        }
    }
}