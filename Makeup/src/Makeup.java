abstract public class Makeup {

    private String brand;

    public Makeup(String brand) {
        setBrand(brand);

    }

    abstract public void isForSale();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Makeup brand: " + brand;
    }
}
