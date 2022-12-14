package oop;

class MonsterMain {
    public static void main(String[] args) {
        Monster myMonster1 = new Monster(3);
        Monster myMonster2 = new Monster(4,6);
        Monster myMonster3 = new Monster(5,3,6);
        myMonster1.voice(5, "Привет!");
        myMonster2.voice();
        myMonster3.voice(4);
    }
}

public class Monster {
    private int eyes;
    private int hands;
    private int legs;

    int neweyes = 3;


    Monster(){
        eyes  = 2;
        hands = 2;
        legs = 2;
    }

    public Monster(int eyes) {
        this.eyes = eyes;
        this.hands = 2;
        this.legs = 2;
    }

    public Monster(int eyes, int hands) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = 2;
    }

    public Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    public void voice(){
        System.out.println("Голос!");
    }
    public void voice (int i){
        for (int j = 0; j < i ; j++){
            System.out.println("Голос!");
        }
    }

    public void voice (int i, String word){
        for (int j = 0; j < i ; j++){
            System.out.println(word);
        }
    }
}
