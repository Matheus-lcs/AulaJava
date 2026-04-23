import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Animal> filaAnimais = new ArrayDeque<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 Adicionar animal a fila");
            System.out.println("2 Atender proximo animal");
            System.out.println("3 Mostrar fila");
            System.out.println("4 Sair");
            System.out.println("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do animal: ");
                    String nome = sc.nextLine();
                    filaAnimais.add(nome);
                    break;
                case 2:
                    if (!filaAnimais.isEmpty()) {
                    System.out.println("Atendendo: " + filaAnimais.poll());
                    } else {
                        System.out.println("Fila vazia!");
                    }
                    break;
                case 3:
                    System.out.println("Fila atual: " + filaAnimais);
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        }while (opcao != 4);

        sc.close();
    }
}