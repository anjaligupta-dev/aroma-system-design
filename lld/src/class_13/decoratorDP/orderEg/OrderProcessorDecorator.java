package class_13.decoratorDP.orderEg;

public abstract class OrderProcessorDecorator implements OrderProcessor {
    protected final OrderProcessor processor;

    public OrderProcessorDecorator(OrderProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void process(Order order) {
        processor.process(order);
    }
}
