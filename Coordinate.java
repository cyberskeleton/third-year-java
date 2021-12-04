package Point;

import java.util.Objects;

public class Coordinate {

    protected long x;
    protected long y;

    public Coordinate(final long x, final long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return this.x;
    }

    public void setX(final long x) {
        this.x = x;
    }

    public long getY() {
        return this.y;
    }

    public void setY(final long y) {
        this.y = y;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinate)) return false;
        final Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}