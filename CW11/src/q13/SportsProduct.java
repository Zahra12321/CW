package q13;

public class SportsProduct extends Product{

    private String type = "sport";

    public SportsProduct(String name, double price) {
        super(name, price);
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "SportsProduct{" +
                "type='" + type + '\'' +
                '}';
    }
}
