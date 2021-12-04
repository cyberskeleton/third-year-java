package Lab9;
import java.util.Objects;

public class Car extends Toy {

    private boolean isRadioControlled;

    public Car(final boolean isRadioControlled) {
        this.isRadioControlled = isRadioControlled;
    }

    public Car(final Size size, final int priceInCents, final int minAge, final int maxAge, final boolean isRadioControlled) {
        super(size, priceInCents, minAge, maxAge);
        this.isRadioControlled = isRadioControlled;
    }

    public boolean isRadioControlled() {
        return this.isRadioControlled;
    }

    public void setRadioControlled(final boolean radioControlled) {
        this.isRadioControlled = radioControlled;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        final Car car = (Car) o;
        return isRadioControlled == car.isRadioControlled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isRadioControlled);
    }

    @Override
    public String toString() {
        return "Car{" +
                "isRadioControlled=" + isRadioControlled +
                ", size=" + size +
                ", priceInCents=" + priceInCents +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                '}';
    }
}
