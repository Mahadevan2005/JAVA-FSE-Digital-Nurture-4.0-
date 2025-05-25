import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.println("The multiplication table is: ");
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
        s.close();
    }
}
