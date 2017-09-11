package ua.com.juja.core.week05.Library;

public class Library {

    public String printCatalog(Issue[] catalog) {
        String result = "";

        if (catalog == null) {
            return result;
        }

        for (Issue iter: catalog) {
            result += iter.toPrint() + "\n";
        }

        return result;
    }

    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        String result = "";

        if (catalog == null) {
            return result;
        }

        for (int index = 0; index < catalog.length; index++) {
            if (catalog[index].getCountPages() > barrierCountPages) {
                result += catalog[index].toPrint();
            }
        }

        return result;
    }


}
