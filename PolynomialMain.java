package Polynomial;
import RationalFraction.RationalFraction;

import java.util.Arrays;
import java.util.Scanner;

public class PolynomialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input quantity: ");
        int n = sc.nextInt();
        Polynomial[] polyArray = new Polynomial[n];
        System.out.print("input polynomial length: ");
        int len = sc.nextInt();
        RationalFraction[][] coefficientsArray = new RationalFraction[n][len];
        for (int i = 0; i < n; i++) {
            RationalFraction[] array = new RationalFraction[len];
            System.out.println("input " + i + " polynomial");
            for (int j = 0; j < len; j++) {
                System.out.print("input numerator: ");
                int a = sc.nextInt();
                System.out.print("input denominator: ");
                int b = sc.nextInt();
                array[j] = RationalFraction.input(a, b);
            }
            coefficientsArray[i] = array;
        }

        for (int i = 0; i < n; i++) {
            polyArray[i] = new Polynomial(coefficientsArray[i]);
        }
        RationalFraction[] nullArray =  new RationalFraction[len];
        RationalFraction nullFraction = RationalFraction.input(0, 1);
        Arrays.fill(nullArray, nullFraction);
        Polynomial sum = new Polynomial(nullArray);
        for (Polynomial polynomial : polyArray) {
            sum = polynomial.Add(sum, polynomial);
        }
        sum.print();
    }
}
