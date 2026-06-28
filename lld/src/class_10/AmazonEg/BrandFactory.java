package class_10.AmazonEg;

// Step 3 : Define Abstract factory : Brand factory
public interface BrandFactory {
    public Laptop createLaptop();
    public Phone createPhone();
    public Earbuds createEarbuds();
}
