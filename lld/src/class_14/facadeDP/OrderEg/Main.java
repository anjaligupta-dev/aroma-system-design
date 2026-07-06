package class_14.facadeDP.OrderEg;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        OrderRequest request = new OrderRequest(2499, "SAVE500");
        orderFacade.placeOrder(request);
    }
}


/* *
    Output :
        Inventory reserved.
        Coupon 'SAVE500' applied.
        Payment of ₹2499.0 completed.
        Shipment created.
        Invoice generated.
        Order confirmation email sent.
        Reward points added to customer account.
        Order placed successfully.
* */