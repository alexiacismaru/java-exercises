package be.kdg.prog1.a809;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection connection = initialiseDatabase();
        if (connection == null) {
            return; // or System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        int choice = 4;
        do {
            System.out.println("What would you like to do?");
            System.out.println("1) Display all books");
            System.out.println("2) Add a book");
            System.out.println("3) Search books by title");
            System.out.println("4) Quit");
            System.out.print(">> ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear the input buffer

            switch (choice) {
                case 1:
                    displayAllBooks(connection);
                    break;
                case 2:
                    System.out.print("Title?     ");
                    String title = scanner.nextLine();
                    System.out.print("Author?    ");
                    String author = scanner.nextLine();
                    System.out.print("Published? ");
                    int yearPublished = scanner.nextInt();
                    addBook(connection, new Book(title, author, yearPublished));
                    break;
                case 3:
                    System.out.print("Search term? ");
                    String searchTerm = scanner.nextLine();
                    searchBooksByTitle(connection, searchTerm);
                    break;
            }
        } while (choice != 4);

        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Closing connection failed!");
        }
    }

    private static Connection initialiseDatabase() {
        try {
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:hsqldb:file:db/booksDb",
                            "sa", "");

            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS books (title VARCHAR(10), author VARCHAR(10), year_first_published INTEGER)");
            statement.execute("DELETE FROM books");

            statement.close();

            return connection;
        } catch (SQLException e) {
            System.out.println("DB initialization failed!");
            return null;
        }
    }

    private static void displayAllBooks(Connection connection) {
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT title, author, year_first_published FROM books");
            int found = 0;
            while (resultSet.next()) {
                Book book = new Book();
                book.setTitle(resultSet.getString(1));
                book.setAuthor(resultSet.getString(2));
                book.setYearFirstPublished(resultSet.getInt(3));

                System.out.println(book);
                found++;
            }

            if (found == 0) {
                System.out.println("<no books found>");
                System.out.println();
            }

            statement.close();
        } catch (SQLException e) {
            System.out.println("Displaying all books failed!\n");
        }
    }

    private static void addBook(Connection connection, Book book) {
        try {
            Statement statement = connection.createStatement();

            statement.execute("INSERT INTO books (title, author, year_first_published) VALUES ('"
                    + book.getTitle() + "', '" + book.getAuthor() + "', " + book.getYearFirstPublished() + ")");

            System.out.println();
            System.out.println("Added the following book:");
            System.out.println(book);

            statement.close();
        } catch (SQLException e) {
            System.out.println("Adding book failed! " + e.getMessage() + "\n");
        }
    }

    private static void searchBooksByTitle(Connection connection, String searchTerm) {
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT title, author, year_first_published FROM books WHERE title like '%" + searchTerm + "%'");
            int found = 0;
            while (resultSet.next()) {
                Book book = new Book();
                book.setTitle(resultSet.getString(1));
                book.setAuthor(resultSet.getString(2));
                book.setYearFirstPublished(resultSet.getInt(3));

                System.out.println(book);
                found++;
            }

            if (found == 0) {
                System.out.println("<no books found>");
                System.out.println();
            }

            statement.close();
        } catch (SQLException e) {
            System.out.println("Searching books failed!\n");
        }
    }
}
