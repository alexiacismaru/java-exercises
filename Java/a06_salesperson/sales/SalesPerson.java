package be.kdg.java1.assignments.a06_salesperson.sales;

public class SalesPerson {
    private String name;
    private double revenue;
    
    public SalesPerson(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
    }
    
    public double getRevenue() {
        return revenue;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean hasMoreRevenueThan(SalesPerson other) {
        return revenue > other.getRevenue();
    }
    
}  // class