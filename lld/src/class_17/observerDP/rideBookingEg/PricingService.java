package class_17.observerDP.rideBookingEg;

public class PricingService implements Observer {
    @Override
    public void update(Ride ride) {
        System.out.println("--- Pricing Service ---");

        if (ride.getStatus() == RideStatus.TRIP_COMPLETED) {
            System.out.println("Calculating final fare.");
            System.out.println("Generating trip receipt.");
        } else {
            System.out.println("Pricing remains unchanged.");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Pricing Service";
    }
}
