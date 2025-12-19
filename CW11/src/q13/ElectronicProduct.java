package q13;

public class ElectronicProduct extends Product {

    private String type = "electronic";

    public ElectronicProduct(String name, double price) {
        super(name, price);
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "type='" + type + '\'' +
                '}';
    }
}
