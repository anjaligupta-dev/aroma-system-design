package class_10.AmazonEg;

// Step 4 : Define Samsung factory
public class SamsungFactory implements BrandFactory {
    @Override
    public Laptop createLaptop() {
        return new GalaxyBook();
    }

    @Override
    public Phone createPhone() {
        return new GalaxyPhone();
    }

    @Override
    public Earbuds createEarbuds() {
        return new GalaxyBuds();
    }
}

