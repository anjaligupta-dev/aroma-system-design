package class_15.strategyDP.discountEngineEg;

public class BankOfferDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.85;   // 15% discount
    }
}

