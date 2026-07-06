package class_14.facadeDP.OrderEg;

public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private CouponService couponService;
    private ShippingService shippingService;
    private InvoiceService invoiceService;
    private NotificationService notificationService;
    private LoyaltyService loyaltyService;

    public OrderFacade() {
        inventoryService = new InventoryService();
        paymentService = new PaymentService();
        couponService = new CouponService();
        shippingService = new ShippingService();
        invoiceService = new InvoiceService();
        notificationService = new NotificationService();
        loyaltyService = new LoyaltyService();
    }

    public void placeOrder(OrderRequest request) {
        inventoryService.reserveItems();
        couponService.applyCoupon(request.getCouponCode());
        paymentService.makePayment(request.getAmount());
        shippingService.createShipment();
        invoiceService.generateInvoice();
        notificationService.sendEmail();
        loyaltyService.addRewardPoints();
        System.out.println("Order placed successfully.");
    }
}
