import java.util.Scanner;

public class ItemVenda {
    private String nomeProduto;
    private double precoUnitario;
    private int quantidade;

    public ItemVenda(String nomeProduto, double precoUnitario, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return precoUnitario * quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.print("digite o preco unitario do produto: ");
        double precoUnitario = sc.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();
        ItemVenda item = new ItemVenda(nomeProduto, precoUnitario, quantidade);
        double valorTotal = item.calcularValorTotal();
        System.out.println("O valor total da venda é: " + valorTotal);
    }
}