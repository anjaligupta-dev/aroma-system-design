package class_13.decoratorDP.orderEg;

public class PriorityOrderProcessor implements OrderProcessor {
    @Override
    public void process(Order order) {
        System.out.println("Processing Priority/VIP Order");
        System.out.println("Assigning dedicated processing queue...");
        System.out.println("Order ID : " + order.getOrderId());
        System.out.println("Order Amount : ₹" + order.getAmount());
    }
}
