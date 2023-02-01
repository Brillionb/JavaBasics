package basic;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("Privet");
        System.out.println(sb1.equals(sb2));
        System.out.println(ravenstvo(sb1, sb2));

    }

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        if (s1.equals(s2)){
            return true;
        } else return false;
    }
}
