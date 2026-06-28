package class_10.AmazonEg;

// Step 4 : Define Apple factory
public class AppleFactory implements BrandFactory {
    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }

    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Earbuds createEarbuds() {
        return new Airpods();
    }
}
