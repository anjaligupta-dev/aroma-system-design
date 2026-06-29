package class_11.builderDP.HomeEg;

public class Main {
    public static void main(String[] args) {
        Home home1 = new Home.HomeBuilder(3, 2,true)
                .setSwimmingPool(true)
                .setGarage(false)
                .build();

        System.out.println(home1); // Home : bedrooms=3, bathrooms=2, kitchen=true, garage=false, swimmingPool=true


        Home home2 = new Home.HomeBuilder(4, 4,true)
                .setSwimmingPool(false)
                .setGarage(false)
                .build();

        System.out.println(home2); // Home : bedrooms=4, bathrooms=4, kitchen=true, garage=false, swimmingPool=false
    }
}
