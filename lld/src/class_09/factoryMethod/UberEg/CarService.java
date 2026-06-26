package class_09.factoryMethod.UberEg;

public class CarService extends TransportService {
    @Override
    protected Transport createTransport() {
        return new Car(); // Creating and returning a Car instance
    }
}
