public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Two integer sum: " + add(10, 20));
        System.out.println("Two double sum: " + add(12.0, 13.0));
        System.out.println("Three integer sum: " + add(10, 20, 30));
    }
    public static int add(int a, int b)
    {
        return a+b;

    }
    public static double add(double a, double b)
    {
        return a+b;
    }
    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }
}
