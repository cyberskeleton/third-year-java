package Lab9;


import java.util.Objects;

public class Toy {

    protected Size size;
    protected int priceInCents;
    protected int minAge;
    protected int maxAge;

    public Toy() {
        super();
        this.size = Size.MEDIUM;
        this.minAge = 0;
        this.maxAge = 99;
    }

    public Toy(final Size size, final int priceInCents, final int minAge, final int maxAge) {
        this.size = size;
        this.priceInCents = priceInCents;
        this.minAge = minAge;
        this.maxAge = maxAge;
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

    public int getMinAge() {
        return this.minAge;
    }

    public void setMinAge(final int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public void setMaxAge(final int maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Toy)) return false;
        final Toy toy = (Toy) o;
        return priceInCents == toy.priceInCents && minAge == toy.minAge && maxAge == toy.maxAge && size == toy.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, priceInCents, minAge, maxAge);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "size=" + size +
                ", priceInCents=" + priceInCents +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                '}';
    }
}