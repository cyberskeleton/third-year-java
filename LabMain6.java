import java.util.*;

//2.1, 2.2, 3.1-3.6, hw 2.9
//task 2.1, 2.2
class LabMain6 {
    static void ShowMatrix(int[][] res, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + res[i][j]);;
            }
            System.out.println();
        }
    }
    static int[][] InputMatrix(int n) {
        Random r = new Random();
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = r.nextInt(10);
            }
        }
        return res;
    }
    static int[][] CyclicShift(int[][] matrix, int k) {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                row[j] = matrix[i][(j+k)%matrix.length];
            }
            matrix[i] = row;
        }
        return matrix;
    }
    static int[][] SortRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = j; k < matrix.length; k++) {
                    if (matrix[i][j] > matrix[i][k]) {
                        int placeholder = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = placeholder;
                    }
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input n: ");
        int a = input.nextInt();
        int[][] myMatrix = InputMatrix(a);
        ShowMatrix(myMatrix, a);
        System.out.print("input k: ");
        int k = input.nextInt();
        int[][] sortedMatrix = SortRows(myMatrix);
        System.out.println("sorted matrix");
        ShowMatrix(sortedMatrix, a);
        int[][] newMatrix = CyclicShift(myMatrix, k);
        System.out.println("shifted matrix");
        ShowMatrix(newMatrix, a);
    }
}


//task 3.1, 3.2, 3.3, 3.4
class UninitializedPointer {
    String NonInitStr;
    String InitInPoint = "this is an initialized string!";
    String ConstructorInit;
    public UninitializedPointer() {
        System.out.println("this is a constructor with no argument");
        ConstructorInit = "string initialized in the constructor";
    }
    public UninitializedPointer(String arg) {
        System.out.println("this is a constructor with '" + arg + "' as an argument");
    }
    public static void main(String[] args) {
        UninitializedPointer obj1 = new UninitializedPointer();
        UninitializedPointer obj2 = new UninitializedPointer("hi");
    }
}

//task 3.5, 3.6
class Dog {
    private String name;
    private String say;

    public Dog(String nameArg, String sayArg) {
        name = nameArg;
        say = sayArg;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSay() {
        return this.say;
    }

    public void setSay(final String say) {
        this.say = say;
    }

    public String bark() {
        return this.say;
    }

    public String bark(int times) {
        return this.say.repeat(times);
    }

    public String bark(String anotherSay) {
        return anotherSay;
    }

    public String bark(List<String> sayList) {
        return String.join("-", sayList);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        final Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(say, dog.say);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, say);
    }
    @Override
    public String toString() {
        return name + " says " + say;
    }
    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "Ruff!");
        Dog scruffy = new Dog("Scruffy", "Wurf!");
        System.out.println(spot);
        System.out.println(scruffy);
        Dog dog = spot;
        printEquals(dog, spot);
        printEquals(dog, scruffy);
        dog.setName(scruffy.getName());
        dog.setSay(scruffy.getSay());
        printEquals(dog, scruffy);
        System.out.println(spot.bark());
        System.out.println(spot.bark(20));
        System.out.println(spot.bark("awooooooooooooooooooo..."));
        System.out.println(spot.bark(Arrays.asList("arf", "barf", "bork", "bonk")));
    }
    private static void printEquals(Dog first, Dog second) {
        System.out.println(first.name + " == " + second.name + " is " + (first == second));
        System.out.println(first.name + " equals " + second.name + " is " + (first.equals(second)));
        System.out.println();
    }
}

//task 2.9
class ArithmeticMeanMatrix {
    static void ShowMatrix(int[][] res, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + res[i][j]);
                ;
            }
            System.out.println();
        }
    }
    static int[][] InputMatrix(int n) {
        Random r = new Random();
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = r.nextInt(10);
            }
        }
        return res;
    }
    static int FindArithmeticMean(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum / (matrix.length * matrix.length);
    }

    static int[][] ChangeRows(int[][] matrix) {
        int mean = FindArithmeticMean(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] -= mean;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input n: ");
        int a = input.nextInt();
        int[][] myMatrix = InputMatrix(a);
        ShowMatrix(myMatrix, a);
        ChangeRows(myMatrix);
        System.out.println();
        ShowMatrix(myMatrix, a);
    }
}
