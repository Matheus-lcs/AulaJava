import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lanchonete l = new Lanchonete();

        // Produtos
        Produto p1 = new Produto("001", "Cachorro quente", 12.0, "paes");
        Produto p2 = new Produto("002", "Suco de Laranja", 5.0, "Bebida");
        Produto p3 = new Produto("003", "Coca-Cola", 12.0, "Bebida");
        Produto p4 = new Produto("004", "Coxinha", 7.0, "Salgado");
        Produto p5 = new Produto("005", "Pastelao", 7.0, "Salgado");

        l.adicionarProduto(p1);
        l.adicionarProduto(p2);
        l.adicionarProduto(p3);
        l.adicionarProduto(p4);
        l.adicionarProduto(p5);

        int opcao;

        do {
            System.out.println("\n=== LANCHONETE ===");
            System.out.println("1 - Ver cardápio");
            System.out.println("2 - Criar pedido");
            System.out.println("3 - Atender próximo pedido");
            System.out.println("4 - Ver último atendido");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    l.mostrarCardapio();
                    break;

                case 2:
                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();

                    Pedido pedido = new Pedido(nome);

                    String continuar;

                    do {
                        System.out.print("Digite o código do produto: ");
                        String codigo = sc.nextLine();

                        Produto p = l.buscarProduto(codigo);

                        if (p != null) {
                            pedido.adicionarItem(p);
                            System.out.println("Produto adicionado!");
                        } else {
                            System.out.println("Produto não encontrado!");
                        }

                        System.out.print("Adicionar mais? (s/n): ");
                        continuar = sc.nextLine();

                    } while (continuar.equalsIgnoreCase("s"));

                    l.fazerPedido(pedido);
                    break;

                case 3:
                    l.atenderProximo();
                    break;

                case 4:
                    l.mostrarUltimoAtendido();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}