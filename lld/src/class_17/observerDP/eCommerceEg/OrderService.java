package class_17.observerDP.eCommerceEg;

import java.util.*;

public class OrderService implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private Order currentOrder;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer + " subscribed.");
    }


    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer + " unsubscribed.");
    }


    @Override
    public void notifyObservers() {
        System.out.println();
        System.out.println("Notifying " + observers.size() + " subscribed services...\n");

        for (Observer observer : observers) {
            System.out.println("------------------------------------------------");
            System.out.println("Notifying -> " + observer);
            observer.update(currentOrder);
            System.out.println(observer + " completed.");
            System.out.println("------------------------------------------------\n");
        }
    }


    public void placeOrder(Order order) {
        System.out.println("\n======================================================");
        System.out.println("Customer clicked PLACE ORDER");
        System.out.println("======================================================");

        System.out.println("Order Id      : " + order.getOrderId());
        System.out.println("Customer Name : " + order.getCustomerName());
        System.out.println("Product       : " + order.getProductName());
        System.out.println("Quantity      : " + order.getQuantity());

        currentOrder = order;

        System.out.println("\nOrder created successfully.");
        notifyObservers();

        System.out.println("All services finished processing the order.");
        System.out.println("======================================================\n");
    }
}
