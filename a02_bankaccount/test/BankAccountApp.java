package be.kdg.java1.assignments.a02_bankaccount.test;

import be.kdg.java1.assignments.a02_bankaccount.bank.BankAccount;

public class BankAccountApp {
	
	public static void main(String[] args) {
		BankAccount greg = new BankAccount("Gregory Persons", "BE15 6474 3001 5840");
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
		
		BankAccount carl = new BankAccount("Carl Deleu", "BE45 8477 0157 5478", 35652);
		System.out.println("\n" + carl);
		carl.deposit(6487);
		System.out.println(carl);
	}  // main()

}  // class