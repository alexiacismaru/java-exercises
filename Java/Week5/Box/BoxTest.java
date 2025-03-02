package Week5.Box;

public class BoxTest {
    public static void main(String[] args) {
        BoxApp cube = new BoxApp("Cube", 10);
        System.out.println(cube);

        BoxApp flat = new BoxApp("Flat box", 30, 30, 3.5);
        System.out.println(flat);

        BoxApp parcel = new BoxApp("Parcel Service box", 30.5, 21.5, 17.0);
        System.out.println(parcel);
    }
}
