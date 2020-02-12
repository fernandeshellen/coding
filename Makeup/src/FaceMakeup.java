public class FaceMakeup extends Makeup {

    boolean isLiquid;
    String type;

    public FaceMakeup(String brand, boolean isLiquid, String type) {
        super(brand);
        isLiquid(isLiquid);
        setType(type);
    }

    public void isForSale() {

        System.out.println("Yes");
    }

    public boolean isLiquid() {
        return isLiquid;
    }

    public void isLiquid(boolean isLiquid) {
        this.isLiquid = isLiquid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return super.toString() + "\n" + "Liquid? " + isLiquid + "\nType: " + type + "\n";
    }
}
