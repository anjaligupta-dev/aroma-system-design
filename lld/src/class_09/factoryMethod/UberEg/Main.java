package class_09.factoryMethod.UberEg;

public class Main {
    public static void main(String[] args) {
        // Example: User selects "Car" from app
        TransportService carService = new CarService();
        carService.startBooking();  // Car booked

        // Example: User selects "Bicycle" from app
        TransportService bicycleService = new BicycleService();
        bicycleService.startBooking();  // Bicycle booked

        // Example: User selects "Scooter" from app
        TransportService scooterService = new ScooterService();
        scooterService.startBooking();  // Scooter booked
    }
}
