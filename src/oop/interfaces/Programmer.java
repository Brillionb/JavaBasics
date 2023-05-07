package oop.interfaces;

public class Programmer extends Employee implements Programmable{
    public Programmer(String name) {
        super(name);
    }


    @Override
    public void code() {
        System.out.println( super.getName() + " is programming");
    }
}
