import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        System.out.print("Choose the operator from the options: (+, *, /, -): ");
        String c = s.next();
        System.out.print("Enter a number: ");
        int b = s.nextInt();
        switch(c) {
            case "+":
                System.out.print("The result is: "+(a+b));
                break;
            case "*":
                System.out.print("The result is: "+(a*b));
                break;
            case "-":
                System.out.print("The result is: "+(a-b));
                break;
            case "/":
                System.out.print("The result is: "+(a/b));
            default:
                System.out.println("Invalid input");
        }
        s.close(); 
    }
}
