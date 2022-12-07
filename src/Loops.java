public class Loops {
    public static void main(String[] args) {
        // цикл while в реальном проекте используется, когда выполняется определенное условие-
        //например : пока программа не закрыта, пока в файле есть данные итд.
        //Если же нужно выполнить цикл определенное известное число раз - обычно используется цикл for

        //Задача ввести все четные числа от заданного числа до 0
        int i = 999;
        while (i >= 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}

class ArithmeticalMean {
    public static void main(String[] args) {
        // вычислить среднее арифметическое чисел от 1 до заданного числа max
        int max = 450;
        int sum = 0;
        int count = 1;
        while (count <= max) {
            sum = sum + count;
            count++;
        }
        float average = sum / (float) count;
        System.out.println("Среднее арифметическое чисел от 0 до " + max + " равно " + average);
    }
}
class DoWhile {
    public static void main(String[] args) {
        //вывести на экран сколько секунд осталось до конц периода
        //используем цикл do-while, тк запись должна быть выведена на экран хотя бы один раз
        int counter = 10;
        do {
            System.out.println("До конца периода осталось " + counter + " секунд");
        } while (--counter >0);
    }
}
class ForExample {
    public static void main(String[] args) {
        // Цикл For применяется, если нужно выполнить цикл определенное известное число раз

        //Задача - выведем все цисла от 1000 до 0, которые делятся без остатка на 3
        for (int j = 1000; j > 0; j--){
            if (j % 3 ==0){
                System.out.println(j);
            }
        }
    }
}
class LoopsHomework{
    public static void main(String[] args) {
        //Задача - вывести все нечетные числа от 100 до 1000 , которые делятся без остатка на 5
        for (int i = 100; i <= 1000; i++){
            if (i % 5 == 0 && i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
