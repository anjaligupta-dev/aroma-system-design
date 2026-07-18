package class_17.observerDP.eCommerceEg;

public class RecommendationService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("========== Recommendation Service ==========");
        System.out.println("Analyzing purchase history...");
        System.out.println("Product purchased : " + order.getProductName());
        System.out.println("Generating recommendations...");
        System.out.println("- Mouse Pad");
        System.out.println("- USB Hub");
        System.out.println("- Laptop Stand");
        System.out.println("Recommendation engine updated.");
    }

    public String toString() {
        return "Recommendation Service";
    }
}
