package class_13.decoratorDP.orderEg;

public class InvoiceDecorator extends OrderProcessorDecorator {
    public InvoiceDecorator(OrderProcessor processor) {
        super(processor);
    }

    @Override
    public void process(Order order) {
        super.process(order);
        System.out.println("Generating Invoice.");
        System.out.println("Invoice Generated Successfully.");
    }
}