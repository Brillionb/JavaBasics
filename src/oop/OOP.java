package oop;

import oop.Human;

public class OOP {
    public static void main(String[] args) {
        Human masha = new Human();
        masha.age = 16;
        masha.name = "Masha";
        masha.weight = 50.2;

        Human katya = new Human();
        katya.age = 25;
        katya.name = "Katya";
        katya.weight = 55.5;

        Human ivan = new Human();
        ivan.age = 20;
        ivan.name = "Ivan";
        ivan.weight = 66.3;

        Human anton = new Human();
        anton.age = 55;
        anton.name = "Anton";
        anton.weight = 80.0;

        Human pavel = new Human();
        pavel.age = 63;
        pavel.name = "Pavel";
        pavel.weight = 72.8;

        //double averageAge = (pavel.age + anton.age + ivan.age + katya.age + masha.age) / 5;
        //System.out.println(averageAge);

        Human[] human = {masha, katya, ivan, anton, pavel};
        double averageAge = 0;
        for (Human somebody : human){
            averageAge += somebody.age/human.length;
        }
        System.out.println(averageAge);
    }
}
