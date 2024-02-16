public class Runner {
    public static void main(String[] args, double price) {
        Menu menu = new Menu();//make a new menu
        menu.addDrink(new Drink("La Chouffe", 3.5, true));
        menu.addDrink(new Drink("Heineken", 5, true));
        menu.addDrink(new Drink("Sprite", 2, false));
        menu.addDrink(new Drink("Coca-Cola", 2.5, false));
        menu.addDrink(new Drink("Fanta", 1, false));
        menu.addDrink(new Drink("Cristal", 3, true));
        menu.addDrink(new Drink("Duvel", 6, true));
        menu.addDrink(new Drink("Wine", 10, true));
        menu.addDrink(new Drink("Absolut", 20, true));
        menu.addDrink(new Drink("Whiskey", 25, true));//add elements to it

        System.out.println(menu);
        System.out.println(Menu.getSize());
        System.out.println(Menu.getTotalPrice());
        System.out.println(Menu.mostExpensive());
        System.out.println(Menu.getAlcoholicDrinks());
        menu.removeMoreExpensiveThen(3);//the price to which we compare the price in the removeMoreExpensiveThen() method in Menu
        System.out.println(menu);//print the new menu
        Drink[] newArrivals = {new Drink("Bushmills 10yr", 7, true), new Drink("SpringBank 5yr", 5, true)};//add drinks
        menu.addDrinks(newArrivals);//add the drinks in the List
        System.out.println(menu);//print out the full new menu
    }
}
