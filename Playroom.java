package Lab9;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Playroom {

    private final List<Toy> toys = new ArrayList<>();

    public List<Toy> getToys() {
        return this.toys;
    }

    public void addToys(final List<? extends Toy> toys) {
        this.toys.addAll(toys);
    }

    public void addToy(final Toy toy) {
        this.toys.add(toy);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Playroom)) return false;
        final Playroom playroom = (Playroom) o;
        return Objects.equals(toys, playroom.toys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toys);
    }

    @Override
    public String toString() {
        return "Playroom{" +
                "toys=" + toys +
                '}';
    }
}