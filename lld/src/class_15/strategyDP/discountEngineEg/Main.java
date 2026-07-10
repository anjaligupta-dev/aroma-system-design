package class_15.strategyDP.discountEngineEg;

public class Main {
    public static void main(String[] args) {
        double orderAmount = 5000;

        CheckoutService checkout = new CheckoutService(new NewUserDiscount());

        System.out.println("Applying New User Discount");
        checkout.checkout(orderAmount);

        System.out.println();

        System.out.println("Customer removes it and checks Sale Day Discount");
        checkout.setDiscountStrategy(new SaleDayDiscount());
        checkout.checkout(orderAmount);

        System.out.println();

        System.out.println("Customer now selects Bank Offer");
        checkout.setDiscountStrategy(new BankOfferDiscount());
        checkout.checkout(orderAmount);

        System.out.println();

        System.out.println("Customer finally applies Coupon Code");
        checkout.setDiscountStrategy(new CouponDiscount());
        checkout.checkout(orderAmount);
    }
}


/* *

    Output :
        Applying New User Discount
        Original Amount : ₹5000.0
        Final Amount    : ₹4500.0

        Customer removes it and checks Sale Day Discount
        Original Amount : ₹5000.0
        Final Amount    : ₹4500.0

        Customer now selects Bank Offer
        Original Amount : ₹5000.0
        Final Amount    : ₹4250.0

        Customer finally applies Coupon Code
        Original Amount : ₹5000.0
        Final Amount    : ₹4700.0

* */