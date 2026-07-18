package class_17.observerDP.rideBookingEg;

public class AnalyticsService implements Observer {
    @Override
    public void update(Ride ride) {
        System.out.println("--- Analytics Service ---");
        System.out.println("Updating ride metrics.");
        System.out.println("Updating driver statistics.");
        System.out.println("Updating business dashboard.");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Analytics Service";
    }
}
