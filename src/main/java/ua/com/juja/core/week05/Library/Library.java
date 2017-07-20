package ua.com.juja.core.week05.Library;

public class Library {

    public String printCatalog(Issue[] catalog) {
        String result = "";

        if (catalog == null) {
            return result;
        }

        for (Issue iter: catalog) {
            result += iter.toPrint();
        }

        return result;
    }


}
