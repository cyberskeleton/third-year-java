package Point;

public class PointMain {

    public double getDistance(final Point first, final Point second) {
        return Math.abs(Math.sqrt(Math.pow((double) second.getX() - first.getX(), 2) - Math.pow((double) second.getY() - first.getY(), 2)));
    }

    public double getVelocity(final Point start, final Point end, final long deltaTime) {
        if (deltaTime == 0) {
            return 0;
        }
        return this.getDistance(start, end) / deltaTime;
    }

    public double getAcceleration(final double velocity, final long deltaTime) {
        return velocity/deltaTime;
    }

    public boolean pointsIntersect(final Point first, final Point second) {
        System.out.println(first + ":" + second);
        return first.equals(second);
    }

    public void testIntersect(final Point first, final Point second, final Coordinate deltaFirst, final Coordinate deltaSecond, final int timePeriod) {
        final Point start1 = new Point(first.getX(), first.getY(), 0);
        final Point start2 = new Point(second.getX(), second.getY(), 0);

        for (int i = 1; i <= timePeriod; i++) {
            first.move(deltaFirst, i);
            second.move(deltaSecond, i);
            if (this.pointsIntersect(first, second)) {
                System.out.printf("Points intersect at (%s; %s) on period of time %s \n", first.getX(), first.getY(), i);
                final double velocity1 = this.getVelocity(start1, first, i);
                System.out.println("Velocity 1: " + velocity1);
                System.out.println("Acceleration 1: " + this.getAcceleration(velocity1, i));

                final double velocity2 = this.getVelocity(start2, first, i);
                System.out.println("Velocity 2: " + velocity2);
                System.out.println("Acceleration 2: " + this.getAcceleration(velocity2, i));

                return;
            }
        }
        System.out.println("Points don't intersect");
    }

    public static void main(String[] args) {
        final PointMain test = new PointMain();

        final Point first = new Point(0, 0, 0);
        final Point second = new Point(100, 0, 0);
        final double distance = test.getDistance(first, second);
        System.out.println("Initial distance: " + distance);
        final Coordinate deltaFirst = new Coordinate(3, 0);
        final Coordinate deltaSecond = new Coordinate(-2, 0);
        final int time = 100;

        test.testIntersect(first, second, deltaFirst, deltaSecond, time);



    }
}