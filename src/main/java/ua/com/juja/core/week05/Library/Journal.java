package ua.com.juja.core.week05.Library;

public class Journal extends Issue {
    private String yearJournal;
    private String numberJournal;

    public Journal(String name, int countPages, String yearJournal, String numberJournal) {
        super(name, countPages);
        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
    }

    public String toPrint() {
        return "Journal{" +
                "name=" + getName() +
                ",countPages=" + getCountPages() +
                ",year=" + yearJournal +
                ",number=" + numberJournal +
                "}";
    }
}
