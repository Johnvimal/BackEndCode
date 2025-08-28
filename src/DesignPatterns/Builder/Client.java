package DesignPatterns.Builder;

public class Client {

    public static void main(String[] args) {
        SoldItem item = SoldItem.getBuilder().setId(111).setName("MilkBikis").setAvailable(true)
                .setDiscount(1.00).setWeight(1.00).setPrice(9.00).setQuantity(25).build();
        System.out.println(item);

    }
}
