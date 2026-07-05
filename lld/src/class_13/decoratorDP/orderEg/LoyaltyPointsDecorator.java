package class_13.decoratorDP.orderEg;

public class LoyaltyPointsDecorator extends OrderProcessorDecorator {
    public LoyaltyPointsDecorator(OrderProcessor processor) {
        super(processor);
    }

    @Override
    public void process(Order order) {
        super.process(order);
        int points = (int) order.getAmount() / 100;
        System.out.println("Reward Points Earned : " + points);
    }
}
