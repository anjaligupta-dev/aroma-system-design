package class_14.facadeDP.TravelEg;

public class Main {
    public static void main(String[] args) {
        // Create the Facade
        TravelBookingFacade travelFacade = new TravelBookingFacade();

        // Book the complete vacation package
        travelFacade.bookVacation("Delhi", "New York", 3500);
    }
}


/* *

    Output :
        Flight booked from Delhi to New York
        Hotel booked in New York
        Taxi booked in New York
        Travel insurance purchased.
        Payment of $3500.0 completed.
        Booking confirmation email sent.
        Vacation package booked successfully.

* */