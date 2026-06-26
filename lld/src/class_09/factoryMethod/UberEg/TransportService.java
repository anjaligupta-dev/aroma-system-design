package class_09.factoryMethod.UberEg;

public abstract class TransportService {
    // Factory Method
    protected abstract Transport createTransport();

    // Business Logic - Common for all subclasses
    public void startBooking() {
        Transport transport = createTransport();
        transport.book();
    }
}
