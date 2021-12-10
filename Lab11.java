package Lab11;

import java.util.Scanner;


public class Lab11 {
    public static void testReplace() {
        final ReplacePairs str1 = new ReplacePairs("aabcdeef");
        final ReplacePairs str2 = new ReplacePairs("RepeeaTTeed lettters");
        final ReplacePairs str3 = new ReplacePairs("jjaavvaa");
        final ReplacePairs str4 = new ReplacePairs("This is just a simple string");
        final ReplacePairs str5 = new ReplacePairs("Doouble letttters");

        System.out.println();
        System.out.println(str1.replace());
        System.out.println(str2.replace());
        System.out.println(str3.replace());
        System.out.println(str4.replace());
        System.out.println(str5.replace());
    }

    public static void testRemove() {
        final RemoveGroup str1 = new RemoveGroup("ab222ahggfshgkjj222", "222");
        final RemoveGroup str2 = new RemoveGroup("very cold and very dark", "very");
        final RemoveGroup str3 = new RemoveGroup("removej123athesej123acharsj123a", "j123a");
        final RemoveGroup str4 = new RemoveGroup("Helloabcd worabcdld", "abcd");
        final RemoveGroup str5 = new RemoveGroup("jhgjhgjhgjhggjhgjhgjhga", "jhgjhgjhgjhggjhgjhgjhg");

        System.out.println();
        System.out.println(str1.remove());
        System.out.println(str2.remove());
        System.out.println(str3.remove());
        System.out.println(str4.remove());
        System.out.println(str5.remove());
    }

    public static  void main (String[] args) {
        testReplace();
        testRemove();
    }
}
