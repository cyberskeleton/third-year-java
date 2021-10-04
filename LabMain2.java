import java.util.Scanner;

//cw 3.1-3.4, 3.7-3.9, 4.3, hw 3.26, 4.4
//task 3.1, 3.2
class LabMain2 {
    public static void main(String[] args) {
        System.out.println(1.2+31);
        System.out.println(45*54-11);
        System.out.println(15/4);
        System.out.println(15.0/4);
        System.out.println(67%5);
        System.out.println((2*45.1+3.2)/2);
        System.out.println("Результат дорівнює: " + (2+3));
        System.out.println("Результат дорівнює: " + (4.5*56));
        System.out.println("Результат дорівнює: " + (2/3.0));
    }
}

//task 3.3
class UserInputUA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть ім''я: ");
        String name = input.nextLine();
        System.out.println("Привіт, " + name + "!");
        input.close();
    }
}

//task 3.4
class InitializeNumbers {
    public static void main(String[] args) {
        double a = 1.0/10000.0;
        System.out.println(a);
        double b = 2.33E5;
        System.out.println(b);
        double c = Math.PI;
        System.out.println(c);
        float c2 = (float) Math.PI;
        System.out.println(c2);
        double d = Math.E;
        System.out.println(d);
        float d2 = (float) Math.E;
        System.out.println(d2);
        double e = Math.sqrt(5);
        System.out.println(e);
        double f = Math.log(100);
    }
}

//task 3.7
class GravityForce {
    public static void main(String[] args) {
        double gamma = 6.673E-11;
        Scanner input = new Scanner(System.in);
        System.out.println("input m1, m2, r: ");
        double m1 = input.nextDouble();
        double m2 = input.nextDouble();
        double r = input.nextDouble();
        double F = gamma*((m1*m2)/r);
        System.out.println("F = " + F);
        input.close();
    }
}
//task 3.8
class Truncation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input number: ");
        double x = input.nextDouble();
        input.close();
        int integer_part = (int) x;
        double fraction_part = x%1;
        System.out.println("no math: " + integer_part + " " + fraction_part);
        double integer_part2 = Math.floor(x);
        double fraction_part2 = x - integer_part2;
        System.out.println("with math: " + integer_part2 + " " + fraction_part2);
        int bigger = integer_part + 1;
        System.out.println("smallest bigger number: "+ bigger);
        System.out.println("biggest smaller number: "+ integer_part);
        if (fraction_part < 0.5) {
            System.out.println("rounded: "+ integer_part);
        }
        else {
            System.out.println("rounded: "+ (integer_part + 1));
        }
    }
}
//task 3.9
class FixedPointRepresentation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double difference = x - y;
        double product = x * y;
        System.out.printf("difference: %.1f \n", difference);
        System.out.printf("product: %.1f \n", product);
    }
}

//task 4.3
class RosenbrockFunction {
    public static double Rosenbrock2d (double x, double y){
        double first = (x*x - y);
        double second = (x - 1);
        return (100*first*first + second*second);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.println(Rosenbrock2d(x, y));
    }
}

//task 3.26
class CylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input r, h: ");
        double r = input.nextDouble();
        double h = input.nextDouble();
        System.out.println("volume: "+ Math.PI*r*r*h);
    }
}

//task 4.4
class TrianglePerimeterArea {
    public static double Perimeter (double x, double y, double z){
        return x+y+z;
    }
    public static double Area (double x, double y, double z, double perimeter){
        double p = perimeter/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println("area: " + Area(a, b, c, Perimeter(a, b, c)));
        System.out.println("perimeter: " + Perimeter(a, b, c));
        System.out.println("area with given numbers: " + Area(3, 3.5+2E-111, 3.5+2E-111, Perimeter(3, 3.5+2E-111, 3.5+2E-111)));
        System.out.println("perimeter with given numbers: " + Perimeter(3, 3.5+2E-111, 3.5+2E-111));
    }
}