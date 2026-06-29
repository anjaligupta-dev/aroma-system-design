package class_11.builderDP.PizzaEg;

public class PizzaOrder {
    // Mandatory Fields
    private final String pizzaName;
    private final PizzaSize size;

    // Optional Fields
    private final CrustType crustType;
    private final boolean extraCheese;
    private final boolean extraSauce;
    private final int oreganoSachets;
    private final int chilliFlakesSachets;
    private final String couponCode;
    private final boolean giftWrap;
    private final boolean contactlessDelivery;
    private final String specialInstructions;

    private PizzaOrder(PizzaOrderBuilder builder) {
        this.pizzaName = builder.pizzaName;
        this.size = builder.size;
        this.crustType = builder.crustType;
        this.extraCheese = builder.extraCheese;
        this.extraSauce = builder.extraSauce;
        this.oreganoSachets = builder.oreganoSachets;
        this.chilliFlakesSachets = builder.chilliFlakesSachets;
        this.couponCode = builder.couponCode;
        this.giftWrap = builder.giftWrap;
        this.contactlessDelivery = builder.contactlessDelivery;
        this.specialInstructions = builder.specialInstructions;
    }

    @Override
    public String toString() {
        return "PizzaOrder" +
                "\n pizzaName='" + pizzaName + '\'' +
                ",\n size=" + size +
                ",\n crustType=" + crustType +
                ",\n extraCheese=" + extraCheese +
                ",\n extraSauce=" + extraSauce +
                ",\n oreganoSachets=" + oreganoSachets +
                ",\n chilliFlakesSachets=" + chilliFlakesSachets +
                ",\n couponCode='" + couponCode + '\'' +
                ",\n giftWrap=" + giftWrap +
                ",\n contactlessDelivery=" + contactlessDelivery +
                ",\n specialInstructions='" + specialInstructions + '\'';
    }

    public static class PizzaOrderBuilder {
        // Mandatory
        private final String pizzaName;
        private final PizzaSize size;

        // Optional
        private CrustType crustType = CrustType.REGULAR;
        private boolean extraCheese;
        private boolean extraSauce;
        private int oreganoSachets = 1;
        private int chilliFlakesSachets = 1;
        private String couponCode = "";
        private boolean giftWrap;
        private boolean contactlessDelivery;
        private String specialInstructions = "";

        public PizzaOrderBuilder(String pizzaName, PizzaSize size) {

            if (pizzaName == null || pizzaName.isBlank()) {
                throw new IllegalArgumentException("Pizza name is required.");
            }

            if (size == null) {
                throw new IllegalArgumentException("Pizza size is required.");
            }

            this.pizzaName = pizzaName;
            this.size = size;
        }

        public PizzaOrderBuilder crustType(CrustType crustType) {
            if (crustType != null) {
                this.crustType = crustType;
            }
            return this;
        }

        public PizzaOrderBuilder extraCheese(boolean value) {
            this.extraCheese = value;
            return this;
        }

        public PizzaOrderBuilder extraSauce(boolean value) {
            this.extraSauce = value;
            return this;
        }

        public PizzaOrderBuilder oreganoSachets(int count) {
            if (count < 0) {
                throw new IllegalArgumentException("Oregano sachets cannot be negative.");
            }
            this.oreganoSachets = count;
            return this;
        }

        public PizzaOrderBuilder chilliFlakesSachets(int count) {
            if (count < 0) {
                throw new IllegalArgumentException("Chilli flakes sachets cannot be negative.");
            }
            this.chilliFlakesSachets = count;
            return this;
        }

        public PizzaOrderBuilder couponCode(String couponCode) {
            if (couponCode != null) {
                this.couponCode = couponCode.trim();
            }
            return this;
        }

        public PizzaOrderBuilder giftWrap(boolean value) {
            this.giftWrap = value;
            return this;
        }

        public PizzaOrderBuilder contactlessDelivery(boolean value) {
            this.contactlessDelivery = value;
            return this;
        }

        public PizzaOrderBuilder specialInstructions(String instructions) {
            if (instructions != null) {
                this.specialInstructions = instructions;
            }
            return this;
        }

        public PizzaOrder build() {

            if (giftWrap &&
                    crustType == CrustType.CHEESE_BURST) {
                throw new IllegalStateException(
                        "Gift wrapping is not available for Cheese Burst pizzas.");
            }

            if (oreganoSachets > 10) {
                throw new IllegalStateException(
                        "Maximum 10 oregano sachets are allowed.");
            }

            if (extraSauce &&
                    size == PizzaSize.SMALL) {
                throw new IllegalStateException(
                        "Extra sauce is not available for Small pizzas.");
            }

            return new PizzaOrder(this);
        }
    }
}