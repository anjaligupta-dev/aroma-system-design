package class_17.observerDP.eCommerceEg;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        Observer inventory = new InventoryService();
        Observer payment = new PaymentService();
        Observer notification = new NotificationService();
        Observer analytics = new AnalyticsService();
        Observer recommendation = new RecommendationService();

        orderService.registerObserver(inventory);
        orderService.registerObserver(payment);
        orderService.registerObserver(notification);
        orderService.registerObserver(analytics);
        orderService.registerObserver(recommendation);

        System.out.println();

        Order order1 = new Order(101, "Alice", "Wireless Mouse", 2);
        orderService.placeOrder(order1);

        System.out.println("Analytics Service is under maintenance.\n");
        orderService.removeObserver(analytics);

        Order order2 = new Order(102, "Bob", "Mechanical Keyboard", 1);
        orderService.placeOrder(order2);
    }
}

/* *

    Output :
        Inventory Service subscribed.
        Payment Service subscribed.
        Notification Service subscribed.
        Analytics Service subscribed.
        Recommendation Service subscribed.


        ======================================================
        Customer clicked PLACE ORDER
        ======================================================
        Order Id      : 101
        Customer Name : Alice
        Product       : Wireless Mouse
        Quantity      : 2

        Order created successfully.

        Notifying 5 subscribed services...

        ------------------------------------------------
        Notifying -> Inventory Service
        ========== Inventory Service ==========
        Received Order #101
        Checking stock for Wireless Mouse
        Current Stock : 50
        Requested Quantity : 2
        Stock available.
        Reserving inventory...
        Updating warehouse database...
        Inventory updated successfully.
        Inventory Service completed.
        ------------------------------------------------

        ------------------------------------------------
        Notifying -> Payment Service
        ========== Payment Service ==========
        Received Order #101
        Fetching payment details...
        Validating payment...
        Authorizing payment...
        Payment successful.
        Generating invoice INV-101
        Updating order status to PAID.
        Payment Service completed.
        ------------------------------------------------

        ------------------------------------------------
        Notifying -> Notification Service
        ========== Notification Service ==========
        Preparing confirmation message...
        Sending Email to Alice
        Sending SMS.
        Sending Push Notification.
        Customer notified successfully.
        Notification Service completed.
        ------------------------------------------------

        ------------------------------------------------
        Notifying -> Analytics Service
        ========== Analytics Service ==========
        Updating revenue.
        Incrementing order count.
        Updating product sales.
        Refreshing dashboards.
        Analytics updated.
        Analytics Service completed.
        ------------------------------------------------

        ------------------------------------------------
        Notifying -> Recommendation Service
        ========== Recommendation Service ==========
        Analyzing purchase history...
        Product purchased : Wireless Mouse
        Generating recommendations...
        - Mouse Pad
        - USB Hub
        - Laptop Stand
        Recommendation engine updated.
        Recommendation Service completed.
        ------------------------------------------------

        All services finished processing the order.
        ======================================================

        Analytics Service is under maintenance.

        Analytics Service unsubscribed.

        ======================================================
        Customer clicked PLACE ORDER
        ======================================================
        Order Id      : 102
        Customer Name : Bob
        Product       : Mechanical Keyboard
        Quantity      : 1

        Order created successfully.

        Notifying 4 subscribed services...

        ------------------------------------------------
        Notifying -> Inventory Service
        ========== Inventory Service ==========
        Received Order #102
        Checking stock for Mechanical Keyboard
        Current Stock : 50
        Requested Quantity : 1
        Stock available.
        Reserving inventory...
        Updating warehouse database...
        Inventory updated successfully.
        Inventory Service completed.
        ------------------------------------------------

        ------------------------------------------------
        Notifying -> Payment Service
        ========== Payment Service ==========
        Received Order #102
        Fetching payment details...
        Validating payment...
        Authorizing payment...
        Payment successful.
        Generating invoice INV-102
        Updating order status to PAID.
        Payment Service completed.
        ------------------------------------------------

        ------------------------------------------------
        Notifying -> Notification Service
        ========== Notification Service ==========
        Preparing confirmation message...
        Sending Email to Bob
        Sending SMS.
        Sending Push Notification.
        Customer notified successfully.
        Notification Service completed.
        ------------------------------------------------

        ------------------------------------------------
        Notifying -> Recommendation Service
        ========== Recommendation Service ==========
        Analyzing purchase history...
        Product purchased : Mechanical Keyboard
        Generating recommendations...
        - Mouse Pad
        - USB Hub
        - Laptop Stand
        Recommendation engine updated.
        Recommendation Service completed.
        ------------------------------------------------

        All services finished processing the order.
        ======================================================

* */