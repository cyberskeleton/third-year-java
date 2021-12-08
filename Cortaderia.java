package Lab9;

import java.util.Objects;

public class Cortaderia extends Flower {

        private boolean isPurple;

        public Cortaderia(final boolean isPurple) {
            this.isPurple = isPurple;
        }

        public Cortaderia(final Size size, final int priceInCents, final Size freshness, final boolean isPurple) {
            super(size, priceInCents, freshness);
            this.isPurple = isPurple;
        }

        public boolean isPurple() {
            return this.isPurple;
        }

        public void setPurple(final boolean purple) {
            this.isPurple = purple;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Cortaderia)) return false;
            if (!super.equals(o)) return false;
            final Cortaderia cortaderia = (Cortaderia) o;
            return isPurple == cortaderia.isPurple;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), isPurple);
        }

        @Override
        public String toString() {
            return "Cordateria{" +
                    "isPurple=" + isPurple +
                    ", size=" + size +
                    ", priceInCents=" + priceInCents +
                    ", freshness=" + freshness +
                    '}';
        }
    }
