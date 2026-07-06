package class_14.facadeDP.OrderEg;

public class OrderRequest {
    private double amount;
    private String couponCode;

    public OrderRequest(double amount, String couponCode) {
        this.amount = amount;
        this.couponCode = couponCode;
    }

    public double getAmount() {
        return amount;
    }

    public String getCouponCode() {
        return couponCode;
    }
}
