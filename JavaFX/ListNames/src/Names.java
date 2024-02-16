package week1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();//make a new List with elements of the type String
        names.add("Albert");//add element to the List
        names.add("Henry");//add element to the List
        names.add("Josephine");//add element to the List
        names.add("Anabelle");//add element to the List
        names.add("Ashraf");//add element to the List

        for (String name : names) {
            System.out.println(name + " ");
        }//print the elements using a for-each loop

        System.out.println("Check for the name: " + names.contains("Georgie"));//check if the name Georgie is present in the List and print the result of that
        //returns a boolean value
        Iterator<String> iterator = names.iterator();//the iterator() method can get an iterator for a collection
        while (iterator.hasNext()) {//while there are still elements left
            if (iterator.next().startsWith("A")) {//the next element starts with an "A"
                iterator.remove();//remove it
            }
        }

        System.out.print(names);//print out the list by passing it to a print statement --includes only the names missing an "A"
    }
}