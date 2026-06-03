import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }

            if (x % 2 != 0) {
                x++;
            }

            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += x + i * 2;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
