package LambdaAndFunctionalInterfaces;

public class RunnableLambdaDemo {
    public static void main(String[] args) throws InterruptedException {
        // Runnable using lambda
        Runnable r = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - count: " + i);
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
        };

        Thread t1 = new Thread(r, "Thread-1");
        Thread t2 = new Thread(r, "Thread-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Using a lambda to create a one-off thread
        new Thread(() -> System.out.println("Quick lambda thread running")).start();

        // Give the quick thread a moment
        Thread.sleep(200);
    }
}