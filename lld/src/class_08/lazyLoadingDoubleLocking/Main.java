package class_08.lazyLoadingDoubleLocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Single threaded
//        Singleton singleton1 = Singleton.getInstance("Abc");
//        Singleton singleton2 = Singleton.getInstance("Xyz");


        // Multithreaded environment
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Thread 1
        Runnable task1 = () -> {
            Singleton singleton3 = Singleton.getInstance("Ijk");
        };

        // Thread 2
        Runnable task2 = () -> {
            Singleton singleton4 = Singleton.getInstance("Pqr");
        };

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.shutdown();
    }
}

/* *
 Output :
    Constructor created by : Ijk
 * */
