//task 2.7
import java.util.Scanner;
class HomeworkMain1 {
    public static void main(String[] args) {
        int result = 1;
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        for (int i = 0; i < numbers.length(); i++) {
            int current = Integer.parseInt(String.valueOf(numbers.charAt(i)));
            result *= current;
        }
        System.out.println(result);
    }
}
