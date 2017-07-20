package ua.com.juja.core.week05.Library;

class Book extends Issue {
    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }

    public String toPrint() {
        String result = "Book{" + super.toPrint() + ",author=" + authorBook + "}";
        return result;
    }



}