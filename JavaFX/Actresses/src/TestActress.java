import java.util.*;

public class TestActress {
    private static final List<Actress> testData = List.of(
            new Actress("Cameron Diaz", 1972),
            new Actress("Nathalie Meskens", 1982),
            new Actress("Angelina Jolie", 1975),
            new Actress("Jennifer Lopez", 1970),
            new Actress("Reese Witherspoon", 1976),
            new Actress("Zoe Kravitz", 1988),
            new Actress("Jennifer Lawrence", 1990),
            new Actress("Kirsten Dunst", 1982),
            new Actress("Kate Winslet", 1975),
            new Actress("Emma Watson", 1990),
            new Actress("Marie Vinck", 1983),
            new Actress("Anne Hathaway", 1982),
            new Actress("Drew Barrymore", 1975),
            new Actress("Natalie Portman", 1981),
            new Actress("Tara Reid", 1975),
            new Actress("Katie Holmes", 1978),
            new Actress("Anna Faris", 1976)
    );

    public static void main(String[] args) {
        Actress reese = new Actress("Reese Witherspoon", 1976);
        Actress drew = new Actress("Drew Barrymore", 1975);
        Actress anna = new Actress("Anna Faris", 1976);
        Actress nathalie = new Actress("Nathalie Meskens", 1982);
        // TODO 1: Print out the size of the test Data
        System.out.println(testData.size());

        // TODO 2: Use a List to add nathalie and anna to the test data. Print out the size of the list.
        // Print out the list with a for-each statement
        List<Actress> actresses = new ArrayList<>(testData);//create a new List
        actresses.add(nathalie);//add a new element
        actresses.add(anna);//add a new element

        System.out.print(actresses.size());//print the size of the List

        for (Actress actress : actresses) {
            System.out.print(actress + ", ");
        }//print the elements of the List

        // TODO 3: next remove reese and drew from the list and print the list size and the list with one statement
        actresses.remove(reese);
        actresses.remove(drew);
        System.out.printf(String.valueOf(actresses.size()), actresses);

        // TODO 4: now remove all actresses born before 1976 and print again
        Iterator<Actress> removeIt = actresses.iterator();
        while (removeIt.hasNext()) {
            Actress actress = removeIt.next();
            if (actress.getBirthYear() < 1976) {
                removeIt.remove();
            }
        }
        System.out.printf(String.valueOf(actresses.size()), actresses);

        // TODO 5: use an appropriate collection to remove all duplicates from the resulting list
        // and sort in natural order. Print out the collection
        Set<Actress> orderedActresses = new TreeSet<>(actresses);//collection that removes all duplicates
        System.out.printf(String.valueOf(orderedActresses.size()), orderedActresses);
    }
}
