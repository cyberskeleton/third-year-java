package Lab9;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlowerShop {

    private final List<Flower> flowers = new ArrayList<>();

    public List<Flower> getFlowers() {
        return this.flowers;
    }

    public <T extends Flower> void addFlowers(final List<T> flowers) {
        this.flowers.addAll(flowers);
    }

    public void addFlower(final Flower flower) {
        this.flowers.add(flower);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof FlowerShop)) return false;
        final FlowerShop flowershop = (FlowerShop) o;
        return Objects.equals(flowers, flowershop.flowers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowers);
    }

    @Override
    public String toString() {
        return "FlowerShop{" +
                "flowers=" + flowers +
                '}';
    }
}