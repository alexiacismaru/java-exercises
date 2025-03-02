package Week5.Bank;

public class BankTest {
    public static void main(String[] args) {
        BankApp greg = new BankApp("Gregory Persons", "BE15 6474 3001 5840");
        System.out.println(greg);
        greg.deposit(3000);
        System.out.println(greg);
        if (greg.withdraw(2000)) {
            System.out.println(greg);
        } else {
            System.out.println("Insufficient credit");
        }
        if (greg.withdraw(1500)) {
            System.out.println(greg);
        } else {
            System.out.println("Insufficient credit");
        }
        System.out.println(greg);

        BankApp carl = new BankApp("Carl Deleu", "BE45 8477 0157 5478", 35652);
        System.out.println("\n" + carl);
        carl.deposit(6487);
        System.out.println(carl);
    }
}
