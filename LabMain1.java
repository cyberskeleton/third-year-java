import java.util.Scanner;
//lab 1
class H1 {
    public int x;
}

class LabMain1 {
    public static void main(String[] args) {
        //task 1.1
        int x = 2;
        char three = '3';
        String five = "5";
        System.out.println(x + "+" + three + "=" + five);
        //task 1.2
        System.out.println("hello world!");
        //task 1.4
        H1 obj1;
        obj1 = new H1();
        obj1.x = 11;
        System.out.println(obj1.x);
        //tasks 1.5, 1.6
        int sum = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("i: " + i);
            sum += i;
        }
        System.out.println("sum: " + sum);
    }
}
//task 2.1
class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input name: ");
        String name = input.nextLine();
        System.out.println("hello, " + name + "!");
        input.close();
    }
}
