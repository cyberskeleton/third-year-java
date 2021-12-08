package Lab9;

import java.util.Objects;

public class Rose extends Flower {
    protected String cultivar;
    public Rose(final Size size, final int priceInCents, final Size freshness, final String cultivar) {
        super(size, priceInCents, freshness);
        this.cultivar = cultivar;
    }

    public String getCultivar() {
        return this.cultivar;
    }

    public void setCultivar(final String cultivar) {
        this.cultivar = cultivar;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Rose)) return false;
        if (!super.equals(o)) return false;
        final Rose rose = (Rose) o;
        return Objects.equals(cultivar, rose.cultivar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cultivar);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "cultivar='" + cultivar + '\'' +
                ", size=" + size +
                ", priceInCents=" + priceInCents +
                ", freshness=" + freshness +
                '}';
    }
}