public class MakeupTest {

    public static void main(String[] args) {

        Blush Nars = new Blush ("NARS", "peach", false, "blush", 25, "travel size");
        Mascara Lacome = new Mascara ("Lacome", true, "mascara", 52, "regular size", "black");
        FaceMakeup TooFaced = new Foundation("Too Faced", true, "foundation", 40, "regular size", "light beige");


        System.out.println(Nars);
        System.out.println("Washable? " + Nars.isWashable() + "\n");

        System.out.println(Lacome);
        System.out.println("Washable? " + Lacome.isWashable() + "\n");

        System.out.println(TooFaced);
        System.out.println("Washable? " + isWashable(Lacome) + "\n");

        System.out.println("Is it for sale? ");
        TooFaced.isForSale();
    }

    public static boolean isWashable (Washable w) {
      return w.isWashable();

    }

}