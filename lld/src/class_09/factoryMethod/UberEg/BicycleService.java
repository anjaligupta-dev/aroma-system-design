package class_09.factoryMethod.UberEg;

public class BicycleService extends TransportService {
    @Override
    protected Transport createTransport() {
        return new Bicycle();
    }
}
