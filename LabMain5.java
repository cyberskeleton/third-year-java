import java.util.Arrays;
import java.util.Scanner;
//1.1-1.6, hw 1.18, 1.22
//task 1.1
class LabMain5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        String[] array = numbers.split(" ");
        for (String i : array){
            System.out.println(i);
        }
        input.close();
    }
}
//task 1.2
class FindMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] stringArray =  input.nextLine().split(" ");
        int [] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        int max = intArray[0];
        int min = intArray[0];
        for (int j : intArray) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("min: " + min + " max: " + max);
        input.close();
    }
}

//task 1.3
class Mean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input array length: ");
        int n = input.nextInt();
        int[] numbers = new int [n];
        int i = 0;
        int sum = 0;
        while (i < n){
            numbers[i] = input.nextInt();
            sum += numbers[i];
            i++;
        }
        int mean = sum/n;
        System.out.println(mean);
        int standard_sum = 0;
        for (int j = 0; j < n; j++){
            standard_sum += (numbers[j] - mean)*(numbers[j] - mean);
        }
        System.out.println("standard deviation: " + Math.sqrt(standard_sum/(double) n));
    }
}

//task 1.4
class Counters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] strings =  input.nextLine().split(" ");
        int [] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        int[] counterArray = new int[numbers.length];
        counterArray[0] = 1;
        int i = 0;
        int j = 1;
        while (i < numbers.length-1) {
            while (j < numbers.length) {
//                System.out.println(i + " "+ j);
                if (numbers[i] == numbers[j]) {
                    counterArray[j] = counterArray[i] + 1;
                    i++;
                    j++;
                }
                else {
                    counterArray[j] = 1;
                    i++;
                    j++;
                }
            }
        }
//        for (int k : counterArray){
//            System.out.println(k);
//        }
        int max = counterArray[0];
        int number = 1;
        for (int k = 0; k < counterArray.length; k++) {
            if (counterArray[k] > max) {
                max = counterArray[k];
                number = numbers[k];
            }
        }
        System.out.println(max + " in a row of number " + number);
    }
}

//task 1.5
class BestDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        double BestDistance = Double.POSITIVE_INFINITY;
        double placeholderX = 0;
        double placeholderY = 0;
        double placeholderZ = 0;
        while (input.hasNextDouble()){
            System.out.println("input next point: ");
            double xi = input.nextDouble();
            double yi = input.nextDouble();
            double zi = input.nextDouble();
            double distance = Math.pow((x - xi), 2) + Math.pow((y - yi), 2) + Math.pow((z - zi), 2);
            if (distance < BestDistance) {
                BestDistance = distance;
                placeholderX = xi;
                placeholderY = yi;
                placeholderZ = zi;
            }
        }
        System.out.printf("(%f, %f, %f) is the closest", placeholderX, placeholderY, placeholderZ);
    }
}

//task 1.6
class MinimalNumberLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        String[] array = numbers.split(" ");
        int minLength = Integer.MAX_VALUE;
        for (String i : array){
            if (i.length() < minLength) {
                minLength = i.length();
            }
        }
        for (String j : array) {
            if (j.length() == minLength) {
                System.out.print(j + " ");
            }
        }
    }
}

//task 1.18
class Pnorm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vectorStr = input.nextLine();
        String[] array = vectorStr.split(" ");
        double [] vector = new double[array.length];
        int p = Integer.parseInt(args[0]);
        for (int i = 0; i < array.length; i++) {
            vector[i] = Double.parseDouble(array[i]);
        }
        int pnorm = 0;
        for (int j = 0; j < vector.length; j++) {
            pnorm += Math.pow(Math.abs(vector[j]), p);
        }
        System.out.println(pnorm);
    }
}

//task 1.22
class PrintSpiral {
    private final String[][] matrix;
    private final int numberOfSegments;
    private final int dimension;
    private int xCoordinate;
    private int yCoordinate;
    public PrintSpiral(int n) {
        numberOfSegments = n;
        dimension = numberOfSegments/2 + 4 + numberOfSegments % 2;
        xCoordinate = dimension / 2;
        yCoordinate = dimension / 2;
        matrix = new String[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            String[] row = new String[dimension];
            Arrays.fill(row, ".");
            matrix[i] = row;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input n: ");
        int n = input.nextInt();
//        for (int n = 2; n < 100 ; n++) {
        PrintSpiral printSpiral = new PrintSpiral(n);
        printSpiral.process();
//        }
    }
    private void process() {
        int max = 0;
        int sum = 0;
        boolean exit = false;
        do {
            ++max;
            int remainder = max % 4;
            sum += max;
            if (sum >= numberOfSegments) {
                max = numberOfSegments - sum + max;
                exit = true;
            }
            switch (remainder) {
                case 0:
                    setMatrixElements(-1, 0, max);
                    break;
                case 1:
                    setMatrixElements(0, -1, max);
                    break;
                case 2:
                    setMatrixElements(1, 0, max);
                    break;
                case 3:
                    setMatrixElements(0, 1, max);
                    break;
                default:
                    throw new IllegalArgumentException("Error occurred");
            }
        } while (!exit);
        for (int j = 0; j < dimension; j++) {
            System.out.println((Arrays.toString(matrix[j]).replace(",", "").replace("]", "")
                    .replace("[", "")));
        }
    }
    private void setMatrixElements(int deltaX, int deltaY, int max) {
        for (int i = 0; i < max; i++) {
            matrix[yCoordinate][xCoordinate] = "Y";
            xCoordinate += deltaX;
            yCoordinate += deltaY;
        }
    }
}
