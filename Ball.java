package Lab9;


import java.util.Objects;

public class Ball extends Toy {

    private String color;

    public Ball(final String color) {
        this.color = color;
    }

    public Ball(final Size size, final int priceInCents, final int minAge, final int maxAge, final String color) {
        super(size, priceInCents, minAge, maxAge);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        if (!super.equals(o)) return false;
        final Ball ball = (Ball) o;
        return Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", priceInCents=" + priceInCents +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                '}';
    }
}