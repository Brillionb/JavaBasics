package oop.inheritance;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Tuzik");
        Cat cat = new Cat("Murzik");
        System.out.println(dog.getPaw());
        cat.sleep();
        Pet pet = new Pet("www");
       Pet.breath();

    }
}
