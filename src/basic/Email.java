package basic;

public class Email {
    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com; oni@yandex.ru;");

    }

    public static void email(String s){
        int a = 0; // позиция символа "@"
        int b = 0; // позиция символа "."
        int c = 0; // позиция символа ";"

        while (c < s.length()-1){
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c);
            System.out.println(s.substring(a + 1, b));
            c = c+1;
        }
    }
}
