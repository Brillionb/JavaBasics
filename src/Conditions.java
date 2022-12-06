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
