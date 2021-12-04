package Lab9;
import java.util.Objects;

public class Photo {
    private String title;

    public Photo(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo)) return false;
        final Photo photo = (Photo) o;
        return Objects.equals(title, photo.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "title='" + title + '\'' +
                '}';
    }
}