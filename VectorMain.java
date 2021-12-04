package Vector;

import java.util.Arrays;
import java.util.Scanner;

public class VectorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input quantity: ");
        int n = sc.nextInt();
        System.out.print("input vector len: ");
        int len = sc.nextInt();
        Vector[] array = new Vector[n];
        for (int i = 0; i < n; i++) {
            double[] arr = new double[len];
            System.out.println("input " + i + " vector");
            for (int j = 0; j < len; j++) {
                arr[j] = sc.nextDouble();
            }
            array[i] = new Vector(arr);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("vectors " + Arrays.toString(array[i].vectorArray) + " " + Arrays.toString(array[j].vectorArray));
                System.out.println(array[i].vectorLength() + " " + array[j].vectorLength());
                System.out.println(array[i].dotProduct(array[j]));
                System.out.println(array[i].getAngle(array[j]));
            }
        }
    }
}
