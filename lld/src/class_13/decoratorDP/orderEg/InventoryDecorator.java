package class_13.decoratorDP.orderEg;

public class InventoryDecorator extends OrderProcessorDecorator {
    public InventoryDecorator(OrderProcessor processor) {
        super(processor);
    }

    @Override
    public void process(Order order) {
        System.out.println("Checking inventory.");
        System.out.println("Inventory available.");
        super.process(order);
    }
}
