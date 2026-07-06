package class_14.facadeDP.TravelEg;

public class TravelBookingFacade {
    private FlightService flightService;
    private HotelService hotelService;
    private TaxiService taxiService;
    private InsuranceService insuranceService;
    private PaymentService paymentService;
    private EmailService emailService;

    public TravelBookingFacade() {
        flightService = new FlightService();
        hotelService = new HotelService();
        taxiService = new TaxiService();
        insuranceService = new InsuranceService();
        paymentService = new PaymentService();
        emailService = new EmailService();
    }

    public void bookVacation(String source, String destination, double amount) {
        flightService.bookFlight(source, destination);
        hotelService.bookHotel(destination);
        taxiService.bookTaxi(destination);
        insuranceService.purchaseInsurance();
        paymentService.makePayment(amount);
        emailService.sendConfirmation();
        System.out.println("Vacation package booked successfully.");
    }
}
