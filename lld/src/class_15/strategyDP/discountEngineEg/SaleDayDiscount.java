package class_15.strategyDP.discountEngineEg;

public class SaleDayDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90;   // 10% discount
    }
}
