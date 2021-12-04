package Lab9;

import java.util.Objects;

public class Cube extends Toy {

    private int edges;

    public Cube(final int edges) {
        this.edges = edges;
    }

    public Cube(final Size size, final int priceInCents, final int minAge, final int maxAge, final int edges) {
        super(size, priceInCents, minAge, maxAge);
        this.edges = edges;
    }

    public int getEdges() {
        return this.edges;
    }

    public void setEdges(final int edges) {
        this.edges = edges;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Cube)) return false;
        if (!super.equals(o)) return false;
        final Cube cube = (Cube) o;
        return edges == cube.edges;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), edges);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "edges=" + edges +
                ", size=" + size +
                ", priceInCents=" + priceInCents +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                '}';
    }
}