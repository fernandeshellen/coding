public class Blush extends FaceMakeup implements Washable{

    private double price;
    private String size;
    String color;

    public boolean isWashable() {
        return false;
    }

    public Blush(String brand, String color, boolean isLiquid, String type, double price, String size) {
        super(brand, isLiquid, type);
        setPrice(price);
        setSize(size);
        setColor(color);
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
        return super.toString() + "Price: $" + price + "\n" + "Size: " + size + "\n" + "Color: " + color;
    }
}
