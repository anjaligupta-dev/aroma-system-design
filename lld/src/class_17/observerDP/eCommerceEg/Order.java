package class_17.observerDP.eCommerceEg;

public class Order {
    private final int orderId;
    private final String customerName;
    private final String productName;
    private final int quantity;

    public Order(int orderId, String customerName, String productName, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
}
