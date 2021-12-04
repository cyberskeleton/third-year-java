package Lab9;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Album {

    private final List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return this.pages;
    }

    public void addPage(final Page page) {
        this.pages.add(page);
    }

    public void addPages(final List<Page> pages) {
        this.pages.addAll(pages);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Album)) return false;
        final Album album = (Album) o;
        return Objects.equals(pages, album.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages);
    }

    @Override
    public String toString() {
        return "Album{" +
                "pages=" + pages +
                '}';
    }
}