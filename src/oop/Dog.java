package oop;

class DogMain {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.setDogBreed("Золотистый ретривер");
        myDog.setName("Супчик");
        myDog.setSpeed(5);

        System.out.println(myDog.info());
        myDog.run();
    }
}

public class Dog {
    // см демонстрацию работы в классе main.DogMain
    private String name;
    private String dogBreed;
    private int speed;

    public void setName(String name) {
        this.name = name;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run(){
        for (int i = 0; i < speed; i++) {
            if (i < speed-1) {
                System.out.print("бегу,");
            } else System.out.print("бегу!");
        }
    }

    public String info(){
        return "Имя собаки: " + name + ", порода собаки: " + dogBreed + ", скорость: " + speed;
    }
}
