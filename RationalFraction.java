package RationalFraction;

public class RationalFraction {
    private int n;
    private int m;
    public static RationalFraction Add(RationalFraction a, RationalFraction b) {
        RationalFraction result = new RationalFraction();
        if (a.m == b.m) {
            result.n = a.n + b.n;
            result.m = a.m;
        }
        else {
            result.n = a.n*b.m + b.n*a.m;
            result.m = a.m * b.m;
        }
        return result;
    }
    public static RationalFraction input(int n, int m ) {
        RationalFraction res = new RationalFraction();
        res.n = n;
        res.m = m;
        return res;
    }
    public static RationalFraction[] ChangeElements(RationalFraction[] array) {
        for (int i = 0; i < array.length-1; i++) {
            //System.out.println(array[i].n +" "+ array[i].m);
            array[i] = Add(array[i], array[i+1]);
        }
        array[array.length-1] = Add(array[array.length-1], array[0]);
        return array;
    }
    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public static RationalFraction reduce(RationalFraction a) {
        a.n /= gcd(a.n, a.m);
        a.m /= gcd(a.n, a.m);
        return a;
    }
    public static void print(RationalFraction a) {
        //a = reduce(a);
        System.out.println(a.n + "/" + a.m);
    }
}