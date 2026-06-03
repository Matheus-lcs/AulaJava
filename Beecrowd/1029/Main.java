import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    static int calls;
    
    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1)
            return 1;
        
        calls += 2;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if( n < 1 || n > 40){
            sc.close();
            
            System.exit(0);
        }
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            
            calls = 0;
            int result = fib(x);
            
            System.out.println("fib(" + x + ") = " + calls + " calls = " + result);
        }
        
        sc.close();
    }
 
}