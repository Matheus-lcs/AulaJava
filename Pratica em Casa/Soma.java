import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===Calculadora===");

        try {
            System.out.println("Digite o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = sc.nextInt();

            int soma = num1 + num2;

            System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
        } finally {
            sc.close();
        }
    }
}