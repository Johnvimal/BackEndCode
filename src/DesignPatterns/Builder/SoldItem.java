package DesignPatterns.Builder;

public class SoldItem {

    private long id;
    private String name;
    private double price;
    private double discount;
    private int quantity;
    private boolean available;
    private double weight;

    public static SoldItemBuilder getBuilder() {
        return new SoldItemBuilder();
    }

    public SoldItem(SoldItemBuilder  builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
        this.discount = builder.discount;
        this.quantity = builder.quantity;
        this.available = builder.available;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "SoldItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", available=" + available +
                ", weight=" + weight +
                '}';
    }

    public static class SoldItemBuilder {
        private long id;
        private String name;
        private double price;
        private double discount;
        private int quantity;
        private boolean available;
        private double weight;

        public SoldItem build() {
            return new SoldItem(this);
        }

        public SoldItemBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public SoldItemBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public SoldItemBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public SoldItemBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public SoldItemBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public SoldItemBuilder setAvailable(boolean available) {
            this.available = available;
            return this;
        }

        public SoldItemBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }


    }
}
