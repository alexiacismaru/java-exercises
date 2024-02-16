import java.util.*;

public class Menu {
    static List<Drink> drinks = new ArrayList<>();


    public void addDrink(Drink drink) {
        drinks.add(drink);
    }//method that adds a drink into the list

    @Override
    public String toString() {
        return "Menu{" +
                "drinks=" + drinks +
                '}';
    }

    public static int getSize() {
        return drinks.size();
    }//method that print the number of drinks from the main method

    public static double getTotalPrice() {
        double sum = 0.0;//new variable that represents the sum of the prices
        for (Drink drink : drinks) {//for-each loop
            sum += drink.getPrice();//sum represents all the prices together
        }
        return sum;//print out the sum
    }

    public static Drink mostExpensive() {
        Drink mostExpensive = drinks.get(0);
        for (Drink drink : drinks) {//for-each loop
            if (drink.getPrice() > mostExpensive.getPrice())
                mostExpensive = drink;//if the price of the drink is bigger than the price of the most expensive drink
            //becomes the most expensive drink
        }
        return mostExpensive;//print out the most expensive drink
    }

    public static List<Drink> getAlcoholicDrinks() {
        List<Drink> alcoholic = new LinkedList<>();//new List containing alcoholic drinks
        for (Drink drink : drinks) {//for-each loop
            if (drink.isAlcoholic())
                alcoholic.add(drink);//if the drink is alcoholic --boolean=true-- add it to the List
        }
        return alcoholic;//print out the List
    }

    public static boolean removeMoreExpensiveThen(double price) {
        for (Iterator<Drink> it = drinks.iterator(); it.hasNext(); ) {//iterator equals to the elements of the drinks List
            if (it.next().getPrice() > price) it.remove();//if the element is bigger than the price -> remove it
        }
        return false;//otherwise, keep it and return false
    }

    public void addDrinks(Drink[] drinksTwo) {//new Array
        drinks.addAll(Arrays.asList(drinksTwo));//add the array of drinks to menu
    }

    public void sort() {
        Collections.sort(drinks);
    }//sort the drinks
}
