import java.util.*;
import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> callables = Arrays.asList(
                () -> "Task 1 result",
                () -> "Task 2 result",
                () -> "Task 3 result"
        );

        List<Future<String>> futures = executor.invokeAll(callables);

        for (Future<String> future : futures) {
            System.out.println("Result: " + future.get());
        }

        executor.shutdown();
    }
}