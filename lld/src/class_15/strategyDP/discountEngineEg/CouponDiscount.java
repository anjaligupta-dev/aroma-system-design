package class_15.strategyDP.discountEngineEg;

public class CouponDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount - 300;
    }
}
