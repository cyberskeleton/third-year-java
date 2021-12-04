package Lab9;
import java.util.Objects;

public class Doll extends Toy {

    private String name;

    public Doll(final String name) {
        this.name = name;
    }

    public Doll(final Size size, final int priceInCents, final int minAge, final int maxAge, final String name) {
        super(size, priceInCents, minAge, maxAge);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Doll)) return false;
        if (!super.equals(o)) return false;
        final Doll doll = (Doll) o;
        return Objects.equals(name, doll.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Doll{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", priceInCents=" + priceInCents +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                '}';
    }
}