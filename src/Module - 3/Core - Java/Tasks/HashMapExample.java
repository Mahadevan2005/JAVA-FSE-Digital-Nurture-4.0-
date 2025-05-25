import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();

        System.out.println("Enter the number of students: ");
        int n = s.nextInt();
        s.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the Student: ");
            String name = s.nextLine();

            System.out.println("Enter the roll number of the student: ");
            int roll = s.nextInt();
            s.nextLine(); 

            hm.put(name, roll);
        }

        System.out.println(hm);
    }
}
