public class Strings {
    public static void main(String[] args) {
        // Задача - создать массив с названиями месяцев, проинициализировать сразу.
        //Вывести названия (в кавычках) в одну строчку, разделив запятой, после последнего поставить точку.

        // это было первое решение
       /* String[] months = {"январь", "февраль","март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь" };
        for (String i : months){
           if (i != "декабрь") {
                System.out.print("\"" + i + "\", ");
            } else System.out.print("\"" + i + "\". ");
        }*/

        String[] months = {
                "январь",
                "февраль",
                "март",
                "апрель",
                "май",
                "июнь",
                "июль",
                "август",
                "сентябрь",
                "октябрь",
                "ноябрь",
                "декабрь"
        };
        String result = "";
        for (int i = 0; i < months.length; i++){
            result += "\""+ months[i] + "\"";
            if (i == months.length-1){
                result += ".";
            } else result += ",";
        }
        System.out.println(result);
    }
}




