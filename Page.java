package Lab9;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Page {

    private final List<Photo> photos = new ArrayList<>();

    public List<Photo> getPhotos() {
        return this.photos;
    }

    public void addPhoto(final Photo photo) {
        this.photos.add(photo);
    }

    public void addPhotos(final List<Photo> photos) {
        this.photos.addAll(photos);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Page)) return false;
        final Page page = (Page) o;
        return Objects.equals(photos, page.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photos);
    }

    @Override
    public String toString() {
        return "Page{" +
                "photos=" + photos +
                '}';
    }
}