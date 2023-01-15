package oop;

public class Test {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Мария");
        employees.add("Иван");
        employees.add("Игорь");
        employees.add("Евгений");
        employees.add("Николай");
        employees.add("Петр");
        employees.remove("Мария");

        for (int i = 0; i < employees.getSize(); i++){
            System.out.println(employees.get(i));
        }
    }


}
