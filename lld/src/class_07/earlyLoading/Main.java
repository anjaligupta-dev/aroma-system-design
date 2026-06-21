package class_07.earlyLoading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Regular
        Singleton singleton1 = Singleton.getInstance(); // Singleton constructor
        Singleton singleton2 = Singleton.getInstance();
        singleton1.print();
        singleton2.print();
        System.out.println();


        // Multithreaded environment
        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Thread 1
        Runnable task1 = () -> {
            Singleton singleton3 = Singleton.getInstance();
            singleton3.print();
        };

        // Thread 2
        Runnable task2 = () -> {
            Singleton singleton4 = Singleton.getInstance();
            singleton4.print();
        };

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.shutdown();
    }
}

/* *
    Output :
        Singleton constructor
        Print Method
        Print Method

        Print Method
        Print Method
* */
