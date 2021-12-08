package Lab9;

import java.util.Objects;

public class Flower {
    protected Size size;
    protected int priceInCents;
    protected Size freshness;

    public Flower() {
        super();
        this.size = Size.MEDIUM;
    }

    public Flower(final Size size, final int priceInCents, final Size freshness) {
        this.size = size;
        this.priceInCents = priceInCents;
        this.freshness = freshness;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(final Size size) {
        this.size = size;
    }

    public int getPriceInCents() {
        return this.priceInCents;
    }

    public void setPriceInCents(final int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public Size getFreshness() {
        return this.freshness;
    }

    public void setFreshness(final Size freshness) {
        this.freshness = freshness;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        final Flower flower = (Flower) o;
        return priceInCents == flower.priceInCents && size == flower.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, priceInCents);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "size=" + size +
                ", priceInCents=" + priceInCents +
                ", freshness=" + freshness +
                '}';
    }
}