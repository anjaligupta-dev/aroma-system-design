package class_13.decoratorDP.orderEg;

public class CouponDecorator extends OrderProcessorDecorator {
    public CouponDecorator(OrderProcessor processor) {
        super(processor);
    }

    @Override
    public void process(Order order) {
        System.out.println("Validating coupon.");
        System.out.println("Coupon applied successfully.");
        super.process(order);
    }
}
