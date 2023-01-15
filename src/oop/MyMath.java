package oop;

public class MyMath {
    //Модификаторы доступа

    // public - доступен из любого места в проекте

    // private - доступен только методам класса, в котором объявлен

    // default -

    // static - для использования статических методов/переменных/класса не нужно создавать объект данного класса.
    // можно обращаться к статическому методу или полю, используя имя класса. Например, если поле count статично
    // в классе Counter, значит, вы можете обратиться к переменной запросом вида: Counter.count.

    // final - константа (значение может быть присвоено только один раз)

    private static final double PI = 3.14;

    public static int square(int number) {
        return number * number;
    }

    public static double length(int radius){
        return 2 * PI * radius;
    }

    public static double area(int radius){
        return PI * radius * radius;
    }

    // передача аргументов переменной длины.
    public static int sum(int... numbers){
        int sum = 0;
        for (int i : numbers){
            sum+=i;
        }
        return sum;

    }
}
