package class_10.AmazonEg;

// Step 4 : Define Sony factory
public class SonyFactory implements BrandFactory {
    @Override
    public Laptop createLaptop() {
        return new VaioLaptop();
    }

    @Override
    public Phone createPhone() {
        return new XperiaPhone();
    }

    @Override
    public Earbuds createEarbuds() {
        return new SonyBuds();
    }
}
