package class_17.observerDP.rideBookingEg;

public class PassengerApp implements Observer {
    @Override
    public void update(Ride ride) {
        System.out.println("--- Passenger App ---");

        switch (ride.getStatus()) {
            case ACCEPTED -> System.out.println("Your driver " + ride.getDriverName() + " has accepted your ride.");

            case DRIVER_ARRIVING -> System.out.println("Driver is arriving.");

            case TRIP_STARTED -> System.out.println("Enjoy your ride!");

            case TRIP_COMPLETED -> System.out.println("Trip completed successfully.");

            default -> System.out.println("Invalid ride status");
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Passenger App";
    }
}
