package ua.com.juja.core.week05.lab24;

public class Issue {
    private String name;
    private int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String toPrint() {
        return "name=" + name +
                ",countPages=" + countPages;
    }

}

class Book extends Issue {
    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }

    public String toPrint(){
        String result = "Book{" + super.toPrint() + ",author=" + authorBook + "}";
        return result;
    }

    public static void main(String[] args) {

        Issue test = new Book("Neba", 100, "authoeNeba" );
        Issue test2 = new Issue("Bart", 200);

        System.out.println(test.toPrint());
        System.out.println(test2.toPrint());
    }

}

