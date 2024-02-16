package be.kdg.java1.assignments.a01_book.test;


// import java.awt.print.Book;      NO!!
import be.kdg.java1.assignments.a01_book.library.Book;

public class BookApp {
    public static void main(String[] args) {
        Book b1 = new Book("Deitel & Deitel", "Java, How to program,", 1186);

        Book animalFarm = new Book();
        System.out.println(animalFarm.toString());
        animalFarm.setAuthor("George Orwell");
        animalFarm.setTitle("Animal farm");
        animalFarm.setPages(300);
        animalFarm.setOnLoan(true);
        System.out.println(animalFarm);
    }  // main()
    
}  // class
