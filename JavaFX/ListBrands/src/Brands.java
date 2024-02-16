import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Brands {
    private String brand;

    public Brands(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brands{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public List<String> brands = new ArrayList<>();

    public void alphabetic() {
        Collections.sort(brands);
    }//sort the brand brands alphabetically

    public void alphabeticDescending() {
        Collections.reverse(brands);
    }//sort the brand brands from Z -> A
}
