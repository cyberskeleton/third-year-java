package RationalFraction;
import java.util.Scanner;

public class RationalFractionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input array size: ");
        int arraySize = sc.nextInt();
        RationalFraction array[] = new RationalFraction[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("numerator: ");
            int num = sc.nextInt();
            System.out.print("denominator: ");
            int denom = sc.nextInt();
            array[i] = RationalFraction.input(num, denom);
        }
        RationalFraction.ChangeElements(array);
        for (int i = 0; i < arraySize; i++) {
            RationalFraction.print(array[i]);
        }
    }
}
