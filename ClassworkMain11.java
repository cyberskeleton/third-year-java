import java.util.Scanner;

public class ClassworkMain11 {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(str.split("\s").length);
    }
}

class RemoveArticles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        StringBuffer sb = new StringBuffer(s1);
        s1 = s1.replaceAll("\\s*\\ban\\b", "");
        s1 = s1.replaceAll("\\s*\\ba\\b", "");
        System.out.println(s1);
    }
}

class AddVery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s2 = input.nextLine();
        s2 = s2.replace("small", "very small");
        s2 = s2.replace("large", "very large");
        System.out.println(s2);
        String str = input.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.append(", that we use to illustrate the methods of class StringBuffer"));
    }
}


