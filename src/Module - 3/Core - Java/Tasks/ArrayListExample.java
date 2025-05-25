import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        String c = "Y";
        while(c != "N")
        {
            System.out.print("Type 'Y' to start entering the name: ");
            c = s.nextLine();
            if(c.equals("N"))
                break;
            System.out.print("Enter the student name: ");
            String temp = s.nextLine();
            al.add(temp);
        }
        if(al.size() > 0)
        {
            System.out.println("---Entered names are---");
            for(int i=0;i<al.size();i++)
            {
                System.out.println(al.get(i));
            }
        }
        s.close();
    }
}
