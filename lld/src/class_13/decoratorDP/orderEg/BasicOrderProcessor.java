package class_13.decoratorDP.orderEg;

public class BasicOrderProcessor implements OrderProcessor {
    @Override
    public void process(Order order) {
        System.out.println("Processing Standard Order");
        System.out.println("Order ID : " + order.getOrderId());
        System.out.println("Order Amount : ₹" + order.getAmount());
    }
}