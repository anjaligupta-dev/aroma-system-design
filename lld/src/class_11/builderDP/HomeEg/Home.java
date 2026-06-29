package class_11.builderDP.HomeEg;


// CLIENT -> uses -> HOMEBUILDER -> creates/builds -> HOME

public class Home {
    // mandatory
    private int bedrooms;
    private int bathrooms;
    private boolean kitchen;

    // optional
    private boolean garage;
    private boolean swimmingPool;

    // constructor
    private Home(HomeBuilder builder) {
        this.bedrooms = builder.bedrooms;
        this.bathrooms = builder.bathrooms;
        this.kitchen = builder.kitchen;
        this.garage = builder.garage;
        this.swimmingPool = builder.swimmingPool;
    }


    @Override
    public String toString(){
        return "Home : bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", kitchen=" + kitchen +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool;
    }


    public static class HomeBuilder{
        // mandatory
        private int bedrooms;
        private int bathrooms;
        private boolean kitchen;

        // optional
        private boolean garage;
        private boolean swimmingPool;

        // constructor - setting mandatory fields
        public HomeBuilder(int bedrooms, int bathrooms, boolean kitchen) {
            // basic validation
            if (bedrooms <= 0 || bathrooms <= 0) {
                throw new IllegalArgumentException("bedrooms and bathrooms must be positive");
            }

            this.bedrooms = bedrooms;
            this.bathrooms = bathrooms;
            this.kitchen = kitchen;
        }

        // optional parameters
        public HomeBuilder setSwimmingPool(boolean swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this; // enabling method chaining - returning this lets you call another method right after
        }

        public HomeBuilder setGarage(boolean garage) {
            this.garage = garage;
            return this;
        }

        // build method - creating home instance
        public Home build() {
            return new Home(this);
        }
    }
}


