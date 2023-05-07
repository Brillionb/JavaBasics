package oop.AnonimousClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Counterable() {
            @Override
            public String report(int month) {
                return ("отчет за " + month + " месяцев");
            }
        }, 12);
    }
}
