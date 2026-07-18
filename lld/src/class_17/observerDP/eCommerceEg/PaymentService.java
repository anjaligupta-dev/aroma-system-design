package class_17.observerDP.eCommerceEg;

public class PaymentService implements Observer{
    @Override
    public void update(Order order){
        System.out.println("========== Payment Service ==========");
        System.out.println("Received Order #" + order.getOrderId());
        System.out.println("Fetching payment details...");
        System.out.println("Validating payment...");
        System.out.println("Authorizing payment...");
        System.out.println("Payment successful.");
        System.out.println("Generating invoice INV-" + order.getOrderId());
        System.out.println("Updating order status to PAID.");
    }

    public String toString(){
        return "Payment Service";
    }
}
