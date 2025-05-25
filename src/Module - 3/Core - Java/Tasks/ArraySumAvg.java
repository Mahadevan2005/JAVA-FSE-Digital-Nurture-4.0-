import java.util.*;
public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Sum of the Array is: " + sum(arr));
        System.out.println("Average of the Array is: " + avg(arr));
        sc.close();
    }
    public static int sum(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)   
            sum += arr[i];
        return sum;
    }
    public static int avg(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)   
            sum += arr[i];
        return sum/arr.length;
    }
}
