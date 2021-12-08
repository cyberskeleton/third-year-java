package Lab9;

import java.util.Objects;

public class Begonia extends Flower {

    private int numberOfThorns;

    public Begonia(final int thorns) {
        this.numberOfThorns = thorns;
    }

    public Begonia(final Size size, final int priceInCents, Size freshness, final int thorns) {
        super(size, priceInCents, freshness);
        this.numberOfThorns = thorns;
    }

    public int getNumberOfThorns() {
        return this.numberOfThorns;
    }

    public void setNumberOfThorns(final int numberOfThorns) {
        this.numberOfThorns = numberOfThorns;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Begonia)) return false;
        if (!super.equals(o)) return false;
        final Begonia begonia = (Begonia) o;
        return numberOfThorns == begonia.numberOfThorns;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfThorns);
    }

    @Override
    public String toString() {
        return "Begonia{" +
                "numberOfThorns=" + numberOfThorns +
                ", size=" + size +
                ", priceInCents=" + priceInCents +
                ", freshness=" + freshness +
                '}';
    }
}