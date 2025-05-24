public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 100 / 5 + 2 * 4;
        int result4 = 100 / (5 + 2) * 4;

        System.out.println("Result1 (10 + 5 * 2): " + result1);   // 10 + (5*2) = 10 + 10 = 20
        System.out.println("Result2 ((10 + 5) * 2): " + result2); // (10+5) * 2 = 15 * 2 = 30
        System.out.println("Result3 (100 / 5 + 2 * 4): " + result3); // (100/5) + (2*4) = 20 + 8 = 28
        System.out.println("Result4 (100 / (5 + 2) * 4): " + result4); // 100 / 7 * 4 = 14 * 4 = 56
    }
}
