package Week5.SalesPerson;

public class SalesPersonApp {
    private String name;
    private double revenue;

    public SalesPersonApp(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
    }

    public double getRevenue() {
        return revenue;
    }

    public String getName() {
        return name;
    }

    public boolean hasMoreRevenueThan(SalesPersonApp other) {
        return revenue > other.getRevenue();
    }
}
