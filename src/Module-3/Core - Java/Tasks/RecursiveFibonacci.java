import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
        sc.close();
    }
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
