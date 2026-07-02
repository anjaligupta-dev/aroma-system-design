package class_11.builderDP.HomeEg;

public class Main {
    public static void main(String[] args) {
        Home home1 = new Home.HomeBuilder(3, 2, true)
                .swimmingPool(true)
                .garage(false)
                .build();

        System.out.println(home1);
        System.out.println("-----------------------------------");


        Home home2 = new Home.HomeBuilder(4, 4, true)
                .swimmingPool(false)
                .garage(false)
                .build();

        System.out.println(home2);
        System.out.println("-----------------------------------");


        // Testcase to test validation
        Home home3 = new Home.HomeBuilder(2, 1, true)
                .swimmingPool(true)
                .build();

        System.out.println(home3);
    }
}


/* *

    Output :
        Home : bedrooms=3, bathrooms=2, kitchen=true, garage=false, swimmingPool=true
        -----------------------------------
        Home : bedrooms=4, bathrooms=4, kitchen=true, garage=false, swimmingPool=false
        -----------------------------------
        Exception in thread "main" java.lang.IllegalStateException: A swimming pool is allowed only for homes with at least 3 bedrooms.
            at l03_design_patterns.creational.p05_builder.HomeEg.Home$HomeBuilder.build(Home.java:80)
            at l03_design_patterns.creational.p05_builder.HomeEg.Main.main(Main.java:25)

* */