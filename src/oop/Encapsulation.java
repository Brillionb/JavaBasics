package oop;

public class Encapsulation {
    public static void main(String[] args) {
        Student kolya = new Student(20);
        kolya.setName(new StringBuilder("Kolya"));
        kolya.getName().append("!!!");

        System.out.println(kolya.getName()); /// Kolya!!! - если getName возвращает не копию, а объект

    }
}

class Student {
    private StringBuilder name;
    private int age;

    public Student(int age){
       this.age = age;
    }

    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name){
        this.name = name;
    }
}
