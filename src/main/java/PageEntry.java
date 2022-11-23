import java.util.Locale;

public class PageEntry implements Comparable<PageEntry> {
    private final String pdfName;
    private final int page;
    private final int count;

    public PageEntry(String pdfName, int page, int count) {
        this.pdfName = pdfName.toLowerCase();
        this.page = page;
        this.count = count;
    }

    @Override
    public int compareTo(PageEntry o) {

        //описать сравнение
        return 0;
    }
}
