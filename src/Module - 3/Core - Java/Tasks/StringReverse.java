import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String temp = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            temp += s.charAt(i);
        }
        System.out.print("The reversed string is: " + temp);
        sc.close();
    }
}
