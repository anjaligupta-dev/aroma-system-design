package class_17.observerDP.rideBookingEg;

public class Main {
    public static void main(String[] args) {
        RideService rideService = new RideService();

        Observer passenger = new PassengerApp();
        Observer driver = new DriverApp();
        Observer pricing = new PricingService();
        Observer notification = new NotificationService();
        Observer maps = new MapsService();
        Observer analytics = new AnalyticsService();

        rideService.registerObserver(passenger);
        rideService.registerObserver(driver);
        rideService.registerObserver(pricing);
        rideService.registerObserver(notification);
        rideService.registerObserver(maps);
        rideService.registerObserver(analytics);

        Ride ride = new Ride(501, "Alice", "John", "Airport", "City Mall", RideStatus.REQUESTED);

        rideService.updateRideStatus(ride, RideStatus.ACCEPTED);

        System.out.println("--------------------------------");

        rideService.updateRideStatus(ride, RideStatus.TRIP_STARTED);

        System.out.println("--------------------------------");

        System.out.println("Analytics Service is offline.");

        rideService.removeObserver(analytics);

        rideService.updateRideStatus(ride, RideStatus.TRIP_COMPLETED);
    }
}


/* *

    Output :
        Passenger App subscribed.
        Driver App subscribed.
        Pricing Service subscribed.
        Notification Service subscribed.
        Maps Service subscribed.
        Analytics Service subscribed.

        --------------------------------
        Ride Status Updated
        Ride Id : 501
        Passenger : Alice
        Driver : John
        Status : ACCEPTED
        --------------------------------

        --- Passenger App ---
        Your driver John has accepted your ride.

        --- Driver App ---
        Proceed to Airport

        --- Pricing Service ---
        Pricing remains unchanged.

        --- Notification Service ---
        Sending Push Notification.
        Sending SMS.
        Sending Email.

        --- Maps Service ---
        Displaying driver's live location.

        --- Analytics Service ---
        Updating ride metrics.
        Updating driver statistics.
        Updating business dashboard.

        --------------------------------

        --------------------------------
        Ride Status Updated
        Ride Id : 501
        Passenger : Alice
        Driver : John
        Status : TRIP_STARTED
        --------------------------------

        --- Passenger App ---
        Enjoy your ride!

        --- Driver App ---
        Navigate to City Mall

        --- Pricing Service ---
        Pricing remains unchanged.

        --- Notification Service ---
        Sending Push Notification.
        Sending SMS.
        Sending Email.

        --- Maps Service ---
        Starting navigation.

        --- Analytics Service ---
        Updating ride metrics.
        Updating driver statistics.
        Updating business dashboard.

        --------------------------------
        Analytics Service is offline.
        Analytics Service unsubscribed.

        --------------------------------
        Ride Status Updated
        Ride Id : 501
        Passenger : Alice
        Driver : John
        Status : TRIP_COMPLETED
        --------------------------------

        --- Passenger App ---
        Trip completed successfully.

        --- Driver App ---
        Ride completed.

        --- Pricing Service ---
        Calculating final fare.
        Generating trip receipt.

        --- Notification Service ---
        Sending Push Notification.
        Sending SMS.
        Sending Email.

        --- Maps Service ---
        Stopping navigation.

* */