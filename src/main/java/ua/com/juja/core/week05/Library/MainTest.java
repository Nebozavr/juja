package ua.com.juja.core.week05.Library;

public class MainTest {

    public static void main(String[] args) {

        Issue issue = new Issue("Issue", 20);
        Issue book = new Book("Book", 50, "Author");
        Issue journal = new Journal("Journal", 100, "1990", "5");

        System.out.println(issue.toPrint());
        System.out.println(book.toPrint());
        System.out.println(journal.toPrint());


        Issue[] catalog = new Issue[3];
        catalog[0] = new Issue("Test Book", 50);
        catalog[1] = new Book("Test Book", 100, "Yura Bartoshchuk");
        catalog[2] = new Journal("Test Journal", 20, "1990", "#5");

        String print = new Library().printCatalog(catalog);

        System.out.println(print);
    }
}
