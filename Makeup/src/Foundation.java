public class Foundation extends FaceMakeup implements Washable {

    private double price;
    private String size;
    String color;

    public Foundation(String brand, boolean isLiquid, String type, double price, String size, String color) {
        super(brand, isLiquid, type);
        setPrice(price);
        setSize(size);
        setColor(color);
    }

    public boolean isWashable() {
        return false;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String result;
        result = super.toString() + "Price: $" + price + "\n" + "Size: " + size + "\n" + "Color: " + color;
        return result;
    }
}
