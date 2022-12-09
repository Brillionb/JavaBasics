public class MonsterMain {
    public static void main(String[] args) {
        Monster myMonster1 = new Monster(3);
        Monster myMonster2 = new Monster(4,6);
        Monster myMonster3 = new Monster(5,3,6);
        myMonster1.voice(5, "Привет!");
        myMonster2.voice();
        myMonster3.voice(4);
    }

    }
