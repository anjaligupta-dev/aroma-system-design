package class_13.decoratorDP.orderEg;

public class TaxDecorator extends OrderProcessorDecorator {
    public TaxDecorator(OrderProcessor processor) {
        super(processor);
    }

    @Override
    public void process(Order order) {
        double tax = order.getAmount() * 0.18;
        System.out.println("Tax Calculated : ₹" + tax);
        super.process(order);
    }
}
