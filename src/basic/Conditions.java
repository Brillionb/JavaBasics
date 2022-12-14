package basic;

public class Conditions {
    public static void main(String[] args) {
        //Что купить в зависимости от кол-ва денег. > 500р - пицца, <500 но > 300 - шаурма,
        // <300 но > 100 - гамбургер < 100р - доширак

        int money = 600;
        if (money > 500) {
            System.out.println("Ты богат, купи пиццу");
        } else if (money > 300){
            System.out.println("Сегодня лакомимся шавухой");
        } else if (money > 100){
            System.out.println("По гамбургеру?");
        } else {
            System.out.println("Денег хватит лишь на бич-пакет");
        }
    }
}

class NumberOfMonthWithIf{
    public static void main(String[] args) {
        // Задача - программа принимает номер месяца и выводит его название на экран
        // Если введен несуществующий номер - выводим "месяц не существует"
        // массивы не использовать

        int number = 4;
        String result = "";
        if (number == 1){
            result = "январь";
        } else if (number == 2){
            result = "февраль";
        } else if (number == 3){
            result = "март";
        } else if (number == 4){
            result = "апрель"; // и так далее
        } else {
            result = "месяц не существует";
        }
        System.out.println(result);
    }
}

class SwitchCase {
    public static void main(String[] args) {
        int number = 17;
        String result = "";
        switch (number){
            case 1 : result = "январь";
            break;
            case 2 : result = "февраль";
                break;
            case 3 : result = "март";
                break;
            case 4 : result = "апрель";
                break;
            case 5 : result = "май";
                break;
            case 6 : result = "июнь";
                break;
            case 7 : result = "июль";
                break;
            case 8 : result = "август";
                break;
            case 9 : result = "сентябрь";
                break;
            case 10 : result = "октябрь";
                break;
            case 11 : result = "ноябрь";
                break;
            case 12 : result = "декабрь";
                break;
            default: result = "месяц не существует";
        }
        System.out.println(result);
    }
}

class TimeOfYear{
    public static void main(String[] args) {
        //программа принимает строковую переменную название месяца
        //вывести время года, иначе - месяц не существует

        String month = "абракадабра";
        String result = "";
        switch (month){
          case  "январь" : result = "зима";
          break;
            case  "февраль" : result = "зима";
                break;
            case  "март" : result = "весна";
                break;
            case  "апрель" : result = "весна";
                break;
            case  "май" : result = "весна";
                break;
            case  "июнь" : result = "лето";
                break;
            case  "июль" : result = "лето";
                break;
            case  "август" : result = "лето";
                break;
                case  "сентябрь" : result = "осень";
                break;
            case  "октябрь" : result = "осень";
                break;
            case  "ноябрь" : result = "осень";
                break;
            case  "декабрь" : result = "зима";
                break;
            default: result = "месяц не существует";
        }
        System.out.println(result);
    }
}
