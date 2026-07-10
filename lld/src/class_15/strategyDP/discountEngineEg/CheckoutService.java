package class_15.strategyDP.discountEngineEg;

public class CheckoutService {
    private DiscountStrategy discountStrategy;

    public CheckoutService(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void checkout(double amount) {
        double finalAmount = discountStrategy.applyDiscount(amount);

        System.out.println("Original Amount : ₹" + amount);
        System.out.println("Final Amount    : ₹" + finalAmount);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
