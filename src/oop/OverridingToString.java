package oop;

public class OverridingToString {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Peter";
        human.age = 33;
        //human.toString();
        System.out.println(human); // метод toString переопределен в классе Human
    }



}
