package class_17.observerDP.eCommerceEg;

public class InventoryService implements Observer{
    @Override
    public void update(Order order){
        System.out.println("========== Inventory Service ==========");
        System.out.println("Received Order #" + order.getOrderId());
        System.out.println("Checking stock for " + order.getProductName());
        System.out.println("Current Stock : 50");
        System.out.println("Requested Quantity : " + order.getQuantity());
        System.out.println("Stock available.");
        System.out.println("Reserving inventory...");
        System.out.println("Updating warehouse database...");
        System.out.println("Inventory updated successfully.");
    }

    public String toString(){
        return "Inventory Service";
    }
}
