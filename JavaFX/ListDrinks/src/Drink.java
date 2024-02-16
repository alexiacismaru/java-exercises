public class Drink {
    private String name;
    private double price;
    private boolean isAlcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        this.name = name;
        this.price = price;
        this.isAlcoholic = isAlcoholic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    @Override
    public String toString() {
        return name + price;
    }

    public int compareTo(Drink o) {
        int priceCompare = Double.compare(o.getPrice(), getPrice());
        return priceCompare == 0 && isAlcoholic ? -1 : priceCompare;
    }//make the drinks comparable, the natural sorting order is on high from high to low
}
