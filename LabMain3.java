//cw 2.1-2.6
import java.util.Scanner;

//task 2.1
class LabMain3 {
    public static void main(String[] args){
        final int a = 0x10;
        final int b = 0x01;
        System.out.println(Integer.toBinaryString(a|b));
        System.out.println(Integer.toBinaryString(a&b));
        System.out.println(Integer.toBinaryString(a^b));
        System.out.println(Integer.toBinaryString(a<<b));
        System.out.println(Integer.toBinaryString(a>>b));
    }
}
//task 2.3
class CharToBin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input char: ");
        char character = input.nextLine().charAt(0);
        System.out.println(Integer.toBinaryString(character));
    }
}

//task 2.4
class ChangeBitAtPos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("input n, m: ");
        byte n = (byte) input.nextInt();
        byte m = (byte) input.nextInt();
        n ^= 1 << m;
        System.out.println(n);
    }
}
//task 2.5
class CyclicShiftBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input n: ");
        int n = input.nextInt();
        rotateLeft(n);
    }
    private static void rotateLeft(int n) {
        System.out.println(String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0'));
        final int iLeft = ((n << 1) | (n >> 7)) & 0xff;
        System.out.println(String.format("%8s", Integer.toBinaryString(iLeft)).replace(' ', '0'));
        System.out.println(iLeft);
    }
}
