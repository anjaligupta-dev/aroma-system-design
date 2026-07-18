package class_17.observerDP.rideBookingEg;

public class DriverApp implements Observer {
    @Override
    public void update(Ride ride) {
        System.out.println("--- Driver App ---");

        switch (ride.getStatus()) {
            case ACCEPTED -> System.out.println("Proceed to " + ride.getPickupLocation());

            case TRIP_STARTED -> System.out.println("Navigate to " + ride.getDestination());

            case TRIP_COMPLETED -> System.out.println("Ride completed.");

            default -> System.out.println("Ride cancelled.");
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Driver App";
    }
}
