package oop.inheritance;

public class Animal {
    private int eyes;

    public int getEyes() {
        return eyes;
    }

    public Animal(int eyes) {
        this.eyes = eyes;
        System.out.println("I am an animal");
    }

    protected void eat(){
        System.out.println("Animal eats");
    }

    protected void drink(){
        System.out.println("Animal drinks");
    }

    static void breath(){
        System.out.println("Animal is breathing");
    }

}
