package Week2;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int pizza = 800;
        int topping = 50;
        int pricePizzas;
        int numberPizzas;
        int numberToppings;
        int finalPrice;
        System.out.print("How many pizzas would you like");
        numberPizzas = keyboard.nextInt();
        pricePizzas = numberPizzas * pizza;
        System.out.print(pricePizzas);
        System.out.print("How many toppings would you like?");
        for(numberToppings = 0 ; numberToppings <=3 ; numberToppings++) {
            int priceToppings = numberToppings * topping;
            System.out.print(priceToppings);
        }
        {
        }
        int priceToppings = numberToppings * topping;
        finalPrice = priceToppings + pricePizzas;
        System.out.print(finalPrice);
    }
}
