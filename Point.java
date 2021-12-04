package Point;

import java.util.Objects;

public class Point extends Coordinate {
    private long time;

    public Point(final long x, final long y, final long time) {
        super(x, y);
        this.time = time;
    }

    public Coordinate move(final Coordinate offset, final int timeOffset) {
        this.x += offset.x;
        this.y += offset.y;
        this.time = timeOffset;

        return new Coordinate(this.x, this.y);
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(final long time) {
        this.time = time;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        if (!super.equals(o)) return false;
        final Point point = (Point) o;
        return time == point.time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), time);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", timePeriod=" + time +
                '}';
    }
}