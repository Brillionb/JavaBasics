package oop;

public class Human {
    String name;
    int age;
    double weight;

    //переопределение метода toString
    public String toString() {
        return  name + ", " + age;
    }
}
