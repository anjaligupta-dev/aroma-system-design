package class_10.AmazonEg;

// Step 2 : Define apple product : MacBook
public class MacBook implements Laptop {
    @Override
    public String getModel() {
        return "MacBook Pro";
    }
}
