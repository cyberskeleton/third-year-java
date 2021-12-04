package Lab9;


import java.util.ArrayList;
import java.util.List;

public class Lab9 {
    public void testAlbum() {
        final Album album = new Album();

        final Page page1 = new Page();
        final Page page2 = new Page();
        final Page page3 = new Page();
        List<Page> pages = List.of(page1, page2, page3);
        album.addPages(pages);
        final Page page4 = new Page();
        album.addPage(page4);

        page4.addPhotos(
                List.of(
                        new Photo("Country landscape"),
                        new Photo("A building"),
                        new Photo("Another building")));
        page3.addPhoto(new Photo("Cat on the floor"));
        page3.addPhoto(new Photo("Cat staring out of the window"));

        int count = 0;
        for(final Page page : album.getPages()) {
            count += page.getPhotos().size();
        }
        System.out.printf("Total number of pictures in the album: %s \n\n\n\n\n", count);
    }

    public void testPlayroom() {
        final int budgetInCents = 5000_00;

        final List<Toy> cars = List.of(
                new Car(Size.MEDIUM, 1000, 0, 5, false),
                new Car(Size.MEDIUM, 1000, 0, 5, false),
                new Car(Size.BIG, 10000, 0, 5, false),

                new Car(Size.SMALL, 500, 6, 17, false),
                new Car(Size.SMALL, 500, 6, 17, false),
                new Car(Size.SMALL, 500, 6, 17, false),
                new Car(Size.MEDIUM, 3000, 6, 17, true),
                new Car(Size.MEDIUM, 4000, 6, 17, true),
                new Car(Size.MEDIUM, 5000, 6, 17, true),

                new Car(Size.BIG, 10000000, 18, 99, false)
        );

        final List<Toy> dolls = List.of(
                new Doll(Size.MEDIUM, 2000, 0, 5, "Ann"),
                new Doll(Size.MEDIUM, 2000, 0, 5, "Matt"),
                new Doll(Size.BIG, 50000, 0, 5, "Bella"),
                new Doll(Size.SMALL, 500, 6, 17, "Sarah"),
                new Doll(Size.SMALL, 500, 6, 17, "Joy"),
                new Doll(Size.SMALL, 2500, 6, 17, "Karen")
        );

        List<Ball> balls = new ArrayList<>();
        balls.addAll(List.of(
                new Ball(Size.MEDIUM, 300, 0, 5, "Blue"),
                new Ball(Size.MEDIUM, 300, 0, 5, "Red"),
                new Ball(Size.MEDIUM, 300, 0, 5, "Green"),
                new Ball(Size.BIG, 2000, 0, 5, "Orange")));
        final List<String> colors = List.of("Amaranth", "Vermilion", "Coquelicot", "Gamboge", "Burlywood", "Aureolin",
                "Celadon", "Glaucous", "Skobeloff", "Viridian", "Feldgrau", "Mountbatten Pink", "Phlox");
        for (final String color : colors) {
            final Ball ball = new Ball(Size.SMALL, 999, 6, 17, color);
            balls.add(ball);
        }

        final List<Toy> cubes = List.of(
                new Cube(Size.MEDIUM, 497, 0, 7, 4),
                new Cube(Size.MEDIUM, 498, 0, 7, 4),
                new Cube(Size.MEDIUM, 499, 0, 7, 4),
                new Cube(Size.BIG, 12345, 0, 7, 1),

                new Cube(Size.BIG, 500, 8, 12, 12),
                new Cube(Size.BIG, 500, 8, 12, 12),
                new Cube(Size.BIG, 500, 8, 12, 12),
                new Cube(Size.BIG, 4444, 13, 17, 32),
                new Cube(Size.BIG, 4444, 13, 17, 32),

                new Cube(Size.BIG, 19280, 18, 192, 192)
        );

        final Playroom playroom = new Playroom();
        playroom.addToys(cars);
        playroom.addToys(dolls);
        playroom.addToys(balls);
        playroom.addToys(cubes);

        final List<Toy> toys = playroom.getToys();

        System.out.println("All MEDIUM:");
        final ArrayList<Toy> medium = new ArrayList<>();
        for (final Toy toy : toys) {
            if (toy.getSize().equals(Size.MEDIUM)) {
                medium.add(toy);
                System.out.println(toy);
            }
        }
        System.out.println("---");

        System.out.println("Up to $20:");
        for (final Toy toy : toys) {
            if (toy.getPriceInCents() <= 20_00) {
                System.out.println(toy);
            }
        }
        System.out.println("---");

        System.out.println("For 5-year-olds:");
        for (final Toy toy : toys) {
            if (toy.getPriceInCents() <= 20_00) {
                System.out.println(toy);
            }
        }
        System.out.println("---");

        System.out.println("SMALL size, up to 17 years, under $50:");
        for (final Toy toy : toys) {
            if (toy.getPriceInCents() <= 50_00 && toy.getMaxAge() <= 17 && toy.getSize().equals(Size.SMALL)) {
                System.out.println(toy);
            }
        }
        System.out.println("---");

        System.out.println("Seniors only:");
        for (final Toy toy : toys) {
            if (toy.getMaxAge() >= 18) {
                System.out.println(toy);
            }
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
        final Lab9 lab9 = new Lab9();

        lab9.testAlbum();

        lab9.testPlayroom();
    }
}