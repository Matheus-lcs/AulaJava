import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Cliente cliente;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean adicionarItem(Produto produto, int quantidade) {
        if (produto.reduzirEstoque(quantidade)) {
            itens.add(new ItemVenda(produto, quantidade));
            return true;
        }
        return false;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void imprimirRecibo(int numeroVenda) {
        System.out.println("\n====== RECIBO VENDA #" + numeroVenda + " ======");
        System.out.println("Cliente : " + cliente.getNome() + "  CPF: " + cliente.getCpf());
        System.out.println("Itens:");
        for (ItemVenda item : itens) {
            System.out.printf("  - %-14s x%d  R$ %.2f%n",
                    item.getProduto().getNome(),
                    item.getQuantidade(),
                    item.calcularSubtotal());
        }
        System.out.printf("TOTAL: R$ %.2f%n", calcularTotal());
    }

    public Cliente getCliente() {
        return cliente;
    }
}