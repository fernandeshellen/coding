public class Mascara extends FaceMakeup implements Washable{

    String size;
    double price;
    String color;

    public Mascara(String brand, boolean isLiquid, String type, double price, String size, String color) {
        super(brand, isLiquid, type);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public boolean isWashable() {
        return true;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString() {
        return super.toString() +"Price: $" + price + "\n" + "Size: " + size + "\n" + "Mascara color: " + color;
    }
}
