package ua.com.juja.core.week05.Library;

public class MainTest {

    public static void main(String[] args) {

        Issue issue = new Issue("Issue", 20);
        Issue book = new Book("Book", 50, "Author");
        Issue journal = new Journal("Journal", 100, "1990", "5");

        System.out.println(issue.toPrint());
        System.out.println(book.toPrint());
        System.out.println(journal.toPrint());
    }
}
