package class_10.AmazonEg;

public class Main {
    public static void main(String[] args) {
        shopFromBrand("Apple Store", new AppleFactory());
        shopFromBrand("Samsung Store", new SamsungFactory());
        shopFromBrand("Sony Store", new SonyFactory());
    }


    private static void shopFromBrand(String brandName, BrandFactory factory) {
        System.out.println("----- Shopping from " + brandName + " -----");

        Laptop laptop = factory.createLaptop();
        Phone phone = factory.createPhone();
        Earbuds earbuds = factory.createEarbuds();

        System.out.println("Laptop  : " + laptop.getModel());
        System.out.println("Phone   : " + phone.getModel());
        System.out.println("Earbuds : " + earbuds.getModel());
    }
}


/* *

    Output :
        ----- Shopping from Apple Store -----
        Laptop  : MacBook Pro
        Phone   : iPhone 17 pro
        Earbuds : Airpods Pro
        ----- Shopping from Samsung Store -----
        Laptop  : Galaxy Book 3 pro
        Phone   : Galaxy S23 Ultra
        Earbuds : Galaxy Buds Pro
        ----- Shopping from Sony Store -----
        Laptop  : Vaio Laptop
        Phone   : Xperia 1 III
        Earbuds : Sony Buds Pro

* */