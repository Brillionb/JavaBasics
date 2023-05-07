package oop.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Driver d = new Driver(30, "John", "Рейс1");
        System.out.println(d.age);
        System.out.println(d.name);

    }
}

class Employee1 {
    int age;
    String name;
    Employee1(int a, String n){
        age = a;
        name = n;
        System.out.println("Конструктор супер класса");
    }

}

class Driver extends Employee1{
    String race;
    Driver(int age, String name,String race){
        super(age, name);
        this.race = race;
        System.out.println("конструктор Driver");

    }
}


