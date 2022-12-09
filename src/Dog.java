public class Dog {
    // см демонстрацию работы в классе DogMain
    String name;
    String dogBreed;
    int speed;

    void run(){
        for (int i = 0; i < speed; i++) {
            if (i < speed-1) {
                System.out.print("бегу,");
            } else System.out.print("бегу!");
        }
    }

    String info(){
        return "Имя собаки: " + name + ", порода собаки: " + dogBreed + ", скорость: " + speed;
    }
}
