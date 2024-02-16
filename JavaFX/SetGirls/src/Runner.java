import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Girl> girls = List.of(new Girl("An", 20), new Girl("Bea", 20),
                new Girl("Bea", 25), new Girl("Diana", 25),
                new Girl("Zoë", 18), new Girl("Ekaterina", 18),
                new Girl("Bea", 20));//make a new List and add the elements to it

        TreeSet<Girl> setGirls = new TreeSet<>(girls);
        System.out.printf("Set of %d girls: %s\n", setGirls.size(), setGirls);
        System.out.println("Last girl: " + setGirls.last());//print the last girl
        System.out.println("Girl before Diana: " + setGirls.lower(new Girl("Diana", 25)));//print the girl before Diana
        System.out.println("Girl that would be after Dido (21): " + setGirls.ceiling(new Girl("Dido", 21)));//if Dido would be added,
        // who would've come right after
    }
}
