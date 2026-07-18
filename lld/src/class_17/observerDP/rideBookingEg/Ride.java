package class_17.observerDP.rideBookingEg;

public class Ride {
    private final int rideId;
    private final String passengerName;
    private final String driverName;
    private final String pickupLocation;
    private final String destination;

    private RideStatus status;

    public Ride(int rideId, String passengerName, String driverName, String pickupLocation, String destination, RideStatus status) {
        this.rideId = rideId;
        this.passengerName = passengerName;
        this.driverName = driverName;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.status = status;
    }

    public int getRideId() {
        return rideId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDestination() {
        return destination;
    }

    public RideStatus getStatus() {
        return status;
    }

    public void setStatus(RideStatus status) {
        this.status = status;
    }
}
