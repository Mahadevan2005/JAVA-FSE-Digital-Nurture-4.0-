import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        String temp = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            temp += s.charAt(i);
        }
        if(temp.equals(s))
            System.out.print("The string is a palindrome");
        else
            System.out.print("The string is not a palindrome");
        sc.close();
    }
}
