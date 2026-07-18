package class_17.observerDP.eCommerceEg;

public class AnalyticsService implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("========== Analytics Service ==========");
        System.out.println("Updating revenue.");
        System.out.println("Incrementing order count.");
        System.out.println("Updating product sales.");
        System.out.println("Refreshing dashboards.");
        System.out.println("Analytics updated.");
    }

    public String toString() {
        return "Analytics Service";
    }
}
