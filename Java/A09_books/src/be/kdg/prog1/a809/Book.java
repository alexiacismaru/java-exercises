package be.kdg.prog1.a809;

public class Book {
    private String title;
    private String author;
    private int yearFirstPublished;

    public Book() {
    }

    public Book(String title, String author, int yearFirstPublished) {
        this.title = title;
        this.author = author;
        this.yearFirstPublished = yearFirstPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearFirstPublished() {
        return yearFirstPublished;
    }

    public void setYearFirstPublished(int yearFirstPublished) {
        this.yearFirstPublished = yearFirstPublished;
    }

    @Override
    public String toString() {
        return "TITLE:     " + title + "\n"
                + "AUTHOR:    " + author + "\n"
                + "PUBLISHED: " + yearFirstPublished + "\n";
    }
}
