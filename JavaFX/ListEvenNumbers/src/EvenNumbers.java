import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {
        Random random = new Random();//create random numbers
        List<Integer> numberList = new ArrayList<>();//create a new List with Integer elements

        for (int i = 0; i < 20; i++) {//20 numbers
            numberList.add(random.nextInt(50) + 1);//1 ->50
        }//randomise 20 numbers from 1 till 50 --both inclusive-- and add them to the List
        System.out.println(numberList);//print out the List

        Integer[] numberArray = numberList.toArray(new Integer[0]);//create an Array and store the contents of the List in it
        for (Integer integer : numberArray) {
            System.out.print(integer + ", ");
        }//print out the elements of the Array using a for-each loop
        System.out.println();

        //Remove odd numbers. Does not work on fixed size array!
        List<Integer> evenNumbers = Arrays.asList(numberArray);//create a List that will store the elements of the Array above
        for (Iterator<Integer> iterator = evenNumbers.iterator(); iterator.hasNext(); ) {//iteration() is equal to the elements of the list
            Integer next = iterator.next();//the Integer is equal to the elements of the iteration
            if (next % 2 == 1) {//if the Integer is not divisible by 2
                iterator.remove();//remove it
            }
        }

        System.out.println(evenNumbers);//print out the List containing only the even numbers

        Collections.sort(evenNumbers);//sort the numbers from smallest -> biggest
        System.out.println("Ascending: " + evenNumbers);

        Collections.reverse(evenNumbers);//sort the numbers from biggest -> smallest
        System.out.println("Descending: " + evenNumbers);

        Collections.shuffle(evenNumbers);//shuffle the List again
        System.out.println("Shuffled: " + evenNumbers);

        System.out.printf("48 appears %s times.", Collections.frequency(evenNumbers, 48));//print out the amount of times the number 48 appeared in the List

    }
}
