package class_11.builderDP.HomeEg;


// CLIENT -> uses -> HOMEBUILDER -> creates/builds -> HOME

public class Home {
    // Builder is commonly used with immutable objects, make the fields final.
    // mandatory
    private final int bedrooms;
    private final int bathrooms;
    private final boolean kitchen;

    // optional
    private final boolean garage;
    private final boolean swimmingPool;

    // Private constructor - can only be called by the Builder
    private Home(HomeBuilder builder) {
        this.bedrooms = builder.bedrooms;
        this.bathrooms = builder.bathrooms;
        this.kitchen = builder.kitchen;
        this.garage = builder.garage;
        this.swimmingPool = builder.swimmingPool;
    }


    @Override
    public String toString() {
        return "Home : bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", kitchen=" + kitchen +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool;
    }


    public static class HomeBuilder {
        // Builder Mandatory Fields Should Be final. These values are supplied in the Builder constructor and never change.
        private final int bedrooms;
        private final int bathrooms;
        private final boolean kitchen;

        // Optional fields remain non-final because they are configured later.
        // Optional fields (default values)
        private boolean garage = false;
        private boolean swimmingPool = false;

        // constructor for setting mandatory fields
        public HomeBuilder(int bedrooms, int bathrooms, boolean kitchen) {
            // basic validation
            if (bedrooms <= 0) {
                throw new IllegalArgumentException("Bedrooms must be greater than zero.");
            }

            if (bathrooms <= 0) {
                throw new IllegalArgumentException("Bathrooms must be greater than zero.");
            }

            this.bedrooms = bedrooms;
            this.bathrooms = bathrooms;
            this.kitchen = kitchen;
        }

        // optional parameters
        public HomeBuilder swimmingPool(boolean swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this; // enabling method chaining - returning this lets you call another method right after
        }

        public HomeBuilder garage(boolean garage) {
            this.garage = garage;
            return this;
        }

        // build method - creating home instance
        // Final validation and object creation
        public Home build() {
            // Example of cross-field validation
            if (swimmingPool && bedrooms < 3) {
                throw new IllegalStateException("A swimming pool is allowed only for homes with at least 3 bedrooms.");
            }

            return new Home(this);
        }
    }
}


