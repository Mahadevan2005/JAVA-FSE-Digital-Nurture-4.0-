import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int n = s.nextInt();
        if(n%4 == 0 && n%100 != 0)
            System.out.println("It is an leap year");
        else if(n%400 == 0)
            System.out.println("It is an leap year");
        else if(n%400 != 0 && n%100 == 0)
            System.out.println("It is not an leap year");
        else    
            System.out.println("It is not an leap year");
        s.close();
    }    
}
