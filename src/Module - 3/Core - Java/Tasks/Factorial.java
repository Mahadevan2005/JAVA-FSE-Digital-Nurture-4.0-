import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int fact = 1;
        int i = n;
        while(i > 0)
        {
            fact = fact*i;
            i--;
        }
        System.out.println("Factorial of the number is: " + fact);
        sc.close();
    }
}
