package oop.inheritance;

public class Pet extends Animal {
    private String name;
    private int tail;
    private int paw;

    public Pet(String name) {
        super(2);
        this.name = name;
        this.tail=1;
        this.paw = 4;
        System.out.println("I am a pet");
    }

    public String getName() {
        return name;
    }

    public int getTail() {
        return tail;
    }

    public int getPaw() {
        return paw;
    }

    public void run(){
        System.out.println("Pet runs");
    }

    public void jump(){
        System.out.println("Pet jumps");
    }

    static void breath(){
        System.out.println("Pet is breathing");
    }
}
