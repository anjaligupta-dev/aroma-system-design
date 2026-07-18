package class_17.observerDP.rideBookingEg;

public class MapsService implements Observer {
    @Override
    public void update(Ride ride) {
        System.out.println("--- Maps Service ---");

        switch (ride.getStatus()) {
            case ACCEPTED -> System.out.println("Displaying driver's live location.");

            case DRIVER_ARRIVING -> System.out.println("Updating ETA.");

            case TRIP_STARTED -> System.out.println("Starting navigation.");

            case TRIP_COMPLETED -> System.out.println("Stopping navigation.");

            default -> System.out.println("Unknown ride status");
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Maps Service";
    }
}
