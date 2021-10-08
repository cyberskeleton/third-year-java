import java.util.Scanner;
import  java.util.Random;
//task 3.2-3.6, 4.20a, hw 4.6, 4.20є
//task 3.2
class LabMain4 {
    public static void main(String[] args) {
        Random r = new Random();
        int min = 0;
        int max = 10;
        int integer = r.nextInt(max);
        System.out.println(integer);
        for (int i=0; i < 25; i++) {
            int new_max = max+10;
            int new_integer = r.nextInt(new_max);
            if (new_integer > integer) {
                System.out.println(new_integer);
                integer = new_integer;
            }
            else {
                i--;
            }
            max = new_max;
        }
    }
}
//task 3.3
class RollDie {
    public static void main(String[] args) {
        Random r = new Random();
        int die = r.nextInt();
        for (int i = 0; i < 2; i++) {
        if (die>7 | 0>die){
            die = r.nextInt();
            i--;
            }
        }
        System.out.println(die);
    }
}
//task 3.4
class CheckDifferent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if ((a == b & a != c) || (a==c & a != b) || (b==c & a != c)) {
            System.out.println("2 same values");
        }
        else if (a==b & b == c) {
            System.out.println("all the same");
        }
        else {
            System.out.println("no same values");
        }
    }
}
//task 3.5
class FindMedianOfFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (d > e) {
            int temp = d;
            d = e;
            e = temp;
        }
        if (a > d) {
            int temp = d;
            d = a;
            a = temp;
            temp = e;
            e = b;
            b = temp;
        }
        if (c > b) {
            if (b < d) {
                System.out.println(Math.min(c, d));
            }
            else {
                System.out.println(Math.min(b, e));
            }
        }
        else {
            if (c > d) {
                System.out.println(Math.min(c, e));
            }
            else {
                System.out.println(Math.min(b, d));
            }
        }
    }
}

//task 4.20a
class ComputeWhileLargerThanEps2 {
    static int factorial(int n) {
        int f=1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input epsilon: ");
        double eps = input.nextDouble();
        System.out.print("input x: ");
        double x = input.nextDouble();
        double temp = x;
        double sum = 0;
        int power = 1;
        int i = 0;
        while (Math.abs(temp) > eps) {
            sum += temp;
            temp = Math.pow(-1, i)*Math.pow(x, power)/factorial(power);
            System.out.println("temp: " + temp);
            power += 2;
            i += 1;
        }
        System.out.println("result: " + sum);
    }
}
//task 4.20є
class ComputeWhileLargerThanEps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input epsilon: ");
        double eps = input.nextDouble();
        System.out.print("input x: ");
        double x = input.nextDouble();
        double temp = x;
        double sum = 1;
        while (Math.abs(temp) > eps) {
            sum -= temp;
            temp *= -x;
        }
        System.out.println("result: " + sum);
    }
}

//task 4.6
class ThreePointTriangleProbability {
    public static void main(String[] args) {
        Random r = new Random();
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            double a = r.nextDouble();
            double b = r.nextDouble();
            double c = r.nextDouble();
            if (a + b > c & a + c > b & b + c > a) {
                counter += 1;
            }
        }
        double res = (double) counter/1000;
        System.out.println(res);
    }
}
