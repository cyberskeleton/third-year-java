import java.nio.ByteBuffer;
import java.util.Scanner;

public class ControlBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input n: ");
        int n = input.nextInt();
//        int n = 268435454; // 0b00001111110111111011111101111110; // max allowed: 268435455
        if(n > 0b00001111111111111111111111111111) {
            throw new RuntimeException("Input number exceeds 2^28 limit!");
        }

        System.out.println("\n Successful processing expected: \n");
        System.out.println(String.valueOf(n));
        int encoded = encodeControlBits(n);
        System.out.println("28 bit number: " + String.valueOf(encoded));
        int decoded = decodeControlBits(encoded);
        System.out.println(String.valueOf(decoded));

        System.out.println("\n Exception is going to be thrown when 1 added to the encoded number: "
                + encoded + " -> " + ++encoded + "\n");
        decodeControlBits(encoded);
    }

    private static int decodeControlBits(int n) {
        System.out.println(String.format("Input::%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        byte[] data = new byte[4];
        data[0] = (byte) ((n) & 0xFF); // 0xFF is the same as 11111111, 8 lower bits of a byte
        data[1] = (byte) ((n >> 8) & 0xFF);
        data[2] = (byte) ((n >> 16) & 0xFF);
        data[3] = (byte) ((n >> 24) & 0xFF);

        byte[] result = new byte[4];
        for (int i = 0; i < data.length; i++) {
            System.out.print(String.format("%8s->", Integer.toBinaryString(data[i] & 0xFF)).replace(' ', '0'));
            int controlBit = data[i] & 0x01;
            byte valueBits = (byte) (data[i] >> 1 & 0x7F);
            final int calculatedBit = calculateControlBit(valueBits);
            System.out.print(String.format("->(%s==", controlBit));
            System.out.print(String.format("%s)->", calculatedBit));
            if (controlBit != calculatedBit) {
                throw new RuntimeException("Control bit doesn't match expected!");
            }

            result[i] = valueBits;
            System.out.println(String.format("%8s", Integer.toBinaryString(result[i] & 0xFF)).replace(' ', '0'));
        }
        int finalInt = ((result[0] & 0xFF) << 21) + ((result[1] & 0xFF) << 14) + ((result[2] & 0xFF) << 7) + (result[3] & 0xFF);
        System.out.println(String.format("Output:%32s", Integer.toBinaryString(finalInt)).replace(' ', '0'));

        return finalInt;
    }

    private static int encodeControlBits(int n) {
        System.out.println(String.format("Input::%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        byte[] data = new byte[4];
        data[0] = (byte) ((n) & 0x7F); // 0x7F is the same as 01111111, 7 lower bits of a byte
        data[1] = (byte) ((n >> 7) & 0x7F);
        data[2] = (byte) ((n >> 14) & 0x7F);
        data[3] = (byte) ((n >> 21) & 0x7F);

        for (int i = 0; i < data.length; i++) {
            System.out.print(String.format("%8s->", Integer.toBinaryString(data[i] & 0xFF)).replace(' ', '0'));
            data[i] = (byte) (data[i] << 1);
            final int code = calculateControlBit(data[i]);
            data[i] |= code & 0xFF;
            System.out.print(String.format("+%s=", code));
            System.out.println(String.format("%8s", Integer.toBinaryString(data[i] & 0xFF)).replace(' ', '0'));
        }
        int finalInt = ByteBuffer.wrap(data).getInt();
        System.out.println(String.format("Output:%32s", Integer.toBinaryString(finalInt)).replace(' ', '0'));

        return finalInt;
    }

    private static int calculateControlBit(int n) {
        String str = String.format("%8s", Integer.toBinaryString(n & 0xFF)).replace(' ', '0');
        System.out.print(str);
        int accum = 0;
        for (int j = 0; j < 8; j++) {
            accum += str.charAt(j);
        }
        return accum % 2;
    }

}