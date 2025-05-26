public class VirtualThread {

    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            int finalI = i;
            Thread.startVirtualThread(() -> {
                System.out.println("Virtual Thread #" + finalI);
            });
        }
    }
}