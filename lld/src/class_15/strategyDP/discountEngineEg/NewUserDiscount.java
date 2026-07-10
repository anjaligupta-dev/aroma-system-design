package class_15.strategyDP.discountEngineEg;

public class NewUserDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount - 500;
    }
}
