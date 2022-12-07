import org.w3c.dom.ls.LSOutput;

public class Variables {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 100;
       // byte b3 = 128; // error -128 ... 127

        short s1 = 10;
        short s2 = -4988;
        short s3 = 9999;

        int i1 = 874647; // тип значений по умолчанию для целых чисел
        int i2 = -647382874;

        long l1 = 64748392392L;
        long l2 = -647373832823L;

        float f1 = 662662372.9876F;
        float f2 = 0.876f;

        double d1 = 3.14; // тип значений по умолчанию для чисел с плавающей точкой
        double d2 = 10D;
        double d3 = 3.14d;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = 4;
        char c4 = ' ';

        char c5 = 500; //пятисотый знак в таблице ASCII, записанный в десятичной системе счисления
        char c6 = '\u01F4';// так же пятисотый знак в шестнадцатеричной системе

        System.out.println(c6);
        System.out.println(c5);

        boolean bool1 = true;
        boolean bool2 = false;

        // системы счисления : десятичная, двоичная, восьмеричная, шестнадцатеричная
        int a1 = 123;

        int a2 = 0B1111011; // двоичная
        int a3 = 0b1111011;

        int a4 = 0173;//восьмеричная

        int a5 = 0x7B; // шестнадцатеричная
        int a6 = 0X7B;

        int a7 = 1_000_000;// нижнее подчеркивание используется для лучшей читаемости числа

        // Задача - представить количество дней в виде - лет месяцев дней

        int day = 600;
        int years = day / 365;
        int months = (day % 365) / 31;
        int days = day - years * 365 - months * 31;
        System.out.println(day + " дней - это:");
        System.out.println(years + " лет");
        System.out.println(months + " месяцев");
        System.out.println(days + " дней");
    }
}

 class VariablesTaskTime{
     public static void main(String[] args) {
         //представить количество секунд в виде  - дней часов минут секунд
         int second = 186465;
         int days = second / 86400;
         int hours = (second % 86400) / 3600;
         int minutes = ((second % 86400) % 3600) / 60;
         int seconds = second - days * 86400 - hours * 3600 - minutes * 60;
         System.out.println(second + " секунд это:");
         System.out.println(days + " дней");
         System.out.println(hours + " часов");
         System.out.println(minutes + " минут");
         System.out.println(seconds + " секунд");
     }
}

class VariablesAssignment {
    public static void main(String[] args) {
        long a = 100L;
        int b = 50;

        long c=b;
        float d=a;
        double e = b;

        boolean x = true;
        boolean y = false;
        boolean z= true;

        boolean result1 = x && y && z;// логическое И
        boolean result2 = x || y || z; // логическое ИЛИ

        System.out.println(result2);

        //short circuits
        //При сравнении && если первое выражение false, то второе даже не будет проверяться (результат false)
        // При сравнении || если первое выражение true, то второе не будет проверятся (результат true)
        // Соответственно вторая часть в сравнении даже не будет выполнена, если там есть вычисление
        int m = 10;
        int n = 2;
        int p = 10;

        boolean q = m < n && n++ < p; // инкремент даже не будет выполняться, тк первое выражение уже false
        System.out.println(q);
        System.out.println(n);

        // рассмотрим побитовые операции ( & Поразрядное И, | Поразрядное ИЛИ, ^  Поразрядное исключающее ИЛИ

        int aa = 5;
        int bb = 10;
        System.out.println(aa & bb); // 0101 & 1010 = 0
        System.out.println(aa | bb); // 0101 & 1010 = 15
        System.out.println( aa ^ bb); // - true только тогда, когда только одно из условий true


    }
}

class TaskPifagor {
    public static void main(String[] args) {
        // решить задачу вычисления гипотенузы треугольника, если известны катеты
        float a = 4.00f;
        float b = 4.00f;
        float c= (float) Math.sqrt(a*a + b*b);
        System.out.println("Длина гипотенузы равна " + c);

    }
}

class BooleanCondition {
    public static void main(String[] args) {
        //Не используя else выводить на экран действие в зависимости от времени и погоды
        int time = 10;
        boolean isNight = time <=5 || time >= 23;
        boolean isGoodWeather = true;

        if (isNight) {
            System.out.println("Time to sleep");
        }
        if (!isNight && isGoodWeather){
            System.out.println("Go for a walk");
        }
        if (!isNight && !isGoodWeather){
            System.out.println("Read a book");
        }
    }
}
