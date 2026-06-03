import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<ItemVenda> itens;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (ItemVenda item : itens) {
            valorTotal += item.calcularValorTotal();
        }
        return valorTotal;
    }
    
    public List<ItemVenda> getItens() {
        return itens;
    }

    public static void main(String[] args) {
        Venda venda = new Venda();
        ItemVenda item1 = new ItemVenda("Produto A", 10.0, 5);
        venda.adicionarItem(item1);
        System.out.println("Valor total da venda: " + venda.calcularValorTotal());
    }
}