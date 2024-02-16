package be.kdg.java1.assignments.a01_book.library;

public class Book {
    /*
    properties
     */
    private String author;
    private String title;
    private int pages;    // -32768.. 32767
    private boolean onLoan;
    
    /*
    constructor(s)
     */
    public Book(String author, String title, int pages) {
        setAuthor(author);
        setTitle(title);
        setPages(pages);
    }
    
    public Book() {
        this("unknown", "unknown", 0);
    }
    
    /*
    getter(s)/setter(s)
     */
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public boolean isOnLoan() {
        return onLoan;
    }
    
    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
    
    /*
    method(s)
     */
    @Override
    public String toString() {
        return String.format("Book %s (%d pages), written by %s is currently%son onloan",
                title.toUpperCase(), pages, author.toUpperCase(), onLoan ? " " : " not ");
    }  // toString()
    
}  // class Book
