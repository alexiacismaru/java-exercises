package Week5.Book;

public class BookTest {
    public static void main(String[] args){
        BookApp bookOne = new BookApp("DEITEL & DEITEL", " JAVA, HOW TO PROGRAM", 1186  );
        System.out.println("Book" + bookOne.title + ", (" + bookOne.number + "pages), written by" + bookOne.author + "is  on loan.");
    }
}
