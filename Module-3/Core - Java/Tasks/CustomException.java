import java.util.*;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try 
        {
            if(age < 18)
                throw new InvalidAgeException("You are not eligible");
            else
                System.out.println("You are eligible");
        }
        catch(InvalidAgeException e)
        {
            System.out.print("Exception Message: " + e.getMessage());
            sc.close();
        }
    }
}