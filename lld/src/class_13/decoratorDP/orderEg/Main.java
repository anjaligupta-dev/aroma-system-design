package class_13.decoratorDP.orderEg;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("ORD-101", 5000);
        System.out.println(":: Basic Order ::");

        OrderProcessor basic = new InvoiceDecorator(
                new LoyaltyPointsDecorator(
                        new TaxDecorator(
                                new CouponDecorator(
                                        new InventoryDecorator(
                                                new BasicOrderProcessor()
                                        )
                                )
                        )
                )
        );

        basic.process(order1);
        System.out.println("-----------------------------------");


        Order order2 = new Order("ORD-102", 7500);
        System.out.println(":: VIP Order ::");

        OrderProcessor vip = new InvoiceDecorator(
                new LoyaltyPointsDecorator(
                        new TaxDecorator(
                                new CouponDecorator(
                                        new InventoryDecorator(
                                                new PriorityOrderProcessor()
                                        )
                                )
                        )
                )
        );

        vip.process(order2);
    }
}


/* *

    Output :
        :: Basic Order ::
        Tax Calculated : ₹900.0
        Validating coupon.
        Coupon applied successfully.
        Checking inventory.
        Inventory available.
        Processing Standard Order
        Order ID : ORD-101
        Order Amount : ₹5000.0
        Reward Points Earned : 50
        Generating Invoice.
        Invoice Generated Successfully.
        -----------------------------------
        :: VIP Order ::
        Tax Calculated : ₹1350.0
        Validating coupon.
        Coupon applied successfully.
        Checking inventory.
        Inventory available.
        Processing Priority/VIP Order
        Assigning dedicated processing queue...
        Order ID : ORD-102
        Order Amount : ₹7500.0
        Reward Points Earned : 75
        Generating Invoice.
        Invoice Generated Successfully.

* */